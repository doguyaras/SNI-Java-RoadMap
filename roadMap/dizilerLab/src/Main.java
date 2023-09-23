import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*int[] numbers = {5,10,20,30,40};

        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));

        System.out.println("-----------------------");

        for(int number:numbers){
            System.out.println(number);
        }*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Dizi Uzunlugu: ");
        int length = scanner.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i <numbers.length ; i++) {
            System.out.print((i+1)+". Sayı: ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(numbers));

        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }

        System.out.println("Ortalama: "+total/numbers.length);*/

        /*int total = 0;
        int[] numbers = {1,5,-5,9,2,8,9};

        int[] numbers2 = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers2[i] = numbers[i];
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers2));*/

        /*for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        System.out.println(total);*/

//        String[] names = {"Ali","Ahmet","Mehmet"};
//        System.out.println(Arrays.toString(names));
//
//        for (int i = names.length-1; i>=0; i--) {
//            System.out.println(names[i]);
//        }

        /*int[] numbers1 = {1,2,3};
        System.out.println(Arrays.toString(numbers1));
        int[] numbers2 = numbers1;
        System.out.println(Arrays.toString(numbers2));
        numbers1[0] = 5;
        System.out.println(Arrays.toString(numbers2));*/

        int[] numbers = {20,32,12,46,4};
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers,12));

        int[] copyOf = Arrays.copyOf(numbers,3);
        System.out.println(Arrays.toString(copyOf));
        int[] copyOfRange = Arrays.copyOfRange(numbers,2,4);
        System.out.println(Arrays.toString(copyOfRange));

        /*Arrays.fill(numbers,44);
        System.out.println(Arrays.toString(numbers));*/

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}