package com.company;
import java.util.Scanner;

public class _07_Java_Practice {
    public static void main(String[] args) {

          //   Question No.1:

       // Write a program to sum three numbers in Java:

        int a=15;
        int b=45;
        int c=50;
        int sum= a+b+c ;
        System.out.println("your sum is  "+sum);


           //  Question No.2:

    //    Write a program to calculate CGPA using marks of three subjects (out of 100)

                   float subject1=14;
                   float subject2=54;
                   float subject3=74;
                   float cgpa= (subject1+subject2+subject3)/30;
                   System.out.println(cgpa);

        //      Question no.3:

        // Program that asks the user to enter his/her name and greets them with “Hello <name>, have a good day” text.

        Scanner as= new Scanner(System.in);
        System.out.println("What is your Name : ");


        String os= as.nextLine();
        System.out.println("Hello " +os +" Have a good day ");


          // Question no.4:

        // Write a Java program to convert Kilometers to miles:

//
//        System.out.println("ENTER KILOMETERS : ");
//
//         Scanner os= new Scanner(System.in);
//         double kilometers, miles;
//         kilometers = os.nextDouble();
//
//         miles= (kilometers)/1.6;
//
//      System.out.println(miles+" miles");


             //    Question no. 5:

//        Write a Java program to detect whether a number entered by the user is an integer or not.

//       Scanner bol = new Scanner(System.in);
//
//        System.out.println("Enter Any Number :");
//
//        boolean b1 = bol.hasNextInt();
//
//        System.out.println(b1);


    }
}
