 package com.company;


import java.util.Random;
public class  Main
{
    public static void main(String[] args)
    {
        System.out.println("snake and ladder\n ");
        int sum = 0;
        for(int i=0;i<5;i++)
        {
            Random rand = new Random();
            int num = rand.nextInt(20);
            System.out.println("the dice rolled is " +num);
            sum = sum + num;
            System.out.printf("now the dice is at %dth place\n\n", sum);
        }

                if(sum<5)
                {
                    System.out.println("no change");
                }
                else if ((sum<15)&&(sum>6))
                {
                    System.out.println("normal");
                }
                else if ((sum<25)&&(sum>16))
                {
                    System.out.println("go back to 1");
                }
                else if ((sum<35)&&(sum>26))
                {
                    System.out.println("jump to last ur winner");
                }
                else if ((sum<45)&&(sum>36))
                {
                    System.out.println("no harm");
                }
                else if ((sum<55)&&(sum>46))
                    System.out.println("winner");
                else
                {
                    System.out.println("exceeded");
                }



    }
}
