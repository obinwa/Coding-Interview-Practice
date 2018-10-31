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
public class RecursiveReverse {
    
    
    Node reverse(Node head1)
    {
        System.out.printf("The list before being reversed is :\n");
        printList(head1);
        
        Node temp = head1.next;
        Node hold[] = helpReverse(null,head1);
        
        System.out.printf("\nThe list after being reversed is :\n");
        printList(hold[0]);
        
        return hold[0];
    }
    
    Node[] helpReverse(Node prev,Node head1)
    {
        Node head = head1;
        Node  reverse;
        Node[] save;
        
        if(head1.next == null)
        {
            //Node save = head1.next;
            Node store = head1.next;
            head1.next = prev;
            
            Node[] val = {head1,prev};
            return val;
        }
        else
        {
            //Node save = new Node(0);
            //save.copy(head1);
            //save = save.next ;
            save = helpReverse(head1,head1.next);
            reverse = save[1];
            
            reverse.next = prev;
            //head1.next = null;
            
        }
        Node[] val = {save[0],prev};
        return val;
        
        
    }
    
    void printList(Node head)
    {
        Node temp = new Node(0);
        temp.copy(head);
        
        while(temp != null)
        {
            System.out.printf("%d ",temp.data);
            temp = temp.next;
        }
    }
    
    public static void main(String[] args)
    {
        Node top = new Node(6);
        top.next = new Node(3);
        top.next.next = new Node(8);
        top.next.next.next = new Node(9);
        
        RecursiveReverse test = new RecursiveReverse();
        test.reverse(top);
        
    }
}
