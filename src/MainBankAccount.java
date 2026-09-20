public class MainBankAccount {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountNumber(4566325);
        account.setCustomerName("Ledian Acebo");
        account.setEmail("ledian1901@hotmail.com");
        account.setPhoneNumber("450-513-3736");


        account.depositAmount(50.0);
        account.withrawnAmount(15.0);

        System.out.println(account.getAccountBalance());
        System.out.println(account.getAccountNumber());
        System.out.println(account.getCustomerName());
        System.out.println(account.getEmail());
        System.out.println(account.getPhoneNumber());

        account.describeAccount();

    }

}