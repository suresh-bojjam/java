package hackers;

import java.util.Scanner;

class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}

}
public class LList {

	public static  Node insert(Node head,int data)
	{
		Node p=new Node(data);			
		if(head==null)
			head=p;
		else if(head.next==null)
			head.next=p;
		else
		{
			Node start=head;
			while(start.next!=null)
				start=start.next;
			start.next=p;

		}
		return head;
	}
	public static void display(Node head)
	{
		Node start=head;
		while(start!=null)
		{
			System.out.print(start.data+" ");
			start=start.next;
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Node head=null;
		/*int T=sc.nextInt();
              while(T-->0){
                  int ele=sc.nextInt();
                  head=insert(head,ele);
              }*/
		//int a[]= {1,1,1,1,1,1,1};
		int a[]= {1,2,2,3,3,4};
		for(int i=0;i<a.length;i++) {
			head=insert(head,a[i]);
		}
		head=removeDuplicates(head);
		display(head);

	}
	public static Node removeDuplicates(Node head) {
		/* Traverse the list till last node */
	    
		/* Pointer to traverse the linked list */
	    Node current = head;
	 
	    /* Pointer to store the next pointer of a node to be deleted*/
	    Node next_next; 
	   
	    /* do nothing if the list is empty */
	    if (current == null) 
	       return null; 
	    
	    while (current.next != null) 
	    {
	       /* Compare current node with next node */
	       if (current.data == current.next.data) 
	       {
	           /* The sequence of steps is important*/              
	           next_next = current.next.next;
	           current.next = next_next;  
	       }
	       else /* This is tricky: only advance if no deletion */
	       {
	          current = current.next; 
	       }
	    }
	return head; 
	}
}