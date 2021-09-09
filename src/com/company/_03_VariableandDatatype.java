/*
                   ***********( Variables and Data Types In Java )***********

                                                   Just like we have some rules that we follow to speak English
 (the grammar), we have some rules to follow while writing a Java program. The set of these rules is called syntax.
 It’s like Vocabulary and Grammar of Java.


    **********  Variables:
                      * A variable is a container that stores a value.
                      * This value can be changed during the execution of the program.
Example: int number = 10; (Here, int is a data type, the number is the variable name, and 10 is the value it stores.

    **********  Rules for declaring a variable name:

                            * We can choose a name while declaring a Java variable if the following rules are followed:

               * Must not begin with a digit. (E.g., 1arry is an invalid variable)
               * Name is case sensitive. (Osama and osama are different)
               * Should not be a keyword (like Void).
               * White space is not allowed. (int osama is a good boy is invalid)
               * Can contain alphabets, $character, _character, and digits if the other conditions are met.

           *********** Data Types :

   * Data types in Java fall under the following categories:

              * Primitive Data Types (Intrinsic)
              * Non-Primitive Data Types (Derived)

         ********* Primitive Data Types :

          * Java is statically typed, i.e., variables must be declared before use. Java supports 8 primitive data types:

         Data Type---Size---Value Range :

          1. Byte	1 byte	-128 to 127
          2. short	1 byte	-32,768 to 32,767
          3. int	2 byte	-2,147,483,648 to 2,147,483,647
          4. float	4 byte	3.40282347 x 1038 to 1.40239846 x 10-45
          5. long	8 byte	-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
          6. double	8 byte	1.7976931348623157 x 10308, 4.9406564584124654 x 10-324
          7. char	2 byte	0 to 65,535
          8. boolean	Depends on JVM	True or False


 */


public class _03_VariableandDatatype {
     public static void main(String[] args) {
        byte num1= 10;
        byte num2=66;
        byte num3=33;
        int sum = num1+num2  +num3;
        int product = num1*num2  * num3;
        System.out.println(sum);
        System.out.println(product);

        }
}
