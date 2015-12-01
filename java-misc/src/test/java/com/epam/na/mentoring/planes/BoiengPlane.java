package com.epam.na.mentoring.planes;

/**
 * Created by Vitali_Shulha on 01-Dec-15.
 */
public class BoiengPlane extends CivilPlane {

    private String name = "Boeing 747";


    public BoiengPlane(Integer distance, Integer tonnage, Integer peopleCapacity) {
        super(distance, tonnage, peopleCapacity);
    }

    public BoiengPlane() {
        super(10000, 2500, 100);
    }

    @Override
    public String toString() {
        return "BoiengPlane{" +
                "name='" + name + '\'' +
                '}' + "distance=" + super.getDistance()
                + "tonnage=" + super.getTonnage()
                + "peopleCapacity=" + super.getPeopleCapacity();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BoiengPlane that = (BoiengPlane) o;

        return !(name != null ? !name.equals(that.name) : that.name != null);

    }



    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
