package com.Almaz.datastructure;

class Tree{
	Integer value;
	Tree left, right;
	Tree(Integer value){
		this.value = value;
		left = null;
		right = null;
	}
}
public class BinaryTree {
	
	public static Integer calculateHeightBinaryTree(Tree tree) {
		if(tree == null) {
			return 0;//base code, calling left to be 0
		}
		Integer left = calculateHeightBinaryTree(tree.left);
		Integer right =calculateHeightBinaryTree(tree.right);
		
		return Math.max(left, right)+1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree root = new Tree(1);
		root.right = new Tree(2);
		root.right.right = new Tree(3);
		root.right.right.right = new Tree(4);
		root.right.right.right.right= new Tree(5);
		root.left = new Tree(0);
		
		System.out.println(calculateHeightBinaryTree(root));
		
	}

}
