public class OracleDBConnection extends DbConnection {

    public void openConnection() {
        System.out.println("Oracle bağlantısı açıldı.");
    }

    public void closeConnection() {
        System.out.println("Oracle bağlantısı kapatıldı.");
    }

    public void executeQuery(String data) {

        System.out.println("Oracle komutları çalıştırıldı.");
    }
}
