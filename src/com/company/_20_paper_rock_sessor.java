package com.company;

import java.util.Random;
import java.util.Scanner;

public record _20_paper_rock_sessor() {
    public static void main(String[] args) {




                     Scanner sc = new Scanner(System.in);
                     System.out.println("\n\n\n\t\t\t\t( Paper, Rock, scissor Game )");
                     System.out.println("\n\t\t\t\t For Rock    =  0 \n\t\t\t\t For Paper   =  1 \n\t\t\t\t For Scissor =  2  ");


                     System.out.println("\n\t\t\t\tLet's Start ");
                     System.out.println("\n\t\t\t\tRock :");
                     System.out.println("\t\t\t\tPaper :");
                     System.out.println("\t\t\t\tScissor :");
                     System.out.print("\t\t\t\tEnter Your Choice : ");
                     int playerinput = sc.nextInt();


                     Random number = new Random();
                     int computerchoice = number.nextInt(3);


        if (playerinput == computerchoice) {
            System.out.println("\n\n\t\tMatch Draw");
        } else if (playerinput == 0 && computerchoice == 2) {

            System.out.println("\n\n\t\tCongrates : You Win The Match ");
        } else if (playerinput == 1 && computerchoice == 0) {

            System.out.println("\n\n\t\tCongrates : You Win The Match ");
        } else if (playerinput == 2 && computerchoice == 1) {

            System.out.println("\n\n\t\tCongrates : You Win The Match ");
        } else {

            System.out.println("\n\n \t\t Sorry you lost : ");

        }


        if (computerchoice == 0) {
            System.out.println("\t\tComputer choice : Rock\n\n");
        }


        if (computerchoice == 1) {
            System.out.println("\t\tComputer choice : Paper\n\n");
        }

        if (computerchoice == 2) {
            System.out.println("\t\tComputer choice : Scissor\n\n");
        }
        System.out.println("\n\n\t\t\t\t powered by :  uniquedevelopers   ");
    }

}


















