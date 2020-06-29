import java.net.*;
import java.io.*;

public class URLDemo{
   public static void main(String [] args)   {
      try      {
         //protocol://host:port/path?query#ref
         //With HTTP, the default port is 80.
         URL url = new URL("http://www.myjava.com/index.htm?language=en#j2se");
         System.out.println("URL is " + url.toString());
         System.out.println("protocol is "+ url.getProtocol());
         System.out.println("authority is "+ url.getAuthority());
         System.out.println("file name is " + url.getFile());
         System.out.println("host is " + url.getHost());
         System.out.println("path is " + url.getPath());
         System.out.println("port is " + url.getPort());
         System.out.println("default port is "+ url.getDefaultPort());
         System.out.println("query is " + url.getQuery());
         System.out.println("ref is " + url.getRef());
      }
      catch(IOException e)      {
         e.printStackTrace();
      }
   }
}
/*
URL is http://www.myjava.com/index.htm?language=en#j2se
protocol is http
authority is www.myjava.com
file name is /index.htm?language=en
host is www.myjava.com
path is /index.htm
port is -1
default port is 80
query is language=en
ref is j2se
Press any key to continue . . .




URL is https://docs.oracle.com/javase/tutorial/networking/overview/networking.ht
ml
protocol is https
authority is docs.oracle.com
file name is /javase/tutorial/networking/overview/networking.html
host is docs.oracle.com
path is /javase/tutorial/networking/overview/networking.html
port is -1
default port is 443
query is null
ref is null
Press any key to continue . . .



*/







