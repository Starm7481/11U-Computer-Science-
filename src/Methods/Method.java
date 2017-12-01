/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import java.util.Scanner;

/**
 *
 * @author Starm7481
 */
public class Method {
    
    //void method - performs an action 
    // does not return an answer
    //follows a procedure
    //In round brackets - extra variable so that it can work 
    public void sayHello(String name){
          System.out.println("Hello " + name);
    }

    /**
     * @param args the command line arguments
     */
    
    // a double return type says 'need to send a double as an answer'
    // sometimes called a function
    public double arearec(double length, double width){
        double answer = length * width;
        return answer;
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Method test = new Method();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter your name!");
        
        String name = input.nextLine();
        
        test.sayHello(name);
        
        System.out.println("enter the length and width of a rectangle");
        
        double width = input.nextDouble();
        
        double length = input.nextDouble();
        
        double area = test.arearec(width, length);
        
        System.out.println("The area is "+area);
    }
}
