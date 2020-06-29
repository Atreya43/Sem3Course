import java.sql.*;
public class TestStatement {
	public static void main (String args[])	{

		try	{

			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con = DriverManager.getConnection("jdbc:odbc:test");
			Statement st= con.createStatement();
			ResultSet rs = st.executeQuery("select * from Student");
			while(rs.next())
				 System.out.println(rs.getInt(1)+" "+rs.getString(2)) ;
		}
		catch(Exception e){}
	}
}
