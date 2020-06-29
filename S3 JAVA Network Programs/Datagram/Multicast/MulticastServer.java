import java.util.*;
import java.net.*;
import java.io.*;

class MulticastServer{
	public static void main(String[] a)	{
		try{
			MulticastSocket ms = new MulticastSocket();
			while(true){
				Date dt = new Date();
				byte[] dtbytes = dt.toString().getBytes();
				DatagramPacket dp =
				new DatagramPacket(dtbytes,dtbytes.length,InetAddress.getByName("239.10.10.10"),15000);
				ms.send(dp);
				System.out.println("Packet Sent");
				Thread.sleep(1000);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}