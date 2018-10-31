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
public class StackWithList {
    
    LinkedList<Object> list;
    public StackWithList()
    {
        
    }
    public Object pop()
    {
        Object first = list.pollFirst();
        System.out.printf(" popping %s out \n",first.toString());
        
        System.out.printf("The remaining stack contains\n");
        for(Object element:list)
        {
            System.out.printf("%s",element.toString());
        }
        
        
        return first;
    }
    
    public void push(Object element)
    {
        list.add(element);
        System.out.printf("The remaining stack contains");
        for(Object node:list)
        {
            System.out.printf("%s",node.toString());
        }
    }
}

class Node
{
    public Node(Object element)
    {
        
    }
}