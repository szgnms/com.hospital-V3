package hospital.Methods;

import static hospital.Methods.szgn.menuSecim;
import static hospital.Methods.szgn.scan;
import static java.awt.Color.*;

public class musab {

    void patientMenu() {
        System.out.println(GREEN+"================="+BLUE+"PATIENT MENU"+GREEN+"=================");
        System.out.println("""
                Please select ->
                1-Patient Registration
                2-Patient Discharged
                3-Quit
                
                """);
        szgn.menuSecim= scan.next();
        switch (menuSecim){
            case "1" -> patientRegistiration();
            case "2" -> patientDischarged();
            case "3" -> System.exit(0);
            default -> new szgn().wrongInputMethod();
        }
    }

    private void patientRegistiration() {
    }

    private void patientDischarged() {
    }




}
