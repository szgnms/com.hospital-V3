package hospital.Methods;

import java.util.Scanner;

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

    private void createDoctor() {
    }



    private void deleteDoctor() {
    }




}