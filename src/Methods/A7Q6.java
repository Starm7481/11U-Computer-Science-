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
    
        int dig = 0;
        
        dig = (digit % 10);
        
        if(dig < 0){
            dig = dig*-1;
        }
        
        System.out.println("Your last digit is " + dig);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        A7Q6 test = new A7Q6();
        
        System.out.println("Enter your integer!");
        
        Scanner digi = new Scanner(System.in);
        
        int digit = digi.nextInt();
        
        test.lastDigit(digit);
    }
}
