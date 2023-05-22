package hospital.clinics;

public class AnesthesiaAndReanimation implements ClinicsInterface <String,String>{


    @Override
    public String clinicName() {
       return "AnesthesiaAndReanimation";
    }

    @Override
    public String clinicDoctor() {
        return "Anesthesia Specialist";
    }



}
