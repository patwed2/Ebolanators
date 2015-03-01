/*
 * person interface
 *
 * Implement for each type of person
 */
package com.Ebolanators;

/**
 *
 * @author will
 */
public interface person {
    
    /**
     *
     * @param period The period in what schedule to get
     * @return schedule class defining movement
     */
    public schedule getMovement(int period);
    
    /**
     *
     * @return Returns starting health of person
     */
    public int getMaxHealth();

    /**
     *
     * @return Returns current health of person
     */
    public int getHealth();

    /**
     *
     * @param health Amount of health to deduct
     */
    public void doDamage(int health);
    
    /**
     *
     * @param distance Distance from diseased individual
     * @return percent chance of infection
     */
    public double resistance(double distance);
    
    /**
     *
     * @return Whether person is infected
     */
    public boolean infected();
    
    /**
     *
     * @param infected Set whether infected or not
     */
    public void setInfection(boolean infected);
}
