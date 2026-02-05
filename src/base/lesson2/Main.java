package base.lesson2;

public class Main {
    public static void main(String[] args) {
        //Lesson 2
        System.out.println("(46+10)*(10/3) = " + Calculator.mul(Calculator.sum(46,10),Calculator.div(10,3)));
        Customer customer1 = new Customer();
        Customer customer2 = new Customer(18, Gender.WOMAN,1234568961,"Flora");
        System.out.println(customer1.toString());
        System.out.println(customer2.toString());
}
}

