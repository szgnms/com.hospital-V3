package hospital.dbConnect;
import hospital.methods.PatientsMethods;
import hospital.methods.DoctorsMethods;

import java.sql.SQLException;


public class SqlQueries extends Connectiondb {

    public void createBranch(){
        try {
            st.execute("create table if not exists t_branch("+
                    "doctor_id integer not null," +
                    "branch varchar(255) not null unique)");
        } catch (SQLException e) {
            System.out.println();;

        }
    }

    public void createDiseases(){
        try {
            st.execute("create table if not exists t_disease("+
                    "doctor_id integer not null," +
                    "disease varchar(255) not null unique)");
        } catch (SQLException e) {
            System.out.println();;

        }
    }



    public void createDoctorTable() {
        try {
            st.execute("CREATE TABLE IF NOT EXISTS t_doctors(" +
                    "doctor_id INTEGER not null," +
                    "name VARCHAR(255) NOT NULL," +
                    "surname VARCHAR(255) NOT NULL," +
                    "branch varchar(255) not null)");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void createDischargePatient() {
        try {
            st.execute("CREATE TABLE IF NOT EXISTS t_discharge_patient(" +
                    "patient_id INTEGER not null," +
                    "name VARCHAR(255) NOT NULL," +
                    "surname VARCHAR(255) NOT NULL," +
                    "diseases varchar(255) not null," +
                    "doktor_id INTEGER)");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void createPatientTable() {
        try {
            st.execute("CREATE TABLE IF NOT EXISTS t_patients(" +
                    "patient_id INTEGER," +
                    "name varchar(255) not null," +
                    "surname varchar(255) not null," +
                    "diseases varchar(255) not null," +
                    "doctors_id INTEGER,  " +
                    "room_number INTEGER)");

                   // "constraint doctor_fk foreign key (doctors_id) references t_doctors (doctor_id) )");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void addDoctor(int id, String name, String surname, String branch) {
        try {
            st.execute("insert into t_doctors values(" + id + ",'" + name + "'," + "'" + surname + "'," + "'" + branch + "')");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void addPatient(int id, String name, String surname, String diseases, int drId, int room) {
        try {
            st.execute("insert into t_patients values(" + id + ",'" + name + "'," + "'" + surname + "'," + "'" + diseases + "',"+ drId+","+room+" )");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void addDischargePatient(int id, String name, String surname, String diseases) {
        try {
            st.execute("insert into t_discharge_patient values(" + id + ",'" + name + "'," + "'" + surname + "'," + "'" + diseases + "')");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void addDischargedPatient(int id, String name, String surname, String diseases, int doctorId) {
        try {
            st.execute("insert into t_discharge_patient values(" + id + ",'" + name + "'," + "'" + surname + "'," + "'" + diseases + "',"+doctorId+" )");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


    public void printDoctorValues(String table) {
        try {
            rs = st.executeQuery("select * from " + table);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("------------------------------------------------------------------------------------");

        try {
            System.out.printf("%-15s %-15.15s %-15.15s  %-4s \n",
                    rs.getMetaData().getColumnName(1),
                    rs.getMetaData().getColumnName(2),
                    rs.getMetaData().getColumnName(3),
                    rs.getMetaData().getColumnName(4)
                   );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("------------------------------------------------------------------------------------");
        try {
            while (rs.next()) {
                System.out.printf("%-15s %-15.15s %-15.15s %-4s \n",
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)

                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("------------------------------------------------------------------------------------");
    }

    public void printPatientValues(String table) {
        try {
            rs = st.executeQuery("select * from " + table);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("-----------------------------------------------------------------------------------------------");

        try {
            System.out.printf("%-15s %-15.15s %-15.15s %-35.35s %-4s \n",
                    rs.getMetaData().getColumnName(1),
                    rs.getMetaData().getColumnName(2),
                    rs.getMetaData().getColumnName(3),
                    rs.getMetaData().getColumnName(4),
                    rs.getMetaData().getColumnName(5));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("-----------------------------------------------------------------------------------------------");
        try {
            while (rs.next()) {
                System.out.printf("%-15s %-15.15s %-15.15s %-35.35s %-4s \n",
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5)
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("-----------------------------------------------------------------------------------------------");
    }


    public <T> void printPatientWithValue(String tableName, String columnName, T value) {
        try {
            rs = st.executeQuery("select * from " + tableName + " where " + columnName + " ilike '" + value + "' ");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("---------------------------------------------------------------------------");
        try {
            System.out.printf("%-15s %-15.15s %-15.15s %-15s %-4s \n",
                    rs.getMetaData().getColumnName(1),
                    rs.getMetaData().getColumnName(2),
                    rs.getMetaData().getColumnName(3),
                    rs.getMetaData().getColumnName(4),
                    rs.getMetaData().getColumnName(5));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("---------------------------------------------------------------------------");
        try {
            while (rs.next()) {
                System.out.printf("%-15s %-15.15s %-15.15s %-15s %-4s \n",
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5)
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("---------------------------------------------------------------------------");

    }

    public  void printDoctorWithId( int value) {
        String sql ="select * from t_doctors where doctor_id  = ?" ;
        setPrepareStatement(sql);
        try {
            prst.setInt(1, value);
           rs=prst.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("---------------------------------------------------------------------------");
        try {
            System.out.printf("%-15s %-15.15s %-15.15s %-4s \n",
                    rs.getMetaData().getColumnName(1),
                    rs.getMetaData().getColumnName(2),
                    rs.getMetaData().getColumnName(3),
                    rs.getMetaData().getColumnName(4)
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("---------------------------------------------------------------------------");
        try {
            while (rs.next()) {
                System.out.printf("%-15s %-15.15s %-15.15s %-4s \n",
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("---------------------------------------------------------------------------");

    }

    public  void printPatientWithId( int value) {
        String sql ="select * from t_patients where patient_id  = ?" ;
        setPrepareStatement(sql);
        try {
            prst.setInt(1, value);
            rs=prst.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("---------------------------------------------------------------------------");
        try {
            System.out.printf("%-15s %-15.15s %-15.15s %-15.15s %-4s \n",
                    rs.getMetaData().getColumnName(1),
                    rs.getMetaData().getColumnName(2),
                    rs.getMetaData().getColumnName(3),
                    rs.getMetaData().getColumnName(4),
                    rs.getMetaData().getColumnName(5)
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("---------------------------------------------------------------------------");
        try {
            while (rs.next()) {
                System.out.printf("%-15s %-15.15s %-15.15s %-15.15s  %-4d \n",
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                         rs.getInt(5)
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("---------------------------------------------------------------------------");


    }

    public <T> void printDoctorWithValue(String tableName, String columnName, T value) {
        try {
            rs = st.executeQuery("select * from " + tableName + " where " + columnName + " ilike '" + value + "' ");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("---------------------------------------------------------------------------");
        try {
            System.out.printf("%-15s %-15.15s %-15.15s  %-4s \n",
                    rs.getMetaData().getColumnName(1),
                    rs.getMetaData().getColumnName(2),
                    rs.getMetaData().getColumnName(3),
                    rs.getMetaData().getColumnName(4) );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("---------------------------------------------------------------------------");
        try {
            while (rs.next()) {
                System.out.printf("%-15s %-15.15s %-15.15s  %-4s \n",
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("---------------------------------------------------------------------------");

    }

    public void setPrepareStatement(String sql) {
        try {
            prst = conn.prepareStatement(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public   void deleteDoctorWithId(int id) {

        String query = "delete from t_doctors where doctor_id = ?";
        setPrepareStatement(query);

        try {
           prst.setInt(1,id);
           int deleted = prst.executeUpdate();
           if (deleted>0){
               System.out.println(id+ " doctor was deleted with success");
           }else{
               System.out.println(id+" doctor not found");

               new DoctorsMethods().doctorMenu();
           }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public   void deletePatientWithId(int id) {
        String query = "delete from t_patients where patient_id = ?";
        setPrepareStatement(query);

        try {
            prst.setInt(1,id);
            int deleted = prst.executeUpdate();
            if (deleted>0){
                System.out.println(" patient with an id of"+ id +" was successfully deleted");
            }else{
                System.out.println(" patient with an ID of "+ id +" could not be found");

                new PatientsMethods().patientDischarged();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



}





