package Day24;

import java.util.Scanner;

class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
	
}

public class Solution {
	
	public static Node removeDuplicates(Node head) {
		Node current = head,
			 next    = head.next;
		
		while(next != null) {
			
			if(current.data == next.data) {
				next    = next.next;
				current.next = next;
			}
			else {
				current = next;
				next    = next.next;
			}
			
		}
		
		return head;
	}
	
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
		int T=sc.nextInt();
		while(T-->0){
			int ele=sc.nextInt();
			head=insert(head,ele);
		}
		head=removeDuplicates(head);
		display(head);
		
	}
}

