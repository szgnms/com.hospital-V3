package hospital.Methods;


import hospital.dbConnect.Connectiondb;
import hospital.dbConnect.SqlQueries;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import static hospital.Methods.color.*;
import static hospital.Methods.szgn.*;
import java.sql.*;


public class musab extends Connectiondb implements WorngInput {

    String patientName;
    String patientSurname;
    String patientDisease;
    int patientIdSearch;

    private PreparedStatement prst1;

    void patientMenu() {
        System.out.println(GREEN + "=================" + BLUE + "PATIENT MENU" + GREEN + "=================");
        System.out.println("""
                Please select ->
                1-Patient Registration
                2-Patient Search
                3-Patient Discharged
                4-All Patients
                5-Main Menu\n""");
        System.out.print("Your Selection : ");
        szgn.menuSecim = scan.next();
        switch (menuSecim) {
            case "1" -> patientRegistiration();
            case "2" -> patientSearch();
            case "3" -> patientDischarged();
            case "4" -> allPatients();
            case "5" -> new szgn().hospitalRun();
            default -> wrongMethod();
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

        Patient newPatient = new Patient(patientId,patientName,patientSurname,patientDisease,Rooms.firstFloorNumberRoom);
        Rooms.firstFloorRooms.add(newPatient);

        patientId++;
        Rooms.firstFloorNumberRoom++;

        for(Patient w : Rooms.firstFloorRooms){
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

        switch (menuSecim){
            case "1" -> patientIdSearch();
            case "2" -> patientNameSearch();
            case "3" -> patientSurnameSearch();
            case "4" -> patientDiseaseSearch();
            case "5" -> allPatients();
            case "6" -> new szgn().hospitalRun();
                default -> wrongMethod();

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
        patientMenu();
    }

    public void settPrepareStatement(String sql) {
        try {
            this.prst1 = conn.prepareStatement(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public Patient patientDischarged() {

        Patient patient = null;
        System.out.println("please enter patient id");
        patientIdSearch=scan.nextInt();
        String sql ="select * from t_patients where patient_id = ?";
        settPrepareStatement(sql);

        try {
            prst1.setInt(1,patientIdSearch);
            ResultSet resultSet = prst1.executeQuery();
            if(resultSet.next()){
                patient = new Patient();
                patient.setId(resultSet.getInt("patient_id"));
                patient.setName(resultSet.getString("name"));
                patient.setSurname(resultSet.getString("surname"));
                patient.setDisease(resultSet.getString("diseases"));

            }else{
                System.out.println("patient with an ID of "+ patientIdSearch +" could not be found");
                patientDischarged();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println(patient+ " patient was discharged");
        return patient;
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
        patientMenu();
    }


}
