package hospital.Methods;

import hospital.Diseases;

import java.util.ArrayList;
import java.util.List;

import static hospital.Methods.color.BLUE;
import static hospital.Methods.color.WHITE;
import static hospital.Methods.szgn.menuSecim;
import static hospital.Methods.szgn.scan;

public class ListDiseases {
    List<Diseases> aestheticsPlasticSurgeryList = new ArrayList<>();
    List<Diseases> anesthesiaAndReanimationList = new ArrayList<>();
    List<Diseases> dermatologyList = new ArrayList<>();
    List<Diseases> emergencyAndAmbulancesList = new ArrayList<>();
    List<Diseases> endocrinologyAndMetabolicDiseasesList = new ArrayList<>();

    List<Diseases> eyeDiseasesList = new ArrayList<>();
    List<Diseases> internalMedicineList = new ArrayList<>();
    List<Diseases> nutritionAndDietList = new ArrayList<>();
    List<Diseases> oralAndDentalDiseasesList = new ArrayList<>();
    List<Diseases> cardiologyList = new ArrayList<>();
    List<List> diseasesList = new ArrayList<>();

    public void diseasesList() {

        aestheticsPlasticSurgeryList.add(Diseases.BREAST_AUGMENTATION_OR_REDUCTIOM);
        aestheticsPlasticSurgeryList.add(Diseases.FACELIFT);
        aestheticsPlasticSurgeryList.add(Diseases.LIPOSUCTION);
        aestheticsPlasticSurgeryList.add(Diseases.ABDOMINOLOPLASTY);
        aestheticsPlasticSurgeryList.add(Diseases.RHINOPLASTY);


        anesthesiaAndReanimationList.add(Diseases.COMPICATIONS_OF_GENERAL_ANESTHESIA);
        anesthesiaAndReanimationList.add(Diseases.ANESTHESIA_ALLERGY);
        anesthesiaAndReanimationList.add(Diseases.POST_ANESTHETIC_SHOCK);
        anesthesiaAndReanimationList.add(Diseases.PATIENTS_REQUIRING_INTENSIVE_CARE_UNIT_ICU);


        dermatologyList.add(Diseases.ECZEMA);
        dermatologyList.add(Diseases.PSORIASIS);
        dermatologyList.add(Diseases.SKIN_CANCER);
        dermatologyList.add(Diseases.ACNE);
        dermatologyList.add(Diseases.FUNGAL_INFECTIONS);


        emergencyAndAmbulancesList.add(Diseases.HEART_ATTACK);
        emergencyAndAmbulancesList.add(Diseases.STROKE);
        emergencyAndAmbulancesList.add(Diseases.FRACTURES_DUE_TO_ACCIDENTS);
        emergencyAndAmbulancesList.add(Diseases.RESPIRATORY_DISTRESS);
        emergencyAndAmbulancesList.add(Diseases.BLEEDING);


        endocrinologyAndMetabolicDiseasesList.add(Diseases.DIABETES);
        endocrinologyAndMetabolicDiseasesList.add(Diseases.THYROID);
        endocrinologyAndMetabolicDiseasesList.add(Diseases.OBESITY);
        endocrinologyAndMetabolicDiseasesList.add(Diseases.CUSHINGS_SYNDROME);
        endocrinologyAndMetabolicDiseasesList.add(Diseases.ADDISONS_SYNDROME);


        eyeDiseasesList.add(Diseases.CATARACTS);
        eyeDiseasesList.add(Diseases.LAUCOMA);
        eyeDiseasesList.add(Diseases.MACULAR_DEGENERATION);
        eyeDiseasesList.add(Diseases.RETINAL_DETACHMENT);
        eyeDiseasesList.add(Diseases.DRY_EYE_SYNDROME);


        internalMedicineList.add(Diseases.HYPERTENSION);
        internalMedicineList.add(Diseases.ASTHMA);
        internalMedicineList.add(Diseases.CHRONIC_KIDNEY_DISEASE);
        internalMedicineList.add(Diseases.LIVER_CIRRHOSIS);


        nutritionAndDietList.add(Diseases.ANOREXIA);
        nutritionAndDietList.add(Diseases.DIABETES_RELATED_NUTRITION);
        nutritionAndDietList.add(Diseases.DIGESTIVE_PROBLEMS);
        nutritionAndDietList.add(Diseases.MALNUTRITION);


        oralAndDentalDiseasesList.add(Diseases.DENTAL_CARIES);
        oralAndDentalDiseasesList.add(Diseases.GUM_DISEASES);
        oralAndDentalDiseasesList.add(Diseases.TOOTH_LOSS);
        oralAndDentalDiseasesList.add(Diseases.BAD_BREATH);
        oralAndDentalDiseasesList.add(Diseases.TEMPOROMANDIBULAR);


        cardiologyList.add(Diseases.CORONARY_ARTERY_DISEASE);
        cardiologyList.add(Diseases.MYOCARDIAL_INFARCTION);
        cardiologyList.add(Diseases.CONGESTIVE_HEART_FAILURE);
        cardiologyList.add(Diseases.HYPERTENSION_HIGH_BLOOD_PRESSURE);



        diseasesList.add(aestheticsPlasticSurgeryList);
        diseasesList.add(anesthesiaAndReanimationList);
        diseasesList.add(dermatologyList);
        diseasesList.add(emergencyAndAmbulancesList);
        diseasesList.add(endocrinologyAndMetabolicDiseasesList);
        diseasesList.add(eyeDiseasesList);
        diseasesList.add(internalMedicineList);
        diseasesList.add(nutritionAndDietList);
        diseasesList.add(oralAndDentalDiseasesList);
        diseasesList.add(cardiologyList);
    }
    public void printCliniclist() {
        System.out.println(
                BLUE + "1- AestheticsPlasticSurgery\n" +
                        WHITE + "2- AnesthesiaAndReanimation\n" +
                        BLUE + "3- Dermatology\n" +
                        WHITE + "4- EmergencyAndAmbulances\n" +
                        BLUE + "5- EndocrinologyAndMetabolicDiseases\n" +
                        WHITE + "6- EyeDiseases\n" +
                        BLUE + "7- InternalMedicine\n" +
                        WHITE + "8- NutritionAndDiet\n" +
                        BLUE + "9- OralAndDentalDiseases\n" +
                        WHITE + "10- Cardiology");
    }
    public  void selectDisease(){
        int index =1;
        diseasesList();
        printCliniclist();
        System.out.println("Select Clinic");
        szgn.menuSecim=scan.next();
        switch (menuSecim){
            case "1" -> {
                for (Diseases  w: aestheticsPlasticSurgeryList){
                    System.out.println((index)+"- "+w);
                    index++;
                }
                System.out.println("Select Disease");
                menuSecim=scan.next();
                switch (menuSecim){
                   case "1" -> musab.patientDisease =aestheticsPlasticSurgeryList.get(0).toString();
                   case "2" -> musab.patientDisease =aestheticsPlasticSurgeryList.get(1).toString();
                   case "3" -> musab.patientDisease =aestheticsPlasticSurgeryList.get(2).toString();
                   case "4" -> musab.patientDisease =aestheticsPlasticSurgeryList.get(3).toString();
                   case "5" -> musab.patientDisease =aestheticsPlasticSurgeryList.get(4).toString();
                }

            }
            case "2" -> {
                for (Diseases  w: anesthesiaAndReanimationList){
                    System.out.println((index)+"- "+w);
                    index++;
                }
                System.out.println("Select Disease");
                menuSecim=scan.next();
                switch (menuSecim){
                    case "1" -> musab.patientDisease =anesthesiaAndReanimationList.get(0).toString();
                    case "2" -> musab.patientDisease =anesthesiaAndReanimationList.get(1).toString();
                    case "3" -> musab.patientDisease =anesthesiaAndReanimationList.get(2).toString();
                    case "4" -> musab.patientDisease =anesthesiaAndReanimationList.get(3).toString();

                }

            }
            case "3" -> {
                for (Diseases  w: dermatologyList){
                    System.out.println((index)+"- "+w);
                    index++;
                }
                System.out.println("Select Disease");
                menuSecim=scan.next();
                switch (menuSecim){
                    case "1" -> musab.patientDisease =dermatologyList.get(0).toString();
                    case "2" -> musab.patientDisease =dermatologyList.get(1).toString();
                    case "3" -> musab.patientDisease =dermatologyList.get(2).toString();
                    case "4" -> musab.patientDisease =dermatologyList.get(3).toString();
                    case "5" -> musab.patientDisease =dermatologyList.get(4).toString();
                }
            }
            case "4" -> {
                for (Diseases  w: emergencyAndAmbulancesList){
                    System.out.println((index)+"- "+w);
                    index++;
                }
                System.out.println("Select Disease");
                menuSecim=scan.next();
                switch (menuSecim){
                    case "1" -> musab.patientDisease =emergencyAndAmbulancesList.get(0).toString();
                    case "2" -> musab.patientDisease =emergencyAndAmbulancesList.get(1).toString();
                    case "3" -> musab.patientDisease =emergencyAndAmbulancesList.get(2).toString();
                    case "4" -> musab.patientDisease =emergencyAndAmbulancesList.get(3).toString();
                    case "5" -> musab.patientDisease =emergencyAndAmbulancesList.get(4).toString();
                }

            }
            case "5" -> {
                for (Diseases  w: endocrinologyAndMetabolicDiseasesList){
                    System.out.println((index)+"- "+w);
                    index++;
                }
                System.out.println("Select Disease");
                menuSecim=scan.next();
                switch (menuSecim){
                    case "1" -> musab.patientDisease =endocrinologyAndMetabolicDiseasesList.get(0).toString();
                    case "2" -> musab.patientDisease =endocrinologyAndMetabolicDiseasesList.get(1).toString();
                    case "3" -> musab.patientDisease =endocrinologyAndMetabolicDiseasesList.get(2).toString();
                    case "4" -> musab.patientDisease =endocrinologyAndMetabolicDiseasesList.get(3).toString();
                    case "5" -> musab.patientDisease =endocrinologyAndMetabolicDiseasesList.get(4).toString();
                }
            }
            case "6" -> {
                for (Diseases  w: eyeDiseasesList){
                    System.out.println((index)+"- "+w);
                    index++;
                }
                System.out.println("Select Disease");
                menuSecim=scan.next();
                switch (menuSecim){
                    case "1" -> musab.patientDisease =eyeDiseasesList.get(0).toString();
                    case "2" -> musab.patientDisease =eyeDiseasesList.get(1).toString();
                    case "3" -> musab.patientDisease =eyeDiseasesList.get(2).toString();
                    case "4" -> musab.patientDisease =eyeDiseasesList.get(3).toString();
                    case "5" -> musab.patientDisease =eyeDiseasesList.get(4).toString();
                }

            }
            case "7" -> {
                for (Diseases  w: internalMedicineList){
                    System.out.println((index)+"- "+w);
                    index++;
                }
                System.out.println("Select Disease");
                menuSecim=scan.next();
                switch (menuSecim){
                    case "1" -> musab.patientDisease =internalMedicineList.get(0).toString();
                    case "2" -> musab.patientDisease =internalMedicineList.get(1).toString();
                    case "3" -> musab.patientDisease =internalMedicineList.get(2).toString();
                    case "4" -> musab.patientDisease =internalMedicineList.get(3).toString();

                }
            }

            case "8" -> {
                for (Diseases  w: nutritionAndDietList){
                    System.out.println((index)+"- "+w);
                    index++;
                }
                System.out.println("Select Disease");
                menuSecim=scan.next();
                switch (menuSecim){
                    case "1" -> musab.patientDisease =nutritionAndDietList.get(0).toString();
                    case "2" -> musab.patientDisease =nutritionAndDietList.get(1).toString();
                    case "3" -> musab.patientDisease =nutritionAndDietList.get(2).toString();
                    case "4" -> musab.patientDisease =nutritionAndDietList.get(3).toString();

                }


            }
            case "9" -> {
                for (Diseases  w: oralAndDentalDiseasesList){
                    System.out.println((index)+"- "+w);
                    index++;
                }
                System.out.println("Select Disease");
                menuSecim=scan.next();
                switch (menuSecim){
                    case "1" -> musab.patientDisease =oralAndDentalDiseasesList.get(0).toString();
                    case "2" -> musab.patientDisease =oralAndDentalDiseasesList.get(1).toString();
                    case "3" -> musab.patientDisease =oralAndDentalDiseasesList.get(2).toString();
                    case "4" -> musab.patientDisease =oralAndDentalDiseasesList.get(3).toString();
                    case "5" -> musab.patientDisease =oralAndDentalDiseasesList.get(4).toString();
                }

            }
            case "10" -> {
                for (Diseases  w: cardiologyList){
                    System.out.println((index)+"- "+w);
                    index++;
                }
                System.out.println("Select Disease");
                menuSecim=scan.next();
                switch (menuSecim){
                    case "1" -> musab.patientDisease =cardiologyList.get(0).toString();
                    case "2" -> musab.patientDisease =cardiologyList.get(1).toString();
                    case "3" -> musab.patientDisease =cardiologyList.get(2).toString();
                    case "4" -> musab.patientDisease =cardiologyList.get(3).toString();

                }


            }

        }

    }

}
