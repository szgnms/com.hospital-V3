package hospital.methods;


import hospital.repo.ListDiseases;
import hospital.repo.Patient;
import hospital.repo.Rooms;
import hospital.repo.WrongInput;
import hospital.dbConnect.Connectiondb;
import hospital.dbConnect.SqlQueries;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import static hospital.repo.Color.*;
import static hospital.methods.MainMenuMethods.*;

import java.sql.*;


public class PatientsMethods extends Connectiondb implements WrongInput {


    String patientName;
    String patientSurname;
    public static String patientDisease;
    int patientIdSearch;



    void patientMenu() {
        System.out.println(GREEN + "=================" + BLUE + "PATIENT MENU" + GREEN + "=================");
        System.out.println("""
                Please select ->
                1-Patient Registration
                2-Patient Search
                3-Patient Discharged
                4-All Patients
                5-All Discharged Patients
                6-Main Menu""");
        System.out.print("Your Selection : ");
        MainMenuMethods.menuSecim = scan.next();
        switch (menuSecim) {
            case "1" -> patientRegistiration();
            case "2" -> patientSearch();
            case "3" -> patientDischarge();
            case "4" -> allPatients();
            case "5" -> allDischargedPatients();
            case "6" -> new MainMenuMethods().hospitalRun();
            default -> wrongMethod();
        }
    }

    private void allDischargedPatients() {
        new SqlQueries().printPatientValues("t_discharge_patient");
        patientMenu();
    }


    private void patientRegistiration() {
        try {
            rs=st.executeQuery("select max(patient_id) from t_patients ");
            while (rs.next()) {
                patientId=rs.getInt(1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
           patientId++;
        System.out.println("Please enter the Name of the Patient");
        patientName = scan.next();
        System.out.println("Please enter the Surname of the Patient");
        patientSurname = scan.next();
        System.out.println("Please select the Disease of the Patient");
        new ListDiseases().selectDisease();

        new SqlQueries().addPatient(patientId, patientName, patientSurname, patientDisease);



        Patient newPatient = new Patient(patientId, patientName, patientSurname, patientDisease, Rooms.firstFloorNumberRoom);
        Rooms.firstFloorRooms.add(newPatient);


        patientId++;
        Rooms.firstFloorNumberRoom++;

        for (Patient w : Rooms.firstFloorRooms) {
            System.out.println(w);
        }


        patientMenu();


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

        System.out.print("YOUR SELECTION : ");
        MainMenuMethods.menuSecim= MainMenuMethods.scan.next();

        switch (menuSecim) {
            case "1" -> patientIdSearch();
            case "2" -> patientNameSearch();
            case "3" -> patientSurnameSearch();
            case "4" -> patientDiseaseSearch();
            case "5" -> allPatients();
            case "6" -> new MainMenuMethods().hospitalRun();
            default -> wrongMethod();


        }
    }

    private void patientIdSearch() {
        System.out.println("please enter patient id");
        patientIdSearch = scan.nextInt();
        new SqlQueries().printPatientWithId( patientIdSearch);
          patientMenu();
    }

    private void patientNameSearch() {
        System.out.println("please enter patient name");
        patientName = scan.next();
        new SqlQueries().printPatientWithValue("t_patients", "name", patientName);
        patientMenu();
    }

    private void patientSurnameSearch() {
        System.out.println("please enter patient Surname");
        patientSurname = scan.next();
        new SqlQueries().printPatientWithValue("t_patients", "surname", patientSurname);
        patientMenu();
    }


    private void patientDiseaseSearch() {
        System.out.println("please enter patient disease");
        patientDisease = scan.next();
        new SqlQueries().printPatientWithValue("t_patients", "diseases", patientDisease);
        patientMenu();
    }

    private void allPatients() {
        new SqlQueries().printPatientValues("t_patients");
        patientMenu();
    }


    public void settPrepareStatement(String sql) {
        try {
             prst = conn.prepareStatement(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void patientDischarge(){
        patientDischarged();
        String ptDiName ="";
        String ptDiSurname="";
        String ptDidisease="";
        try {
            rs= st.executeQuery("Select * from t_patients where patient_id = " + patientIdSearch);
            while (rs.next()) {
                ptDiName=rs.getString(2);
                ptDiSurname=rs.getString(3);
                ptDidisease=rs.getString(4);


            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        new SqlQueries().addDischargePatient(patientIdSearch,ptDiName,ptDiSurname,ptDidisease);
        new SqlQueries().deletePatientWithId(patientIdSearch);
        patientMenu();
    }
    public Patient patientDischarged() {
        new SqlQueries().printPatientValues("t_patients");
        Patient patient = null;
        System.out.println("please enter patient id");
        patientIdSearch = scan.nextInt();
        String sql = "select * from t_patients where patient_id = ?";
        settPrepareStatement(sql);

        try {

             prst.setInt(1, patientIdSearch);
            ResultSet resultSet =  prst.executeQuery();
            if (resultSet.next()) {
                patient = new Patient();
                patient.setId(resultSet.getInt("patient_id"));
                patient.setName(resultSet.getString("name"));
                patient.setSurname(resultSet.getString("surname"));
                patient.setDisease(resultSet.getString("diseases"));

            } else {
                System.out.println("patient with an ID of " + patientIdSearch + " could not be found");
                patientDischarged();


            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        System.out.println(patient + "\n patient was discharged");



        return patient;
    }



    @Override
    public void wrongMethod() {
        System.out.println(RED + "PLEASE SELECT CORRECT \nREDIRECTING TO MENU");
        for (int i = 0; i < 5; i++) {


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
