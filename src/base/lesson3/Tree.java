package base.lesson3;

public class Tree {
    private Integer age;
    private Boolean isalife;
    private String name;

    public Tree(){
        System.out.println("Пустой конструктор без параметров сработал.");
    }
    public Tree(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree(Integer age, Boolean isalife, String name) {
        this.age = age;
        this.isalife = isalife;
        this.name = name;
    }
}
