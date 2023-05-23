package hospital.branch;

import hospital.clinics.*;
import hospital.dbConnect.Connectiondb;

import java.sql.SQLException;

public class BranchQuery {
    public void branchQuery(){
        try {
            Connectiondb.st.execute("insert into t_branch values(1, '"+ new AestheticsPlasticSurgery().clinicName()+"')");
            Connectiondb.st.execute("insert into t_branch values(2, '"+ new AnesthesiaAndReanimation().clinicName()+"')");
            Connectiondb.st.execute("insert into t_branch values(3, '"+ new Dermatology().clinicName()+"')");
            Connectiondb.st.execute("insert into t_branch values(4, '"+ new EmergencyAndAmbulances().clinicName()+"')");
            Connectiondb.st.execute("insert into t_branch values(5, '"+ new EndocrinologyAndMetabolicDiseases().clinicName()+"')");
            Connectiondb.st.execute("insert into t_branch values(6, '"+ new EyeDiseases().clinicName()+"')");
            Connectiondb.st.execute("insert into t_branch values(7, '"+ new InternalMedicine().clinicName()+"')");
            Connectiondb.st.execute("insert into t_branch values(8, '"+ new NutritionAndDiet().clinicName()+"')");
            Connectiondb.st.execute("insert into t_branch values(9, '"+ new OralAndDentalDiseases().clinicName()+"')");
            Connectiondb.st.execute("insert into t_branch values(10, '"+ new Cardiology().clinicName()+"')");
        } catch (SQLException e) {
            System.out.println();
        }
    }


}
