package base.lesson3;

public class JavaProgram {
    public static void main(String[] args) {
        //Task1
        Study study = new Study("Изучение Java - это просто!");
        System.out.println(study.printCourse());

        //Task2
        Car car1 = new Car();
        Car car2 = new Car(2.5,"green", "BMW");
        car1.setWeight(3.5);
        car1.setColor("black");
        car1.setName("Jeep");
        System.out.println(car1.toString());
        System.out.println(car2.toString());

        //Task3
        House house1 = new House();
        House house2 = new House();
        house1.setHouse(9,2005,"House1");
        house2.setHouse(6,1907,"House2");
        System.out.println(house1.toString() + " Возраст здания: "+house1.getAgeofHouse());
        System.out.println(house2.toString() + " Возраст здания: "+house2.getAgeofHouse());

        //Task4
        Tree tree1 = new Tree();
        Tree tree2 = new Tree(20,"tree1");
        Tree tree3 = new Tree(13,true,"tree2");
    }
}
