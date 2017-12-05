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
        
         if(digit < 0){
            digit=digit*-1;
        }
         
          
         
          String digis = ""+digit;
          
          boolean checks[] = new boolean[digis.length()];
          
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
          
       
          int trues = 0;
          int falses = 0;
          
          for(int i = 0; i < digis.length();i++){
              if(checks[i] == true){
                  trues = trues +1;
              }
              else{
                  falses = falses +1;
              }
          }
          
          if(falses == 0){
              System.out.println("true!");
          }
          else{
              System.out.println("false!");
          }
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        A7Q8 test = new A7Q8();
        
        System.out.println("Enter your integer!");
        
        Scanner digi = new Scanner(System.in);
        
        double digit = digi.nextDouble();
        
        test.oddNumbers(digit);
    }
}
