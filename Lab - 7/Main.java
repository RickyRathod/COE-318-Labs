package coe318.FinalLab;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Ricky
 */
public class Main implements UserInterface{
    String input = "";
    ArrayList<Object> cirElement = new ArrayList<>();
    Scanner userIn = new Scanner(System.in);
    
    @Override
    public void start(){
        display();
        run();
    }
    
    @Override
    public void run(){
        while(true){
            input = userIn.nextLine().trim();               //reads the nextline and removes all spaces
            if(input.equalsIgnoreCase("end")){
                end();
                break;
            }
            else if(input.equalsIgnoreCase("spice")){
                spice();
            }
            else{
                String[] value = input.split(" ");
                if(value.length != 4){                          //checks the value length of your input and if it does not equal 4 its preints the statement
                    System.out.println("Please review the format of your inputs");
                }
                else{
                    if(input.toLowerCase().startsWith("v")){
                        double temp;
                        Node n1 = new Node();
                        Node n2 = new Node();
                        n1.id = Integer.parseInt(value[1]);
                        n2.id = Integer.parseInt(value[2]);
                        temp = Double.parseDouble(value[3]);
                        VoltageSource v = new VoltageSource(temp, n1, n2);
                        cirElement.add(v);
                    }
                    else if (input.toLowerCase().startsWith("r")){
                       double temp;
                       Node n1 = new Node();
                       Node n2 = new Node();
                       n1.id = Integer.parseInt(value[1]);
                       n2.id = Integer.parseInt(value[2]);
                       temp = Double.parseDouble(value[3]);
                       Resistor r = new Resistor(temp, n1, n2);
                       cirElement.add(r);                              
                    }
                }
            }
            
        }
    }
    
    @Override
    public void display(){
        System.out.println("Enter your input:");
    }
    
    @Override
    public void spice(){
        for(Object o : cirElement){
            System.out.println(o);
        }
    }
    
    @Override
    public void end(){
        System.out.println("All done");
    }
    
    public static void main(String[] args){
        Main m = new Main();
        m.start();
    }
}
