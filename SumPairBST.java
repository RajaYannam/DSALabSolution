package com.greatlearning.Sumpair;

import java.util.HashSet;

public class SumPairBST {
	static class Node{
		int data;
		Node left,right;
		Node(int data)
		{
			this.data=data;
			left=null;
			right=null;
		}
	}
	
	static boolean traversal(Node node,int sum,HashSet<Integer> set)
	{
		if(node==null) {
			return false;
		}
		if(traversal(node.left,sum,set))
		{
			return true;
		}
		if(set.contains(sum-node.data))
		{
			System.out.print("pair is found ("+(sum-node.data)+ "," + node.data+ ")");
			if(node!=null)
			{
				traversal(node.left,sum,set);
				System.out.println("");
				traversal(node.right,sum,set);
				return true;
			}
		}
		else {
			set.add(node.data);
		}
		
		if(traversal(node.right,sum,set))
		{
			return true;
		}
		return false;	
	}

	public static void main(String[] args) {
		HashSet<Integer> interaction=new HashSet<Integer>();
		int sum=130;
		Node root=new Node(40);
		Node left=new Node(20);
		Node right=new Node(60);
		root.left=left;
		root.right=right;
		root.left.left=new Node(10);
		root.left.right=new Node(30);
		root.right.left=new Node(50);
		root.right.right=new Node(70);
		boolean binarysearch= traversal(root,sum,interaction);
		if(binarysearch == false)
		{
			System.out.print("nodes are not found");
		}
		
	}
}
