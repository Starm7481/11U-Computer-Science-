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

public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public void compInt(double value, double year, double interest){
    
    // b = p(1+r)^n
        // creates integers for the values then progressively performs the formula 
        
        double balance = 0;
        
        double b = (1+interest);
        
        balance = Math.pow(b, year);
        
        balance = (value*(balance));
        // prints the balance 
        System.out.println("Your balance now is " + balance);
        
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //scanner and print 
        A7Q4 test = new A7Q4();
        
        System.out.println("Enter your initial value! ");
        
        Scanner val = new Scanner(System.in);
        
        double value = val.nextInt();
        
        System.out.println("Enter your amount of years! ");
        
        Scanner ye = new Scanner(System.in);
        
        double year = ye.nextDouble();
        
        System.out.println("Enter your interest rate! ");
        
        Scanner in = new Scanner(System.in);
        
        double interest = in.nextDouble();
        
        test.compInt(value, year, interest);
    }
}
