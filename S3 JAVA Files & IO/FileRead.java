import java.io.*;
class FileRead
{
   public static void main(String args[])
  {
	try{
	FileReader in = new FileReader(args[0]);
    BufferedReader br = new BufferedReader(in);
    String strLine;
    //Read File Line By Line
    while ((strLine = br.readLine()) != null)   {
      // Print the content on the console
      System.out.println (strLine);
    }
    //Close the input stream
    in.close();
    }catch (Exception e){//Catch exception if any
      System.err.println("Error: " + e.getMessage());
    }
  }
}
