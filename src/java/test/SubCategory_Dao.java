package test;
import java.sql.*;
public class SubCategory_Dao {
    Connection con=null;
    public Connection getConnect() throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/fyndall_db","root","");
    return conn;
    }
    public int SubCategory_Registration(String... data) throws Exception
    {
    int i=0;
        SubCategory_Pojo pojo=new SubCategory_Pojo();
        pojo.setSid(Integer.parseInt(data[0]));
        pojo.setS_name(data[1]);
        pojo.setCid(Integer.parseInt(data[2]));  
        con=getConnect();
        Statement stmt=con.createStatement();
        i=stmt.executeUpdate("insert into sub_category(sid,s_name) values('"+pojo.getSid()+"','"+pojo.getS_name()+"','"+pojo.getCid()+"',')");
    return i;
    
    }
    
}