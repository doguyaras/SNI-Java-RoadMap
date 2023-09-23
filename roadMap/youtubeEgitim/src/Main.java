public class Main {

    public static void main(String[] args) {

        CreditManager creditManager = new CreditManager();
        creditManager.save();
        creditManager.calculate();

        Customer customer = new Customer();
        customer.setId(1);
        customer.setCity("İstanbul");

        Company company = new Company();
        company.setCompanyName("Arçelik");
        company.setTaxNumber("34345345");
        company.setId(100);

        Person person = new Person();
        person.setFirstName("Doğukan");
        person.setLastName("Yaraş");

        CustomerManager customerManager2 = new CustomerManager(new Person(),new CarCreditManager());
        customerManager2.giveCredit();

        Customer customer1 = new Customer();
        Customer customer2 = new Person();
        Customer customer3 = new Company();


    }
}