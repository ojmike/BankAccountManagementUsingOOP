import java.util.List;

public interface CustomerServices {
    String logIn(Customer customer);
    int accountBalance(Customer customer);
    String transferMoney(int sendersAccountNumber,int receiversAccountnumber, int amountToBeTransfared);
    String withdrawMoney(Customer customer, int amount);
    int statementOfAccount(Customer customer);
    String logOut(Customer customer);
    String registerNewCustomer(Customer customer);
    List<Customer> getAllCustomers();
}
