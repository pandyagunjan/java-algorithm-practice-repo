package LeetCode;

public class FibonacciNumber {
    /**
     * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
     *
     * F(0) = 0, F(1) = 1
     * F(n) = F(n - 1) + F(n - 2), for n > 1.
     * Given n, calculate F(n).
     *
     *
     *
     * Example 1:
     *
     * Input: n = 2
     * Output: 1
     * Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
     * Example 2:
     *
     * Input: n = 3
     * Output: 2
     * Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
     * Example 3:
     *
     * Input: n = 4
     * Output: 3
     * Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
     */


    public static int fibSeries(int number)
    {
        if(number==0)
            return 0;
        if(number==1)
            return 1;
        return fibSeries(number-2)+ fibSeries(number-1);

// iterative method
//        int n1=0;
//        int n2=1;
//        int sum=0;
//        for(int i=2 ; i <=number ; i++)
//        {
//            sum= n1+n2;
//            n1=n2;
//            n2=sum;
//        }
//       return sum;
    }
    public static void main(String[] args) {

        System.out.println(fibSeries(8));



    }
}
