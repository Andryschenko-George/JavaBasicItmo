package base.lesson1;

import java.util.Scanner;

public class Task {
    static Scanner scanner = new Scanner(System.in);

    public void write(){
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");
    }
    public double count1(int x, int y, int z, int g){
        return (x+y)*((double)z/g);
    }
    public int count2(int x, int y, int z){
        return x*y*z;
    }
    public void division(int number) {
        int result = (number / 10) / 10;
        System.out.println("number = " + number);
        System.out.println("(number / 10) / 10 = " + result);
    }
    public double doubleCout(double x, double y, double z){
        return x*y*z;
    }
    public void scaning(){
        System.out.print("Введите число:");
        int scan=scanner.nextInt();
        System.out.println("Вы ввели: " + scan);
    }
    public void parityСheck() {
        System.out.print("Введите число для проверки на четность:");
        int scan = scanner.nextInt();
        if (scan%2==0 && scan<=100){
            System.out.println("Четное");
        } else if (scan%2==1) {
            System.out.println("Нечетное");
        } else {
            System.out.println("Выход за пределы диапазона");
        }

    }
}
