import java.util.*;

public class Main {
    //Sayısal Loto

    public static void doldur(SortedSet<Integer> integers,int sutunSayisi) {
        integers.clear();
        Random random = new Random();
        while (integers.size() < sutunSayisi) {
            int sayi = random.nextInt((49) + 1);
            integers.add(sayi);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Satır sayısı: ");
        int satirSayisi = scanner.nextInt();
        System.out.print("Sütun sayısı: ");
        int sutunSayisi = scanner.nextInt();
        SortedSet<Integer> integers = new TreeSet<Integer>();
        for (int i = 0; i < satirSayisi; i++) {
            doldur(integers,sutunSayisi);
            Iterator<Integer> iterator = integers.iterator();
            while (iterator.hasNext()) {
                System.out.print(iterator.next() + " ");
            }
            System.out.println();
        }


    }
}