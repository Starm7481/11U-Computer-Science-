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
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
     public String examGrade(int grade){
      
         // finds ranges for number grades and assigns them a letter grade as the answer
         
         String answer = "";
         
         if(grade<49){
              answer = "F";
         }
         
         if(grade>50 && grade<61){
              answer = "D";
         }
         if(grade>60 && grade<70){
              answer = "C";
         }
      
         if(grade>70 && grade<80){
              answer = "B";
         }
      
         if(grade>80){
              answer = "A";
         }
      
      
        return answer;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        // scanner and print 
        A7Q2 test = new A7Q2();
        
        System.out.println("Enter your grade! ");
        
        Scanner input = new Scanner(System.in);
        
        int grade = input.nextInt();
        
        String letter = test.examGrade(grade);
        
        System.out.println("Your grade is a: " + letter);
    }
}
