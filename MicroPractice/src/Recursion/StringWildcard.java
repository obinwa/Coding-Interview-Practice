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

import java.util.* ;

public class StringWildcard {
    
    public static void main(String[] args)
    {
        // U --> E?E?..
        //E --> normal string
        //? --> 1|0
        
        StringWildcard sw = new StringWildcard();
        //char[] input = sw.getString();
        String input = "WE???" ; //.toCharArray();
        int n = input.length();
        
        sw.generateHelper(input, n);
        
    }
    
    public char[] getString()
    {
        Scanner read = new Scanner(System.in);
        System.out.print(" Enter String  :  ");
        String inputString = read.nextLine();
        
        return inputString.toCharArray() ;
    }
    
    public void printString(char[] value)
    {
        for(int i = 0; i < value.length ; i++)
        {
            System.out.printf("%c",value[i]);
        }
       
       System.out.println();
    }
    
    public void generateHelper(String wildcard, int n)
    {
        char[] wildcardA = wildcard.toCharArray();
        generateWildcard(wildcardA, n-1);
    }
    
    public void generateWildcard(char[] wildcardChar, int n)
    {
        char[] wildcard = wildcardChar.clone();
        if(n <= 0)
        {
            printString(wildcardChar);
        }
        
        else if(wildcard[n] == '?')
        {
            int k = n;
            wildcard[k] = '0';
            generateWildcard(wildcard, n-1);
            char[] wild;
            wild = wildcard.clone();
            wild[k] = '1';
            //int k = n
            generateWildcard(wild,n-1);
        }
        else
        {
            generateWildcard(wildcard,n-1);
        }
    }
}
