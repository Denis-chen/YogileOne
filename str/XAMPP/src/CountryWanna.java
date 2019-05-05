import java.sql.*;
/**
 * @author 10542
 */
public class CountryWanna {
    public static void main(String[] args) throws SQLException {
        Connection con;
        Statement sql;
        ResultSet rs;
        String uri = "jdbc:mysql://localhost:3306/world";
        String user = "root";
        String password = "";
        con = DriverManager.getConnection(uri, user,password);
        if (con == null) {
            return;
        }
        try {
            sql = con.createStatement();
            rs = sql.executeQuery("select Name,Population from country where Region = 'Middle East'");
            int allPopulation = 0;
            while (rs.next()) {
                String name = rs.getString(1);
                int population = rs.getInt(2);
                System.out.printf("The population of %s is %d\n", name, population);
                allPopulation = allPopulation + population;
            }
            System.out.println("The population of Middle East" + allPopulation);
        } catch (SQLException e) {
            System.out.println("Error:" + e);
        }

    }
}
