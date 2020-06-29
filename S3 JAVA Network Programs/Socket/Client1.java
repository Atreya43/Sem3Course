
// Run Server.java first.


import java.io.*;
import java.net.*;
import java.util.*;
public class Client1{
	public static void main(String ar[])	{
		try		{
			Socket client = new Socket("localhost",8000);
			DataInputStream fromserver = new DataInputStream(client.getInputStream());
			PrintWriter toserver = new PrintWriter(client.getOutputStream(),true);

			while(true)			{
				System.out.println("Enter the radius:");
				Scanner sc = new Scanner(System.in);

				double radius = sc.nextDouble();
				toserver.println(radius);

				Scanner sc1 = new Scanner(fromserver);
				double area = sc1.nextDouble();
				System.out.println(area);
			}
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}
