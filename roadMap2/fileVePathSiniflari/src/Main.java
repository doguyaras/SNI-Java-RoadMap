import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*File file = new File("C:\\Users\\doguy\\Desktop\\sample.txt");
        System.out.println(file.exists());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.isDirectory());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParent());
        System.out.println(file.length());
        System.out.println(new Date(file.lastModified()));

        File file2 = new File("C:\\Users\\doguy\\Desktop\\ornek.txt");
        if (!file2.exists()){
            try {
                file2.createNewFile();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        if (file2.exists()){
            boolean silindiMi = file2.delete();
            System.out.println(silindiMi);
        }*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dosya yolu: ");
        String path = scanner.nextLine();

        File file = new File(path);
        String[] icerik = file.list();

        for (int i = 0; i < icerik.length; i++) {
            System.out.println(icerik[i]);
        }
        scanner.close();
    }
}