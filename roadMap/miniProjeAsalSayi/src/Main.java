public class Main {
    public static void main(String[] args) {

        int number = 6;
        boolean isPrime = true;

        if(number<2){
            System.out.println("Undefined number!");
            return;
        }
        if(number==1){
            System.out.println("1 is not prime!");
            return;
        }

        for(int i = 2; i<number;i++){
            if(number % i == 0){
                isPrime = false;
            }
        }

        if(isPrime){
            System.out.println("This number is prime!");
        }else{
            System.out.println("This number is not prime!");
        }


    }
}