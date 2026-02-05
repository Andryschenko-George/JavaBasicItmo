package base.lesson3;

import java.awt.Color;

public class Car {
    private Double weight;
    private String color;
    private String name;

    public Car() {
    }
    public Car(String color) {
        this.color = color;
    }
    public Car(Double weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Car(Double weight, String color, String name) {
        this.weight = weight;
        this.color = color;
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
