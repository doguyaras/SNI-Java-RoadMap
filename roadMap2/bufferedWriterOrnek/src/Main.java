import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        File file = new File("input.txt");
        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            Scanner scanner = new Scanner(System.in);
            String line = null;
            while (!(line = scanner.nextLine()).equals("quit")) {
                bufferedWriter.write(line);
                bufferedWriter.flush();
            }
            scanner.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}