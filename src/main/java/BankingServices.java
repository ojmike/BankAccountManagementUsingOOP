import java.util.Date;

public class BankingServices {
    public static void main(String[] args) {
        Customer ade = new Customer("Ade","Wale",new Date(2020-07-07),"Osun","teacher");
        CustomerServices customerServices = new CustomerServiceImplementation();

        customerServices.registerNewCustomer(ade);
       customerServices.logIn(ade);
       ade.setAccountBalance(500);

        System.out.println( customerServices.withdrawMoney(ade,500));

    }
}
