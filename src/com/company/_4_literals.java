
/*
          *********** Literals:

                          *  A constant value that can be assigned to the variable is called a literal.

               * 101 – Integer literal
               * 10.1f – float literal
               * 10.1 – double literal (default type for decimals)
               *‘A’ – character literal
               * true – Boolean literal
               * “Osama” – String literal

        ********** Keywords :

                      * Words that are reserved and used by the Java compiler. They cannot be used as an Identifier.

                                {You can visit docs.oracle.com for a comprehensive list}


*/
      package com.company.forth.java;

public class _4_literals {
    public static void main(String[] args) {

        byte osama = 34;
        int zahid = 56;
        short tayyab = 87;
        long junaid = 5666666666666L;
        char ayesha = 'A';
//        float fiza = 5.6f;
        double babi = 4.66D;
        boolean tito = true;
        String ansa = "java";

        System.out.println(zahid);
//        System.out.println(fiza);
        System.out.println(junaid);
        System.out.println(tayyab);
        System.out.println(babi);
        System.out.println(ayesha);
        System.out.println(tito);
        System.out.println(ansa);
        System.out.println(osama);
    }
}