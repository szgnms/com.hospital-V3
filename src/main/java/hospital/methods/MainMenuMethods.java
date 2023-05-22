package hospital.methods;

import hospital.repo.WrongInput;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static hospital.repo.Color.*;


public class MainMenuMethods implements WrongInput {




    public static Scanner scan = new Scanner(System.in);
    public static String menuSecim;

    static int doctorId = 1000;
    static int patientId = 2000;


    public void hospitalRun() {
        System.out.println(GREEN + "=================" + CYAN + " WELCOME TO DEV3 HOSPITAL" + GREEN + "=================");
        System.out.println(GREEN + "========================" + CYAN + " MAIN MENU" + GREEN + "=========================\n" + RED + "Please select ->");
        System.out.println(GREEN + """
                1- DOCTOR MENU
                2- PATIENT MENU
                3- QUIT
                """);
        System.out.print("YOUR SELECTION : ");
        menuSecim = scan.next();
        switch (menuSecim) {
            case "1" -> new DoctorsMethods().doctorMenu();
            case "2" -> new PatientsMethods().patientMenu();
            case "3" -> System.exit(0);
            default -> wrongMethod();
        }

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

        hospitalRun();

    }
}
