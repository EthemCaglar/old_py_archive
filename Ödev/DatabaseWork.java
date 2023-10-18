import java.sql.*; 

public class DatabaseWork {
    public static final String DB_URL = "jdbc:mysql://localhost:3306/patikabase";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            st = conn.createStatement();

            // Statement ile Insert İşlemi
            String updateQuery1 = "INSERT INTO employees (id,name,position,salary) VALUES ('1','Derek Foster' , 'Project Manager' , '1700')";
            String updateQuery2 = "INSERT INTO employees (id,name,position,salary) VALUES ('2','Bryce Meyer' , 'Communications Director' , '2000')";
            String updateQuery3 = "INSERT INTO employees (id,name,position,salary) VALUES ('3','Joel Haver' , 'Marketing Coordinator' , '1300')";
            String updateQuery4 = "INSERT INTO employees (id,name,position,salary) VALUES ('4','Braxton Sanders' , 'Web Designer' , '1100')";
            String updateQuery5 = "INSERT INTO employees (id,name,position,salary) VALUES ('5','Seth Richardson' , 'Account Executive' , '2000')";
            st.executeUpdate(updateQuery1);
            st.executeUpdate(updateQuery2);
            st.executeUpdate(updateQuery3);
            st.executeUpdate(updateQuery4);
            st.executeUpdate(updateQuery5);

            ResultSet resultSet = st.executeQuery("SELECT * FROM employees");
            while (resultSet.next()) {
                System.out.println("ID : " + resultSet.getInt(1));
                System.out.println("Name : " + resultSet.getString(2));
                System.out.println("Position : " + resultSet.getString(3));
                System.out.println("Salary : " + resultSet.getInt(4));
                System.out.println("#################");
            }

            st.close();
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }

}
