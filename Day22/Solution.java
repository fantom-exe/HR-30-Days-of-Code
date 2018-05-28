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
	
	public static int getHeight(Node root) {
		int leftHeight = 0, rightHeight = 0, height;
		
		// base case
		if(root == null) {
			return -1;
		}
		
		// left height
		leftHeight += getHeight(root.left);
		
		// right height
		rightHeight += getHeight(root.right);
		
		height = Math.max(leftHeight, rightHeight) + 1;
		
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