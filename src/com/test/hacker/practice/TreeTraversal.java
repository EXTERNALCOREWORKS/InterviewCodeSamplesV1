package com.test.hacker.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

public class TreeTraversal {
    public void inOrderTraversal(TreeNode root) {
        if(root!=null) {
        	inOrderTraversal(root.left);
        	System.out.println(root.val);
        	inOrderTraversal(root.right);
        }
    }
    
    public void preOrderTraversal(TreeNode root) {
    	if(root!=null) {
    		System.out.println(root.val);
    		preOrderTraversal(root.left);
        	preOrderTraversal(root.right);
        }
    }
    
    public void postOrderTraversal(TreeNode root) {
    	if(root!=null) {
			postOrderTraversal(root.left);
	    	postOrderTraversal(root.right);
	    	System.out.println(root.val);
    	}
    }
    
    public void breadthFirstSearchTraversal(TreeNode root) {
        List<Integer> results= new ArrayList<>();
    	Queue<TreeNode> queue= new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
        	TreeNode current=queue.poll();
        	results.add(current.val);
        	if(current.left!=null)
        		queue.add(current.left);
        	if(current.right!=null)
        		queue.add(current.right);
        }
        System.out.println(results);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        
        TreeTraversal tt = new TreeTraversal();
        System.out.println("InOrder: ");
        tt.inOrderTraversal(root);  // Output: 4 2 5 1 6 3 7
        
        System.out.println("\n PreOrder: ");
        tt.preOrderTraversal(root);  // Output: 1 2 4 5 3 6 7
        
        System.out.println("\n PostOrder: ");
        tt.postOrderTraversal(root);  // Output: 4 5 2 6 7 3 1
        
        System.out.println("\n Breadth First Search: ");
        tt.breadthFirstSearchTraversal(root);  // Output: 1 2 3 4 5 6 7
    }
}
