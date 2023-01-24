package coe318.lab6;

/**
 *
 * @author Ricky Rathod
 */
public class Resistor {
    //instance variables 
    // The first resistor should have the number 1, the second 2, etc.
    public double resistance;
    public Node node1, node2;
    public int resistorID;
    private static int resistor_count = 1;
    
    //constructor from manual
    //implement illigal argument using the example

public Resistor(double resistance, Node node1, Node node2){
    if(resistance < 0){
        throw new IllegalArgumentException("The resistance can't be negative");
    }
    if(node1 == null || node2 ==null){
        throw new IllegalArgumentException("Error");
    }
        
    this.resistance = resistance;
    this.node1 = node1;
    this.node2 = node2;
    this.resistorID = resistor_count;
    resistor_count++;
}

// methods are required
public Node [] getNodes(){
    Node[] nodes = {node1, node2};
    return nodes;
}

////The first component is the letter 'R' followed by the resistor's id number
@Override
public String toString(){
    return("R"+resistorID + " " + node1 + " " + node2 + " " + resistance);
}
}