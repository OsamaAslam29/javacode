/*

Java Practice Questions on Strings: Practice Set on Java Strings (Must Solve!)

        Today we will solve some of the best problems in Java related to strings! Here is the Chapter 3 – Practice Set

1. Write a Java program to convert a string to lowercase.
2. Write a Java program to replace spaces with underscores.
3. Write a Java program to fill in a letter template which looks like below:
         // letter = “Dear <|name|>, Thanks a lot”
         // Replace <|name|> with a string (some name)

4. Write a Java program to detect double and triple spaces in a string.
5. Write a program to format the following letter using escape sequence characters.
      Letter = “Dear Harry, This Java Course is nice. Thanks”




package com.company;

public class cwh_15_ps3 {
    public static void main(String[] args) {
        // Problem 1
        //String name = "Jack Parker";
        //name = name.toLowerCase();
        //System.out.println(name);

        // Problem 2
        //String text = "To My     Friend";
        //text = text.replace(" ", "_");
        //System.out.println(text);

        // Problem 3
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Sachin");
        System.out.println(letter);

        // Problem 4
        String myString = "This string contains double and  triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        // Problem 5
        String myLetter = "Dear Harry,\n\tThis Java Course is Nice.\nThanks!";
        System.out.println(myLetter);

    }
}



 */


package com.company;

public class _15_java_ps2 {
    public static void main(String[] args) {

    }
}
