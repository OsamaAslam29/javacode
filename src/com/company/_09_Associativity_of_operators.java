/*
          ******* Associativity of Operators in Java :

   ****** Associativity :
                         Associativity tells the direction of the execution of operators. It can either be
                         left to right or vice versa.

   ( / * -> L to R )

   ( + - -> L to R )

   ( ++, = -> R to L )


    Quick Quiz: How will write the following expression in Java?

      1--->  x-y/2
      2--->  b*b-4ac/2a
      3--->  v*v-u*u
      4--->  a*b-d
*/




package com.company;
import java.util.Scanner;
public class _09_Associativity_of_operators {
    public static void main(String[] args) {
        //    Question no.1 :
        //      x-y/2
        Scanner os= new Scanner(System.in);
         float a = os.nextFloat();
        Scanner op= new Scanner(System.in);
        float b= op.nextFloat();
         System.out.println(a*b/2);


       // Question no.2 :
      //   b*b-4ac/2a
//
//        Scanner quad= new Scanner(System.in);
//        float a= quad.nextFloat();
//        Scanner sad= new Scanner(System.in);
//        float b = sad.nextFloat();
//        Scanner saad= new Scanner(System.in);
//        float c = saad.nextFloat();
//
//          float k= b*b-(4*a*c)/(2*a);
//        System.out.println(k);

//        int b = 10;
//        int c = 10;
//        int a = 10;
//        int k = b*b - (4*a*c)/(2*a);
//        System.out.println(k);

           // Question no.3 :
        //   v*v-u*u

        int v=15, u=10;
        System.out.println(v*v-u*u);

    // Question no.4 :
        //  a*b-d

//        Scanner os= new Scanner(System.in);
//        System.out.print("enter the value of A : ");
//        int a=os.nextInt();
//        Scanner or= new Scanner(System.in);
//        System.out.print("enter the value of B : ");
//        int b = or.nextInt();
//        Scanner not= new Scanner(System.in);
//        System.out.print("enter the value of D : ");
//
//        int d= not.nextInt() ;
//
//         int k= a*b-d;
//        System.out.print("Your answer is  : ");
//        System.out.println(k);


//   this is my code
     }

}
