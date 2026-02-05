package base.lesson1;

public class Main {
    public static void main(String[] args) {
        //  Lesson 1
        Task task = new Task();
        task.write();
        System.out.println("(46+10)*(10/3) = " + String.format("%.2f", task.count1(46,10, 10,3)));
        System.out.println("29*4*-15 = " + task.count2(29,4, 15));
        task.division(10500);
        System.out.println("3.6 * 4.1 * 5.9 = " + String.format("%.2f",task.doubleCout(3.6,4.1,5.9)));
        task.scaning();
        task.parityСheck();

    }
}