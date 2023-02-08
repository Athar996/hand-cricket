package com.company;


// import java.util.*;

 import java.util.Random;

 import java.util.Scanner;

 public class Main

 {

     public static void main(String[] args)
     {
         int me=0;

         int computer=0;

    for(int i=0;i<5;i++)

    {

         System.out.println("hand cricket\n"+"enter any num between 10");

         Scanner sc = new Scanner (System.in);

         Random rand = new Random();

         Random toss = new Random();

         int coin= toss.nextInt(2);

            if(coin==1)

            {

                System.out.println("Tails, human won toss");

                int human=sc.nextInt();

                System.out.println("human selected : "+human);

                me++;

             }

            else

            {

                System.out.println("Heads, computer won toss");

                int comp=rand.nextInt(10);

                System.out.println("comp selected : "+comp);

                computer++;

            }

    }

         System.out.println("total score 0f human"+ me);

         System.out.println("total score 0f comp"+computer);

         if(me>computer)

         {

             System.out.println("me won");

         }

         else

         {

             System.out.println("comp won");

         }



/*       Scanner sc = new Scanner (System.in);

         Random rand = new Random();

         int computer = 0;

         int you = 0;

         System.out.println("***Please have a note***");

         System.out.println("1. (0) standas for rock\n2. (1) stands for paper\n3. (2) stands for sccisor");

         for (int i = 0; i<5; i++)

         {

             int comp = rand.nextInt(3);

             System.out.println("Select one number among 0, 1 2");

             int human = sc.nextInt();

             System.out.println("computer selected: "+ comp);

             if (comp == 0 && human == 1)

             {

                 System.out.println(" You won");

                 you++;

             }

             else if (comp == 0 && human == 2)

             {

                 System.out.println(" You lose");

                 computer++;

             }

             else if (comp == 1 && human == 0)

             {

                 System.out.println(" You lose");

                 computer++;

             }

             else if (comp == 1 && human == 2)

             {

                 System.out.println(" You won");

                 you++;

             }

             else if (comp == 2 && human == 0)

             {

                 System.out.println(" You won");

                 you++;

             }

             else if (comp == 2 && human == 1)

             {

                 System.out.println(" You lose");

                 computer++;

             }

             else

             {

                 System.out.println("It's a tie, both computer and you selected the same...");

             }





         }

         System.out.println("The final score of computer is: "+computer+" and you scored : "+you);

         if (computer > you)

         {

             System.out.println("Sorry, finally computer won!!. Better luck next time ");



         }

         else

         {

             System.out.println("Congratulations finally you won!!!");

         }



*/

}

}

