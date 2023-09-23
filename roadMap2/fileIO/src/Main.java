import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dosya yolu: ");
        String filePath = scanner.nextLine();

        File file = new File(filePath);
        if (!file.exists()) {
            try {
                boolean fileCreated = file.createNewFile();
                if (fileCreated) {
                    System.out.println("Dosya oluşturuldu!");
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            String line = null;
            do {

                line = scanner.nextLine();
                fileWriter.write(line);
                fileWriter.write(System.lineSeparator());

            } while (!line.equals("quit"));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        scanner.close();
        System.out.println("Dosya yazdırma başarılı!");
        System.out.println("Dosya boyutu: " + file.length() + " byte");

    }
}