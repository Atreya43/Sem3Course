import java.net.URI;
import java.net.URL;

public class urlTOuri {
  public static void main(String[] argv) throws Exception {

    URI uri = null;
    URL url = null;

    // Create a URI
    uri = new URI("file:///h:/20/URLReadFile.java");
    url = uri.toURL();
    System.out.println("URL: "+url);

    uri = new URI(url.toString());

    System.out.println("\nURI: "+uri);
  }
}

/*

URI – Uniform Resource Identifier – This identifies a resource uniquely.
The identifier used could optionally contain the location and the name
or not. Ok, you have read that before…what does it really mean? Here
is how I see it.

Take ISBN number for instance. It helps you identify the book uniquely.
Let’s assume you are interested in the book with the
ISBN number ‘ISBN-10: 0596519206?. Using an ISBN number you can confirm
as to whether any book you are looking at is the book you are interested
in. But using the number, you cannot get access to the book, you can
only confirm whether you have found the book or not. This doesn’t mean
that an URI cannot tell you how to access the resource also or not, but
it SHOULD at least let you differentiate that resource from all others.

URL – Uniform Resource Locator – This lets you know how to get access to
that particular resource. In most cases, URI is contained as a sub-part
within the URL. URL contains not just the resource identifying
information (URI) but also the resource locating information.
Well, take for example, the above book resource, a URL for the book
could be ‘http://www.amazon.com/dp/0596519206/‘. Here you can see that
the ISBN number (URI) is contained as a part of the URL. But the URL
also provides you more information that lets you gain access to it.
Like, it lets you know that the resource can be accessed
on the ‘World Wide Web’ via the HTTP protocol at the Amazon
address using the ISBN number.

That said, I would also like to add that the two terms URL and URI are
used so interchangeably these days that the subtle difference really
doesn’t have a lot of significance.
*/