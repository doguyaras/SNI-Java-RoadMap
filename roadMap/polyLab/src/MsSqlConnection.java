public class MsSqlConnection extends DbConnection{

    public void openConnection(){
        System.out.println("MsSql bağlantısı açıldı.");
    }

    public void closeConnection(){
        System.out.println("MsSql bağlantısı kapatıldı.");
    }

    public void executeQuery(String data){

        System.out.println("MsSql komutları çalıştırıldı.");
    }
}
