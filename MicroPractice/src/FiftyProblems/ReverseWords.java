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
public class ReverseWords {
    
    
    String reverseWords(String sentence1)
    {
        String result = "";
        String hold;
        
        String sentence = sentence1.trim();
        String[] all = sentence.split("\\s");
        
        String prev = "";
        
        for(String element : all)
        {
            result = element + " " + result;
        }
        
        System.out.printf("The reverse of %s is \n\t\t%s\n",sentence1,result);
        return result;
    }
    
    public static void main(String[] args)
    {
        String words = "Ye, I am the "
                + "child of the Lord. God's own child.";
        
        ReverseWords test = new ReverseWords();
        test.reverseWords(words);
    }
}
