package com.sparta.basics;

public enum Planets {

    MERCURY (3.303e+23, 57.91),
    VENUS   (4.869e+24, 108.2),
    EARTH   (5.976e+24, 149.6),
    MARS    (6.421e+23, 227.9),
    JUPITER (1.9e+27,   778.5),
    SATURN  (5.688e+26, 1434),
    URANUS  (8.686e+25, 2871),
    NEPTUNE (1.024e+26, 4495);

    private final double getMass;
    private final double getDistance;

    Planets(double mass, double distance) {
        this.getMass = mass;
        this.getDistance = distance;
    }

    public double getMass()   { return getMass; }
    public double getDistance() { return getDistance; }

}
