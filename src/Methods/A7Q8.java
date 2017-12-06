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
public class A7Q8 {

    /**
     * @param args the command line arguments
     */
    public void oddNumbers(double digit){
        // if the digit is negative it turns it positive     
         if(digit < 0){
            digit=digit*-1;
        }
         // creates a string to measure how many spaces the integer takes up 
          String digis = ""+digit;
          
          // creates a true false array the same size as the digit's spaces
          boolean checks[] = new boolean[digis.length()];
          // this for loop breaks the integer into digits and checks if its even or odd, 
          //if its odd the parallel spot in the array becomes true, if its even it becomes false
          for(int i = 0; i < digis.length();i++){

              
              double temp = (digit%10); 
              
              digit = Math.floor(digit/10);
              
              if(temp == 1 || temp == 3 || temp == 5 || temp == 7 || temp ==9 || temp == 0){
                 checks[i] = true;
              }
              else{
                  checks[i] = false;
              }
          }
          
       // creates counters 
          int trues = 0;
          int falses = 0;
          // this for loop checks the true or falses in the array and counts them 
          for(int i = 0; i < digis.length();i++){
              if(checks[i] == true){
                  trues = trues +1;
              }
              else{
                  falses = falses +1;
              }
          }
          // if the number has no even numbers, it is true that all digits are odd 
          if(falses == 0){
              System.out.println("true!");
          }
          else{
              System.out.println("false!");
          }
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        // scanner and test 
        A7Q8 test = new A7Q8();
        
        System.out.println("Enter your integer!");
        
        Scanner digi = new Scanner(System.in);
        
        double digit = digi.nextDouble();
        
        test.oddNumbers(digit);
    }
}
