package com.epam.na.mentoring.aircompany;

import com.epam.na.mentoring.exceptions.NoPlanesException;
import com.epam.na.mentoring.planes.IFlying;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vitali_Shulha on 01-Dec-15.
 */
public class Aircompany {

    private String name;
    private List<IFlying> planes;

    public Aircompany(String name, List<IFlying> planes) {
        this.name = name;
        this.planes = planes;
    }

    public Aircompany(String name) {
        this.planes = new ArrayList<IFlying>();
        this.name = name;
    }

    public List<IFlying> getPlanes() {
        return planes;
    }

    public void setPlanes(List<IFlying> planes) {
        this.planes = planes;
    }

    public Integer getTotalTonnage(){
        Integer totalTonnage = 0;

        if (planes.isEmpty()) {
            throw new NoPlanesException();
        }

        for(IFlying plane : planes) {
            totalTonnage = totalTonnage + plane.getTonnage();
        }

        return totalTonnage;
    }
}
