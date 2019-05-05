import java.sql.*;
/**
 * @author 10542
 */
public class LifeWanna {
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
            rs = sql.executeQuery("select Name,LifeExpectancy from country order by LifeExpectancy");
            /**
             * rs.next() 跳读取下一行信息
             * 若有，返回true，继续循环
             * 若无，返回false，停止循环
             */
            while (rs.next()) {
                float life = rs.getInt(2);
                String name;
                //获取第一条数据的信息
                rs.first();
                while (life == 0) {
                    //获取下一条数据的信息
                    rs.next();
                    life = rs.getInt(2);
                }
                name = rs.getString(1);
                System.out.println("The shortest life expectancy in the world:" + name);
                System.out.println ("LifeExpectancy is:" + rs.getInt (2));
                //获取最后一条数据的信息
                rs.last();
                name = rs.getString(1);
                System.out.println("The longest life expectancy in the world:" + name);
                System.out.println ("LifeExpectancy is:" + rs.getInt (2));

            }
        } catch (SQLException e) {
            System.out.println("Error:" + e);
        }
    }
}
