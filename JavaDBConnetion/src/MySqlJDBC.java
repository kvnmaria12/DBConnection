import java.sql.*;

public class MySqlJDBC {

    public static void main(String[] args) {

        try {
            String url = "jdbc:mysql://localhost:3306/sys";
            String username = "root";
            String password = "kvnmaria@12";

            String query = "select email from gmxinterns where id=3322";

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, username, password);

            Statement st = con.createStatement();

            ResultSet rst = st.executeQuery(query);

            rst.next();

            String result = rst.getString("email");

            System.out.println(result);

            st.close();
            con.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
