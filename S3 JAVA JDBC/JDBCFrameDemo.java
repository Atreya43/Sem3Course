import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

class JDBCFrameDemo extends JFrame implements ActionListener
{
	JTextField jtRoll,jtName,jtAdd;
	JLabel jlRoll,jlName,jlAdd;
	JButton jbNext,jbPrevious,jbFirst,jbLast;
	Connection cn;
	Statement st;
	ResultSet rs;
	public JDBCFrameDemo()
	{

		this.setPreferredSize(new Dimension(10,10));
		setLayout(new GridLayout(5,2));
		jtRoll= new JTextField(20);
		jtName= new JTextField(20);
		jtAdd= new JTextField(20);
		jtAdd.setPreferredSize(new Dimension(10,10));
		jlRoll = new JLabel("Roll Number:");
		jlName = new JLabel("Student Name:");
		jlAdd = new JLabel("Student Address:");

		jbNext = new JButton("Next");
		jbPrevious = new JButton("Previous");
		jbFirst = new JButton("First");
		jbLast = new JButton("Last");

		jbNext.addActionListener(this);
		jbPrevious.addActionListener(this);
		jbFirst.addActionListener(this);
		jbLast.addActionListener(this);

		add(jlRoll);
		add(jtRoll);
		add(jlName);
		add(jtName);
		add(jlAdd);
		add(jtAdd);

		add(jbNext);
		add(jbPrevious);
		add(jbFirst);
		add(jbLast);

		openConnection();
		setSize(500,500);
		setVisible(true);

	}

	public void openConnection()
	{
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con = DriverManager.getConnection("jdbc:odbc:Test");

			st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);

			rs = st.executeQuery("select * from Stud");
			rs.first();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

	public void actionPerformed(ActionEvent ae)
	{
		try{
			if(ae.getActionCommand().equals("Next"))
			{
				if(rs.next())
				{
					jtRoll.setText(rs.getString(3));
					jtName.setText(rs.getString(2));
					jtAdd.setText(rs.getString(4));
				}
			}
			if(ae.getActionCommand().equals("Previous"))
			{
							if(rs.previous())
							{
								jtRoll.setText(rs.getString(3));
								jtName.setText(rs.getString(2));
								jtAdd.setText(rs.getString(4));
							}
			}
			if(ae.getActionCommand().equals("First"))
			{
							rs.first();

								jtRoll.setText(rs.getString(3));
								jtName.setText(rs.getString(2));
								jtAdd.setText(rs.getString(4));

			}
			if(ae.getActionCommand().equals("Last"))
			{
							rs.last();

								jtRoll.setText(rs.getString(3));
								jtName.setText(rs.getString(2));
								jtAdd.setText(rs.getString(4));

			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String a[])
	{
		new JDBCFrameDemo();
	}

}