package hospital.diseases;

import hospital.dbConnect.Connectiondb;

import java.sql.SQLException;

public class DiseaseQuery {
    public void diseaseQuery(){
        try {
            Connectiondb.st.execute("insert into t_disease values(1, '"+ Diseases.BREAST_AUGMENTATION_OR_REDUCTIOM.toString()+"')");
            Connectiondb.st.execute("insert into t_disease values(1, '"+ Diseases.FACELIFT.toString()+"')");
            Connectiondb.st.execute("insert into t_disease values(1, '"+ Diseases.LIPOSUCTION.toString()+"')");
            Connectiondb.st.execute("insert into t_disease values(1, '"+ Diseases.ABDOMINOLOPLASTY.toString()+"')");
            Connectiondb.st.execute("insert into t_disease values(1, '"+ Diseases.RHINOPLASTY.toString()+"')");

            Connectiondb.st.execute("insert into t_disease values(2, '"+ Diseases.COMPICATIONS_OF_GENERAL_ANESTHESIA.toString()+"')");
            Connectiondb.st.execute("insert into t_disease values(2, '"+ Diseases.ANESTHESIA_ALLERGY.toString()+"')");
            Connectiondb.st.execute("insert into t_disease values(2, '"+ Diseases.POST_ANESTHETIC_SHOCK.toString()+"')");
            Connectiondb.st.execute("insert into t_disease values(2, '"+ Diseases.PATIENTS_REQUIRING_INTENSIVE_CARE_UNIT_ICU.toString()+"')");

            Connectiondb.st.execute("insert into t_disease values(3, '"+ Diseases.ECZEMA.toString()+"')");
            Connectiondb.st.execute("insert into t_disease values(3, '"+ Diseases.PSORIASIS.toString()+"')");
            Connectiondb.st.execute("insert into t_disease values(3, '"+ Diseases.SKIN_CANCER.toString()+"')");
            Connectiondb.st.execute("insert into t_disease values(3, '"+ Diseases.ACNE.toString()+"')");
            Connectiondb.st.execute("insert into t_disease values(3, '"+ Diseases.FUNGAL_INFECTIONS.toString()+"')");

            Connectiondb.st.execute("insert into t_disease values(4, '"+ Diseases.HEART_ATTACK.toString()+"')");
            Connectiondb.st.execute("insert into t_disease values(4, '"+ Diseases.STROKE.toString()+"')");
            Connectiondb.st.execute("insert into t_disease values(4, '"+ Diseases.FRACTURES_DUE_TO_ACCIDENTS.toString()+"')");
            Connectiondb.st.execute("insert into t_disease values(4, '"+ Diseases.RESPIRATORY_DISTRESS.toString()+"')");
            Connectiondb.st.execute("insert into t_disease values(4, '"+ Diseases.BLEEDING.toString()+"')");

            Connectiondb.st.execute("insert into t_disease values(5, '"+ Diseases.DIABETES.toString()+"')");
            Connectiondb.st.execute("insert into t_disease values(5, '"+ Diseases.THYROID.toString()+"')");
            Connectiondb.st.execute("insert into t_disease values(5, '"+ Diseases.OBESITY.toString()+"')");
            Connectiondb.st.execute("insert into t_disease values(5, '"+ Diseases.CUSHINGS_SYNDROME.toString()+"')");
            Connectiondb.st.execute("insert into t_disease values(5, '"+ Diseases.ADDISONS_SYNDROME.toString()+"')");

            Connectiondb.st.execute("insert into t_disease values(6, '"+ Diseases.CATARACTS.toString()+"')");
            Connectiondb.st.execute("insert into t_disease values(6, '"+ Diseases.LAUCOMA.toString()+"')");
            Connectiondb.st.execute("insert into t_disease values(6, '"+ Diseases.MACULAR_DEGENERATION.toString()+"')");
            Connectiondb.st.execute("insert into t_disease values(6, '"+ Diseases.RETINAL_DETACHMENT.toString()+"')");
            Connectiondb.st.execute("insert into t_disease values(6, '"+ Diseases.DRY_EYE_SYNDROME.toString()+"')");

            Connectiondb.st.execute("insert into t_disease values(7, '"+ Diseases.HYPERTENSION.toString()+"')");
            Connectiondb.st.execute("insert into t_disease values(7, '"+ Diseases.ASTHMA.toString()+"')");
            Connectiondb.st.execute("insert into t_disease values(7, '"+ Diseases.CHRONIC_KIDNEY_DISEASE.toString()+"')");
            Connectiondb.st.execute("insert into t_disease values(7, '"+ Diseases.LIVER_CIRRHOSIS.toString()+"')");

            Connectiondb.st.execute("insert into t_disease values(8, '"+ Diseases.ANOREXIA.toString()+"')");
            Connectiondb.st.execute("insert into t_disease values(8, '"+ Diseases.DIABETES_RELATED_NUTRITION.toString()+"')");
            Connectiondb.st.execute("insert into t_disease values(8, '"+ Diseases.DIGESTIVE_PROBLEMS.toString()+"')");
            Connectiondb.st.execute("insert into t_disease values(8, '"+ Diseases.MALNUTRITION.toString()+"')");

            Connectiondb.st.execute("insert into t_disease values(9, '"+ Diseases.DENTAL_CARIES.toString()+"')");
            Connectiondb.st.execute("insert into t_disease values(9, '"+ Diseases.GUM_DISEASES.toString()+"')");
            Connectiondb.st.execute("insert into t_disease values(9, '"+ Diseases.TOOTH_LOSS.toString()+"')");
            Connectiondb.st.execute("insert into t_disease values(9, '"+ Diseases.BAD_BREATH.toString()+"')");
            Connectiondb.st.execute("insert into t_disease values(9, '"+ Diseases.TEMPOROMANDIBULAR.toString()+"')");

            Connectiondb.st.execute("insert into t_disease values(10, '"+ Diseases.CORONARY_ARTERY_DISEASE.toString()+"')");
            Connectiondb.st.execute("insert into t_disease values(10, '"+ Diseases.MYOCARDIAL_INFARCTION.toString()+"')");
            Connectiondb.st.execute("insert into t_disease values(10, '"+ Diseases.CONGESTIVE_HEART_FAILURE.toString()+"')");
            Connectiondb.st.execute("insert into t_disease values(10, '"+ Diseases.HYPERTENSION_HIGH_BLOOD_PRESSURE.toString()+"')");



        } catch (SQLException e) {
            System.out.println();;
        }
    }
}
