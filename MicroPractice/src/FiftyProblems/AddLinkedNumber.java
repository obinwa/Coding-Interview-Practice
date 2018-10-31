/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FiftyProblems;

/**
 * Given two numbers represented by two linked lists, write a function that 
 * returns sum list. The sum list is
 *linked list representation of addition of two input numbers. It is not allowed to modify the lists. Also, not
 *allowed to use explicit extra space (Hint: Use Recursion).
 *
 * @author CHIDIEBERE
 */

    
    /*
    *Input:
        First List: 5->6->3 // represents number 563
        Second List: 8->4->2 // represents number 842
    *Output
        Resultant list: 1->4->0->5 // represents number 1405  
    */
    
class Node 
    {
        int data;
        Node next;
        
        Node(int d)
        {
            data = d;
            next = null;
        }
        
        void increaseData(int x)
        {
            this.data = this.data + x ;
        }
        
      void copy(Node obj)
      {
          this.data = obj.data;
          this.next = obj.next;
      }
        
    }    

class LinkedList
{
    Node head1, head2 ;
    
    LinkedList(Node x, Node y)
    {
        head1 = x;
        head2 = y;
    }
    
    
    
    int normalize(Node first1, Node second1)
    {
        int count = 0;
        Node first = new Node(0),second = new Node(0);
        first.copy(head1); 
        second.copy(head2);
        //second.clone(h2);
        while(first.next != null || second.next != null)
        {
            if(first.next == null)
            {
                count--;
                //second = second.next ;
                
            }
            else if(second.next == null)
            {
                count++;
               // first = first.next;
            }
           first = first.next == null ? first : first.next;
           second = second.next == null ? second : second.next;
        }
        
        return count;
    }
    
    Node Add(Node first, Node second)
    {
        System.out.printf("  %d",first.data);
        System.out.printf("  %d",second.data);
        Node start = new Node(0);
        Node f = new Node(0),s = new Node(0);
        f.copy(this.head1);
        s.copy(this.head2);
        int  diff = normalize(f,s);
        System.out.printf("the difference is  %d ", diff);
        System.out.printf("  %d",first.data);
        AddList(start,first,s,diff);
        System.out.printf(" \n.. %d",first.data);
        //this.printList(adjusted[0]);
        
        return start;
    }
    
    void AddList(Node prev,Node first1, Node second,int count)
    {
        System.out.printf(first1.toString());
        Node result; // = new Node(0);
        if(first1 == null)
        {
            System.out.printf("first is null, count = %d",count);
            return ;
        }
         if(second == null)
        {
            System.out.printf("second is null");
        }
        if(first1 == null || second == null)
        {
            System.out.printf("ggg is null");
            return;
        }
        
        int carry , sum ;
        //System.out.printf(">%d",first.data);
        //System.out.printf(">%d",second.data);
        
        if(count > 0) // first is longer
        {
            System.out.printf("\n value of node is %d, count is %d\n",first1.data,count);
            sum = first1.data;
            result = new Node(sum);
            int x = count -1;
            this.AddList(result,first1.next,second,x);
            prev.next = result;
            
        }
        else if(count < 0) // second is longer than first
        {
            System.out.printf("\n>%d\n",second.data);
            sum = second.data;
            result = new Node(sum);
            int y = count + 1;
            this.AddList(result,first1,second.next,y);
        }
        else if(count == 0)
        {
            if(first1.next == null)
            {
                sum = Math.abs((first1.data + second.data) - 10);
                result = new Node(sum);
                   
                 carry = (sum >= 10)? 1 : 0 ;
                 prev.increaseData(carry) ;
           
                prev.next = result;
                return;
            }
           sum = Math.abs((first1.data + second.data) - 10);
           result = new Node(sum);
                   
           carry = (sum >= 10)? 1 : 0 ;
           prev.increaseData(carry) ;
           
           prev.next = result;
           this.AddList(result,first1.next,second.next,0);
        }
        
       
    }
    
    
    
    /* Utility function */
    
    void printList(Node head1)
    {
        Node head = new Node(0);
        head.copy(head1);
        while(head != null)
        {
            System.out.print(head.data + "");
            head = head.next ;
        }
        System.out.println("");
    }
    
    public static void main(String[] args)
    {
        //creating the first list
        Node head1 = new Node(7);
        head1.next = new Node(5);
        head1.next.next = new Node(9);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(6);
        
        Node head2 = new Node(8);
        head2.next = new Node(5);
        //list.head2.next.next = new Node(7);
        //list.head2.next.next.next = new Node(2);
        //list.head2.next.next.next.next = new Node(6);
        
        LinkedList list = new LinkedList(head1,head2);
        System.out.print("first List is ");
        
       // list.printList(head1);
        //System.out.print("first element of the list is %d",head1.data);
        
        
       // System.out.print("second List is ");
        //list.printList(head2);
        
        //add the two lists
        //Node rs = list.addTwoLists(head1,head2);
        System.out.printf("first element of the list is < %d >",list.head1.data);
        Node rs = list.Add(list.head1,list.head2);
        System.out.print("Resultant List is ");
        list.printList(rs);
    }
}