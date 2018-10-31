/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FiftyProblems;

/**
 *
 * @author CHIDIEBERE
 */
public class Fibonacci {
    
    int fibonacci(int n)
    {
        int f0 = 0;
        int f1 = 1;
        int z =1;
        for(int i = 2;i<=n;i++)
        {
            z = f0 + f1;
            f0 = f1;
            f1 = z;
        }
        System.out.println(z);
        return z;
    }
    public static void main(String[] args)
    {
        Fibonacci test = new Fibonacci();
        test.fibonacci(3);
    }
}
