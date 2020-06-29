import java.util.*;
import java.net.*;
import java.io.*;


 class Server{

           public void connecting() {
			   System.out.println("Server ");

               try {

                   ServerSocket ss=new ServerSocket(8888);
                   while(true) {


                      Socket s=ss.accept();
                      Scanner sc1=new Scanner(s.getInputStream());
                       String str=sc1.nextLine();

                      System.out.println("Message Received :-\n"+str);

                      System.out.println("\n Enter Message :-");
                      Scanner sc=new Scanner(System.in);
                      String st=sc.nextLine();
                      PrintWriter pr= new PrintWriter(s.getOutputStream(),true);
                      pr.println(st);
                   }
               }
               catch(Exception e){
                   System.out.println(""+e.getMessage());
               }
          }

       public static void main(String argc[]){
          Server sr=new Server();
           sr.connecting();
       }
}