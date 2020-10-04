package test;

/**
 *
 * @author lapi
 */
import java.sql.*;
import java.util.*;
    
public class Query_Dao {
    
    Connection con=null;
    public Connection getConnect() throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/fyndall_db","root","");
        return conn;
       
    }
     
    public int update_query(String...data) throws Exception
    {
     con=getConnect();
      int i=0;
      Statement stmt=con.createStatement();
         Query_Pojo pojo=new Query_Pojo();
        pojo.setQid(Integer.parseInt(data[0]));
        pojo.setUid(Integer.parseInt(data[1]));   
        pojo.setS_name(data[2]);
        pojo.setQuery_des((data[3]));
        pojo.setTimestamp(data[4]);
        i=stmt.executeUpdate("insert into query(qid,uid,sc_name,query_des,timestamp) values('"+pojo.getQid()+"','"+pojo.getUid()+"','"+pojo.getS_name()+"','"+pojo.getQuery_des()+"','"+pojo.getTimestamp()+"')");

          return i;   
    }
}