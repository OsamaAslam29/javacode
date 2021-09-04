/*
//         ***********  Java Programming Exercise 1: CBSE Board Percentage Calculator

//*********** Exercise 1:

//  Write a program to calculate the percentage of a given student in the CBSE board exam. His marks from 5
//  subjects must be taken as input from the keyboard. (Marks are out of 100)

*/
     package com.company;
    import java.util.Scanner;

      public class _06_Exercise1 {
      public static void main(String[] args) {

//          float eng, math, phy, com, bio;
  //        double sum,percentage;
          Scanner os= new Scanner(System.in);

          System.out.println("Enter the Marks of Five Subjects ");

          System.out.print("Enter the Marks of English: ");
             float eng =os.nextFloat();

     System.out.print("Enter the Marks of Math: ");
//     float math=os.nextFloat();
//
//      System.out.print("Enter the Marks of Physics: ");
          float  phy=os.nextFloat();
         System.out.print("Enter the Marks of Computer: ");
          float com=os.nextFloat();

          System.out.print("Enter the Marks of Bio: ");
          float bio=os.nextFloat();

          float     sum= eng + math + phy + com + bio ;
          float percentage=(sum/500)*100;
       System.out.println("The sum of subjects "+sum);
       System.out.println("The Percentage of subjects "+percentage);





    }
}
