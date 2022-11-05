package btheap;

// Node.java
// Purpose: Simulate the behaviour of multitasking OS by implementing a Ready Queue and recording element execution times 

/* ******************************************

 * @authors: Emma Langlois, Eric Spensieri
 * @version: 1.0
 * @since: October 30, 2022

 ******************************************** */

public class Node implements BTPosition {

    int element;
    Node left;
    Node right;
    Node parent;

    Node() {
        element = 0;
        right = null;
        left = null;
        parent = null;
        
    } // end default constructor method

    public Node(int element, Node parent) {
        setElement(element);
        setLeft(null);
        setRight(null);
        setParent(parent);

    } // end default constructor method

    @Override
    public int getElement() throws IllegalStateException {
        return element;
    
    } // end getElement method
    
    public void setLeft(Node leftChild) {
        left = leftChild;
    
    } // end setLeft method

    public void setRight(Node rightChild) {
        right = rightChild;
    
    } // end setRight method

    public void setElement(int nodeValue) {
        element = nodeValue;
    
    } // end getRight method

    public void setParent(Node parentNode) {
        parent = parentNode;
    
    } // end setParent method

    public Node getLeft(Node parentNode) {
        return left;
    
    } // end getLeft method

    public Node getRight(Node parentNode) {
        return right;
    
    } // end getRight method

    public Node getParent(Node childNode) {
        return parent;
    
    } // end getParent method


} // end class Node
