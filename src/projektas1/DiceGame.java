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
public class DiceGame {
    public static void main(String[] args) {
       
        int [] dice = new int[6];
        
        for (int i = 0; i < 1000; i++) {
            
             int thr = (int) (Math.random()*6);
             dice[thr]++;
         }
        for (int i = 0; i < dice.length; i++) {
            System.out.print(i+1);
            System.out.print(' ');
            System.out.println(dice[i]);
        }
        
    }
}
