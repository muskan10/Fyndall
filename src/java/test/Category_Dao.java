package test;
import java.sql.*;

public class Category_Dao {
   
    Connection con=null;
    public Connection getConnect() throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/fyndall_db","root","");
    return conn;
    }
    public int Category_Registration(String... data) throws Exception
    {
    int i=0;
        Category_Pojo pojo=new Category_Pojo();
        pojo.setCid(Integer.parseInt(data[0]));
        pojo.setCname(data[1]);
        
        con=getConnect();
        Statement stmt=con.createStatement();
        i=stmt.executeUpdate("insert into category(cid,cname) values('"+pojo.getCid()+"','"+pojo.getCname()+"',')");
    return i;
    
    }
    
}