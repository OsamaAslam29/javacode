/*

           ***********  Operators, Types of Operators & Expressions in Java :

                          *  Operators are used to perform operations on variables and values.
                                   Example :  a + b = c

                           In the above example, 'a' and 'b' are operands on which the '+' operator is applied.

         ************   Types of operators :

                **** Arithmetic Operators :

                          *  Arithmetic operators are used to perform mathematical operations such as addition, division,
                                                                                                   etc on expressions.
           Arithmetic operators cannot work with Booleans.
           % operator can work on floats and doubles.
                            Let x=7 and y=2

  Operator ----------->	Description-------->	Example

  ( + ) ---------------> (Addition)--------->  Used to add two numbers	x + y = 9

  ( - ) ---------------> (Subtraction)-------> Used to subtract the right-hand side value from the left-hand side value
   	                                                                 x - y = 5
  ( * ) --------------> (Multiplication)-------> Used to multiply two values.	x * y = 14

  ( / ) --------------> (Division) ------------> Used to divide left-hand Value by right-hand value.	x / y = 3

  ( % ) --------------> (Modulus) ------------->Used to print the remainder after dividing the left-hand side value from
                                                              the right-hand side value.	x % y = 1
  ( ++ ) ------------> (Increment)-------------> Increases the value of operand by 1.	x++ = 8

  (--) --------------> (Decrement) ------------->	Decreases the value of operand by 1.	y-- =  1

       ******** Assignment operators :

                         * Assignment operators are used to assign values to variables.
                               we use the assignment operator (=) to assign the value 10 to a variable called x:
                                ----------> int x=10;

                         * The addition assignment operator (+=) adds a value to a variable
                                    int x = 10;
                                    int x += 4;

                                 A list of all assignment operators:

Operator --------->	Example---------->	Same
  =	--------------> x = 5 ----------->  x = 5
 +=	--------------> x += 3 ---------->  x = x + 3
 -=	--------------> x -= 3 ---------->	x = x - 3
 *=	--------------> x *= 3 ---------->	x = x * 3
 /=	--------------> x /= 3 ---------->	x = x / 3
 %=	--------------> x %= 3 ---------->	x = x % 3
 &=	--------------> x &= 3 ---------->	x = x & 3
 |=	--------------> x |= 3 ---------->	x = x | 3
 ^=	--------------> x ^= 3 ---------->	x = x ^ 3
 >>= -------------> x >>= ----------->  3x = x >> 3
 <<= -------------> x <<= ----------->  3x = x << 3

     ************  Comparison Operators :

                                    * As the name suggests, these operators are used to compare two operands.
                                                             Let x=7 and y=2

( Operator)------>   Description--------> Example
( ==  )----------->  (Equal to)-------> Checks if two operands are equal. Returns a boolean value.	x == y --> False

(!=)   --------->   (Not equal--------> Checks if two operands are not equal. Returns a boolean value.	x != y --> True

( > )  ----------> (Greater than)-----> Checks if the left-hand side value is greater than the right-hand side value.
                                        Returns a boolean   value.	x > y --> True

( < )----------> (Less than)-----------> Checks if the left-hand side value is smaller than the right-hand side value.
                                          Returns a boolean value.x < y --> False

( >=) --------> (Greater than or equal to)---->Checks if the left-hand side value is greater than or equal to the
                                                 right-hand side value. Returns a boolean value.	x >= y --> True

( <= )--------->(Less than or equal to)-----> Checks if the left-hand side value is less than or equal to the right-hand
                                                      side value. Returns a boolean value.	x <= y -->False

        *********** Logical Operators :

                    * These operators determine the logic in an expression containing two or more values or variables.
                                         Let x = 8 and y =2

  ( Operator)------>   Description----------> Example

   ( && )------------> (logical and) -------> Returns true if both operands are true.
                                                  x>y && x!=y --> True

  ( || ) -----------> (logical or) ---------> Returns true if any of the operand is true.	x>y && x==y --> True

  ( ! ) -----------> (logical not) ----------> Returns true if the result of the expression is false and vice-versa
                                                           (x<y && x==y) ---> False

        *********** Bitwise Operators :

                          *  These operators perform the operations on every bit of a number.

                               Let x =2 and y=3. So 2 in binary is 100, and 3 is 011.


Operator ------------> Description ------------> Example

( & ) ---------------> (bitwise and) -----------> 1&1 =1, 0&1=0,1&0=0,1&1=1, 0&0 =0	(A & B) = (100 & 011) = 000

( | ) ---------------> (bitwise or)	------------> 1&0 =1, 0&1=1,1&1=1, 0&0=0	(A | B)  = (100 | 011 ) = 111

( ^ ) ---------------> (bitwise XOR) -----------> 1&0 =1, 0&1=1,1&1=0, 0&0=0	(A ^ B) = (100 ^ 011 ) = 111

( << ) --------------> (left shift) ------------> This operator moves the value left by the number of bits specified.
 	                                                          13<<2 = 52(decimal)

( >> ) --------------> (right shift) ------------> This operator moves the value left by the number of bits specified.
 	                                                            13>>2 = 3(decimal)


*/

package com.company;

public class _08_Operators {
    public static void main(String[] args) {

        System.out.println(" Operatos " ) ;
        System.out.println(" Types of operators " ) ;
        System.out.println(" There are five types of Operators : " ) ;
        System.out.println(" No.1: Arithmatic Operators : \n int a+b=10; --> int a-b=5; --> int a*b=6; etc." ) ;
        System.out.println(" No.2: Assignment Operators : \n int a=10; --> int a +=10; --> int a *=5  etc." ) ;
        System.out.println(" No.3: logical Operators : \n (10>5)&&(10==5)-->False (10<5)||(10!=5)-->(10<5)!(10==5)-->true etc." ) ;
        System.out.println(" No.4: Comparison Operators : \n int a==b;--> int a!=b; --> int a>b;  --> int a >=b; etc." ) ;
        System.out.println(" No.5: Bitwish Operators :\n no need to explain yet" ) ;

        System.out.println("---------------------------");
        System.out.println("Logical operators :");
int x=8,y=2;
        System.out.println("int x=8,y=2;");
        System.out.println("And Operator : ( (x>y)&&(x==y))) --->"+( (x>y)&&(x==y)));
        System.out.println("Or Operator : ((x<y)||(x!=y))) ---> "+((x<y)||(x!=y)));
        System.out.println("Or Operator : ((x<y)||(x!=y))) ---> "+((x<y)||(x!=y)));
        System.out.println("Not operator : !(x==y))------> "+ !(x==y));
    }

}

