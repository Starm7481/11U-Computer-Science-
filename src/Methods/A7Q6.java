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
public class A7Q6 {

    /**
     * @param args the command line arguments
     */
    public void lastDigit(int digit){
    // creates a temp dig 
        int dig = 0;
        // finds remainder of given int 
        dig = (digit % 10);
        
        //turns the int to a pos if its negative 
        if(dig < 0){
            dig = dig*-1;
        }
        // prints out the remainder of (int/10)
        System.out.println("Your last digit is " + dig);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //scan and print 
        A7Q6 test = new A7Q6();
        
        System.out.println("Enter your integer!");
        
        Scanner digi = new Scanner(System.in);
        
        int digit = digi.nextInt();
        
        test.lastDigit(digit);
    }
}
