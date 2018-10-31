/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FiftyProblems;

import java.util.Arrays;

/**
 *
 * @author CHIDIEBERE
 */
public class PascalNumber {
    
    int[] arr;
    int Num;
    public PascalNumber(int n )
    {
        Num = n + 1;
        arr = new int[Num];
        arr[0] = 1 ;
        //arr[1] = 1;
        
        for(int i = 1; i < Num ; i++)
        {
            arr[i] = i * arr[i-1] ;
        }
        
    }
    void pascal()
    {
        int[] line = new int[Num] ;
        line[0] = 1;
        for(int i = 0; i < Num ; i++)
        {
            line[i] = combination(Num-1,i);
        }
        
        System.out.printf("Pascal triangle's line %d\n", Num);
        System.out.printf("%s\n",Arrays.toString(line));
    }
    
    int combination(int n, int a)
    {
        int numerator = factorial(n);
        int denominator = (factorial(n-a) * factorial(a));
        
        int output = numerator/ denominator ;
        
        return output;
    }
    
    int factorial(int n)
    {
        return arr[n] ;
    }
    
    public static void main(String[] args)
    {
        PascalNumber test = new PascalNumber(0);
        test.pascal();
    }
}
