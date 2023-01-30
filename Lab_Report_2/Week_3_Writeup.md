CSE 15L Week 3 Lab Report
---

During the last two weeks, we worked with creating web servers as well as learning about debugging, testing, and JUnit. Through this, certain vocabulary was also covered such as bugs, symptoms, symptom inducing inputs etc. As such, this lab is done to summarize these skills and excercises. 

Part 1: Creating a Simple Web Server
---

In this part of the lab, I worked on creating a web server that prints out messages stored in the query of the URL. The idea is to input a URL with the form of:

`/add-message?s=<string>`

If the format is correct, the string will be added and printed within the web server. In order to implement this, I create a file called **StringServer.java** with the following code:

`import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

class HandlerOne implements URLHandler {

    ArrayList<String> string = new ArrayList<String> ();

    public String handleRequest(URI url) {
        String result = "";
        if (url.getPath().equals("/add-message") && url.getQuery() != null) {
            String[] parameters = url.getQuery().split("=");

            if (parameters[0].equals("s")) {
                string.add(parameters[1]);
            }

            for (String e: string) {
                result = result + e + "\n";
            }

            return result;
        }

        else {
            for (String e: string) {
                result = result + e + "\n";
            }

            return result + "cannot add new string; must have format: /add-message?s=<string>";
        }
    }
}`

`class StringServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}`

Notice how numerous methods and class constructors are called which come from a public class **Server.java** which we used in Week 2 as well. 
