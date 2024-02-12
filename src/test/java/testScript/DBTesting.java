package testScript;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DBTesting {	
	//connection object
	static Connection con=null;
	//statement object
	private static Statement stmt;
	//database url sqlite
	public static String DB_URL="jdbc:sqlite:C://Users/pragathi.binu/testTrgDB.db";
	//database username
	public static String DB_USER="";
	//database password
	public static String DB_PASSWORD="";
	
	@BeforeTest
	public void setUp() throws Exception{
		try {
			Connection con=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
			stmt=con.createStatement();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test
	public void test() {
		try {
			String query="select * from Students";
			//get contents of userinfo table from db
			ResultSet res=stmt.executeQuery(query);
			//print the result until all records are printed
			//res.nxt return true if there is any next record
			while(res.next())
			{
				System.out.print(res.getString(1));
				System.out.print(" "+res.getString(2));
				System.out.print(" "+res.getString(3));
				System.out.print(" "+res.getString(4));
				System.out.print(" "+res.getString(5));
				
				
			}
			String query1="Select name from Students Where Students.id NOT IN(SELECT studentID FROM Student_Courses)";
			ResultSet res1=stmt.executeQuery(query1);
			String studName="";
			while(res1.next())
			{
				studName=res1.getString("name");
			}
			System.out.println("student name:"+studName);
			Assert.assertEquals(studName, "Rattan");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@AfterTest
	public void tearDown() throws Exception{
		//close DB connection
		if(con!=null)
		{
			con.close();
		}
	}
  
}
