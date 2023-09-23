import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer(1,"Doğukan","Yaraş"));
        customers.add(new Customer(2,"Doğu","Yaraş"));
        customers.add(new Customer(3,"Muhammet","Yaraş"));

        for (Customer customer : customers){
            System.out.println(customer.firstName);
        }


    }
}