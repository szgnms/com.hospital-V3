package hospital.Clinics;

import hospital.ClinicsInterface;

public class EyeDiseases implements ClinicsInterface<String,String> {
    @Override
    public String clinicName() {
        return "EyeDiseases" ;
    }

    @Override
    public String clinicDoctor() {
        return "Eye_Specialist";
    }
}
