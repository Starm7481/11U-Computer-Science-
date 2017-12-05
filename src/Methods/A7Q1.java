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
public class A7Q1 {

    /**
     * @param args the command line arguments
     * 
     * 
     */
    
    public double circleArea(double radius){
        // takes the given integer squares it, multiplies it by pi, then returns
        double answer = (3.14159265359*(radius*radius));
        return answer;
        
    }
    
    public static void main(String[] args) {
        A7Q1 test = new A7Q1();
        
        // TODO code application logic here
        // scanner and print 
        System.out.println("Enter the radius of your circle");
        
        Scanner input = new Scanner(System.in);
        
        double radius = input.nextDouble();
        
        double area = test.circleArea(radius);
        
        System.out.println("Your circle has an area of " + area );
    }
}
