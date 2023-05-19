package hospital;

public enum Diseases {
    RHINOPLASTY("AestheticsPlasticSurgery", "Floor_1"),

    BREAST_AUGMENTATION_OR_REDUCTIOM("AestheticsPlasticSurgery", "Floor_1"),

    FACELIFT("AestheticsPlasticSurgery", "Floor_1"),

    LIPOSUCTION("AestheticsPlasticSurgery", "Floor_1"),

    ABDOMINOLOPLASTY("AestheticsPlasticSurgery", "Floor_1"),

    COMPICATIONS_OF_GENERAL_ANESTHESIA("AnesthesiaAndReanimation", "Floor_2"),
    ANESTHESIA_ALLERGY("AnesthesiaAndReanimation", "Floor_2"),
    POST_ANESTHETIC_SHOCK("AnesthesiaAndReanimation", "Floor_2"),
    PATIENTS_REQUIRING_INTENSIVE_CARE_UNIT_ICU("AnesthesiaAndReanimation", "Floor_2"),

    ECZEMA("Dermatology", "Floor_3"),
    PSORIASIS("Dermatology", "Floor_3"),
    SKIN_CANCER("Dermatology", "Floor_3"),
    ACNE("Dermatology", "Floor_3"),
    FUNGAL_INFECTIONS("Dermatology", "Floor_3"),
    HEART_ATTACK("EmergencyAndAmbulances", "Floor_4"),
    STROKE("EmergencyAndAmbulances", "Floor_4"),
    FRACTURES_DUE_TO_ACCIDENTS("EmergencyAndAmbulances", "Floor_4"),
    RESPIRATORY_DISTRESS("EmergencyAndAmbulances", "Floor_4"),
    BLEEDING("EmergencyAndAmbulances", "Floor_4"),

    DIABETES("EndocrinologyAndMetabolicDiseases","Floor_5"),
    THYROID("EndocrinologyAndMetabolicDiseases","Floor_5"),
    OBESITY("EndocrinologyAndMetabolicDiseases","Floor_5"),
    CUSHINGS_SYNDROME("EndocrinologyAndMetabolicDiseases","Floor_5"),
    ADDISONS_SYNDROME("EndocrinologyAndMetabolicDiseases","Floor_5"),

    CATARACTS("EyeDiseases","Floor_6"),
    LAUCOMA("EyeDiseases","Floor_6"),
    MACULAR_DEGENERATION("EyeDiseases","Floor_6"),
    RETINAL_DETACHMENT("EyeDiseases","Floor_6"),
    DRY_EYE_SYNDROME("EyeDiseases","Floor_6"),
    HYPERTENSION("InternalMedicine","Floor_7"),
    ASTHMA("InternalMedicine","Floor_7"),
    CHRONIC_KIDNEY_DISEASE("InternalMedicine","Floor_7"),
    LIVER_CIRRHOSIS("InternalMedicine","Floor_7"),

    ANOREXIA("NutritionAndDiet","Floor_8"),
    DIABETES_RELATED_NUTRITION("NutritionAndDiet","Floor_8"),
    DIGESTIVE_PROBLEMS("NutritionAndDiet","Floor_8"),
    MALNUTRITION("NutritionAndDiet","Floor_8"),

    DENTAL_CARIES("OralAndDentalDiseases","Floor_9"),
    GUM_DISEASES("OralAndDentalDiseases","Floor_9"),
    TOOTH_LOSS("OralAndDentalDiseases","Floor_9"),
    BAD_BREATH("OralAndDentalDiseases","Floor_9"),
    TEMPOROMANDIBULAR("OralAndDentalDiseases","Floor_9"),

    CORONARY_ARTERY_DISEASE("Cardiology","Floor_10"),
    MYOCARDIAL_INFARCTION("Cardiology","Floor_10"),
    CONGESTIVE_HEART_FAILURE("Cardiology","Floor_10"),
    HYPERTENSION_HIGH_BLOOD_PRESSURE("Cardiology","Floor_10");

    private final String clinicName;
    private final String floor;

    Diseases(String clinicName, String floor) {
        this.clinicName = clinicName;
        this.floor = floor;
    }

    public String getClinicName() {
        return clinicName;
    }

    public String getFloor() {
        return floor;
    }
}
