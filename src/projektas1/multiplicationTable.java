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
public class multiplicationTable {
    
  
    public static void main(String[] args) {
          // print header row
      System.out.print("   |");
      int from = 3;
      int to = 7;
      for (int i = from; i <= to; i++)
         System.out.print(pad(i) + " ");
      System.out.println();
      // print separator
      System.out.print("---+");
      for (int i = from; i <= to; i++)
         System.out.print("-----");
      System.out.println();
      // print main table
      for (int i = from; i <= to; i++) {
         System.out.print(pad(i) + "|");
         for (int j = from; j <= to; j++) {
            System.out.print(pad(i*j) + " ");
         }
         System.out.println();
      }
   } // end of main

   // pad: add blanks to make it 3 long
   public static String pad(int x) {
      String s = new String();
      if (x < 10) s = "  " + x;
      else if (x < 100) s = " " + x;
      else s = "" + x;
      return s;
   }
    
}
   

