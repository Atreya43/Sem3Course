import java.io.*;
import java.util.zip.*;

class testZip{
	public static void main(String args[]){
		// These are the files to include in the ZIP file
		String[] filenames = new String[]{"myfile.txt","CopyFile.java","input.txt"};

		// Create a buffer for reading the files
		byte[] buf = new byte[1024];

		try {
		    // Create the ZIP file
		    String outFilename = "outfile.zip";
		    ZipOutputStream out = new ZipOutputStream(new FileOutputStream(outFilename));

		    // Compress the files
		    for (int i=0; i<filenames.length; i++) {
		        FileInputStream in = new FileInputStream(filenames[i]);

		        // Add ZIP entry to output stream.
		        out.putNextEntry(new ZipEntry(filenames[i]));

		        // Transfer bytes from the file to the ZIP file
		        int len;
		        while ((len = in.read(buf)) > 0) {
		            out.write(buf, 0, len);
		        }

		        // Complete the entry
		        out.closeEntry();
		        in.close();
		    }

		    // Complete the ZIP file
		    out.close();
		} catch (IOException e) {
		}

	}
}