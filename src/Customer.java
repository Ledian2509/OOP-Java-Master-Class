public class Customer {

    private String name;
    private Double creditLimit;
    private String emailAddress;

    public Customer(String name, Double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public Customer(){
        this("No name found","No email added");

    }
    public Customer(String name, String emailAddress) {
        this(name,1000.0,emailAddress);
    }

    public String getName() {
        return name;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

}
