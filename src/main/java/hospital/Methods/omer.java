package hospital.Methods;

import hospital.dbConnect.SqlQueries;


import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import static hospital.Methods.szgn.*;
import static hospital.Methods.color.*;

public class omer implements WorngInput{

    private static String doctorName;
    private String doctorSurname;
    private String doctorBranch;
    int doctorIdSearch;

    void doctorMenu() {
        System.out.println(GREEN+"================"+CYAN+"DOCTOR MENU"+GREEN+"================\n"+RED+"Please select ->");
        System.out.println(BLUE+"1-"+WHITE+"DOCTOR REGISTRATION");
        System.out.println(BLUE+"2-"+WHITE+"DELETE DOCTOR");
        System.out.println(BLUE+"3-"+WHITE+"DOCTOR SEARCH");
        System.out.println(BLUE+"4-"+WHITE+"ALL DOCTORS");
        System.out.println(BLUE+"5-"+WHITE+"RETURN TO MAIN MENU");
        System.out.println(BLUE+"6-"+WHITE+"EXIT");
        System.out.print("YOUR SELECTION : ");

        szgn.menuSecim=szgn.scan.next();

        switch (szgn.menuSecim){
            case "1" ->createDoctor();
            case "2" ->deleteDoctor();
            case "3" ->doctorSearch();
            case "4" ->allDoctors();
            case "5" ->new szgn().hospitalRun();
            case "6" ->System.exit(0);
            default ->wrongMethod();
        }


    }


    private void createDoctor() {
        System.out.println("Please enter the Name of the Doctor");
        doctorName= scan.next();
        System.out.println("Please enter the Name of the Doctor");
        doctorSurname= scan.next();
        System.out.println("Please enter the Branch of the Doctor");
        doctorBranch=scan.next();

        new SqlQueries().addDoctor(doctorId,doctorName,doctorSurname,doctorBranch);
        doctorId++;
        doctorMenu();
    }


    public void deleteDoctor() {
        System.out.println("Please enter the Name of the Doctor");
        String doctorName=scan.next();
        new SqlQueries().deleteDoctorWithName(doctorName);
        doctorMenu();
    }

    private void doctorSearch() {
        new SqlQueries().printPatientValues("t_doctors");
        System.out.println("Please select the type of search you want to make");
        System.out.println("""
                1-Search by Doctor Id
                2-Search by Doctor Name
                3-Search by Doctor Surname
                4-Search by Doctor Branch
                5-Search with All Parameters
                6-Main Menu
                """);

        switch (menuSecim){
            case "1" -> doctorIdSearch();
            case "2" -> doctorNameSearch();
            case "3" -> doctorSurnameSearch();
            case "4" -> doctorBranchSearch();
            case "5" -> allDoctors();
            case "6" -> new szgn().hospitalRun();
            default -> wrongMethod();

        }
    }

    private void allDoctors(){
        new SqlQueries().printDoctorValues("t_doctors");
        doctorMenu();
    }

    private void doctorIdSearch(){
        System.out.println("please enter doctor id");
        doctorIdSearch=scan.nextInt();
        new SqlQueries().printDoctorWithValue("t_doctors","doctor_id",doctorIdSearch);

    }
    private void doctorNameSearch(){
        System.out.println("please enter doctor name");
        doctorName=scan.next();
        new SqlQueries().printPatientWithValue("t_doctors","name",doctorName);
    }

    private void doctorSurnameSearch(){
        System.out.println("please enter doctor Surname");
        doctorSurname=scan.next();
        new SqlQueries().printPatientWithValue("t_patients","surname",doctorSurname);
    }

    private void doctorBranchSearch(){
        System.out.println("please enter patient disease");
        doctorBranch=scan.next();
        new SqlQueries().printPatientWithValue("t_patients","disease",doctorBranch);
    }


    @Override
    public void wrongMethod() {
        System.out.println(RED+"PLEASE SELECT CORRECT \nREDIRECTING TO MENU");
        for (int i = 0; i <5 ; i++) {
            System.out.print(". ");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println();
        doctorMenu();

    }

}