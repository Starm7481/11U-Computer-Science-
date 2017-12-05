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
public class A7Q7 {

    /**
     * @param args the command line arguments
     */
    
    public void firstDigit(int digit){
        // creates a temporary digit 
        double dig = 0;
        // turns it to pos if its negative 
        if(digit < 0){
            digit=digit*-1;
        }
        // creates a string the size of the digit (spaces)
        String digis = ""+digit;
        
        // finds how many spaces to move the decimal to get the first number
        double z =  Math.pow(10,(digis.length()-1));
        
// pulls out the first digit by rounding the remainder down
        dig = Math.floor(digit/z);
        
        // another check to make sure its not negative (was for testing but i'll leave it in)
        if(dig < 0){
            dig = dig*-1;
        }
        
        System.out.println("The first digit is " + dig); 
       
    }
    public static void main(String[] args) {
        // TODO code application logic here
        A7Q7 test = new A7Q7();
        
        System.out.println("Enter your integer!");
        
        Scanner digi = new Scanner(System.in);
        
        int digit = digi.nextInt();
        
        test.firstDigit(digit);
    }
}
