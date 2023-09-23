import java.io.Serializable;

public class Araba implements Serializable {

    private String plaka;
    private String marka;
    private String model;
    private int yil;
    private Motor motor;

    public Araba() {
    }

    public Araba(String marka, String model, int yil, String plaka, Motor motor) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.plaka = plaka;
        this.motor = motor;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public boolean equals(Object other) {
        Araba araba = (Araba) other;
        return this.plaka.equals(araba.plaka);
    }

    @Override
    public String toString() {
        return "Plaka: " + plaka + " Marka: " + marka + " Model: " + model + " Yil: " + yil + " Motor: " + motor.toString();
    }
}
