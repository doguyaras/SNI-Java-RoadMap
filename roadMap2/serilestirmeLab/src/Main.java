import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) {

        Araba araba = new Araba();
        araba.setPlaka("34AAA123");
        araba.setMarka("X Marka");
        araba.setModel("Y Model");
        araba.setYil(2020);

        Motor motor = new Motor();
        motor.setHacim(1600);
        araba.setMotor(motor);

        File file = new File("araba.bin");
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(araba);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            try {
                if(fileOutputStream != null){
                    fileOutputStream.close();
                }
                if(objectOutputStream != null){
                    objectOutputStream.close();
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }


    }
}