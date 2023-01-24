
package coe318.FinalLab;

/**
 *
 * @author Ricky
 */

//code taken from last lab 
public class Node {
    
        public int id; 
    public static int id_next=0; 
    
    public Node()
    {
        this.id= id_next;
        id_next++;     
    }
    
    public int getNode(){
       return id; 
    }
    
    public String toString(){
        return " " + this.id;
    }
    
}
