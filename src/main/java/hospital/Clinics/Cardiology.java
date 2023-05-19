package hospital.Clinics;

import hospital.ClinicsInterface;

public class Cardiology implements ClinicsInterface<String,String> {
    @Override
    public String clinicName() {
        return "Cardiology";
    }

    @Override
    public String clinicDoctor() {
        return "Cardiology_Specialist";
    }
}
