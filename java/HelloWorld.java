import java.io.IOException;
import java.io.OutputStream;
import com.sun.net.httpserver.*;

// The main class of backend program
public class HelloWorld {
    public static void main(String[] args) throws IOException {

        //Adding 2 line for dynamically changes
        int port = Integer.parseInt(System.getenv().getOrDefault("PORT", "8080"));
        HttpServer server = HttpServer.create(new java.net.InetSocketAddress(port),0);

        //HttpServer server = HttpServer.create(new java.net.InetSocketAddress(8080), 0);
        server.createContext("/hello", new HelloHandler());
        server.setExecutor(null);
       server.start();
        System.out.println("Server started on port 8080");
    }

    
    static class HelloHandler implements HttpHandler {
        public void handle(HttpExchange t) throws IOException {
            String response = "Hello World from Basic Java!";
           t.getResponseHeaders().set("Access-Control-Allow-Origin", "*");
            t.sendResponseHeaders(200, response.length()); 
            OutputStream os = t.getResponseBody(); 
            os.write(response.getBytes());         
            os.close();                            
        }
    }
}
