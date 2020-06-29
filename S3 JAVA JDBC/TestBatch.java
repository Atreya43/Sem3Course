// Executing a batch of SQL statements

import java.sql.*;

public class TestBatch{

	public static void main(String args[])	{

		try		{

			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con = DriverManager.getConnection("jdbc:odbc:Test");
			Statement st = con.createStatement();
			String[] statements = { "create table Emp( ID integer, EName String)","insert into Emp values(1,'Jenny')","insert into Emp values(2,'Jack')","insert into Emp values(3,'Tom')","commit"};
			for(String s:statements){
				st.addBatch(s);
				int j=st.executeUpdate(s);
			}
			int arr[] = st.executeBatch();
			con.commit();
			for(int i:arr)
				System.out.println(i);
		}catch(Exception e)	{
					System.out.println(e+"\n\n");
		}
	}
}