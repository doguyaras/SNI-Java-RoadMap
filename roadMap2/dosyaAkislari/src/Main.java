import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        File file = new File("hello.txt");
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            int c = 0;
            while ((c = fileInputStream.read()) != -1) {
                System.out.print((char) c);
            }

        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

    public static void outputStream() {
        File file = new File("hello.txt");
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write("Merhaba".getBytes());
            System.out.println("Dosya akışı başarıyla sağlandı.");
        } catch (IOException exception) {
            System.out.println("Dosya akışı sağlanamadı: " + exception.getMessage());
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException exception) {
                    System.out.println("Dosya akışı kapanamadı: " + exception.getMessage());
                }
            }
        }
    }
}