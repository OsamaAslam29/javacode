/*
        ******** Data Type of Expressions & Increment/Decrement Operators

         ** Resulting data type after arithmetic operation

      Result = byte + short -> integer
      Result = short + integer -> integer
      Result = long + float -> float
      Result = integer + float -> float
      Result = character + integer -> integer
      Result = character + short -> integer
      Result = long + double -> double
      Result = float + double -> double

     ***** Increment and Decrement operators
          1: a++, ++a (Increment Operators)
          2: a--, --a (Decrement Operators)

   These will operate on all data types except Booleans.

Quiz: Try increment and decrement operators on a Java variable

      a++ -> first use the value and then increment
      ++a -> first increment the value then use it

Quiz: What will be the value of the following expression(x).

1:
   int y=7;
   int x = ++y*8;
   value of x?


2:
    char a = ‘B’;
    a++; (a is not ‘C’)

 */





package com.company;

import java.util.Scanner;
public class _10_Data_type_Of_Expressions_and_Increment {
    public static void main(String[] args) {

        // Question no. 1 :

//        Scanner osama = new Scanner(System.in);
//        System.out.print("enter the value of y : ");
//        int y = osama.nextInt();
//        int x = ++y * 8;
//        System.out.println(x);

        // Question no. 2 :

//        char a = 'A';
//        System.out.println(a);
//        System.out.println(++a);
//        System.out.println(a);
//        System.out.println(a++);
//        System.out.println(a);


//     byte x = 5;
//        int y = 6;
//        short z = 8;
//        int a = y + z;
//        float b = 6.54f + x;
//       System.out.println(a);
//       System.out.println(b);
//       System.out.println(a+b);


     // Increment and Decrement Operators
        int i = 56;
        // int b = i++; // first b is assigned i (56) then i is incremented
        int b = 67;
        int c = ++b; // first j is incremented then c is assigned j (68)
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
        int y = 7;
        System.out.println( ++y *8);
        char chr = 'a';
        System.out.println(++chr);
    }

}
