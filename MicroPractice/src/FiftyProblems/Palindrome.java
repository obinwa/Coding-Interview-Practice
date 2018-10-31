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
public class Palindrome {
    
    
    boolean isPalindrome(String val)
    {
        
        if(val.trim().length() == 0)
        {
            return false;
        }  
        //handle trailing zeros
        String test = val;
        char[] testChar = test.toCharArray();
        int size = testChar.length -1;
        int middle = testChar.length/2;
        
        for(int i =0; i <= middle;i++)
        {
            if(testChar[i] != testChar[size - i])
            {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args)
    {
        Palindrome palin = new Palindrome();
        boolean result = palin.isPalindrome("1 23 321");
        System.out.print(result);
    }
}
