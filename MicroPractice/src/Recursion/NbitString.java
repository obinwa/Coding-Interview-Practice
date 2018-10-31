/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Recursion;

/**
 *
 * @author CHIDIEBERE
 */
public class NbitString {
    
    public static void main(String[] args)
    {
        // U --> 1X | 0X
        // X --> 1X | 0X | 1 | 0
        // Generate all the strings of n bits. Assume A[0.. n – 1] is an array of size n.
        
        NbitString str = new NbitString();
        //int n = 3;
        str.generateHelper(3);
        
        
    }
    
    public void generateHelper(int n)
    {
        int[] A = new int[n];
        generate(n-1,A);
    }
    
    public void printArray(int[] A)
    {
        //System.out.print("In print");
        System.out.println();
        for(int i = 0; i < A.length ; i++)
        {
            System.out.printf("%d",A[i]);
        }
    }
    
    public void generate(int n, int[] A)
    {
        if(n < 0)
        {
            printArray(A);
        }
        else
        {
           // System.out.print("In generate"); 
            A[n] = 1;
            generate(n-1,A);
            A[n] = 0;
            generate(n-1,A);
            
            
        }
        
        
    }
    
}
