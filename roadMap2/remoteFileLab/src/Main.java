import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        try {
            URL url = new URL("https://example-files.online-convert.com/document/txt/example.txt");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = connection.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            char[] buffer = new char[1024];

            FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
          /*  StringBuilder builder = new StringBuilder();*/
            int lenght = 0;
            while ((lenght = inputStreamReader.read(buffer)) != -1) {
                /*builder.append(Arrays.copyOfRange(buffer, 0, lenght));*/
                fileOutputStream.write(new String(Arrays.copyOfRange(buffer,0,lenght)).getBytes());
            }
            //System.out.println(builder.toString());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}