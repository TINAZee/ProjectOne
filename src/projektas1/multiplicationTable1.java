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
         
         int from = 11;
         int to = 17;
         
          System.out.println('\t');
          for(;from <= to; from++){
              System.out.println(from);
              System.out.println('\t');
          }
         for (int i = from; i <= to; i++) {
             System.out.println(i);
             System.out.println('\t');
            for (int j = from; j <= to; j++) {
                 System.out.println(from*j);  
                 System.out.println('\t');
     }
             System.out.println("");
     }
}
}
