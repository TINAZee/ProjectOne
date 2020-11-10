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
public class MultidimentionalArrayRightSide {
    
      public static void main(String[] args) {
      
       int [] a = {4, 8, 3, 7, 1};
       int [][] n = new int [a.length][a.length];
       
       //ciklas iraso masyvui reiksmes is a array
        for (int j = -1; j < a.length; j--) {
            for (int i = 0; i < a.length; i++){
//                if (i+j>a.length-1){
//                  break;  
//                }
                n[i][j-i]=a[j];                
             }
        }
        //ciklas iraso reiksmes likusiai masyvo pusei
//        for (int j = a.length-1; j > 0; j--) {
//            for (int i = a.length-1; i > 0; i--){
//                if (i-a.length+j<0){
//                  break;  
//                }
//                n[i][i-a.length-j]=a[j];
//                               
//             }
//        }
          // ciklas atspausdina masyva
          for (int[] n1 : n) {
              for (int i = 0; i < n.length; i++) {
                  int value = n1[i];
                  System.out.print(value);
              }
              System.out.println();
          }
      }
    
}
