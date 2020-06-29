import java.net.*;
class InetAddressTest{

	public static void main(String args[]) throws UnknownHostException {
		InetAddress Address = InetAddress.getLocalHost();
		System.out.println(Address);
		Address = InetAddress.getByName("www.ddu.ac.in");
		System.out.println(Address);
		InetAddress SW[] = InetAddress.getAllByName("www.google.com");
		for (int i=0; i<SW.length; i++)
			System.out.println(SW[i]);
	}
}
/*
MCASTAFF/192.168.*.*
www.ddu.ac.in/199.38.86.197
www.google.com/74.125.236.210
www.google.com/74.125.236.208
www.google.com/74.125.236.209
www.google.com/74.125.236.212
www.google.com/74.125.236.211
Press any key to continue . . .


The getLocalHost( ) method simply returns the InetAddress object
that represents the local host. The getByName( ) method returns
an InetAddress for a host name passed to it. If these methods
are unable to resolve the host name, they throw an UnknownHost
Exception.

On the Internet, it is common for a single name to be used to
represent several machines. In the world of web servers, this
is one way to provide some degree of scaling. The getAllByName( )
factory method returns an array of InetAddresses that represent
all of the addresses that a particular name resolves to. It will
also throw an UnknownHostException if it can't resolve the name
to at least one address.


*/
