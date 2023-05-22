package hospital.clinics;

public class EndocrinologyAndMetabolicDiseases implements ClinicsInterface<String,String> {


    @Override
    public String clinicName() {
        return "EndocrinologyAndMetabolicDiseases";
    }

    @Override
    public String clinicDoctor() {
        return "Endocrinology_and_Metabolic_Diseases_Specialist";
    }
}
