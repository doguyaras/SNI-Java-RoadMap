public class Main {

    public static void main(String[] args) {

        try {
            int[] sayilar = {1, 2, 3};
            System.out.println(sayilar[4]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception);
        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println(exception);
        } catch (Exception exception) {
            System.out.println("Loglandı: " + exception);
        } finally {
            System.out.println("Ben her türlü çalışırım :)");
        }


    }
}