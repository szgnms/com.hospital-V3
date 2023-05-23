package hospital;


import hospital.branch.BranchQuery;
import hospital.diseases.DiseaseQuery;
import hospital.methods.DoctorsMethods;
import hospital.methods.MainMenuMethods;
import hospital.dbConnect.SqlQueries;
import hospital.repo.Rooms;

public class Runner {

    public static void main(String[] args) {

        new SqlQueries().createDiseases();
        new SqlQueries().createBranch();
        new BranchQuery().branchQuery();
        new Rooms().addFloor();
        new DiseaseQuery().diseaseQuery();
        new DoctorsMethods().addBranch();
        new SqlQueries().createDischargePatient();
        new SqlQueries().createDoctorTable();
        new SqlQueries().createPatientTable();
        new MainMenuMethods().hospitalRun();

    }
}
