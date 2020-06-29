// Enhanced word count program that uses a StreamTokenizer
import java.io.*;

class WordCount {

	public static int words=0;
	public static int lines=0;
	public static int chars=0;
	public static int num=0;

	public static void wc(Reader r) throws IOException {

		StreamTokenizer tok = new StreamTokenizer(r);
		tok.eolIsSignificant(true);

		while (tok.nextToken() != tok.TT_EOF) {
			switch (tok.ttype) {
				case StreamTokenizer.TT_EOL:
													lines++;
													chars++;
													break;
				case StreamTokenizer.TT_WORD:
													words++;
				case StreamTokenizer.TT_NUMBER:
													num++;
													break;
				default: // FALLSTHROUGH
											chars += tok.sval.length();
											break;
			}
	}
}
public static void main(String args[]) {
	if (args.length == 0) { // We're working with stdin
		try {
			wc(new InputStreamReader(System.in));
			System.out.println(lines + " " + words + " " + chars+" "+num);
		}
		catch (IOException e) {};
	}
	else { // We're working with a list of files

		int twords = 0, tchars = 0, tlines = 0, tnum=0;

		for (int i=0; i<args.length; i++) {
			try {
				words = chars = lines = num=0;
				wc(new FileReader(args[i]));
				twords += words;
				tchars += chars;
				tlines += lines;
				tnum += num;
				System.out.println(args[i] + ": " +lines + " " + words + " " + chars+" "+num);
			} catch (IOException e) {
				System.out.println(args[i] + ": error.");
			}
  		}
  System.out.println("total: " +tlines + " " + twords + " " + tchars+" "+tnum);
 }
 }
}
/*
eolIsSignificant() - Determines whether or not ends of line are treated as tokens.
double nval  -- If the current token is a number, this field contains the value of that number.

String sval  -- If the current token is a word token, this field contains a string giving the characters of the word token.

static int TT_EOF  -- A constant indicating that the end of the stream has been read.


 static int TT_EOL  -- A constant indicating that the end of the line has been read.


 static int TT_NUMBER  -- A constant indicating that a number token has been read.


 static int TT_WORD  -- A constant indicating that a word token has been read.


 int ttype  -- After a call to the nextToken method, this field contains the type of the token just read.

*/