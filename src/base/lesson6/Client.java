package base.lesson6;

public class Client extends Human{
    public Client(String firstname, String lastname) {
        super(firstname, lastname);
    }

    @Override
    public String greating() {
        return " - Hi, I am " + this.getFirstname();
    }
}
