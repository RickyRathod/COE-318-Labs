package coe318.lab6;

/**
 *
 * @author Ricky Rathod
 */
public class Node {
    //Instance variables 
    // The first Node created will have an id number of 0 (zero).
    private int nodeID;
    private static int node_count = 0;  


    //constructor 
    //The next one will have an id number of 1, the next an id number of 2, and so on
    public Node(){
        this.nodeID = node_count;
        node_count++;
}

    //return and end the node class 
    //The toString()method should return the identifying number as a string.
@Override 
public String toString(){
    return(" " + this.nodeID);
}
}