package base.lesson6;

import java.util.Scanner;

public class SuccessorClass extends MainClass{
    public SuccessorClass() {
    }
    public void numberOut(){
        System.out.println( this.getClass().getSimpleName() + " " + super.number);
    }

    @Override
    protected void getFromUser() {
        System.out.println("Введите ваше Имя");
        super.name = scanner.next();
    }
}
