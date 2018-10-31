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
public class ReverseLinked {
    
    
    Node reverse(Node head)
    {
        //             prev - a - next
        //  next - a - prev  
       Node prev = null;
            
       while(head!=null)
       {
           Node Next = head.next;
           head.next = prev;
           
           prev = head;
           head = Next;
       }
       
       return prev;
    }
    
    void printList(Node head1)
    {
        Node head = head1;
        while(head != null)
        {
            System.out.printf("%d, ",head.data);
            head = head.next;
            
        }
        System.out.printf("\n");
    }
    
    public static void main(String[] args)
    {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(5);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(5);
        
        //System.out.printf("%d",head.next.data);
        
        ReverseLinked example = new ReverseLinked();
        example.printList(head);
        Node top = new Node(0);
        top.copy(head);
        Node rev = example.reverse(top);
        example.printList(rev);
        
    }
}
