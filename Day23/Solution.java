package Day23;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
	Node left,right;
	int data;
	Node(int data){
		this.data=data;
		left=right=null;
	}
}

public class Solution {
	
	static void levelOrder(Node root){
		Queue<Node> levelOrder = new LinkedList<>();
		
		if(root == null) { // print
			while(!levelOrder.isEmpty()) {
				System.out.print(levelOrder.poll() + " ");
			}
		}
		else {
			levelOrder.add(root);
			
			if(root.left != null) {
//			levelOrder.add(root.left);
				levelOrder(root.left);
			}
			
			if(root.right != null) {
//			levelOrder.add(root.right);
				levelOrder(root.right);
			}
			
		}
		
	}
	
	public static Node insert(Node root,int data){
		if(root==null){
			return new Node(data);
		}
		else{
			Node cur;
			if(data<=root.data){
				cur=insert(root.left,data);
				root.left=cur;
			}
			else{
				cur=insert(root.right,data);
				root.right=cur;
			}
			return root;
		}
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		Node root=null;
		while(T-->0){
			int data=sc.nextInt();
			root=insert(root,data);
		}
		levelOrder(root);
	}

}


