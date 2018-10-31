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
public class PermuteString {
 
    
    void permute(String args)
    {
        int  n = args.length();
        char[] argsArray = args.toCharArray();
        permutation(argsArray,0,n-1);
    }
    
    void swap(char[] elements,int f,int s)
    {
        char temp = elements[f];
        elements[f] = elements[s];
        elements[s] = temp;
        
    }
    
    String charToString(char[] letters)
    {
        String result = "";
        for(int i = 0;i < letters.length;i++)
        {
            result = result + "" + letters[i];
        }
        return result;
    }
    
    void permutation(char[] arr,int l, int r)
    {
        if(l == r)
        {
            String arrString = charToString(arr);
            System.out.printf("%s\n",arrString);
        }
        else
        {
            for(int i = l;i<=r;i++)
            {
                swap(arr,l,i);
                permutation(arr,l+1,r);
                swap(arr,i,l);
            }
        }
    }
    
    public static void main(String[] args)
    {
        PermuteString ps = new PermuteString();
        ps.permute("HEYMAN");
    }
}
