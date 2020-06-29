
import java.net.*;
import java.io.*;

public class ReadIPAddress{
  public static void main(String[] args )throws IOException {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter the host name: ");
    String hostname = input.readLine();
    try {
      InetAddress inetadd = InetAddress.getByName(hostname);
      System.out.println("IP address is: " + inetadd.getHostAddress());
    }
    catch(UnknownHostException e ){
      System.out.println("Could not find IP address for: " + hostname);
    }
  }
}
/*
OUPUT 1
-------
Enter the host name: www.ddu.ac.in
IP address is: 199.38.86.197
Press any key to continue . . .

Enter the host name: google.com
IP address is: 216.58.199.174
Press any key to continue . . .

Enter the host name: gmail.com
IP address is: 216.58.199.165
Press any key to continue . . .

Enter the host name: yahoo.com
IP address is: 98.139.183.24
Press any key to continue . . .
*/