import java.io.*;

public class FileInfo {

  public static void main(String[] args)throws IOException {
      File f = new File("FileInfo.java");
      if (f.exists()) {
        System.out.println("getName: " + f.getName());
        System.out.println("getPath: " + f.getPath());
        System.out.println("getAbsolutePath: " + f.getAbsolutePath());

        System.out.println("getParent: " + f.getParent());
        if (f.canWrite()) {
          System.out.println(f.getName() + " is writable.");
        }
        if (f.canRead()) {
          System.out.println(f.getName() + " is readable.");
        }
        if (f.isFile()) {
           System.out.println(f.getName() + " is a file.");
        }
        else if (f.isDirectory()) {
          System.out.println(f.getName() + " is a directory.");
        }
        else {
          System.out.println("What is this?");
        }
        if (f.isAbsolute()) {
          System.out.println(f.getName() + " is an absolute path.");
        }
        else {
          System.out.println(
           f.getName() + " is not an absolute path.");
        }

          System.out.println("Last Modified" + f.lastModified());
          System.out.println(f.getName() + " is "
            + f.length() + " bytes.");

      }
      else {
         System.out.println("Can't find the file " + args[0]);
      }



  }

}

/*
public String getName()

method which takes no arguments and returns a
String. This String is just the name of the file.
It does not include any piece of the directory or
directories that contain this file. In other words
you get back "file1" instead of "/home/users/elharo/file1."

public String getPath()

getPath() returns a String that contains the path being
used for this File. It will be relative or absolute
depending on how the File object was created.

public String getAbsolutePath()

getAbsolutePath() returns the complete, non-relative
path to the file.


public String getParent()

getParent() returns a String that contains the name
of the single directory which contains this file in
the hierarchy. It does not return a full path all
the way back up to the root. If the file is at the
top level of the disk then it has no parent
directory and null is returned.

public boolean exists() throws SecurityException

The exists() method indicates whether or not a
particular file exists where you expect it to be.

public boolean canWrite() throws SecurityException

The canWrite() method indicates whether you have
writeaccess to this file. It's not a bad idea to
check canWrite() before trying to put data in a
file.

public boolean canRead() throws SecurityException

The canRead() method indicates whether you have
read access to this file. It's not a bad idea to
check canRead() before trying to read data out of
a file.

public boolean isFile() throws SecurityException

The isFile() method indicates whether this is
file exists and is a normal file, in other words not a directory.

public boolean isDirectory() throws SecurityException

The isDirectory() returns true if this file exists
and is a directory.

public boolean isAbsolute()

isAbsolute() returns true if the file name is an
absolute path and false if it's a relative path.

public long lastModified() throws SecurityException

lastModified() returns the last modification time.
Since the conversion between this long and a real
date is platform dependent, you should only use
this to compare modification dates.

public long length() throws SecurityException

f.length() is the number of bytes in the file.

public boolean mkdir()

f.mkdir() tries to create a directory with the
given name. If the directory is created, the
method returns true. Otherwise it returns false.

public boolean mkdirs() throws SecurityException

mkdirs() creates not just one but every directory
in the path as necessary, permissions permitting.
mkdirs() returns true if all directories in this
path are created, and false if only some or none
of them are created. You may need to manually
test the existence of each directory in the path
if the method returns false because it could
have been partially successful.

public boolean renameTo(File destination) throws
SecurityException

f1.renameTo(f2) tries to change the name of f1
to f2. This may involve a move to a different
directory if the filenames so indicate. If f2
already exists, then it is overwritten by f1
(permissions permitting). If f1 is renamed,
the method returns true. Otherwise it returns
false.

public String[] list() throws SecurityException

The list() method returns a String array
initialized to the names of each file in
directory f. It's useful for processing all
the files in a directory.

public String[] list(FilenameFilter filter)
throws SecurityException


public boolean delete() throws SecurityException

f.delete() tries to delete the file f. This method
returns true if the file existed and was deleted.
(You can't delete a file that doesn't exist).
Otherwise it returns false.

void deleteOnExit()
Removes the file associated with the
invoking object when the Java Virtual
Machine terminates.

boolean isHidden()
Returns true if the invoking file is
hidden. Returns false otherwise.

boolean setLastModified(long millisec)
Sets the time stamp on the invoking
file to that specified by millisec, which
is the number of milliseconds from
January 1, 1970, Coordinated
Universal Time (UTC).

boolean setReadOnly()
Sets the invoking file to read-only.
*/