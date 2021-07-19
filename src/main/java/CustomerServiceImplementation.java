import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImplementation implements CustomerServices{
    private int nextAccountId = 1;
    @Override
    public String logIn(Customer customer) {
        customer.setLoggedIn(true);
        return customer.getFirstName() + "loggedin successfully";
    }

    @Override
    public int accountBalance(Customer customer) {
        return 0;
    }

    @Override
    public String transferMoney(int sendersAccountNumber, int receiversAccountnumber, int amountToBeTransfared) {
        Customer sendingCustomer = null;
        Customer  receivingCustomer = null;
        for (Customer value : customerList) {
            if (value.getAccountNumber() == sendersAccountNumber && value.getLoggedIn()) {
                sendingCustomer = value;
                System.out.println(sendingCustomer);
            }
        }
        for (Customer customer : customerList) {
            if (customer.getAccountNumber() == receiversAccountnumber) {
                System.out.println(customer.getAccountNumber());
                receivingCustomer = customer;
                System.out.println(customer);
                System.out.println(receivingCustomer);
            }
        }
        assert sendingCustomer != null;
        if(sendingCustomer.getAccountBalance() >= amountToBeTransfared){
                sendingCustomer.setAccountBalance(sendingCustomer.getAccountBalance() - amountToBeTransfared);
            assert receivingCustomer != null;
            receivingCustomer.setAccountBalance(receivingCustomer.getAccountBalance() + amountToBeTransfared);
                return "Money transfared successfully";
            }else{
                return  "Insufficient Balance";
            }

    }

    @Override
    public String withdrawMoney(Customer customer, int amount) {
        if(customer.getLoggedIn() == true && customer.getAccountBalance() >= amount){
            customer.setAccountBalance(customer.getAccountBalance() - amount);
            return amount + " successfully withdrawn";
        }else if(customer.getLoggedIn() == true && customer.getAccountBalance() < amount){
            return "Insufficient Balance";
        }else{
            return "Customer not Loggedin";
        }
    }

    @Override
    public int statementOfAccount(Customer customer) {
        return 0;
    }

    @Override
    public String logOut(Customer customer) {
        customer.setLoggedIn(false);
        return "Customer Logged Out";
    }
    List<Customer> customerList = new ArrayList<>();
    @Override
    public String registerNewCustomer(Customer customer) {

        if(customerList.add(customer)){

            customer.setAccountNumber(generateAccountNumber());

            return customer.getFirstName() + " added successfully with " + customer.getAccountNumber()+ " account number";
        }
        return "Customer not valid";
    }


    @Override
    public List<Customer> getAllCustomers() {
        return customerList;
    }

    public int generateAccountNumber(){
        int accountId = nextAccountId;
        nextAccountId++;
        return accountId ;
    }
}
