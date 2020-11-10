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
public class GameOfLife {
     public static void main(String[] args) {
       
         int size = 5;
         char[][] field = new char [size][size];
         
         for (char[] field1 : field) {
             for (int j = 0; j < field1.length; j++) {
                 if (Math.random()<0.22) {
                     field1[j] = 'X';
                 } else {
                     field1[j] = '.';
                 }
             }
         }
         
          for (int j = 0; j < field.length; j++) {
             for (char[] field1 : field) {
                 System.out.print(field1[j]);
             }
              System.out.println();
          }
         System.out.println("-------------------------------");
     }
}
