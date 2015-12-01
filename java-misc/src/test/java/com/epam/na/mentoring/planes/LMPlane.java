package com.epam.na.mentoring.planes;

/**
 * Created by Vitali_Shulha on 01-Dec-15.
 */
public class LMPlane extends MilitaryPlane {

    private String name = "LM";

    public LMPlane(Integer distance, Integer tonnage, String name) {
        super(distance, tonnage);
        this.name = name;
    }

    public LMPlane(){
        super(15000, 10000);
    }

    @Override
    public String toString() {
        return "LMPlane{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LMPlane lmPlane = (LMPlane) o;

        return !(name != null ? !name.equals(lmPlane.name) : lmPlane.name != null);

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    public Integer getTonnage() {
        return super.getTonnage();
    }
}
