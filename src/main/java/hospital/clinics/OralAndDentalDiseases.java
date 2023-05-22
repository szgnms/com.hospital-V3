package hospital.clinics;

public class OralAndDentalDiseases implements ClinicsInterface<String,String> {
    @Override
    public String clinicName() {
        return "OralAndDentalDiseases";
    }

    @Override
    public String clinicDoctor() {
        return "OralAndDentalDiseases Specialist";
    }
}
