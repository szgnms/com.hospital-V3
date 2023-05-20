package hospital.dbConnect;

import java.sql.SQLException;

public class SqlQueries extends Connection {

    public void createDoctorTable() {
        try {
            st.execute("CREATE TABLE IF NOT EXISTS t_doctors(" +
                    "doctor_id INTEGER PRIMARY KEY not null," +
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
                    "patient_id INTEGER," +
                    "name varchar(255) not null," +
                    "surname varchar(255) not null," +
                    "diseases varchar(255) not null," +
                    "doctors_id INTEGER   ," +
                    "constraint doctor_fk foreign key (doctors_id) references t_doctors (doctor_id) )");
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

    public void addPatient(int id, String name, String surname, String diseases) {
        try {
            st.execute("insert into t_patients values(" + id + ",'" + name + "'," + "'" + surname + "'," + "'" + diseases + "')");
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
        System.out.println("-----------------------------------------------------------");

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
        System.out.println("-----------------------------------------------------------");
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
        System.out.println("-----------------------------------------------------------");
    }

    public void printPatientValues(String table) {
        try {
            rs = st.executeQuery("select * from " + table);
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

    public <T> void printDoctorWithValue(String tableName, String columnName, T value) {
        try {
            rs = st.executeQuery("select * from " + tableName + " where " + columnName + " ilike '" + value + "' ");
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

}





