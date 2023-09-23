import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\doguy\\Desktop\\bmw.png");
        if (file.exists()) {
            FileInputStream fileInputStream = null;
            try {
                fileInputStream = new FileInputStream(file);
                byte[] buffer = new byte[1024];
                int lenght = 0;
                while ((lenght = fileInputStream.read(buffer)) != -1) {
                    System.out.println(Arrays.toString(buffer));
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } finally {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        }


    }
}