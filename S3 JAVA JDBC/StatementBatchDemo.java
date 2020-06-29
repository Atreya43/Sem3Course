import java.sql.*;

public class StatementBatchDemo{
	public static void main(String args[])	{
		try	{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection conn = DriverManager.getConnection("jdbc:odbc:Test");
			// Create statement object
			Statement stmt = conn.createStatement();

			// Set auto-commit to false
			conn.setAutoCommit(false);

			// Create SQL statement
			String SQL = "INSERT INTO Employees (id, first, last, age) " +
			             "VALUES(100,'Zia', 'Ali', 30)";
			// Add above SQL statement in the batch.
			stmt.addBatch(SQL);

			// Create one more SQL statement
			String SQL1 = "INSERT INTO Employees (id, first, last, age) " +
			             "VALUES(101,'Raj', 'Kumar', 35)";
			// Add above SQL statement in the batch.
			stmt.addBatch(SQL1);

			// Create one more SQL statement
			String SQL2 = "UPDATE Employees SET age = 28 " +
			             "WHERE id = 200";
			// Add above SQL statement in the batch.
			stmt.addBatch(SQL2);

			// Create an int[] to hold returned values
			int[] count = stmt.executeBatch();

			//Explicitly commit statements to apply changes
			conn.commit();

		}
		catch(Exception e){}
	}
}