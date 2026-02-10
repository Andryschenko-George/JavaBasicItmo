package base.lesson6;

import java.util.Scanner;

public class MainClass {
    protected Integer number;
    protected Scanner scanner = new Scanner(System.in);
    protected Integer age;
    protected String name;

    public MainClass() {
        System.out.println("Введите число");
        this.number = scanner.nextInt();
    }

    protected void getFromUser(){
        System.out.println("Введите ваш возраст");
        this.age = scanner.nextInt();
    }

}
