import java.sql.*;

public class PrepStatementBatch{
	public static void main(String args[])	{
		try	{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection conn = DriverManager.getConnection("jdbc:odbc:Test");

			// Create SQL statement
			String SQL = "INSERT INTO Employees (id, first, last, age) " +
			             "VALUES(?, ?, ?, ?)";

			// Create PrepareStatement object
			PreparedStatement pstmt = conn.prepareStatement(SQL);

			//Set auto-commit to false
			conn.setAutoCommit(false);

			// Set the variables
			pstmt.setInt( 1, 400 );
			pstmt.setString( 2, "Ram" );
			pstmt.setString( 3, "Solanki" );
			pstmt.setInt( 4, 33 );
			// Add it to the batch
			pstmt.addBatch();

			// Set the variables
			pstmt.setInt( 1, 401 );
			pstmt.setString( 2, "Shyam" );
			pstmt.setString( 3, "Rao" );
			pstmt.setInt( 4, 31 );
			// Add it to the batch
			pstmt.addBatch();

			//add more batches


			//Create an int[] to hold returned values
			int[] count = pstmt.executeBatch();

			//Explicitly commit statements to apply changes
			conn.commit();
		}
		catch(Exception e){}
	}
}