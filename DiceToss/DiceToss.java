

import java.util.Scanner;

public class DiceToss
{
    public static int dice1, dice2, dice3, percentage;

    public static boolean isBetween6And12()
    {
        dice1 = (int) (Math.random() * 6) ;
        dice2 = (int) (Math.random() * 6) ;
        dice3 = (int) (Math.random() * 6) ;
        int sum = dice1 + dice2 + dice3;

        if (sum >= 6 && sum <= 12)
        {
            
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++)
        {


            if (isBetween6And12() == true)
            {
                System.out.println(" " + dice1 + " " + dice2 + " " + dice3 + " Between 6 and 12");
                percentage++;

            }
            else
            {
                System.out.println(" " + dice1 + " " + dice2 + " " + dice3 + " Out of Range");
            }
        }
        System.out.println("Percentage: " + (percentage * 100) / n + "%");
       
    }

}