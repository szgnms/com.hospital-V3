package hospital;

import hospital.Clinics.*;
import hospital.Methods.Floors;

public enum Diseases {
    RHINOPLASTY(new AestheticsPlasticSurgery().clinicName(), Floors.FLOOR_1),

    BREAST_AUGMENTATION_OR_REDUCTIOM(new AestheticsPlasticSurgery().clinicName(), Floors.FLOOR_1),

    FACELIFT(new AestheticsPlasticSurgery().clinicName(), Floors.FLOOR_1),

    LIPOSUCTION(new AestheticsPlasticSurgery().clinicName(), Floors.FLOOR_1),

    ABDOMINOLOPLASTY(new AestheticsPlasticSurgery().clinicName(), Floors.FLOOR_1),

    COMPICATIONS_OF_GENERAL_ANESTHESIA(new AnesthesiaAndReanimation().clinicName(), Floors.FLOOR_2),
    ANESTHESIA_ALLERGY(new AnesthesiaAndReanimation().clinicName(), Floors.FLOOR_2),
    POST_ANESTHETIC_SHOCK(new AnesthesiaAndReanimation().clinicName(), Floors.FLOOR_2),
    PATIENTS_REQUIRING_INTENSIVE_CARE_UNIT_ICU(new AnesthesiaAndReanimation().clinicName(), Floors.FLOOR_2),

    ECZEMA(new Dermatology().clinicName(), Floors.FLOOR_3),
    PSORIASIS(new Dermatology().clinicName(), Floors.FLOOR_3),
    SKIN_CANCER(new Dermatology().clinicName(), Floors.FLOOR_3),
    ACNE(new Dermatology().clinicName(), Floors.FLOOR_3),
    FUNGAL_INFECTIONS(new Dermatology().clinicName(), Floors.FLOOR_3),
    HEART_ATTACK(new EmergencyAndAmbulances().clinicName(), Floors.FLOOR_4),
    STROKE(new EmergencyAndAmbulances().clinicName(),  Floors.FLOOR_4),
    FRACTURES_DUE_TO_ACCIDENTS(new EmergencyAndAmbulances().clinicName(),  Floors.FLOOR_4),
    RESPIRATORY_DISTRESS(new EmergencyAndAmbulances().clinicName(),  Floors.FLOOR_4),
    BLEEDING(new EmergencyAndAmbulances().clinicName(),  Floors.FLOOR_4),

    DIABETES(new EndocrinologyAndMetabolicDiseases().clinicName(), Floors.FLOOR_5),
    THYROID(new EndocrinologyAndMetabolicDiseases().clinicName(), Floors.FLOOR_5),
    OBESITY(new EndocrinologyAndMetabolicDiseases().clinicName(), Floors.FLOOR_5),
    CUSHINGS_SYNDROME(new EndocrinologyAndMetabolicDiseases().clinicName(), Floors.FLOOR_5),
    ADDISONS_SYNDROME(new EndocrinologyAndMetabolicDiseases().clinicName(), Floors.FLOOR_5),

    CATARACTS(new EyeDiseases().clinicName(), Floors.FLOOR_6),
    LAUCOMA(new EyeDiseases().clinicName(),Floors.FLOOR_6),
    MACULAR_DEGENERATION(new EyeDiseases().clinicName(),Floors.FLOOR_6),
    RETINAL_DETACHMENT(new EyeDiseases().clinicName(),Floors.FLOOR_6),
    DRY_EYE_SYNDROME(new EyeDiseases().clinicName(),Floors.FLOOR_6),
    HYPERTENSION(new InternalMedicine().clinicName(),Floors.FLOOR_7),
    ASTHMA(new InternalMedicine().clinicName(),Floors.FLOOR_7),
    CHRONIC_KIDNEY_DISEASE(new InternalMedicine().clinicName(),Floors.FLOOR_7),
    LIVER_CIRRHOSIS(new InternalMedicine().clinicName(),Floors.FLOOR_7),

    ANOREXIA(new NutritionAndDiet().clinicName(),Floors.FLOOR_8),
    DIABETES_RELATED_NUTRITION(new NutritionAndDiet().clinicName(),Floors.FLOOR_8),
    DIGESTIVE_PROBLEMS(new NutritionAndDiet().clinicName(),Floors.FLOOR_8),
    MALNUTRITION(new NutritionAndDiet().clinicName(),Floors.FLOOR_8),

    DENTAL_CARIES(new OralAndDentalDiseases().clinicName(), Floors.FLOOR_9),
    GUM_DISEASES(new OralAndDentalDiseases().clinicName(),Floors.FLOOR_9),
    TOOTH_LOSS(new OralAndDentalDiseases().clinicName(), Floors.FLOOR_9),
    BAD_BREATH(new OralAndDentalDiseases().clinicName(), Floors.FLOOR_9),
    TEMPOROMANDIBULAR(new OralAndDentalDiseases().clinicName(), Floors.FLOOR_9),

    CORONARY_ARTERY_DISEASE(new Cardiology().clinicName(), Floors.FLOOR_10),
    MYOCARDIAL_INFARCTION(new Cardiology().clinicName(),Floors.FLOOR_10),
    CONGESTIVE_HEART_FAILURE(new Cardiology().clinicName(),Floors.FLOOR_10),
    HYPERTENSION_HIGH_BLOOD_PRESSURE(new Cardiology().clinicName(),Floors.FLOOR_10);

    private static String AestheticsPlasticSurgery;
    private final String clinicName;
    private final String floor;


    Diseases(String clinicName, Floors floor) {
        this.clinicName = clinicName;
        this.floor = floor.toString();
    }

    public String getClinicName() {
        return clinicName;
    }

    public String getFloor() {
        return floor;
    }
}
