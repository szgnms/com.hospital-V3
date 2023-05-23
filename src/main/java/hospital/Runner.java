package hospital;


import hospital.diseases.DiseaseQuery;
import hospital.methods.DoctorsMethods;
import hospital.methods.MainMenuMethods;
import hospital.dbConnect.SqlQueries;

public class Runner {

    public static void main(String[] args) {

        new SqlQueries().createDiseases();
        new DiseaseQuery().diseaseQuery();
        new DoctorsMethods().addBranch();
        new SqlQueries().createDischargePatient();
        new SqlQueries().createDoctorTable();
        new SqlQueries().createPatientTable();
        new MainMenuMethods().hospitalRun();

    }
}
