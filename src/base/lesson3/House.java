package base.lesson3;

import java.time.LocalDate;

public class House {
    private Integer numberОfFloors;
    private Integer yearTheBuilding;
    private String name;

    public House() {
    }


    public void setHouse(Integer numberОfFloors, Integer yearTheBuilding, String name){
        this.numberОfFloors = numberОfFloors;
        this.yearTheBuilding = yearTheBuilding;
        this.name = name;
    }
    public Integer getAgeofHouse(){
        int year = LocalDate.now().getYear();
        return year - this.yearTheBuilding;
    }
    @Override
    public String toString() {
        return "House{" +
                "numberОfFloors=" + numberОfFloors +
                ", yearTheBuilding=" + yearTheBuilding +
                ", name='" + name + '\'' +
                '}';
    }
}
