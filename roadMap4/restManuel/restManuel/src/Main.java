import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = null;
        URL url = null;
        HttpURLConnection connection = null;
        BufferedReader reader = null;
        StringBuilder response = null;

        try {
            scanner = new Scanner(System.in);
            System.out.print("URL: ");
            String apiUrl = scanner.nextLine();

            url = new URL(apiUrl);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {

                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                response = new StringBuilder();

                while ((inputLine = reader.readLine()) != null) {
                    response.append(inputLine);
                }
                System.out.println("Response: ");
                System.out.println(response.toString());
            } else {
                System.out.println("Request failed with response code: " + responseCode);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (scanner != null) {
                    scanner.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
}