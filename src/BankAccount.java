public class BankAccount {

    private int accountNumber = 0;
    private Double accountBalance = 0.0;
    private String customerName = "New";
    private String email = "New";
    private String phoneNumber = "XXX-XXX-XXXX";

    public void depositAmount(Double amount){
        if (amount < 0){
            System.out.println("Invalid amount");
        }else{
            this.accountBalance += amount;
        }


    }

    public void withrawnAmount(Double amount){
        if (amount > accountBalance){
            System.out.println("Insufficient funds");
        }else{
            this.accountBalance -= amount;
        }
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }



    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void describeAccount(){
        System.out.print("Account " + accountNumber + " Balance " + accountBalance
                + " Customer " + customerName + " email " + email + " Phone " + phoneNumber + "\n");
    }
}