import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\doguy\\Desktop\\lorem.txt");
        if (file.exists()) {
            FileReader fileReader = null;
            try {
                fileReader = new FileReader(file);
                int c = 0;
                long now = System.currentTimeMillis();
                /*while ((c = fileReader.read()) != -1) {
                    System.out.print((char) c);
                }*/

                char[] buffer = new char[1024];
                int length = 0;
                StringBuilder builder = new StringBuilder();
                while ((length = fileReader.read(buffer)) != -1) {
                    builder.append(Arrays.copyOfRange(buffer, 0, length));
                }
                System.out.println(builder.toString());
                System.out.println(System.currentTimeMillis() - now);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                if (fileReader != null) {
                    try {
                        fileReader.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        } else {
            System.out.println("Dosya bulunamadi.");
        }

    }
}