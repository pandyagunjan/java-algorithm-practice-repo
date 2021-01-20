package CollectionsDemo;

import java.util.Scanner;

public class ProgramLoan
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        //your code goes here

        double temp= 0;

        for(int i = 0 ; i < 6 ; i++)
        {
            temp = amount * 0.1;
            amount= (int) (amount-temp);
        }
        System.out.println(amount);

    }
}

