import java.io.*;

public class Main {

    public static void oku() {
        File file = new File("ogrenci.txt");
        if (file.exists()) {
            FileInputStream fileInputStream = null;
            ObjectInputStream objectInputStream = null;
            try {
                fileInputStream = new FileInputStream(file);
                objectInputStream = new ObjectInputStream(fileInputStream);
                Ogrenci ogrenci = (Ogrenci) objectInputStream.readObject();
                System.out.println(ogrenci);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                try {
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        } else {
            System.out.println("Dosya bulunamadi.");
        }
    }

    public static void yaz(){
        Ogrenci ogrenci = new Ogrenci(1, "Doğukan", "Yaraş", "CSE");
        System.out.println(ogrenci);

        File file = new File("ogrenci.txt");
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(ogrenci);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        yaz();
        oku();

    }
}