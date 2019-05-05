import java.sql.*;
import java.util.Scanner;
/**
 * @author 10542
 */
public class CityWanna {
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
        //输入学号20175223得：5017522
        //magicNumber[] 替换魔法值
        int [] magicNumber = new int[]{10,1000000};
        int studentId ,frist ,last;
        System.out.println ("Input your student's id:");
        Scanner reader = new Scanner (System.in);
        studentId = reader.nextInt ();
        frist = studentId/10;
        last = studentId%10;
        frist = frist + last*1000000;
        if (frist/magicNumber[1]==magicNumber[0]) {
            frist=(frist-10000000)+1000000;
        }
        else if (frist/magicNumber[1]>magicNumber[0]) {
            frist=frist-10000000;
        }
        System.out.println ("Result:" +frist);
        try {
            //Statement sql = con.createStatement(); -> 向数据库发送SQL查询语句
            sql = con.createStatement();
            //ResultSet rs = sql.executeQuery(sqlStr); -> 处理查询结果
            rs = sql.executeQuery("select*from city where population>"+Integer.toString (frist));
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String countryCode = rs.getString(3);
                String district = rs.getString(4);
                int population = rs.getInt(5);
                System.out.printf("%d\t", id);
                System.out.printf("%s\t", name);
                System.out.printf("%s\t", countryCode);
                System.out.printf("%s\t", district);
                System.out.printf("%d\n", population);
            }
            //立刻关闭连接
            con.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e);
        }
    }
}