import java.util.*;

public class StringTokenizing{
  public static void main(String[] args) {

  	StringTokenizer stringTokenizer = new StringTokenizer("The land is being sold tonight");

  	//StringTokenizer stringTokenizer = new StringTokenizer("The land is being*sold*tonight", "*");

    System.out.println("The total no. of tokens generated :  " + stringTokenizer.countTokens());

    while(stringTokenizer.hasMoreTokens()){
      System.out.println(stringTokenizer.nextToken());
    }
  }
}
/*
Tokens can be used where we want to break an
application into tokens. We have to break a String
into tokens as well as we will know how many tokens
has been generated.StringTokenizer is a class in
java.util.package

StringTokenizer(String str)
StringTokenizer(String str, String delim)

countTokens(): It gives the number of tokens
remaining in the string.

hasMoreTokens(): It gives true if more tokens
are available, else false.

nextToken(): It gives the next token available
in the string

*/