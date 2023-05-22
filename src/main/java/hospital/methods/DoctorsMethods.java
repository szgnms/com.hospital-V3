package hospital.methods;

import hospital.clinics.*;
import hospital.repo.WrongInput;
import hospital.dbConnect.SqlQueries;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static hospital.methods.MainMenuMethods.*;
import static hospital.repo.Color.*;
import static hospital.dbConnect.Connectiondb.*;

public class DoctorsMethods implements WrongInput {


    private static String doctorName;
    private String doctorSurname;
    private String doctorBranch;
    int doctorIdSearch;

   static List<String> branchList = new ArrayList<>();

    public void addBranch(){
        branchList.add(new AestheticsPlasticSurgery().clinicDoctor());
        branchList.add(new AnesthesiaAndReanimation().clinicDoctor());
        branchList.add(new Cardiology().clinicDoctor());
        branchList.add(new Dermatology().clinicDoctor());
        branchList.add(new EmergencyAndAmbulances().clinicDoctor());
        branchList.add(new EndocrinologyAndMetabolicDiseases().clinicDoctor());
        branchList.add(new EyeDiseases().clinicDoctor());
        branchList.add(new InternalMedicine().clinicDoctor());
        branchList.add(new NutritionAndDiet().clinicDoctor());
        branchList.add(new OralAndDentalDiseases().clinicDoctor());
    }
    public void printbranchList(){
        System.out.println("==========DOCTOR BRANCH===============");

        for(int i=1; i<=branchList.size();i++){
            System.out.println(i +  " - " + branchList.get(i-1));
        }
        System.out.println();
    }



    public void doctorMenu() {
        System.out.println(GREEN+"================"+CYAN+"DOCTOR MENU"+GREEN+"================\n"+RED+"Please select ->");
        System.out.println(BLUE+"1-"+WHITE+"DOCTOR REGISTRATION");
        System.out.println(BLUE+"2-"+WHITE+"DELETE DOCTOR");
        System.out.println(BLUE+"3-"+WHITE+"DOCTOR SEARCH");
        System.out.println(BLUE+"4-"+WHITE+"ALL DOCTORS");
        System.out.println(BLUE+"5-"+WHITE+"RETURN TO MAIN MENU");

        System.out.print("YOUR SELECTION : ");

        MainMenuMethods.menuSecim= MainMenuMethods.scan.next();

        switch (MainMenuMethods.menuSecim){
            case "1" ->createDoctor();
            case "2" ->deleteDoctor();
            case "3" ->doctorSearch();
            case "4" ->allDoctors();
            case "5" ->new MainMenuMethods().hospitalRun();
            default ->wrongMethod();
        }


    }


    private void createDoctor() {
        try {
            rs=st.executeQuery("select max(doctor_id) from t_doctors ");
            while (rs.next()) {
                doctorId=rs.getInt(1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        doctorId++;

        System.out.println("Please enter the Name of the Doctor");
        doctorName= scan.next();
        System.out.println("Please enter the Name of the Doctor");
        doctorSurname= scan.next();
        printbranchList();
        System.out.println("Please select the Branch of the Doctor");
        menuSecim=scan.next();

        switch (menuSecim){
            case "1"-> doctorBranch = branchList.get(0);
            case "2"-> doctorBranch = branchList.get(1);
            case "3"-> doctorBranch = branchList.get(2);
            case "4"-> doctorBranch = branchList.get(3);
            case "5"-> doctorBranch = branchList.get(4);
            case "6"-> doctorBranch = branchList.get(5);
            case "7"-> doctorBranch = branchList.get(6);
            case "8"-> doctorBranch = branchList.get(7);
            case "9"-> doctorBranch = branchList.get(8);
            case "10"->doctorBranch = branchList.get(9);
        }


        new SqlQueries().addDoctor(doctorId,doctorName,doctorSurname,doctorBranch);

        doctorMenu();
    }


    public void deleteDoctor() {
        new SqlQueries().printDoctorValues("t_doctors");
        System.out.println("Please enter the Id of the Doctor");
        int doctorId =scan.nextInt();
        new SqlQueries().deleteDoctorWithId(doctorId);
        doctorMenu();
    }

    private void doctorSearch() {
        new SqlQueries().printDoctorValues("t_doctors");
        System.out.println("Please select the type of search you want to make");
        System.out.println("""
                1-Search by Doctor Id
                2-Search by Doctor Name
                3-Search by Doctor Surname
                4-Search by Doctor Branch
                5-Search with All Parameters
                6-Main Menu
                """);
        System.out.print("YOUR SELECTION : ");
        menuSecim=scan.next();

        switch (menuSecim){
            case "1" -> doctorIdSearch();
            case "2" -> doctorNameSearch();
            case "3" -> doctorSurnameSearch();
            case "4" -> doctorBranchSearch();
            case "5" -> allDoctors();
            case "6" -> new MainMenuMethods().hospitalRun();
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
        new SqlQueries().printDoctorWithId(doctorIdSearch);
        doctorMenu();
    }
    private void doctorNameSearch(){
        System.out.println("please enter doctor name");
        doctorName=scan.next();
        new SqlQueries().printDoctorWithValue("t_doctors","name",doctorName);
        doctorMenu();
    }

    private void doctorSurnameSearch(){
        System.out.println("please enter doctor Surname");
        doctorSurname=scan.next();
        new SqlQueries().printDoctorWithValue("t_doctors","surname",doctorSurname);
        doctorMenu();
    }

    private void doctorBranchSearch(){
        printbranchList();
        System.out.println("please enter doctor branch");
        doctorBranch=scan.next();
        new SqlQueries().printDoctorWithValue("t_doctors","branch",doctorBranch);
        doctorMenu();
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