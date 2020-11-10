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
public class MultidimensionalArrays {
    public static void main(String[] args) {
        
       int[][] m = {
            {1, 2, 3},
            {4, 5, 6, 8, 4},
            {7, 8, 9}
        };

 

        for (int i = 0; i < m.length; i++) {
//            int[] eilute = m[i];
//            for (int j = 0; j < eilute.length; j++) {
            for (int j = 0; j < m[i].length; j++) {
//                int reiksme = eilute[j];
                int reiksme = m[i][j];
                System.out.print(reiksme);
                System.out.print('\t');
            }
            System.out.println();
        }
        
        
    };
}
