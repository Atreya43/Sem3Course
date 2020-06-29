import java.io.*;

public class FileWriter1{

  public static void main(String[] args) throws IOException{
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Please enter the file name to create : ");
    String file_name = in.readLine();
    File file = new File(file_name);
    boolean exist = file.createNewFile();
    if (!exist)
    {
      System.out.println("File already exists.");
      System.exit(0);
    }
    else
    {
      FileWriter fstream = new FileWriter(file);
      BufferedWriter out = new BufferedWriter(fstream);
      out.write(in.readLine());
      out.close();
      System.out.println("File created successfully.");
    }
  }
}
/*
The another way for writing data to a file, the class
FileWriter and  BufferedWriter are used.

 FileWriter :

 FileWriter is a subclass of OutputStreamWriter class
 that is used to write text  (as opposed to binary
 data) to a file. You create a FileWriter by
 specifying the file to be written to, or optionally,
 when the data should be appended to the end  of an
 existing file instead of overwriting that file. The
 FileWriter class creates  an internal
 FileOutputStream to write bytes to the specified file


BufferedWriter :

The BufferedWriter class is used to write text to a
character-output stream, buffering characters so as
to provide for the efficient writing of single
characters, arrays and strings.The constructor of
the FileWriter class takes the file name which has
to be buffered by the BufferedWriter stream. The
write( ) method of BufferedWriter class is used to
create the file into specified directory.

Following code  write data into new file:

out.write(read_the_Buffered_file_name);

Following code creates the object of FileWriter
and BufferedWriter:
FileWriter fstream = new FileWriter(file_name);
BufferedWriter out = new BufferedWriter(fstream);
*/