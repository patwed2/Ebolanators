/*
 * student
 *
 * A student
 */
package com.Ebolanators;

/**
 * 
 * @author will
 */
public class student implements person {
    private final int MAX_HEALTH = 100; // Change max health here
    private final double GUARANTEED_INFECTION_DISTANCE = 0.7;
    
    private int health = MAX_HEALTH;
    private boolean infected = false;

    @Override
    public schedule getMovement(int period) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getMaxHealth() {
        return MAX_HEALTH;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void doDamage(int health) {
        this.health -= health;
    }

    @Override
    public double resistance(double distance) {
        return (GUARANTEED_INFECTION_DISTANCE / distance) * (100 / health);
    }

    @Override
    public boolean infected() {
        return infected;
    }

    @Override
    public void setInfection(boolean infected) {
        this.infected = infected;
    }
    
    
    
}
