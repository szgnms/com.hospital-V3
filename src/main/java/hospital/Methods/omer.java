package hospital.Methods;

import hospital.dbConnect.SqlQueries;

import static hospital.Methods.szgn.doctorId;
import static hospital.Methods.szgn.scan;


import static java.awt.Color.*;

public class omer {


    private static String doctorName;
    private static String doctorSurname;
    private static String doctorBranch;

    void doctorMenu() {
        System.out.println(GREEN+"================"+WHITE+"DOCTOR MENU"+GREEN+"================");
        System.out.println(BLUE+"1-"+WHITE+"DOCTOR REGISTRATION");
        System.out.println(BLUE+"2-"+WHITE+"DELETE DOCTOR");
        System.out.println(BLUE+"3-"+WHITE+"EXIT");

        szgn.menuSecim=szgn.scan.next();

        switch (szgn.menuSecim){
            case "1" ->createDoctor();
            case "2" ->deleteDoctor();
            case "3" ->System.exit(0);
            default ->new szgn().wrongInputMethod();
        }


    }

    static
    private void createDoctor() {
        System.out.println("Please enter the Name of the Doctor");
        String doctorName= scan.next();
        System.out.println("Please enter the Name of the Doctor");
        String doctorSurname= scan.next();
        System.out.println("Please enter the Branch of the Doctor");
        String doctorBranch=scan.next();

        new SqlQueries().addDoctor(doctorId,doctorName,doctorSurname,doctorBranch);
        doctorId++;
    }


    private void deleteDoctor() {
        System.out.println("Please enter the Name of the Doctor");
        String doctorName=scan.next();
        new SqlQueries().deletePersonWithValue("t_doctors","name",doctorName);
    }




}