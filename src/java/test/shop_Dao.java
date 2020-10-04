package test;
import java.sql.*;
public class shop_Dao {
    Connection con=null;
    public Connection getConnect() throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/fyndall_db","root","");
    return conn;
    }
    public int Shop_Registration(String... data) throws Exception
    {
    int i=0;
    shop_Pojo pojo=new shop_Pojo();
        pojo.setShopid(Integer.parseInt(data[0]));
        pojo.setShop_name(data[1]);
        pojo.setShop_add(data[2]);
        pojo.setShop_cat(data[3]);
        pojo.setShop_profile(data[4]);
        pojo.setLandmark(data[5]);
        pojo.setVid(Integer.parseInt(data[3]));
        
        con=getConnect();
        Statement stmt=con.createStatement();
        i=stmt.executeUpdate("insert into shop(shopid,shop_name,shop_add,shop_cat,shop_profile,landmark,vid) values('"+pojo.getShopid()+"','"+pojo.getShop_name()+"','"+pojo.getShop_add()+"','"+pojo.getShop_cat()+"','"+pojo.getShop_profile()+"','"+pojo.getLandmark()+"' ,'"+pojo.getVid()+"')");
    return i;
    
    }
    
}
