import java.util.Date;

public class Customer {

    private String firstName;
    private String lastName;
    private Date dob;
    private String stateOfOrigin;
    private String occupation;
    private boolean loggedIn;
    private int accountNumber;
    private int accountBalance;


    public Customer(String firstName, String lastName, Date dob, String stateOfOrigin, String occuopation){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.stateOfOrigin = stateOfOrigin;
        this.occupation = occuopation;
    }

    public  Customer(){

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public  void setDob(Date dob){
        this.dob = dob;
    }

    public void setStateOfOrigin(String stateOfOrigin){
        this.stateOfOrigin = stateOfOrigin;
    }

    public void setOccupation(String occupation){
        this.occupation = occupation;
    }

    public void setLoggedIn(boolean loggedIn){
        this.loggedIn = loggedIn;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(int accountBalance){
        this.accountBalance = accountBalance;
    }
    public  String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDob(){
        return dob;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getStateOfOrigin(){
        return stateOfOrigin;
    }

    public boolean getLoggedIn(){
        return loggedIn;
    }

    public int getAccountBalance(){return accountBalance;}

    public int getAccountNumber(){
        return  accountNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", stateOfOrigin='" + stateOfOrigin + '\'' +
                ", occupation='" + occupation + '\'' +
                ", loggedIn=" + loggedIn +
                ", accountNumber=" + accountNumber +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
