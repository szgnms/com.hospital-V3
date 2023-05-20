package hospital.Methods;

import java.util.concurrent.TimeUnit;

import static hospital.Methods.color.*;

import static hospital.Methods.szgn.menuSecim;
import static hospital.Methods.szgn.scan;


public class musab {

    void patientMenu() {
        System.out.println(GREEN + "=================" + BLUE + "PATIENT MENU" + GREEN + "=================");
        System.out.println("""
                Please select ->
                1-Patient Registration
                2-Patient Discharged
                3-Main Menu
                                
                """);
        szgn.menuSecim = scan.next();
        switch (menuSecim) {
            case "1" -> patientRegistiration();
            case "2" -> patientDischarged();
            case "3" -> new szgn().hospitalRun();
            default -> wrongInputMethod();
        }
    }

    private void patientRegistiration() {
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
