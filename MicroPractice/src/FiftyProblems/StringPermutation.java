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
public class StringPermutation {
    
     String word;
     int length ;
     int count;
    public StringPermutation(String arg)
    {
        word = arg;
        length = arg.length();
        count = length-1;
    }
   
    //A -> B[x]X
    //X-> B[x]X|B[x]
    
    void arrange()
    {
        int i = 0;
        while(i< length )
        {
            String hold =  ""+word.charAt(i);
            int more = i+1;
            System.out.printf("in count %d\n",more);
            permutate(hold,more,count);
            i++;
        }
    }
    
    void permutate(String initial,int level,int end)
    {
        System.out.printf("in general  level is %d, end is %d\n",level,end);
        if((level) == end)
        {
            System.out.printf("in base  level is %d, end is %d\n",level,end);
            for(int i = 0; i < count;i++)
            {
                System.out.printf("in base for loop count %d\n",i);
                System.out.printf(""+initial+word.charAt(i)+"\n");
            }
            return;
        }
        else
        {
            System.out.printf("in recur  level is %d, end is %d\n",level,end);
            for(int i = (level); i < end;i++)
            {
                System.out.printf("in recur for loop count %d\n",i);
                String store = initial + ""+word.charAt(i);
                permutate(store, level+1,end);
            }
        }
    }
    
    public static void main(String[] args)
    {
        StringPermutation x = new StringPermutation("1234");
        x.arrange();
    }
}
