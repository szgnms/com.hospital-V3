package hospital;


import hospital.Methods.szgn;
import hospital.dbConnect.SqlQueries;

public class Runner {

    public static void main(String[] args) {
        new SqlQueries().createDoctorTable();
        new SqlQueries().createPatientTable();
      new szgn().hospitalRun();
    }
}
