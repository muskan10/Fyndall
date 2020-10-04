package test;
import java.sql.*;
public class User_Dao {
    Connection con=null;
    public Connection getConnect() throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/fyndall_db","root","");
    return conn;
    }
    public int User_Registration(String... data) throws Exception
    {
    int i=0;
        User_Pojo pojo=new User_Pojo();
        pojo.setUid(Integer.parseInt(data[0]));
        pojo.setUsername(data[1]);
        pojo.setUemailid(data[2]);
        pojo.setUcontact(data[3]);
        pojo.setUprofile(data[4]);
        con=getConnect();
        Statement stmt=con.createStatement();
        i=stmt.executeUpdate("insert into user(uid,username,uemailid,ucontact,uprofile) values('"+pojo.getUid()+"','"+pojo.getUsername()+"','"+pojo.getUemailid()+"','"+pojo.getUcontact()+"','"+pojo.getUprofile()+"')");
    return i;
    
    }
    
}