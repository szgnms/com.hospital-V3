package hospital.Methods;

import java.util.Scanner;

import static java.awt.Color.*;

public class szgn {
static Scanner scan=new Scanner(System.in);
  static String menuSecim;
    public void hospitalRun(){
        System.out.println(GREEN+"================="+BLUE+" WELCOME TO DEV3 HOSPITAL"+GREEN+"=================" );
        System.out.println("""
                Please select ->
                1- DOCTOR MENU
                2- PATIENT MENU
                3- QUIT
                """);
        menuSecim=scan.next();
        switch (menuSecim){
            case "1" -> new omer().doctorMenu();
            case "2" -> new musab().patientMenu();
            case "3" -> System.exit(0);
            default ->  wrongInputMethod();
        }
        
    }

    public void wrongInputMethod() {
    }


}
