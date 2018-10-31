/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHIDIEBERE
 */
import java.util.*;
public class ArrayDistance {
    
    
    public ArrayDistance()
    {
        
    }
    
    public static int distance(int[] SampleArray)
    {
        int result ;
        int largest = 0;
        int length = SampleArray.length;
        int ArrJ = SampleArray[0];
        int ArrI = SampleArray[length-1] ;
        
        for(int j = 0; (SampleArray.length - j) > largest ;j++)
        {
            if(SampleArray[j] < ArrJ )
            {
                continue;
            }
            else
            {
                ArrJ = SampleArray[j];
            }
            
            for(int i = length - 1 ;(i > largest)  ; i--)
            {
                if( largest < (i-j))
                {
                    if(SampleArray[j] > SampleArray[i])
                    {
                        System.out.printf("reached for %d and %d\n",SampleArray[j], SampleArray[i]);
                        largest = i- j ;
                        ArrJ = SampleArray[j] ;
                        ArrI = SampleArray[i];
                         break ;
                    }
                    else
                    {
                        continue;
                    }
                    
                }
                else
                {
                    break;
                }
            }
        }
        
        return largest;
    }
    
    public static void main(String[] args)
    {
        int[] array = {4,2,3,6,2,4,3,1,5};
        int maxDistance = distance(array);
        System.out.printf("%d", maxDistance); //distance([4,2,3,6,1,5]));
    }
}
