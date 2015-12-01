package com.epam.na.mentoring;

import com.epam.na.mentoring.aircompany.Aircompany;
import com.epam.na.mentoring.exceptions.NoPlanesException;
import com.epam.na.mentoring.planes.BoiengPlane;
import com.epam.na.mentoring.planes.IFlying;
import com.epam.na.mentoring.planes.LMPlane;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AircompanyTest {

    @Test(expected= NoPlanesException.class)
    public void OneCanSeeNoPlanesExceptionWhenCreatingAircompanyWithoutPlanes(){
        Aircompany aircompany = new Aircompany("Empty");
        System.out.println("Test body");
        System.out.println("Total tonnage: " + aircompany.getTotalTonnage());
    }



    @Test
    @Ignore
    public void OneCanSeeTotalTonnageInAirCompany(){
        Aircompany aircompany = new Aircompany("KLM");

        List<IFlying> planes = new ArrayList<IFlying>();
        planes.add(new BoiengPlane(10000, 2500, 100));
        planes.add(new LMPlane(20000, 5000, "LM"));

        aircompany.setPlanes(planes);
        int actualTonnage = aircompany.getTotalTonnage();

        Assert.assertEquals(2500 + 5000, actualTonnage);
    }

}
