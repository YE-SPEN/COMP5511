package btheap;
import java.util.*;

// BinaryTree.java
// Purpose: Simulate the behaviour of multitasking OS by implementing a Ready Queue and recording element execution times 

/* ******************************************

 * @authors: Emma Langlois, Eric Spensieri
 * @version: 1.0
 * @since: October 30, 2022

 ******************************************** */

public class BinaryTree extends Node {

    protected Node root;
    protected int size;
    
    public BinaryTree() {
        super();
        root = null;
        size = 0;

    } // end default constructor method

    public BinaryTree(int element, Node rightChild, Node leftChild) {
        setElement(element);
        setLeft(leftChild);
        setRight(rightChild);
        setParent(null);

    } // end main constructor method
 
    public int size() {
        return size;
    
    } // end method size

    public boolean hasLeft(Node position) throws IllegalArgumentException {
        position = checkPosition(position);

        return (getLeft(position) != null);

    } // end method hasLeft

    public boolean hasRight(Node position) throws IllegalArgumentException {
        position = checkPosition(position);

        return (getRight(position) != null);

    } // end method hasRight

    public boolean isInternal(Node position) throws IllegalArgumentException {
        checkPosition(position);

        return (hasLeft(position) || hasRight(position));

    } // end method isInternal

    public boolean isExternal(Node position) throws IllegalArgumentException {

        return (!isInternal(position));

    } // end method isExternal

    public boolean isEmpty() {
        
        return size() == 0;

    } // end method isEmpty
    
    public boolean isRoot(Node position) {
        if (getParent(position) == null) {
           return true;
        }

        else {
           return false;
        }

   } // end isRoot method

   public void insert(Node nextNode, int key) {

    if (root.getElement() == 0) {
        root.setElement(key);
        size++;
        return;
    }

   Queue<Node> inOrder = new LinkedList<Node>();
   inOrder.add(nextNode);

   while (!inOrder.isEmpty()) {
        nextNode = inOrder.peek();
        inOrder.remove();

        if (getLeft(nextNode) == null) {
            Node newNode = new Node(key, nextNode);
            nextNode.setLeft(newNode);
            size++;
            break;
        }

        else {
            inOrder.add(getLeft(nextNode));
        }

        if (getRight(nextNode) == null) {
            Node newNode = new Node(key, nextNode);
            nextNode.setRight(newNode);
            size++;
            break;
        }

        else {
            inOrder.add(getRight(nextNode));
        }

   } // close while loop

} // end method insert
   
   public Node remove(Node position) throws IllegalArgumentException {     // could be position??
        Node currPosition = checkPosition(position);
        Node leftPosition = getLeft(currPosition);
        Node rightPosition = getRight(currPosition);

        if (leftPosition != null && rightPosition != null) {
            throw new IllegalArgumentException("Cannot remove node with two children");
        }

        Node tempNode; 

        if (leftPosition != null) {
            tempNode = leftPosition;
        }

        else if (rightPosition != null) {
            tempNode = rightPosition;
        }

        else {
            tempNode = null;
        }
        
        if (currPosition == root) {
            if (tempNode != null) {
                tempNode.setParent(null);
            }

            root = tempNode;
        }

        return tempNode;

   } // end method remove

    protected Node checkPosition(Node nodePosition) throws IllegalArgumentException {
        if (nodePosition == null || !(nodePosition instanceof Node)) {
            throw new IllegalArgumentException("The position is invalid");
        }

        return nodePosition;

    } // close checkPosition method
    
   
} // end class BinaryTree
