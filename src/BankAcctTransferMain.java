public class BankAcctTransferMain {

    public static void main(String[] args) {
        BankAccountTransfer account1 =
                new BankAccountTransfer("Ledian", 1000);

        BankAccountTransfer account2 =
                new BankAccountTransfer("Jean", 500);

        account1.transferTo(account2, 100);

        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
    }
}
