package com.spartaglobal.configtest.test;

import com.sparta.basics.Planets;
import org.junit.jupiter.api.Test;

public class PlanetsTest {

    @Test

    public void testGetMass() {

        Planets planetTester;
        planetTester = Planets.EARTH;
        System.out.println(planetTester.mass());


    }

    @Test

    public void testGetDistance() {

        Planets planetTester;
        planetTester = Planets.EARTH;
        System.out.println(planetTester.distance());


    }

    @Test

    public void testCloserThan() {

        Planets planetTester;
        planetTester = Planets.MARS;

        for (Planets plan : Planets.values()) {

            if (planetTester.distance() < plan.distance()){
                System.out.println(planetTester + " Is closer to the sun than " + plan + " With a difference of " + (plan.distance() - planetTester.distance()) + " Million kilometres");
            }

        }

    }
}
