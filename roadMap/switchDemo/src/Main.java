public class Main {
    public static void main(String[] args) {

        char grade = 'A';

        switch (grade) {
            case 'A':
            case 'B':
                System.out.println("Çok Güzel : Geçtiniz.");
                break;
            case 'C':
            case 'D':
                System.out.println("Fena değil : Geçtiniz.");
                break;
            case 'F':
                System.out.println("Maalesef : Kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girildi.");
                break;
        }

    }
}