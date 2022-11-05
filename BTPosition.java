package btheap;

// BTPosition.java
// Purpose: Simulate the behaviour of multitasking OS by implementing a Ready Queue and recording element execution times 

/* ******************************************

 * @authors: Emma Langlois, Eric Spensieri
 * @version: 1.0
 * @since: October 30, 2022

 ******************************************** */

public interface BTPosition {

    public abstract int getElement() throws IllegalStateException;

} // end interface BTPosition
