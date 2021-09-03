/*
 ***********Getting User Input in Java:

    ********Reading data from the Keyboard :

                                    * Scanner class of java.util package is used to take input from the user's keyboard.
The Scanner class has many methods for taking input from the user depending upon the type of input.
To use any of the methods of the Scanner class, first, we need to create an object of the Scanner class as shown in the
below example :

           import java.util.Scanner;  // Importing  the Scanner class
           Scanner sc = new Scanner(System.in);  //Creating an object named "sc" of the Scanner class.
           Taking an integer input from the keyboard :

            Scanner S = new Scanner(System.in);  //(Read from the keyboard)
            int a = S.nextInt();  //(Method to read from the keyboard)
 */
// Related Program:

import java.util.Scanner;
public class _5_Takinginput {
    public static void main(String[] args) {
        System.out.println("Taking Input From the User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        float a1 = sc.nextFloat();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        float b1 = sc.nextFloat();

        int sum = a +b;
        float sum1 = a +b;
        System.out.println("The sum of these numbers is");
        System.out.println(sum);
        boolean b2 = sc.hasNextInt();
        System.out.println(b1);
        String str = sc.next();
        String str1 = sc.nextLine();
        System.out.println(str);





    }
}
