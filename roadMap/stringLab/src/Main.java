import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1.equals(str2));
        str2 = "hello";
        System.out.println(str1.equalsIgnoreCase(str2));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir yazı giriniz: ");
        String line = scanner.nextLine();

        System.out.println(line.toLowerCase());
        System.out.println(line.toUpperCase());
        System.out.println(line.charAt(3));

        System.out.println(line.length());
        System.out.println(line.substring(3));
        System.out.println(line.isEmpty());
        System.out.println(line.replace("ab","wq"));

        System.out.println(line.indexOf("D"));
        System.out.println(line.lastIndexOf("a"));
        System.out.println(line.trim());*/

        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        System.out.println(str1 + " "+ str2);


    }
}