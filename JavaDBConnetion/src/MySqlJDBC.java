import java.sql.*;

public class MySqlJDBC {

    private static Connection con;
    private static Statement st;
    private static ResultSet rst;

    private static void setQuery(){

        try {

            String query = "select email from gmxinterns where id=3322";

            con = dbConnection.getConnection();

            st = con.createStatement();

            rst = st.executeQuery(query);

            rst.next();

            String result = rst.getString("email");

            System.out.println(result);

            st.close();
            con.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

        setQuery();

    }

}
