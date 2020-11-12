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
public class MultidimensionalArrayLeftSide {
    
      public static void main(String[] args) {
      
       int [] a = {4, 8, 3, 7, 1};
       int [][] n = new int [a.length][a.length];
       
       for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++){
                //n[i][j] = a[(j+i)%a.length];
                n[i][(i+j)%a.length] = a[j];
            }
                
         }
       
       for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a.length; i++){
                System.out.print(n[i][j]);
                System.out.print('\t');
            }
            System.out.println();
//       //ciklas iraso masyvui reiksmes is a array
//        for (int j = 0; j < a.length; j++) {
//            for (int i = 0; i < a.length; i++){
//                if (i+j>a.length-1){
//                  break;  
//                }
//                n[i][i+j]=a[j];                
//             }
//        }


    int x = 1%5;
    System.out.println(x);
//        //ciklas iraso reiksmes likusiai masyvo pusei
//        for (int j = a.length-1; j > 0; j--) {
//            for (int i = a.length-1; i > 0; i--){
//                if (i-a.length+j<0){
//                  break;  
//                }
//                n[i][i-a.length+j]=a[j];
//                               
//             }
//        }
//          // ciklas atspausdina masyva
//          for (int[] n1 : n) {
//              for (int i = 0; i < n.length; i++) {
//                  int value = n1[i];
//                  System.out.print(value);
//              }
//              System.out.println();
//          }

        
      }
      }
}

