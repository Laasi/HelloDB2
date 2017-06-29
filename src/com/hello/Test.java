package com.hello;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Test {
	public Test(){}
	
 public Employee getEmployee() {
	 Employee emp = new Employee(); 
 try {
 Class.forName("com.ibm.db2.jcc.DB2Driver");
 } catch (ClassNotFoundException e) {
 System.out.println("Please include Classpath Where your DB2 Driver is located");
 e.printStackTrace();
 return null;
 }
 System.out.println("DB2 driver is loaded successfully");
 Connection conn = null;
 PreparedStatement pstmt = null;
 ResultSet rset=null;
 boolean found=false;
 try {
 conn = DriverManager.getConnection("jdbc:db2://192.168.99.100:50000/SIMPLE","DB2INST1","db2inst1-pwd");
 if (conn != null)
 {
 System.out.println("DB2 Database Connected");
 }
 else
 {
 System.out.println("Db2 connection Failed ");
 }
 pstmt=conn.prepareStatement("Select * from user");
 rset=pstmt.executeQuery();
 if(rset!=null)
 {
 while(rset.next())
 {
 found=true;
 System.out.println("user"+rset.getString("username"));
 emp.setUser(rset.getString("username"));
 emp.setPwd(rset.getString("password"));
 
 }
 
 }
 if (found ==false)
 {
 System.out.println("No Information Found");
 }
 } catch (SQLException e) {
 System.out.println("DB2 Database connection Failed");
 e.printStackTrace();
 
 }
 System.out.println("emp is"+emp);
return emp;
 }
 }


