/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Linkedlist;

/**
 *
 * @author CHIDIEBERE
 */
import java.util.* ;
public class NthNode {
    
    public static void main(String[] args)
    {
        NthNode getter = new NthNode();
        String[] colours = {"Blue", "Red" , "Green" , "Yellow" , "Indigo" , "Black"} ;
        LinkedList<String> kolor = new LinkedList<String>();
        
        for (String colour : colours)
        {
            kolor.add(colour);
        }
        
        getter.getNth(kolor, 1);
        
    }
    
    public void getNth(LinkedList<String> list,int n)
    {
        LinkedList<String> temp = list ;
        int size = temp.size();
        
        if(n > size)
        {
            System.out.printf("The size of the list is less than %d ",n);
        }
        else
        {
            int rem = size - n ;
            String node = ""  ;
            Iterator<String> iterate =  temp.iterator();
            
            for(int i = 0; i < rem ;i++)
            {
                node = iterate.next();
                
            }
            
            System.out.printf("%s", node);
        }
    }
}
