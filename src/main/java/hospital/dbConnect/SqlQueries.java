package hospital.dbConnect;

import java.sql.SQLException;

public class SqlQueries extends Connection {

    public void createDoctorTable() {
        try {
            st.execute("CREATE TABLE IF NOT EXISTS t_doctors(" +
                    "d_id INTEGER PRIMARY KEY not null," +
                    "name VARCHAR(255) NOT NULL," +
                    "surname VARCHAR(255) NOT NULL," +
                    "branch varchar(255) not null)");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void createPatientTable() {
        try {
            st.execute("CREATE TABLE IF NOT EXISTS t_patients(" +
                    "t_id INTEGER," +
                    "name varchar(255) not null," +
                    "surname varchar(255) not null," +
                    "diseases varchar(255) not null," +
                    "doctor_id INTEGER not null  ," +
                    "constraint doctor_fk foreign key (doctor_id) references t_doctors (d_id) )");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
