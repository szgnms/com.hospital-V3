package hospital.clinics;

public class NutritionAndDiet implements ClinicsInterface<String,String> {
    @Override
    public String clinicName() {
        return "NutritionAndDiet";
    }

    @Override
    public String clinicDoctor() {
        return "Nutrition And Diet Specialist";
    }
}
