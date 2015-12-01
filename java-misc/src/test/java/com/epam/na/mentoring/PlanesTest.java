package com.epam.na.mentoring;

import com.epam.na.mentoring.aircompany.Aircompany;
import com.epam.na.mentoring.planes.BoiengPlane;
import com.epam.na.mentoring.planes.IFlying;
import com.epam.na.mentoring.planes.LMPlane;
import junit.framework.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vitali_Shulha on 01-Dec-15.
 */
public class PlanesTest {

    @Test
    @Ignore
    public void OneCanFlyCivilPlane(){
        BoiengPlane boiengPlane = new BoiengPlane();
        boiengPlane.fly();
        System.out.println(boiengPlane.toString());
        System.out.println(boiengPlane.getTonnage());

        LMPlane lmPlane = new LMPlane();
        lmPlane.fly();
        System.out.println(lmPlane.toString());
        System.out.println(lmPlane.getTonnage());
    }

    @Test
    @Ignore
    public void OneCanCreateAirCompany(){
        Aircompany aircompany = new Aircompany("KLM");

        List<IFlying> planes = new ArrayList<IFlying>();
        planes.add(new BoiengPlane());
        planes.add(new LMPlane());

        aircompany.setPlanes(planes);

        System.out.println("Total tonnage: " + aircompany.getTotalTonnage());
    }

    @Test
    @Ignore
    public void OneCanCreateBoiengPlane(){
        BoiengPlane boiengPlane = new BoiengPlane(20000, 5000, 180);
        boiengPlane.fly();
        int actualTonnage = boiengPlane.getTonnage();
        Assert.assertEquals(5000, actualTonnage);

    }
}
