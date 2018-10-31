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
public class LinkedListAdd {
    
    
    // base : calculate sum, return carry
    // other value = sum + carry
    
    Node Add(Node first, Node second)
    {
        Node start = new Node(0);
        Node next = new Node(0);
        int diff = normalize(first,second);
        
        start.data = AddHelper(start,next,first,second,diff);
        
        return start;
        
    }
    int AddHelper()// no carry node
    {
        int x1 = 0;
        //AddHelper()
        return x1;
    }
    int AddHelper(Node carryNode,Node sumNode,Node first,Node second,int diff)
    {
        int carry = 0;
        if(diff == 0)
        {
            if(first.next != null)
            {
                Node next = new Node(0);
                int sum = first.data + second.data + AddHelper(sumNode,next,first.next,second.next,0);
                sumNode.data = Math.abs(sum - 10);
                carry = sum/10;
                carryNode.next = sumNode;
                return carry;
                
            }
            else
            {
                int sum = first.data + second.data;
                sumNode.data = Math.abs(sum - 10);
                carry = sum/10;
                carryNode.next = sumNode;
                return carry;
            }
        }
        else if(diff > 0) // first is longer
        {
            int x = diff - 1;
            Node next = new Node(0);
            int sum = first.data + 0 + AddHelper(sumNode,next,first.next,second,x);
            
            sumNode.data = sum % 10;
            carry = sum/10;
            carryNode.next = sumNode;
            return carry;
        }
        else if(diff < 0)
        {
            int y = diff + 1;
            Node next = new Node(0);
            int sum = second.data + 0 + AddHelper(sumNode,next,first,second.next,y);
            sumNode.data = sum % 10;
            carry = sum/10;
            carryNode.next = sumNode;
            return carry;
        }
        return carry;
    }
    
    int normalize(Node first, Node second)
    {
        int count = 0;
        //Node first = new Node(0),second = new Node(0);
        //first.copy(head1); 
        //second.copy(head2);
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
        
        LinkedListAdd list = new LinkedListAdd();//(head1,head2);
        System.out.print("first List is ");
        
       // list.printList(head1);
        //System.out.print("first element of the list is %d",head1.data);
        
        
       // System.out.print("second List is ");
        //list.printList(head2);
        
        //add the two lists
        //Node rs = list.addTwoLists(head1,head2);
        System.out.printf("first element of the list is < %d >",head1.data);
        Node rs = list.Add(head1,head2);
        System.out.print("Resultant List is ");
        list.printList(rs);
    }
}
