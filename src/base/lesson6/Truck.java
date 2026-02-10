package base.lesson6;

public class Truck extends Car{
    private Integer numberOfwheels;
    private Double maxWeight;

    public Truck(int w, String m, char c, float s, Integer numberOfwheels, Double maxWeight) {
        super(w, m, c, s);
        this.numberOfwheels = numberOfwheels;
        this.maxWeight = maxWeight;
    }

    protected void newWheels (Integer newWheelsCount){
        this.numberOfwheels = newWheelsCount;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "numberOfwheels=" + numberOfwheels +
                ", maxWeight=" + maxWeight +
                ", weight=" + weight +
                ", model='" + model + '\'' +
                ", color=" + color +
                ", speed=" + speed +
                '}';
    }
}
