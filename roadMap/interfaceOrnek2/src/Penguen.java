public class Penguen implements Yuruyebilir,Yuzebilir,Ucabilir{

    @Override
    public void uc() {
        System.out.println("Penguen  uçtu.");

    }

    @Override
    public void yuru() {
        System.out.println("Penguen  yürüdü.");

    }

    @Override
    public void yuz() {
        System.out.println("Penguen yüzdü.");

    }
}
