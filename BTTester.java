package btheap;

// BinaryTree.java
// Purpose: Simulate the behaviour of multitasking OS by implementing a Ready Queue and recording element execution times 

/* ******************************************

 * @authors: Emma Langlois, Eric Spensieri
 * @version: 1.0
 * @since: October 30, 2022

 ******************************************** */

import java.util.*;

public class BTTester {

    public static int assignValue(int min, int max) {
        Random newValue = new Random();

        return newValue.nextInt(max - min) + min;

    } // end method assignValue

    public static void main(String[] args) {
    
        BinaryTree tree = new BinaryTree();
        int treeValues[] = new int[10];

        // generate 10 Random values & assign to BinaryTree
        for (int counter = 0; counter < treeValues.length; counter++) {    
            treeValues[counter] = assignValue(1,30);
        
        } // close for loop


        // assign random values to tree
        for (int counter = 0; counter < treeValues.length; counter++) {
            Node nextNode = new Node();
            tree.insert(nextNode, treeValues[counter]);
            System.out.println(nextNode.getElement());
        }

        System.out.println(treeValues);

    } // end main method
    
   
} // end class BinaryTree
