//STEP 1. Import required packages
import java.sql.*;

public class JDBCExample {

   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

      //STEP 3: Open a connection
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection("jdbc:odbc:Test");

     //STEP 4: Execute a query

	       stmt = conn.createStatement();

	       String sql = "CREATE TABLE REGISTRATION " +
	                    "(id INTEGER not NULL, " +
	                    " first VARCHAR(255), " +
	                    " last VARCHAR(255), " +
	                    " age INTEGER, " +
	                    " PRIMARY KEY ( id ))";

	       stmt.executeUpdate(sql);
	       System.out.println("Created table in given database...");

//***************************************************************************

			String sql2 = "INSERT INTO Registration " +
			                   "VALUES (100, 'Zara', 'Ali', 18)";
			stmt.executeUpdate(sql2);

			String sql3 = "INSERT INTO Registration " +
			                   "VALUES (101, 'Mahnaz', 'Fatma', 25)";
			stmt.executeUpdate(sql3);

			String sql4 = "INSERT INTO Registration " +
			                   "VALUES (102, 'Zaid', 'Khan', 30)";
			stmt.executeUpdate(sql4);

			String sql5 = "INSERT INTO Registration " +
			                   "VALUES(103, 'Sumit', 'Mittal', 28)";
			stmt.executeUpdate(sql5);
			System.out.println("Inserted records into the table...");

//***************************************************************************

			String sql6 = "SELECT id, first, last, age FROM Registration";
			      ResultSet rs = stmt.executeQuery(sql6);
			      //STEP 5: Extract data from result set
			      System.out.println("Extract data using select");
			      while(rs.next()){
			         //Retrieve by column name
			         int id  = rs.getInt("id");
			         int age = rs.getInt("age");
			         String first = rs.getString("first");
			         String last = rs.getString("last");

			         //Display values
			         System.out.print("ID: " + id);
			         System.out.print(", Age: " + age);
			         System.out.print(", First: " + first);
			         System.out.println(", Last: " + last);
			      }
			      rs.close();

//***************************************************************************

		String sql7 = "UPDATE Registration " +
                   "SET age = 30 WHERE id in (100, 101)";
      stmt.executeUpdate(sql7);

      // Now you can extract all the records
      // to see the updated records
      String sql8 = "SELECT id, first, last, age FROM Registration";
      ResultSet rs1 = stmt.executeQuery(sql8);

	  System.out.println("\nAfter updating id 100 and 101 age to 30");

      while(rs1.next()){
         //Retrieve by column name
         int id  = rs1.getInt("id");
         int age = rs1.getInt("age");
         String first = rs1.getString("first");
         String last = rs1.getString("last");

         //Display values
         System.out.print("ID: " + id);
         System.out.print(", Age: " + age);
         System.out.print(", First: " + first);
         System.out.println(", Last: " + last);
      }
      rs1.close();

//***************************************************************************

		String sql9 = "DELETE FROM Registration " +
		                   "WHERE id = 101";
		      stmt.executeUpdate(sql9);

		String sql10 = "SELECT id, first, last, age FROM Registration";
		      ResultSet rs2 = stmt.executeQuery(sql10);

		System.out.println("\nAfter deleting id 101");
		while(rs2.next()){
		         //Retrieve by column name
		         int id  = rs2.getInt("id");
		         int age = rs2.getInt("age");
		         String first = rs2.getString("first");
		         String last = rs2.getString("last");

		         //Display values
		         System.out.print("ID: " + id);
		         System.out.print(", Age: " + age);
		         System.out.print(", First: " + first);
		         System.out.println(", Last: " + last);
		      }
      		rs2.close();

//***************************************************************************

		System.out.println("\nFetching records with condition...");
		      String sql11 = "SELECT id, first, last, age FROM Registration" +
		                   //" WHERE id >= 101 ";
		                   // " WHERE first LIKE '%za%' ";
		                   " ORDER BY first ASC";

		      ResultSet rs3 = stmt.executeQuery(sql11);

		      while(rs3.next()){
		         //Retrieve by column name
		         int id  = rs3.getInt("id");
		         int age = rs3.getInt("age");
		         String first = rs3.getString("first");
		         String last = rs3.getString("last");

		         //Display values
		         System.out.print("ID: " + id);
		         System.out.print(", Age: " + age);
		         System.out.print(", First: " + first);
		         System.out.println(", Last: " + last);
		      }
		      rs3.close();

//***************************************************************************

		      String sql1 = "DROP TABLE REGISTRATION ";

			  stmt.executeUpdate(sql1);
			  System.out.println("Table  drop in given database...");

//***************************************************************************

   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            stmt.close();
      }catch(SQLException se2){
      }// nothing we can do
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!");
}//end main
}//end JDBCExample