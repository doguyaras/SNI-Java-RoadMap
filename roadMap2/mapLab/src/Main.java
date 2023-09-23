import java.io.*;
import java.util.*;

public class Main {
    //Sözlük uygulaması

    public static void main(String[] args) {

        File file = new File("sozluk.txt");
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            fileWriter = new FileWriter(file, true);
            String line = null;

            SortedMap<String, String> sortedMap = new TreeMap<String, String>();

            while ((line = bufferedReader.readLine()) != null) {
                //System.out.println(line);
                String[] strings = line.split(":");
                /*System.out.println(strings[0]);
                System.out.println(strings[1]);*/
                sortedMap.put(strings[0], strings[1]);
            }
            Scanner scanner = new Scanner(System.in);
            String input = null;
            System.out.print("Kelime: ");
            while (!(input = scanner.nextLine()).equals("exit")) {
                String value = sortedMap.get(input);
                if (value != null) {
                    System.out.println(value);
                } else {
                    System.out.println("Kelime bulunamadı! Eklemek ister misiniz ? (E)(H)");
                    if (scanner.nextLine().equals("E")) {
                        System.out.print("Yeni kelime: ");
                        String yeniKelime = scanner.nextLine();
                        fileWriter.write("\n");
                        fileWriter.write(input);
                        fileWriter.write(":");
                        fileWriter.write(yeniKelime);
                        fileWriter.flush();

                        sortedMap.put(input, yeniKelime);
                    }
                }
                System.out.print("Kelime: ");
            }


            /*System.out.println(sortedMap.size());

            Set<Map.Entry<String, String>> entrySet = sortedMap.entrySet();
            Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, String> next = iterator.next();
                System.out.println(next.getKey() + " " + next.getValue());
            }*/
        } catch (Exception e) {
            System.out.println("Hata: " + e.getMessage());
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (Exception e) {
                System.out.println("Hata: " + e.getMessage());
            }
        }


    }
}