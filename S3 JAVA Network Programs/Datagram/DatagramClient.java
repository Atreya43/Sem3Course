
import java.net.*;

class DatagramClient{
	public static void main(String args[])	{
		try		{
			byte []b =new byte[]{1,2,3};
			DatagramSocket client = new DatagramSocket(8777,InetAddress.getLocalHost());
			DatagramPacket data = new DatagramPacket(b,3,InetAddress.getLocalHost(),8999);

			// Each datagram is addressed individually.
			client.send(data);
		}
		catch(Exception e)		{
			System.out.println(e);
		}
	}
}
