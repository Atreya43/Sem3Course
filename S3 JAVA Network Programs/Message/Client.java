import java.util.*;
import java.net.*;
import java.io.*;

class Client{

      public void connect()      {
        System.out.println("Client PC");
        try  {
          while(true)  {
             Socket s=new Socket("localhost",8888);

            PrintWriter pr= new PrintWriter(s.getOutputStream(),true);
            System.out.print("\n Enter Message :=");
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();

            pr.println(str);

            Scanner sc1=new Scanner(s.getInputStream());
            String str1=sc1.nextLine();
            System.out.println("Message Received :-\n"+str1);
          }
        }
        catch(Exception e)        {}
      }
      public static void main(String argc[])      {
      	Client cl=new Client();
      	cl.connect();
      }
}