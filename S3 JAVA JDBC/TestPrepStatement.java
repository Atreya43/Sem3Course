import java.sql.*;

public class TestPrepStatement{
	public static void main(String args[])	{
		try	{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection cn = DriverManager.getConnection("jdbc:odbc:Test");
			/* Create a PreparedStatement by calling prepareStatement() method with
			   parameterised SQL statement.
			*/
			PreparedStatement ps = cn.prepareStatement("Select * from Student where StudId = ? and StudName = ? ");

			// Assign a value to the parameter.
			ps.setInt(1,2);
			ps.setString(2,"PQR");

			// Note that now the executeQuery() method doesn't take any arguemnt.
			ResultSet rs = ps.executeQuery();
			while(rs.next())
				 System.out.println(rs.getInt(1)+" "+rs.getString(2));

			ps.setInt(1,1);
			ps.setString(2,"ABC");
			ResultSet rs1= ps.executeQuery();

			while(rs1.next())
				 System.out.println(rs1.getInt(1)+" "+rs1.getString(2));
		}
		catch(Exception e){}
	}
}