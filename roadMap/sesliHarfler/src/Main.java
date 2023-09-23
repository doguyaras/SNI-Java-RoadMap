public class Main {
    public static void main(String[] args) {

        char harf = 'İ';

        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Bu bir kalın sesli harftir.");
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("Bu bir ince sesli harftir.");
                break;
            default:
                System.out.println("Geçersiz harf girildi!");
                break;


        }

    }
}