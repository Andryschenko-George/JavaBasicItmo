package base.lesson6;

public class BankWorker extends Human{
    public BankWorker(String firstname, String lastname) {
        super(firstname, lastname);
    }

    @Override
    public String greating() {
        return " - Hello, my name is "+ this.getFirstname() + " " + this.getLastname() + " Sberbank Customer Service. What can i help you?\\n" ;
    }
}
