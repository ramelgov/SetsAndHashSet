package com.ramelgov.collections;

import java.util.HashSet;
import java.util.Set;

/**
 *
 */
public class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    // Constructor
    public HeavenlyBody(String name, double orbitalPeriod, Set<HeavenlyBody> satellites) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }
    public  boolean addMoon(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return satellites;
    }
}
