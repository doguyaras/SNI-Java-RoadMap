import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        /*DbConnection dbConnection = new MsSqlConnection();
        dbConnection.openConnection();
        dbConnection.closeConnection();
        dbConnection.executeQuery("SELECT * FROM Teachers");

        System.out.println("-----------------------");

        MySqlConnection mySqlConnection = new MySqlConnection();
        mySqlConnection.openConnection();
        mySqlConnection.closeConnection();
        mySqlConnection.executeQuery("SELECT * FROM Student");*/


        /*Scanner scanner = new Scanner(System.in);
        System.out.println("[1 - MsSQL],[2 - MySQL],[3 - Oracle]");
        System.out.print("Database tipini seçiniz: ");
        int tip = scanner.nextInt();
        DbConnection dbConnection = null;

        switch (tip){
            case 1:
                dbConnection = new MsSqlConnection();
                break;
            case 2:
                dbConnection = new MySqlConnection();
                break;
            case 3:
                dbConnection = new OracleDBConnection();
                break;
            default:
                System.out.println("Geçersiz!");
                break;
        }
            if(dbConnection !=null){
                dbConnection.openConnection();
                dbConnection.closeConnection();
                dbConnection.executeQuery("SELECT * FROM Students");
            }*/

    }
}
