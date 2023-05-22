package hospital.clinics;

public class AestheticsPlasticSurgery implements ClinicsInterface<String,String> {

    @Override
    public String clinicName() {
     return "AestheticsPlasticSurgery";
    }

    @Override
    public String clinicDoctor() {
        return "AestheticsPlasticSurgerySpecialist";
    }

}
