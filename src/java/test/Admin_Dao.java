package test;
import java.sql.*;
import java.util.ArrayList;

public class Admin_Dao {
    Connection con=null;
    
   
    public Connection getConnect() throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fyndall_db","root","");
            return con;
    }
    //Admin
     public int CheckAdmin(String... data) throws Exception{
        int i=0;
        con = getConnect();
        Statement stmt = con.createStatement();
        Admin_Pojo obj = new Admin_Pojo();
        obj.setUsername(data[0]);
        obj.setPass(data[1]);
        
        ResultSet rs = stmt.executeQuery("select count(*) from admin where username='"+obj.getUsername()+"' and pass='"+obj.getPass()+"' ");
        rs.next();
        i=rs.getInt(1);
        
        return i;
    }
     
     
         public ArrayList<Admin_Pojo> FetchAdmin() throws Exception
    {
        con=getConnect();
        ArrayList<Admin_Pojo> data=new ArrayList<Admin_Pojo>();
        Statement stmt = con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from admin");
        while(rs.next())
        {
            Admin_Pojo obj = new Admin_Pojo();
            obj.setPass(rs.getString(1));
            obj.setUsername(rs.getString(2));
            data.add(obj);
            
        }
        return data;
    }
     
     
     
     //Category
    public int Category_Registration(String... data) throws Exception
    {
        int i=0;
        Category_Pojo pojo=new Category_Pojo();
       // pojo.setCid(Integer.parseInt(data[0]));
        pojo.setCname(data[0]);
        pojo.setCimage(data[1]);
        con=getConnect();
        Statement stmt=con.createStatement();
      i=stmt.executeUpdate("insert into category(cname,cimage) values('"+pojo.getCname()+"','"+pojo.getCimage()+"')");
    return i;
    
    }
    
       public ArrayList<Category_Pojo> FetchCat() throws Exception
    {
        con=getConnect();
        ArrayList<Category_Pojo> data=new ArrayList<Category_Pojo>();
        Statement stmt = con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from category");
        while(rs.next())
        {
            Category_Pojo obj = new Category_Pojo();
            obj.setCid(rs.getInt(1));
            obj.setCname(rs.getString(2));
            obj.setCimage(rs.getString(3));
            data.add(obj);
         }
        return data;
    }

       public ArrayList<shop_Pojo> FetchShopCat() throws Exception
    {
        con=getConnect();
        ArrayList<shop_Pojo> data=new ArrayList<shop_Pojo>();
        Statement stmt = con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from shop1");
        while(rs.next())
        {
            shop_Pojo obj = new shop_Pojo();
            obj.setShopid(rs.getInt(1));
            obj.setShop_name(rs.getString(2));
            obj.setShop_cat(rs.getString(3));
            obj.setShop_add(rs.getString(4));
            obj.setShop_profile(rs.getString(5));
            obj.setLandmark(rs.getString(6));
            obj.setVid(rs.getInt(7));
            data.add(obj);
            
        }
        return data;
    }
       
       
       public int Delete_Cat(int cid)throws Exception
      {
          con = getConnect();
        int i=0;
        Statement stmt = con.createStatement();
        i = stmt.executeUpdate("delete from category where cid= '"+cid+"'");
        return i;
        }
    
 public ArrayList<Category_Pojo> Editcat(int cid) throws Exception
    {
        con = getConnect();
        ArrayList<Category_Pojo> data = new ArrayList<Category_Pojo>();
        Statement stmt = con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from category where cid='"+cid+"'");
        rs.next();
        Category_Pojo obj = new Category_Pojo();
        obj.setCid(rs.getInt(1));
        obj.setCname(rs.getString(2));
        obj.setCimage(rs.getString(3));
        data.add(obj);
        return data;
    }
    
    public int Updatecat(String... data) throws Exception{
        con = getConnect();
        int i=0;
        Statement stmt = con.createStatement();
        Category_Pojo pojo = new Category_Pojo();
        pojo.setCid(Integer.parseInt(data[0]));
        pojo.setCname(data[1]);
        pojo.setCimage(data[2]);
        i=stmt.executeUpdate("update category set cname='"+pojo.getCname()+"',cimage='"+pojo.getCimage()+"'where cid='"+pojo.getCid()+"'");
        return i;
    }
    
       
    //SubCategory
    public int SubCategory_Registration(String... data) throws Exception
    {
    int i=0;
        SubCategory_Pojo pojo=new SubCategory_Pojo();
        pojo.setS_name(data[0]);
        pojo.setCid(Integer.parseInt(data[1]));  
        con=getConnect();
        Statement stmt=con.createStatement();
        i=stmt.executeUpdate("insert into sub_category(s_name,cid) values('"+pojo.getS_name()+"','"+pojo.getCid()+"')");
    return i;
    
    }
    
     public ArrayList<SubCategory_Pojo> FetchSubCat() throws Exception
    {
        con=getConnect();
        ArrayList<SubCategory_Pojo> data=new ArrayList<>();
        Statement stmt = con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from sub_category");
        while(rs.next())
        {
            SubCategory_Pojo obj = new SubCategory_Pojo();
               obj.setSid(rs.getInt(1));
               obj.setS_name(rs.getString(2));
               obj.setCid(rs.getInt(3));
           
         
            data.add(obj);
            
        }
        return data;
    }
     
     
     public ArrayList<SubCategory_Pojo> Editsubcat(int sid) throws Exception
    {
        con = getConnect();
        ArrayList<SubCategory_Pojo> data = new ArrayList<>();
        Statement stmt = con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from sub_category where sid='"+sid+"'");
        rs.next();
        SubCategory_Pojo obj = new SubCategory_Pojo();
        obj.setSid(rs.getInt(1));
        obj.setS_name(rs.getString(2));
        obj.setCid(rs.getInt(3));
        data.add(obj);
        return data;
    }
    
    public int Updatesubcat(String... data) throws Exception{
        con = getConnect();
        int i=0;
        Statement stmt = con.createStatement();
        SubCategory_Pojo pojo = new SubCategory_Pojo();
        pojo.setSid(Integer.parseInt(data[0]));
        pojo.setS_name(data[1]);
        pojo.setCid(Integer.parseInt(data[2]));
        i=stmt.executeUpdate("update sub_category set s_name='"+pojo.getS_name()+"',cid='"+pojo.getCid()+"'where sid='"+pojo.getSid()+"'");
        return i;
    }
    
     
     public int Delete_SubCat (int sid) throws Exception
      {
        con = getConnect();
        int i=0;
        Statement stmt = con.createStatement();
        i = stmt.executeUpdate("delete from sub_category where sid='"+sid+"'");
        return i;  
      }
     
         
 public ArrayList<SubCategory_Pojo> FetchSubCatid(int cid) throws Exception
    {
        con = getConnect();
        ArrayList<SubCategory_Pojo> data = new ArrayList<SubCategory_Pojo>();
        Statement stmt = con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from sub_category where cid='"+cid+"'");
        while(rs.next()){
        SubCategory_Pojo obj = new SubCategory_Pojo();
        obj.setSid(rs.getInt(1));
        obj.setS_name(rs.getString(2));
        obj.setCid(rs.getInt(3));
        data.add(obj);
        }
        return data;
    }
     
     
    //User Registration
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
     
     
    public ArrayList<User_Pojo> FetchUser() throws Exception
    {
        con=getConnect();
        ArrayList<User_Pojo> data=new ArrayList<User_Pojo>();
        Statement stmt = con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from user");
        while(rs.next())
        {
            User_Pojo obj = new User_Pojo();
            //obj.setUid(rs.getInt(1));
            //obj.setUsername(rs.getString(2));
            obj.setUemailid(rs.getString(3));
            //obj.setUcontact(rs.getString(4));
            obj.setUprofile(rs.getString(5));
            
        }
        return data;
    }
     
    
     public int checkUser(String email,String pass) throws Exception{
        con=getConnect();
        Statement stmt =con.createStatement();
        int i=0;
        ResultSet rs=stmt.executeQuery("select count(*) from user where uemailid='"+email+"'and uprofile='"+pass+"'");
        rs.next();
        i=rs.getInt(1);
        return i;
     
 }
     
           public int Update_User(String... data) throws Exception{
        con = getConnect();
        int i=0;
        Statement stmt = con.createStatement();
        User_Pojo pojo = new User_Pojo();
        pojo.setUid(Integer.parseInt(data[0]));
        pojo.setUsername(data[1]);
        pojo.setUemailid(data[2]);
        pojo.setUcontact((data[2]));//check
        pojo.setUprofile(data[4]);
        
        i=stmt.executeUpdate("update user set username='"+pojo.getUsername()+"',uemailid='"+pojo.getUemailid()+"',ucontact='"+pojo.getUcontact()+"',uprofile='"+pojo.getUprofile()+"'where sid='"+pojo.getUid()+"'");
        return i;
    } 
           
            public int Delete_User (int uid) throws Exception
      {
        con = getConnect();
        int i=0;
        Statement stmt = con.createStatement();
        i = stmt.executeUpdate("delete from user where uid='"+uid+"'");
        return i;  
      }
            
    public int checkEmail(String email) throws Exception{
     con=getConnect();
     Statement stmt =con.createStatement();
     int i=0;
     ResultSet rs=stmt.executeQuery("select count(*) from user where uemailid='"+email+"'");
     rs.next();
     i=rs.getInt(1);
     return i;
     
 }
            
    
         
 public ArrayList<User_Pojo> FetchUserQuery(String email) throws Exception
    {
        con = getConnect();
        ArrayList<User_Pojo> data = new ArrayList<>();
        Statement stmt = con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from user where uemailid='"+email+"'");
        while(rs.next()){
            User_Pojo obj = new User_Pojo();
            obj.setUid(rs.getInt(1));
            data.add(obj);
        }
        return data;
    }
     
       
       
       
     //Query Response
     public int Query_response_Dao_Reg(String... data) throws Exception
    {
    int i=0;
        query_response_Pojo pojo=new query_response_Pojo();
        pojo.setQid(Integer.parseInt(data[0]));
        pojo.setUid(Integer.parseInt(data[1]));
        pojo.setVid(Integer.parseInt(data[2]));
        pojo.setResponse_time(data[3]);
        pojo.setTimestamp(data[4]);
        pojo.setVcontact(data[5]);
        con=getConnect();
        Statement stmt=con.createStatement();
        i=stmt.executeUpdate("insert into query_response(qid,uid,vid,res_text,timestamp,vcontact) values('"+pojo.getQid()+"','"+pojo.getUid()+"','"+pojo.getVid()+"','"+pojo.getResponse_time()+"','"+pojo.getTimestamp()+"','"+pojo.getVcontact()+"')");
    return i;
    
    }

     
     public ArrayList<query_response_Pojo> FetchQueryRes() throws Exception
    {
        con=getConnect();
        ArrayList<query_response_Pojo> data=new ArrayList<query_response_Pojo>();
        Statement stmt = con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from query_reponse");
        while(rs.next())
        {
            query_response_Pojo obj = new query_response_Pojo();
            obj.setQid(rs.getInt(1));
            obj.setQrsid(rs.getInt(2));
            obj.setResponse_time(rs.getString(3));
            obj.setTimestamp(rs.getString(4));
            obj.setUid(rs.getInt(5));
            obj.setVid(rs.getInt(6));
            data.add(obj);
            
        }
        return data;
    }
     
     public int Update_QueryResponse(String... data) throws Exception{
        con = getConnect();
        int i=0;
        Statement stmt = con.createStatement();
        query_response_Pojo pojo = new query_response_Pojo();
        pojo.setQrsid(Integer.parseInt(data[0]));
        pojo.setQid(Integer.parseInt(data[1]));
        pojo.setVid(Integer.parseInt(data[2]));
        pojo.setUid(Integer.parseInt(data[3]));
        pojo.setResponse_time(data[4]);
        pojo.setTimestamp(data[5]);
        i=stmt.executeUpdate("update query_response set qresid='"+pojo.getQrsid()+"'uid='"+pojo.getVid()+"',res_text='"+pojo.getResponse_time()+"'timestamp='"+pojo.getTimestamp()+"'where qid='"+pojo.getQid()+"'");
        return i;
    }
     
      public int Delete_Qres (int qrsid)throws Exception
      {
        con = getConnect();
        int i=0;
        Statement stmt = con.createStatement();
        i = stmt.executeUpdate("delete from query_response where qrsid='"+qrsid+"'");
        return i; 
      }
      
      
      
     //Shop Registration
     public int Shop_Registration(String... data) throws Exception
    {
    int i=0;
    shop_Pojo pojo=new shop_Pojo();
        pojo.setShop_name(data[0]);
        pojo.setShop_add(data[1]);
        pojo.setShop_cat(data[2]);
        pojo.setShop_profile(data[3]);
        pojo.setLandmark(data[4]);
        pojo.setVid(Integer.parseInt(data[5]));
        
        con=getConnect();
        Statement stmt=con.createStatement();
        i=stmt.executeUpdate("insert into shop1(shopid,shop_name,shop_add,shop_cat,shop_profile,landmark,vid) values('"+pojo.getShopid()+"','"+pojo.getShop_name()+"','"+pojo.getShop_add()+"','"+pojo.getShop_cat()+"','"+pojo.getShop_profile()+"','"+pojo.getLandmark()+"' ,'"+pojo.getVid()+"')");
    return i;
    
    }
     
         public ArrayList<shop_Pojo> FetchShop() throws Exception
    {
        con=getConnect();
        ArrayList<shop_Pojo> data=new ArrayList<shop_Pojo>();
        Statement stmt = con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from shop1");
        while(rs.next())
        {
            shop_Pojo obj = new shop_Pojo();
            obj.setShopid(rs.getInt(1));
            obj.setShop_name(rs.getString(2));
            obj.setShop_cat(rs.getString(3));
            obj.setShop_add(rs.getString(4));
            obj.setShop_profile(rs.getString(5));
            obj.setLandmark(rs.getString(6));
            obj.setVid(rs.getInt(7));
            data.add(obj);
            
        }
        return data;
    }
       
         
         
     public ArrayList<shop_Pojo> Editshop(int shopid) throws Exception
    {
        con = getConnect();
        ArrayList<shop_Pojo> data = new ArrayList<shop_Pojo>();
        Statement stmt = con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from shop1 where shopid='"+shopid+"'");
        rs.next();
        shop_Pojo obj = new shop_Pojo();
        obj.setShopid(rs.getInt(1));
        obj.setShop_name(rs.getString(2));
        obj.setShop_cat(rs.getString(3));
        obj.setShop_add(rs.getString(4));
        obj.setShop_profile(rs.getString(5));
        obj.setLandmark(rs.getString(6));
        obj.setVid(rs.getInt(7));
        data.add(obj);
        return data;
    }
    
    public int Updateshop(String... data) throws Exception{
        con = getConnect();
        int i=0;
        Statement stmt = con.createStatement();
        shop_Pojo pojo = new shop_Pojo();
        pojo.setShopid(Integer.parseInt(data[0]));
        pojo.setShop_name(data[1]);
        pojo.setShop_cat(data[2]);
        pojo.setShop_add(data[3]);
        pojo.setShop_profile(data[4]);
        pojo.setLandmark(data[5]);
        pojo.setVid(Integer.parseInt(data[6]));
       i=stmt.executeUpdate("update shop1 set shop_name='"+pojo.getShop_name()+"',shop_cat='"+pojo.getShop_cat()+"',shop_add='"+pojo.getShop_add()+"',shop_profile='"+pojo.getShop_profile()+"',landmark='"+pojo.getLandmark()+"',vid='"+pojo.getVid()+"'where shopid='"+pojo.getShopid()+"'");
        return i;
    } 
           
           
          public int Delete_Shop(int shopid) throws Exception
      {
        con = getConnect();
        int i=0;
        Statement stmt = con.createStatement();
        i = stmt.executeUpdate("delete from shop1 where shopid='"+shopid+"'");
        return i;  
      }
     
     //Vendor Registration
      public int Vendor_Registration(String... data) throws Exception
    {
        int i=0;
        vendor_Pojo pojo=new vendor_Pojo();
        pojo.setVname(data[0]);
        pojo.setEmail(data[1]);
        pojo.setV_pwd(data[2]);
        pojo.setContact(data[3]);
        pojo.setVendor_profile(data[4]);
        pojo.setCategory(data[5]);
        con=getConnect();
        Statement stmt=con.createStatement();
        i=stmt.executeUpdate("insert into vendor(vname,email,v_pwd,contact,vendor_profile,category) values('"+pojo.getVname()+"','"+pojo.getEmail()+"','"+pojo.getV_pwd()+"','"+pojo.getContact()+"','"+pojo.getVendor_profile()+"','"+pojo.getCategory()+"')");
    return i;
    
    }
      
             public ArrayList<vendor_Pojo> FetchVendor() throws Exception
    {
        con=getConnect();
        ArrayList<vendor_Pojo> data=new ArrayList<vendor_Pojo>();
        Statement stmt = con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from vendor");
        while(rs.next())
        {
            vendor_Pojo obj = new vendor_Pojo();
            obj.setVid(rs.getInt(1));
            obj.setVname(rs.getString(2));
            obj.setEmail(rs.getString(3));
            obj.setContact(rs.getString(4));
            obj.setVendor_profile(rs.getString(5));
            obj.setCategory(rs.getString(6));
            data.add(obj);
        }
        return data;
    }
         
     public ArrayList<vendor_Pojo> Editvendor(int vid) throws Exception
    {
        con = getConnect();
        ArrayList<vendor_Pojo> data = new ArrayList<vendor_Pojo>();
        Statement stmt = con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from vendor where vid='"+vid+"'");
        rs.next();
        vendor_Pojo obj = new vendor_Pojo();
        obj.setVid(rs.getInt(1));
        obj.setVname(rs.getString(2));
        obj.setEmail(rs.getString(3));
        obj.setV_pwd(rs.getString(4));
        obj.setContact(rs.getString(5));
        obj.setVendor_profile(rs.getString(4));
        obj.setCategory(rs.getString(5));
        data.add(obj);
        return data;
    }
    
    public int Updatevendor(String... data) throws Exception{
        con = getConnect();
        int i=0;
        Statement stmt = con.createStatement();
        vendor_Pojo pojo = new vendor_Pojo();
        pojo.setVid(Integer.parseInt(data[0]));
        pojo.setVname(data[1]);
        pojo.setEmail(data[2]);
        pojo.setV_pwd(data[3]);
        pojo.setContact(data[4]);
        pojo.setVendor_profile(data[5]);
        pojo.setCategory(data[6]);
       i=stmt.executeUpdate("update vendor set vname='"+pojo.getVname()+"',email='"+pojo.getEmail()+"',v_pwd='"+pojo.getV_pwd()+"',contact='"+pojo.getContact()+"',vendor_profile='"+pojo.getVendor_profile()+"',category='"+pojo.getCategory()+"'where vid='"+pojo.getVid()+"'");
        return i;
    } 
              
       public int Delete_Vendor(String vname) throws Exception
      {
        con = getConnect();
        int i=0;
        Statement stmt = con.createStatement();
        i = stmt.executeUpdate("delete from vendor where vname='"+vname+"'");
        return i;  
      }
        
       
     public int checkVendor(String email,String v_pwd) throws Exception{
     con=getConnect();
     Statement stmt =con.createStatement();
     int i=0;
     ResultSet rs=stmt.executeQuery("select count(*) from vendor where email='"+email+"' and v_pwd='"+v_pwd+"'");
     rs.next();
     i=rs.getInt(1);
     return i;
     
 }
             
     
 
 public ArrayList<vendor_Pojo> FetchVendorQuery(String email) throws Exception
    {
        con = getConnect();
        ArrayList<vendor_Pojo> data = new ArrayList<>();
        Statement stmt = con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from vendor where email='"+email+"'");
        while(rs.next()){
        vendor_Pojo obj = new vendor_Pojo();
        obj.setCategory(rs.getString(7));
        data.add(obj);
        }
        return data;
    }
     
 
              
 public ArrayList<vendor_Pojo> FetchVendorid(String email) throws Exception
    {
        con = getConnect();
        ArrayList<vendor_Pojo> data = new ArrayList<>();
        Statement stmt = con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from vendor where email='"+email+"'");
        while(rs.next()){
        vendor_Pojo obj = new vendor_Pojo();
        obj.setVid(rs.getInt(1));
        data.add(obj);
        }
        return data;
    }
 
 
 
              
 public ArrayList<vendor_Pojo> FetchVendorcon(String email) throws Exception
    {
        con = getConnect();
        ArrayList<vendor_Pojo> data = new ArrayList<>();
        Statement stmt = con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from vendor where email='"+email+"'");
        while(rs.next()){
        vendor_Pojo obj = new vendor_Pojo();
        obj.setContact(rs.getString(5));
        data.add(obj);
        }
        return data;
    }
 
    
      //Update Query
      public int QueryRegistration(String...data) throws Exception
    {
     con=getConnect();
      int i=0;
      Statement stmt=con.createStatement();
         Query_Pojo pojo=new Query_Pojo();
        //pojo.setQid(Integer.parseInt(data[0]));
        pojo.setUid(Integer.parseInt(data[0]));   
        pojo.setS_name(data[1]);
        pojo.setQuery_des((data[2]));
        pojo.setTimestamp(data[3]);
        i=stmt.executeUpdate("insert into query(uid,sc_name,query_des,timestamp) values('"+pojo.getUid()+"','"+pojo.getS_name()+"','"+pojo.getQuery_des()+"','"+pojo.getTimestamp()+"')");

          return i;   
    }
      
        public ArrayList<Query_Pojo> FetchQuery() throws Exception
    {
        con=getConnect();
        ArrayList<Query_Pojo> data=new ArrayList<Query_Pojo>();
        Statement stmt = con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from query");
        while(rs.next())
        {
            Query_Pojo obj = new Query_Pojo();
            obj.setQid(rs.getInt(1));
            obj.setUid(rs.getInt(2));
            obj.setS_name(rs.getString(3));
            obj.setQuery_des(rs.getString(4));
            obj.setTimestamp(rs.getString(5));
            data.add(obj);
            
        }
        return data;
    }
        
         public int Update_Query(String... data) throws Exception{
        con = getConnect();
        int i=0;
        Statement stmt = con.createStatement();
        Query_Pojo pojo = new Query_Pojo();
        pojo.setQid(Integer.parseInt(data[0]));
        pojo.setUid(Integer.parseInt(data[1]));
        pojo.setS_name(data[2]);
        pojo.setQuery_des(data[3]);
        pojo.setTimestamp(data[4]);
        i=stmt.executeUpdate("update query set sc_name='"+pojo.getS_name()+"',Query_des='"+pojo.getQuery_des()+"',timestamp='"+pojo.getTimestamp()+"'where pid='"+pojo.getQid()+"'");
        return i;
    }
        
         public int DeleteQuery (int qid) throws Exception
      {
          con = getConnect();
        int i=0;
        Statement stmt = con.createStatement();
        i = stmt.executeUpdate("delete from query where qid='"+qid+"'");
        return i;
      }
      
}
