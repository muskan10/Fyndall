package test;
import java.sql.*;
public class query_response_Dao {
    Connection con=null;
    public Connection getConnect() throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/fyndall_db","root","");
    return conn;
    }
    public int Query_response_Dao_Reg(String... data) throws Exception
    {
    int i=0;
        query_response_Pojo pojo=new query_response_Pojo();
        pojo.setQrsid(Integer.parseInt(data[1]));
        pojo.setQid(Integer.parseInt(data[0]));
        pojo.setUid(Integer.parseInt(data[4]));
        pojo.setVid(Integer.parseInt(data[5]));
        pojo.setResponse_time(data[2]);
        pojo.setTimestamp(data[3]);
        con=getConnect();
        Statement stmt=con.createStatement();
        i=stmt.executeUpdate("insert into query_response(qresid,qid,uid,vid,res_text,timestamp) values('"+pojo.getQrsid()+"','"+pojo.getQid()+"','"+pojo.getUid()+"','"+pojo.getVid()+"','"+pojo.getResponse_time()+"','"+pojo.getTimestamp()+"' ");
    return i;
    
    }
 }