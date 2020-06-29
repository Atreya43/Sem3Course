import java.net.*;
import java.io.*;

public class URLReadFile{
  public static void main(String[] args) throws IOException{
    try{
      URL url = new URL("file:URLReadFile.java");
      //BufferedReader buff = new BufferedReader(new InputStreamReader(url.openStream()));
      URLConnection urlConnection = url.openConnection();
      BufferedReader buff = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
      String str;
      while((str = buff.readLine()) != null) {
        System.out.println("\n");
        System.out.println(str);
      }
      buff.close();
    }
    catch(IOException e){
      System.err.println(e);
    }
  }
}