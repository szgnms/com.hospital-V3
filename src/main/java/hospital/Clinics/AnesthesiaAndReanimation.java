package hospital.Clinics;

import hospital.ClinicsInterface;

public class AnesthesiaAndReanimation implements ClinicsInterface <String,String>{


    @Override
    public String clinicName() {
       return "AnesthesiaAndReanimation";
    }

    @Override
    public String clinicDoctor() {
        return "Anesthesia_Specialist";
    }



}
