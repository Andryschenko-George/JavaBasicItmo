package base.lesson6;

public abstract class Human implements SmallTalk{
    private String firstname;
    private String lastname;

    public Human(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public abstract String greating();

    public String smallTalk(Human bworker, Human client){
        return bworker.greating() + client.greating();
    }
    @Override
    public String toString() {
        return "Human{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
