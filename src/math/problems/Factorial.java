package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int fact=1;
        int n=5;
//Factorial using loop
        for (int i=1;i<=n;i++){fact=fact*i;}
        System.out.println("Factorial of "+n+ " is  : "+fact);
    }
    //factorial using recursion

    public  int factorial(int x)
    {
        int result;
        if(x==0) {return 1;}
        else  result=factorial(x-1)*x;
        return result;
    }
}
