package advancejava;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
 public class Advancejava
 {
 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
 static final String DB_URL = "jdbc:mysql://localhost:3306/test";
 static final String USER = "root";
  static final String PASS = ""; 

 public static void main(String[] args)
 {
 Connection conn = null;
 Statement stmt = null;
 try
 {
 Class.forName("com.mysql.jdbc.Driver");
 System.out.println("Connecting to database...");
 conn = DriverManager.getConnection(DB_URL, USER, PASS);
 System.out.println("Connected database successfully...");
 System.out.println("Creating table in given database...");
 stmt = conn.createStatement();
 String sql = "CREATE TABLE Emplyee " +
 "(id INTEGER not NULL, " +
 " first VARCHAR(255), " +
 " last VARCHAR(255), " +
 " age INTEGER, " +
 " PRIMARY KEY ( id ))";
 stmt.executeUpdate(sql);
 System.out.println("Created table in given database...");
 }
 catch(SQLException se)
 {
 //Handle errors for JDBC
 se.printStackTrace();
 }
 catch(Exception e)
 {
 //Handle errors for Class.forName
 e.printStackTrace();
 }
 finally{
 //finally block used to close resources
 try{
 if(stmt!=null)
 conn.close();
 }
 catch(SQLException se)
 { }
 try
 {
 if(conn!=null)
 conn.close();
 }
 catch(SQLException se)
 {
 se.printStackTrace();
 }//end finally try
 }//end try
 System.out.println("Goodbye!");

 }
 }
