import java.io.*;
import java.util.*;
import java.net.*;

public class MTS{
	public static void main(String args[]){
		try	{

			ServerSocket s =new ServerSocket(8000);
			int i=1;

			while(true)	{
				Socket conn = s.accept();
				System.out.println("Starting thread " + i);
				ThreadHandler t = new ThreadHandler(conn,i);
				t.start();
				i++;
			}
		}catch(IOException ioe)	{
			System.out.println(ioe);
		}
	}
}

class ThreadHandler extends Thread{
	private Socket conn;
	private int count;

	public ThreadHandler(Socket c,int i)	{
		conn = c;
		count=i;
	}
	public void run()	{
		try		{

			DataInputStream fromClient = new DataInputStream(conn.getInputStream());
			PrintWriter toclient = new PrintWriter(conn.getOutputStream(),true);

			while(true)	{
				Scanner in = new Scanner(fromClient);
				double radius = in.nextDouble();
				System.out.println(radius);

				double area = radius * radius * Math.PI;
				toclient.println(area);
				System.out.println(area);
			}
		}catch(IOException ioe)		{
			System.out.println(ioe);
		}
	}
}










