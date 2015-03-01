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
}
