import java.util.Date;

public class BankingServices {
    public static void main(String[] args) {
        Customer ade = new Customer("Ade","Wale",new Date(2020-07-07),"Osun","teacher");
        Customer james = new Customer("Tunbosun","James",new Date(2020-07-07),"Lagos","Police");
        CustomerServices customerServices = new CustomerServiceImplementation();

        customerServices.registerNewCustomer(ade);
        customerServices.registerNewCustomer(james);
       customerServices.logIn(ade);
       ade.setAccountBalance(500);
       System.out.println(customerServices.getAllCustomers());



        System.out.println(customerServices.transferMoney(1,2,500));

    }
}
