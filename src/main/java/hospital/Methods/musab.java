package hospital.Methods;


import hospital.dbConnect.Connectiondb;
import hospital.dbConnect.SqlQueries;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import static hospital.Methods.color.*;
import static hospital.Methods.szgn.*;



public class musab extends Connectiondb {

    String patientName;
    String patientSurname;
    String patientDisease;
    int  patientIdSearch;
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
        patientName = scan.next();
        System.out.println("Please enter the Surname of the Patient");
        patientSurname = scan.next();
        System.out.println("Please enter the Disease of the Patient");
        patientDisease = scan.next();

        new SqlQueries().addPatient(patientId,patientName,patientSurname,patientDisease);
        patientId++;

    }

    private void patientSearch() {
        new SqlQueries().printPatientValues("t_patients");
        System.out.println("Please select the type of search you want to make");
        System.out.println("""
                1-Search by Patient Id
                2-Search by Patient Name
                3-Search by Patient Surname
                4-Search by Patient Disease
                5-Search with All Parameters
                6-Main Menu
                """);

        switch (menuSecim){
            case "1" -> patientIdSearch();
            case "2" ->
            case "3" ->
            case "4" ->
            case "5" ->
            case "6" ->
                default -> wrongInputMethod();

        }
    }

    private void patientIdSearch(){
        System.out.println("please enter patient id");
        patientIdSearch=scan.nextInt();
        new SqlQueries().printPatientWithValue("t_patients","patient_id",patientIdSearch);

    }

    private void patientNameSearch(){
        System.out.println("please enter patient name");
        patientName=scan.next();
        new SqlQueries().printPatientWithValue("t_patients","name",patientName);
    }

    private void patientSurnameSearch(){
        System.out.println("please enter patient Surname");
        patientSurname=scan.next();
        new SqlQueries().printPatientWithValue("t_patients","surname",patientSurname);
    }


    private void patientDiseaseSearch(){
        System.out.println("please enter patient disease");
        patientDisease=scan.next();
        new SqlQueries().printPatientWithValue("t_patients","disease",patientDisease);
    }

    private void allPatients() {
        new SqlQueries().printPatientValues("t_patients");
    }


    public void patientDischarged() {
        int ptId=0;
        String ptName="";
        String ptSurname="";
        String ptDisease="";
        int ptDocId=0;
        System.out.println("please enter patient id");
        patientIdSearch=scan.nextInt();
        try {
            rs= st.executeQuery("select  id from patient where patient_id like "+patientIdSearch+" ");
            while (rs.next()) {
                ptId = rs.getInt(1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            rs= st.executeQuery("select  name from patient where patient_id like "+patientIdSearch+" ");
            while (rs.next()) {
               ptName = rs.getString(1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            rs= st.executeQuery("select  surname from patient where patient_id like "+patientIdSearch+" ");
            while (rs.next()) {
               ptSurname = rs.getString(1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            rs= st.executeQuery("select  diseases from patient where patient_id like "+patientIdSearch+" ");
            while (rs.next()) {
                ptDisease = rs.getString(1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            rs= st.executeQuery("select  doctor_id from patient where patient_id like "+patientIdSearch+" ");
            while (rs.next()) {
                ptDocId = rs.getInt(1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        new SqlQueries().addDischargedPatient( ptId,ptName,ptSurname,ptDisease,ptDocId);
        new SqlQueries().deletePersonWithValue("t_patients","id",patientIdSearch);
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
