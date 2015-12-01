package com.epam.na.mentoring.planes;

/**
 * Created by Vitali_Shulha on 01-Dec-15.
 */
public class MilitaryPlane implements IFlying {

    private Integer distance;
    private Integer tonnage;

    public MilitaryPlane(Integer distance, Integer tonnage) {
        this.distance = distance;
        this.tonnage = tonnage;
    }

    public void fly() {
        System.out.println("Military is flying");
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
}
