/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektas1;

/**
 *
 * @author krist
 */
public class randomCup {
     public static void main(String[] args) {
     
         double[] puodukai = new double[10];
         //-1 because there is no winner yet
         int winner = -1;
         
         while (winner < 0) {
             for (int i = 0; i < puodukai.length; i++) {
                 puodukai[i] += Math.random();
                 System.out.println(puodukai[i]);
                 if (puodukai[i] >= 10) {
                     if(winner < 0 || puodukai[winner] < puodukai[i])
                     winner = i;
                 }
             }
             System.out.println("------------");
         }
         System.out.println("Winner is: ");
         System.out.println(winner);
     }

}
