
package coe318.FinalLab;

/**
 *
 * @author Ricky
 */

//general template for this file was taken from last lab and altered as needed
public class VoltageSource {
    
    private double voltage;
    private Node node1;
    private Node node2;
    private int id;
    private static int counter =1;
    
    public VoltageSource (double voltage, Node node1, Node node2){
            this.node1 = node1;
            this.node2 = node2;
            this.voltage = voltage;
            this.id = counter;
            counter ++; 
    }
    
    //creates the maximun number of nodes needed in the ciruit 

     public Node[] getNodes(){
       Node[] nodes = new Node[2];
       nodes[0] = this.node1;
       nodes[1] = this.node2;
       return nodes;
    }
     
     public String toString(){
         if (this.node1.id < this.node2.id)
             return "V" + this.id + " " + this.node1 + " " + this.node2 + " DC  " + "-" + this.voltage +".";
         else
             return "V" + this.id + " " + this.node1 + " " + this.node2 + " DC  " + this.voltage +".";
     }
}