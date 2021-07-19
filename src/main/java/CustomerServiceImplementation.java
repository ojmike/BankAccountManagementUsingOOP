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

        return null;
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
