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
public class QuickSort {
    
    int[] arr;
    public QuickSort(int[] args)
    {
        arr = args;
    }
    
    void swap(int index1, int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp ;
    }
    
    void quicksort(int low,int high)
    {
        int i = low;
        int j = high;
        
        int pivot = arr[i+ ((j-i)/2)] ;
        
        while(i <= j)
        {
            
            while(arr[i] < pivot)
            {
                i++ ;
            }
            while(arr[j] > pivot)
            {
                j-- ;
            }
            
            if(i <= j)
            {
                swap(i,j);
                j--;
                i++;
            }
        }
        
        if(i < high)
        {
            quicksort(i,high);
        }
        if(j > low)
        {
            quicksort(low,j);
        }
    }
    
    void sort()
    {
        int start = 0;
        int end = arr.length -1;
        quicksort(start,end);
    }
    
    public static void main(String[] args)
    {
        int[] unsorted = {1,6,3,4,8,9,7,2,4,1,8,3,23} ;
        List generic = Arrays.asList(unsorted);
        
        System.out.printf("Array before sorting %s %n ",Arrays.toString(unsorted));
        QuickSort test = new QuickSort(unsorted);
        test.sort();
        
        System.out.printf("Array after sorting %s",Arrays.toString(test.arr));
        
    }
}
