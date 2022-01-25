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


}
