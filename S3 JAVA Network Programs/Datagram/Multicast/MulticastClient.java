import java.util.*;
import java.net.*;
import java.io.*;

class MulticastClient{
	public static void main(String[] a)	{
		try{
			MulticastSocket ms = new MulticastSocket(15000);
			//224.0.0.0 to 239.255.255.255
			ms.joinGroup(InetAddress.getByName("239.10.10.10"));
			while(true){
				byte[] dtbytes = new byte[1024];
				DatagramPacket dp = new DatagramPacket(dtbytes,dtbytes.length);
				ms.receive(dp);
				System.out.println("Executed");
				String dtstr = new String(dp.getData());
				System.out.println(dtstr);
				//Thread.sleep(1000);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}

/*
A multicast address is a logical identifier for a group of hosts
in a computer network that are available to process datagrams
or frames intended to be multicast for a designated network
service.
*/