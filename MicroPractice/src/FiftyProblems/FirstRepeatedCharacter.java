/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FiftyProblems;

/**
 * Java Program to find first duplicate, non-repeated character in a String.
 *
 * @author CHIDIEBERE
 */
import java.util.* ;

public class FirstRepeatedCharacter {
    
    public FirstRepeatedCharacter()
    {
        
    }
    public static void main(String[] args)
    {
        getFirst("Ebennebe");
        getFirst("EbennebeJago");
    }
    
    /**
     * /*
    * Using HashMap to find first non repeated character of String
    * Algorithm :
    * Step 1: get character array and loop through it to build a
    * hash table with char and their count.
    * Step 2: loop through HashMap to find an entry with
    * value 1, that's your first non-repeated character,
    * as HashMap maintains insertion order.
    */
      
    public static void getFirst(String word)
    {
        String value = word.toLowerCase();
        Map<Character, Integer> store = new HashMap<Character,Integer>();
        int size = value.length();
        
        for(char c : value.toCharArray())
        {
            if(store.containsKey(c))
            {
                store.put(c, (store.get(c) + 1));
            }
            else
            {
                store.put(c,1);
            }
        }
        
        for(char element : value.toCharArray())
        {
            if(store.get(element) == 1)
            {
                System.out.printf("\nThe first non-repeated character in the string %s, is %c",value,element);
                return;
            }
            else if( store.get(element) >= 2)
            {
               
                continue;
                         
            }
            
        }
        System.out.printf("\nNo non-repeating character in string %s ", value);
        
    }
}
