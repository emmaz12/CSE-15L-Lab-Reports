import java.io.IOException;
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
}

class StringServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}