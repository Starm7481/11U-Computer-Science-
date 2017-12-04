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
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public void chaotic(int stars){
        
        
        for(int i = 0; i < stars; i++){
            System.out.println();
            
            int ranum = (int)(Math.random()*(5 - 1 + 1))+ 1;
            
            for(int x = 0; x < ranum; x++){
                System.out.print("*");
            }
        }
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        A7Q5 test = new A7Q5();
        
         System.out.println("Enter how many lines of stars you would like!");
        
        Scanner star = new Scanner(System.in);
        
        int stars = star.nextInt();
        
        test.chaotic(stars);
    }
}
