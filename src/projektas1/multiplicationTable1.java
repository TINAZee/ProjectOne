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
public class multiplicationTable1 {
    
     public static void main(String[] args) {
         
         int from = 1;
         int to = 3;
         
         System.out.print('\t');
         
          for(int i = from; i <= to; i++){
              System.out.print(i);
              System.out.print('\t');
         }
         System.out.println();
         for (int i = from; i <= to; i++) {
             System.out.print(i);
             System.out.print('\t');
            for (int j = from; j <= to; j++) {
                 System.out.print(i*j);  
                 System.out.print('\t');
     }
             System.out.println("");
     }
}
}
