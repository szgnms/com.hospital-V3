package hospital;

import hospital.dbConnect.SqlQueries;

public class Runner {

    public static void main(String[] args) {
        new SqlQueries().createDoctorTable();
        new SqlQueries().createPatientTable();

        new SqlQueries().printPatientValues("t_patients");
        new SqlQueries().printDoctorValues("t_doctors");
        new SqlQueries().addDoctor(1,"ali","veli","test");
        new SqlQueries().addPatient(1,"ali","veli","test");
        new SqlQueries().printDoctorWithValue("t_doctors","name","ali");
        new SqlQueries().printPatientWithValue("t_patients","name","ali");
    }
}
