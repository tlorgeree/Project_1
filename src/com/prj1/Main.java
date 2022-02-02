package com.prj1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        ArrayList<Patient> patient_list = new ArrayList<Patient>();
        ArrayList<Doctor> doctor_list = new ArrayList<Doctor>();
        Scanner doctor;
        try {
            doctor = new Scanner(new File("doctors.txt"));
            while (doctor.hasNextLine()){
                String[] doc_info = doctor.nextLine().split(",",3);
                try {
                    String doc_name = doc_info[0];
                    int doc_age = parseInt(doc_info[1]);
                    String doc_spec = doc_info[2];
                    doctor_list.add(new Doctor(doc_name, doc_age, doc_spec));
                }catch(Exception f){
                    System.out.println("Invalid Doctor Entry");
                }
            }
            doctor.close();
            for (var i = 0; i<doctor_list.size()-1;i++){
                System.out.println(doctor_list.get(i));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not Found.");
        }

        Scanner patient;
        try {
            patient = new Scanner(new File("patients.txt"));
            while (patient.hasNextLine()){
                String[] pat_info = patient.nextLine().split(",",3);
                try {
                    String pat_name = pat_info[0];
                    int pat_age = parseInt(pat_info[1]);
                    String pat_doctor = pat_info[2];
                    patient_list.add(new Patient(pat_name, pat_age, pat_doctor));
                }catch(Exception f){
                    System.out.println("Invalid Doctor Entry");
                }
            }
            patient.close();
            for (var i = 0; i<patient_list.size()-1;i++){
                System.out.println(patient_list.get(i));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not Found.");
        }
    }
}