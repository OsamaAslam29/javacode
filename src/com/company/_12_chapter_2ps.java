package com.company;
import java.util.Scanner;
public class _12_chapter_2ps {
    public static void main(String[] args) {
        //  Practice Set (Java Practice Questions)


        // Question no. 1 :

       // What will be the result of the following expression
      //  float a = 7/4 * 9/2

//        float a = 7/4.0f * 9/2.0f ;
//        System.out.println(a);
//
//        Question no.2 :
//
//        Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
//
//        // Encrypt :
//
//        char grade = 'A';
//
//        grade = (char)(grade + 8);
//        System.out.println(grade);
//
//        // Decrypt :
//
//        grade = (char)(grade-8);
//        System.out.println(grade);


//        question no. 3

//        Use comparison operators to find out whether a given number is greater than the user entered number or not.
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print(" Enter an integer : ");
//
//        int a = sc.nextInt();
//
//        System.out.println(a>10);


//        Question no.3

//        Write the following expression in a java program:
//        (v^2-u^2)/2as


        Scanner os = new Scanner(System.in);
        System.out.print("Enter the value of v : ");
        float v = os.nextInt();
        System.out.print("Enter the value of u : ");
        float u = os.nextInt();
        System.out.print("Enter the value of a : ");
        float a = os.nextInt();
        System.out.print("Enter the value of s : ");
        float s = os.nextInt();


         float k =  ( v*v - u*u )/(2 * a * s);

        System.out.println(k);


//            Question no.4

//        Find the value of 'a' in expression given below :
//        int x = 7
//        int a = 7*49/7 + 35/7
//
//
//         float a = 7 *49/7 + 35/7;
//        System.out.println(a);
    }


}
