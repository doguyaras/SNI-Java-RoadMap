public class Main {

    public static void main(String[] args) throws Exception {

        AccountManager manager = new AccountManager();
        System.out.println("Hesap bakiyesi = " + manager.getBalance());
        manager.deposit(100);
        System.out.println("Hesap bakiyesi = " + manager.getBalance());
        try {
            manager.withdraw(90);
        } catch (BalanceInsufficentException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("Hesap bakiyesi = " + manager.getBalance());
        try {
            manager.withdraw(20);
        } catch (BalanceInsufficentException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("Hesap bakiyesi = " + manager.getBalance());
    }
}