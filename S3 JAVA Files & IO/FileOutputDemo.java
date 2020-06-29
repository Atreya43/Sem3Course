import java.io.*;

class FileOutputDemo{

	public static void main(String args[])        {
	    FileOutputStream out; // declare a file output object
        PrintStream p; // declare a print stream object
	        try{

            	out = new FileOutputStream("out.txt");

                // Connect print stream to the output stream
                p = new PrintStream( out );

                p.println ("Hi...");
                p.println("Welcome..");
                String s = "All";
                byte[] buf = new byte[1024];
                buf= s.getBytes();
                p.write(buf);

                p.close();
            }catch (Exception e)                {
                  System.err.println ("Error writing to file");
            }
        }
}

