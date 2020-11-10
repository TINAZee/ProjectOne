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
         
         //if I want to give a head start I can write like that:
         //double[] puodukai = {0,0,6.7,1.2,0,0,0,0,2.2}
         double[] puodukai = new double[10];
         //-1 because there is no winner yet
         int winner = -1;
         
         while (true) {
             
             for (int i = 0; i < puodukai.length; i++) {
                 puodukai[i] += Math.random();
                 //if I want to see how cups is filling
                 //System.out.println(puodukai[i]);
                 if (puodukai[i] >= 10) {
                     if(winner < 0 || puodukai[winner] < puodukai[i])
                     winner = i;
                     break;
                 }
             }
             if (winner > 0){
                 break;
             }
         }
         System.out.println("Winner is: ");
         System.out.println(winner);
     }

}
