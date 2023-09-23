public class Main {

    public static void main(String[] args) {

        Isci isci = new Isci();
        try {
            isci.setIsim("   ");
        } catch (HataliDeger e) {
            System.out.println(e.getMessage());
        }
        try {
            isci.setMaas(2200);
        }catch (HataliDeger e){
            System.out.println(e.getMessage());
        }

        System.out.println(isci.toString());


    }
}