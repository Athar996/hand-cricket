package com.company;

import java.util.Random;

import java.util.Scanner;


public class game

{

    public static void main(String[] args)

    {

        Scanner sc=new Scanner(System.in);

        Random rand=new Random();


        int me=0;

        int computer =0;

        for(int i=0;i<3;i++)

        {

        System.out.println("1. rock  \t  2.paper  \t  3.scissor");

        System.out.println("enter any num between 1 to 3 ");

        int human = sc.nextInt();

        System.out.println("human selected" + human);

        int comp= rand.nextInt(3);

        System.out.println("computer selected: "+ comp);


        if (comp == 1 && human == 2)

        {

            System.out.println("human won");

            me++;

        }

        else if (comp == 1 && human == 3)

        {

            System.out.println("comp won");

            computer++;

        }

        else if (comp == 2 && human == 1)

        {

            System.out.println("comp won");

            computer++;

        }

        else if (comp == 2 && human == 3)

        {

            System.out.println("human won");

            me++;

        }

        else if (comp==3&&human==1)

        {

            System.out.println("human won");

            me++;

        }

        else if (comp == 3 && human == 2)

        {

            System.out.println("comp won");

            computer++;

        }

        else

        {

            System.out.println("tie match");

        }

      }

        System.out.println(me);

        System.out.println(computer);

        if(me>computer)

        {

            System.out.println("me won final" );

        }

        else

        {

            System.out.println("computer won");

        }


    }

}
