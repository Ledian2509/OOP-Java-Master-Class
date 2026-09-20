public class BankAccountTransfer {

    private String ownerName;
    private double balance;


    public BankAccountTransfer() {
    }

    public BankAccountTransfer(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit (double amount){
        if (amount < 0){
            System.out.println("Invalid amount");
        }else{
            this.balance += amount;
        }
    }


    public void withrawnAmount(double amount){
        if (amount > balance){
            System.out.println("Insufficient funds");
        }else{
            this.balance -= amount;

        }
    }

    public void transferTo(BankAccountTransfer otherAccount, double amount){
        if (this.getBalance() >= amount){
            otherAccount.deposit(amount);
            this.withrawnAmount(amount);

        }else{
            System.out.print("Insufficient funds");
        }

    }


}
