package com.epam.na.mentoring.planes;

/**
 * Created by Vitali_Shulha on 01-Dec-15.
 */
public class CivilPlane implements IFlying {

    private Integer distance;
    private Integer tonnage;
    private Integer peopleCapacity;

    public CivilPlane(Integer distance, Integer tonnage, Integer peopleCapacity) {
        this.distance = distance;
        this.tonnage = tonnage;
        this.peopleCapacity = peopleCapacity;
    }

    public void fly() {
        System.out.println("Civil is flying");
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Integer getTonnage() {
        return tonnage;
    }

    public void setTonnage(Integer tonnage) {
        this.tonnage = tonnage;
    }

    public Integer getPeopleCapacity() {
        return peopleCapacity;
    }

    public void setPeopleCapacity(Integer peopleCapacity) {
        this.peopleCapacity = peopleCapacity;
    }
}
