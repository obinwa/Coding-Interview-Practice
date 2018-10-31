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
public class ReverseArray {
    
    int[] reverseArray(int[] array1)
    {
        int array[] = array1;
        int length = array.length -1;
        int half = (int)Math.floor(length/2);
        
        if(length < 1)
        {
            
        }
        else
        {
            for(int i = 0; i <= half ;i++)
            {
                int a = array[i];
                int temp = a;
                int b = array[length -i];

                array[i] = b;
                array[length-i] = a;
            }
        }
       
        System.out.printf("the reverse of :\n");
        printArray(array1);
        System.out.printf("is \n");
        printArray(array);
        return array;
    }
    
    void printArray(int[] arr)
    {
        for(int i = 0; i < arr.length;i++)
        {
            System.out.printf("%d ",arr[i]);
        }
    }
    
    public static void main(String[] args)
    {
        int[] sample1 = {1,2,3,4,5,6,7,8,9};
        int[] sample2 = {1};
        
        ReverseArray test = new ReverseArray();
        test.reverseArray(sample2);
    }
}
