import java.io.File;

public class CreateDir {
   public static void main(String args[]) {
      String dirname = "\\g:\\19\\map\\temp";
      File d = new File(dirname);
      // Create directory now.
      d.mkdirs();
  }
}