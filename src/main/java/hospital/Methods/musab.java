package hospital.Methods;

import hospital.dbConnect.SqlQueries;

import java.util.concurrent.TimeUnit;

import static hospital.Methods.color.*;
import static hospital.Methods.szgn.*;


public class musab {

    void patientMenu() {
        System.out.println(GREEN + "=================" + BLUE + "PATIENT MENU" + GREEN + "=================");
        System.out.println("""
                Please select ->
                1-Patient Registration
                2-Patient Search
                3-Patient Discharged
                4-All Patients
                5-Main Menu
                                
                """);
        szgn.menuSecim = scan.next();
        switch (menuSecim) {
            case "1" -> patientRegistiration();
            case "2" -> patientSearch();
            case "3" -> patientDischarged();
            case "4" -> allPatients();
            case "5" -> new szgn().hospitalRun();
            default -> wrongInputMethod();
        }
    }



    private void patientRegistiration() {
        System.out.println("Please enter the Name of the Patient");
        String patientName = scan.next();
        System.out.println("Please enter the Surname of the Patient");
        String patientSurname = scan.next();
        System.out.println("Please enter the Disease of the Patient");
        String patientDisease = scan.next();

        new SqlQueries().addPatient(patientId,patientName,patientSurname,patientDisease);
        patientId++;

    }

    private void patientSearch() {
        System.out.println("Please select the type of search you want to make");
        System.out.println("""
                1-Search by Patient Id
                2-Search by Patient Name
                3-Search by Patient Surname
                4-Search by Patient Disease
                5-Search with All Parameters
                6-Main Menu
                """);

        private void patientIdSearch(){
            new SqlQueries().printPatientWithValue("t_patients","patient_id",patientId);

        }

        private void patientNameSearch(){
            new SqlQueries().printPatientWithValue("t_patients","name",);
        }

        private void patientSurnameSearch(){
            new SqlQueries().printPatientWithValue("t_patients","surname",);
        }


        private void patientDiseaseSearch(){
            new SqlQueries().printPatientWithValue("t_patients","disease",);
        }

        private void patientAllParametersSearch(){
            new SqlQueries().printPatientWithValue("t_patients",,);
        }







        switch (menuSecim){
            case "1" -> patientIdSearch;
            case "2" ->
            case "3" ->
            case "4" ->
            case "5" ->
            case "6" ->
                default -> wrongInputMethod();

        }
    }
    private void allPatients() {
    }


    private void patientDischarged() {
    }

    public void wrongInputMethod() {
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

        patientMenu();

    }

}
