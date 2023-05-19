package hospital.Clinics;

import hospital.ClinicsInterface;

public class Dermatology implements ClinicsInterface <String,String> {


    @Override
    public String clinicName() {
        return  "Dermatology";
    }

    @Override
    public String clinicDoctor() {
        return "Dermatology_Specialist" ;
    }
}
