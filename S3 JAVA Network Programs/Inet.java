import java.net.*;

public class Inet{
	public static void main(String args[])	{
		try		{
			InetAddress ip = InetAddress.getLocalHost();
			System.out.println("IP address of local machine : "+ip);
		}
		catch(Exception e){}
	}
}

/*

OUTPUT
=======
IP address of local machine : MCASTAFF/192.168.39.*
Press any key to continue . . .
*/