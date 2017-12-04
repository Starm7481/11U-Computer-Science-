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
        
        double dig = 0;
        
        if(digit < 0){
            digit=digit*-1;
        }
        
        String digis = ""+digit;
        
        double z =  Math.pow(10,(digis.length()-1));
        

        dig = Math.floor(digit/z);
        
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
