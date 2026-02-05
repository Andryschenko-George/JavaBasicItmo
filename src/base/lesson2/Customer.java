package base.lesson2;

public class Customer {
    private Integer age;
    private Gender gender;
    private Integer card;
    private String name;
    private static int temp;
    private final int id;
    public Customer(){
        temp++;
        this.id = nextId();
    }

    public Customer(Integer age, Gender gender, Integer card, String name) {
        this.age = age;
        this.gender = gender;
        this.card = card;
        this.name = name;
        temp++;
        this.id = nextId();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "age=" + age +
                ", male=" + gender +
                ", card=" + card +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    public Gender getMale() {
        return gender;
    }

    public void setMale(Gender gender) {
        this.gender = gender;
    }

    public Integer getCard() {
        return card;
    }

    public void setCard(Integer card) {
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private int nextId(){
        return temp;
    }
}
