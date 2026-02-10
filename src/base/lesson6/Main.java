package base.lesson6;

import base.lesson3.Car;

import java.awt.*;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        //part1-2
        Human person1 = new Client("Anna","Frakn");
        Human person2 = new BankWorker("Jeff","Runner");
        System.out.println(person1.greating());
        System.out.println(person2.smallTalk(person2,person1));
        //part3
        Truck truck = new Truck(1500,"Volvo",'r', 227.9F,6,2500.0);
        System.out.println(truck);
        truck.newWheels(8);
        System.out.println(truck);
        //part4-5
        SuccessorClass successorClass = new SuccessorClass();
        successorClass.numberOut();
        successorClass.getFromUser();
        System.out.println(successorClass.name);
    }
}
