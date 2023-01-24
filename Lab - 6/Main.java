
package coe318.lab6;

/**
 *
 * @author Ricky Rathod
 */
public class Main {
    
    public static void main(String[] args){
        Circuit c1 = Circuit.getInstance();
        
         
        
        Node A = new Node();
        Node B = new Node();
        Node C = new Node();
        System.out.println(A.toString());
        System.out.println(B.toString());
        System.out.println(C.toString());

        
        //creates the new resistors and adds it to the arraylist
        //2 nodes must correspond to each resistor
        Resistor r1 = new Resistor(100.0, A, B);
        Resistor r2 = new Resistor(100.0, B, C); 
        
        //adds the resistors to the circuit
        c1.add(r1);
        c1.add(r2);
        System.out.println(c1.toString());
    }
}

//if the resistor value becomes negative it will ouput and error 
//which states teh illigal arg cant be negative