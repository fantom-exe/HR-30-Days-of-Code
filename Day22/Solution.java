package Day22;

import java.util.*;

class Node {
	Node left,right;
	int data;
	Node(int data){
		this.data=data;
		left=right=null;
	}
}

public class Solution {
	
	int height = 0, max = 0;
	public static int getHeight(Node root) {
		
		if(root.left != null) {
//			height++;
			height += getHeight(root.left);
		}
		else if(root.right != null) {
//			height++;
			height += getHeight(root.right);
		}
		
//		max = height;
//		if()
		
		return height;
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
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		Node root=null;
		while(T-->0){
			int data=sc.nextInt();
			root=insert(root,data);
		}
		int height=getHeight(root);
		System.out.println(height);
	}
	
}