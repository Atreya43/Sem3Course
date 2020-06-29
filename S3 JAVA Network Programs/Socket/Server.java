// Run this program first followed by Client.java

import java.io.*;
import java.net.*;
import java.util.*;

public class Server{
	public static void main(String ar[])	{
		try		{
			ServerSocket server = new ServerSocket(8000);
			Socket client = server.accept();
			DataInputStream fromclient = new DataInputStream(client.getInputStream());
			PrintWriter toclient = new PrintWriter(client.getOutputStream(),true);

			while(true)			{
				Scanner sc = new Scanner(fromclient);
				double radius = sc.nextDouble();
				//System.out.println(radius);

				double area = radius * radius * Math.PI;
				toclient.println(area);
				//System.out.println(area);
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
}