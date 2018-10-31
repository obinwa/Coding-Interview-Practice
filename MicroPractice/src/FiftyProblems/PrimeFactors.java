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
import java.util.*;
public class PrimeFactors {
    
    
    public static void main(String[] args)
    {
        PrimeFactors test = new PrimeFactors();
        int[] arr = {1,1,2,3,4,6};
        ArrayList<Integer> t = new ArrayList<Integer>();
        t.add(9);t.add(8);
        System.out.printf("The prime factors of %d is %s ",35,t);//test.primeFactors(35));
    }
    
    Set<Integer> primeFactors(int number)
    {
        Set<Integer> values = new HashSet<>();
        int copy = number;
        
        for(int i = 2; i < number;i++)
        {
            if(copy%i == 0)
            {
                values.add(i);
                copy = copy/i ;
                --i;
            }
        }
        
        return values;
    }
    
    
}
