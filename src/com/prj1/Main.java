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
        //Get Doctor info from text file
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
                    System.out.println("There is an invalid Doctor Entry");
                }
            }
            doctor.close();
        }catch (FileNotFoundException e) {
            System.out.println("File not Found.");
        }
        //Get Patient info from text file
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
                    System.out.println("There is an invalid Patient Entry");
                }
            }
            patient.close();
        }catch (FileNotFoundException e) {
            System.out.println("File not Found.");
        }

        //Menu Loop
        while (true){
            System.out.println("Please input the letter corresponding to the following menu options (case sensitive):"
                    + "\nA. List all doctors" + "\nB. Find doctor by specialty"
                    + "\nC. List all patients under age 40" + "\nD. List patients age 40+"
                    +"\nE. Exit");
            String input = new Scanner(System.in).nextLine();
            switch (input){
                case "A" ->{
                    for(Doctor doc : doctor_list) System.out.println(doc.toString());
                }
                case "B" -> System.out.println("Option B Selected");
                case "C" -> System.out.println("Option C Selected");
                case "D" -> System.out.println("Option D Selected");
                case "E" -> System.exit(1);
                case default->System.out.println("Input selection not one of the listed options."
                + "\nRemember it IS CASE SENSITIVE.");
            }

        }
    }
}