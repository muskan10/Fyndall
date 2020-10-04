package test;
import java.sql.*;
public class vendors_dao {
    Connection con=null;
    public Connection getConnect() throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/fyndall_db","root","");
    return conn;
    }
    public int Vendor_Registration(String... data) throws Exception
    {
    int i=0;
        vendor_Pojo pojo=new vendor_Pojo();
        pojo.setVname(data[0]);
        pojo.setEmail(data[1]);
        pojo.setContact(data[2]);
        pojo.setVendor_profile(data[3]);
        con=getConnect();
        Statement stmt=con.createStatement();
        i=stmt.executeUpdate("insert into vendor(vname,email,contact,vendor_profile,v_pwd) values('"+pojo.getVname()+"','"+pojo.getEmail()+"','"+pojo.getContact()+"','"+pojo.getVendor_profile()+"','"+pojo.getV_pwd()+"')");
    return i;
    
    }
    
}