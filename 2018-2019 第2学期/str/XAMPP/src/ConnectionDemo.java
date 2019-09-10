import static java.lang.System.out;
import java.sql.*;

public class ConnectionDemo {
    public static void main(String[] args)
            throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String jdbcUrl = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String passwd = "";
        try(Connection conn =
                    DriverManager.getConnection(jdbcUrl, user, passwd)) {
            out.printf("已%s数据库连接%n",
                    conn.isClosed() ? "关闭" : "打开");
        }
    }
}