package com.company;
import java.util.Scanner;
public class _11_Exercise1_shortouts {
    public static void main(String[] args) {

        float eng,math,phy,urdu,comp,bio,sum ;
        System.out.println(" Numbers out of  : 100 ");
        System.out.print("enter the no.s of English : ");
        Scanner Eng  = new Scanner(System.in);
        eng = Eng.nextFloat();

        System.out.print("enter the no.s of Math : ");
        Scanner Math = new Scanner(System.in);
        math = Math.nextFloat();

        System.out.print("enter the no.s of bio : ");
        Scanner Bio = new Scanner(System.in);
        bio = Bio.nextFloat();

        System.out.print("enter the no.s of Phy : ");
        Scanner Phy  = new Scanner(System.in);
        phy = Phy.nextFloat();

        System.out.print("enter the no.s of Urdu : ");
        Scanner Urdu = new Scanner(System.in);
        urdu = Urdu.nextFloat();

        System.out.print("enter the no.s of Comp : ");
        Scanner Comp = new Scanner(System.in);
        comp = Comp.nextFloat();

        sum = (eng + math + phy + urdu + comp+ bio )/6;
        System.out.print("your percentage is : " + sum);

    }
}
