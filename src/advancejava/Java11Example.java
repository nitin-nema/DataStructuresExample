package advancejava;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Java11Example {
    public static void main(String[] args) throws Exception {
        // Using new HTTP Client
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://postman-echo.com/get"))
                .build();
        
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

        // Using new String methods
        String str = "   Hello Java 11   ";
        System.out.println(str.isBlank());
        System.out.println(str.strip());
    }
}
