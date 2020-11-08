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
        //Trying how it works
        System.out.println("Random number between 0 and 1 : " + Math.random()); 
        System.out.println("Random number between 0 and 1 : " + Math.random());
        //Get random cup
        System.out.println("Random value between 1 and 10 : " + getRandomInteger(10, 1));
        System.out.println("Random value between 1 and 10 : " + getRandomInteger(10, 1));
     }
     public static int getRandomInteger(int maximum, int minimum){
         return ((int) (Math.random()*(maximum - minimum))) + minimum;
     }

}
