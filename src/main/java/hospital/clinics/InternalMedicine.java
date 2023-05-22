package hospital.clinics;

public class InternalMedicine implements ClinicsInterface<String,String> {
    @Override
    public String clinicName() {
        return "InternalMedicine";
    }

    @Override
    public String clinicDoctor() {
        return "Internal Medicine Specialist";
    }
}
