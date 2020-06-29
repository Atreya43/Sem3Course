
import java.net.*;

class DatagramServer{
	public static void main(String args[])	{
		try		{
			byte[] b = new byte[3];

			DatagramSocket server = new DatagramSocket(8999);
			DatagramPacket packet = new DatagramPacket(b,3);

			server.receive(packet);

			b = packet.getData();

			for(int i=0;i<b.length;i++)
				System.out.println(b[i]);
		}catch(Exception e)		{
			System.out.println(e);
		}
	}
}
