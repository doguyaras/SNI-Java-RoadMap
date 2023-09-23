public class Karga implements Yuruyebilir,Ucabilir{

    @Override
    public void uc() {
        System.out.println("Karga uçt.");
    }

    @Override
    public void yuru() {
        System.out.println("Karga yürüdü.");
    }
}
