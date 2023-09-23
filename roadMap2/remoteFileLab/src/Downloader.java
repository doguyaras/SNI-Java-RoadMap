import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

public class Downloader {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("URL Giriniz: ");
        String line = scanner.nextLine();
        scanner.close();

        try {
            URL url = new URL(line);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = connection.getInputStream();
            FileOutputStream fileOutputStream = new FileOutputStream(String.valueOf(System.currentTimeMillis()));
            byte[] buffer = new byte[1024];
            int length = 0;
            while ((length = inputStream.read(buffer)) != -1){
                fileOutputStream.write(Arrays.copyOfRange(buffer,0,length));
            }
            System.out.println("Başarıyla indirildi..");
            fileOutputStream.close();
            inputStream.close();
        } catch (Exception e) {
            System.out.println("Başarısız..");
            System.out.println(e.getMessage());
        }
    }
}
