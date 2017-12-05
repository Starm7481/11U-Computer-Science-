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
public class A7Q3 {

    /**
     * @param args the command line arguments
     * 
     * 
     */
    public void factors(int num){

        // creates an array the size of the int 
        
        int divisors[] = new int[num];
        
        int x = 0;
        
        

        for(int i = 1;i < num + 1;i++){
            // takes a number and divides it by an increasing int 
            double temp = num/i;
            // if the remainder of this is 0, it goes in the array 
            if((num%i) == 0){
                divisors[i-1]= (int)temp;
            }
            // if the remainder is not 0 it is marked as a 0 
            else{
                divisors[i-1] = 0;
            }
        }
        System.out.println("your factors are!");
        // prints out all items that aren't 0, these are the factors
        for(int i = 0;i < divisors.length;i++){
            if(divisors[i]!= 0){
                System.out.println(divisors[i]);
            }
        }     
             
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        // scanner and print 
        A7Q3 test = new A7Q3();
        
        System.out.println("Enter your number! ");
        
        Scanner input = new Scanner(System.in);
        
        int num = input.nextInt();
        
        test.factors(num);
        
    }
}
