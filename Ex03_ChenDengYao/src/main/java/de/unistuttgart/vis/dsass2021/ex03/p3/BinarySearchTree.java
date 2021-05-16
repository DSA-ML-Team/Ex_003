package de.unistuttgart.vis.dsass2021.ex03.p3;

public class BinarySearchTree<T extends Comparable<T>> implements IBinarySearchTree<T> {
	
	public IBinaryTreeNode<T> root;
	
	public void insert(T t) {
         
		IBinaryTreeNode<T> newNode = new BinaryTreeNode<T>();
		
		if (root == null) {
	        root = newNode;
	        root.setLeftChild(null);
	        root.setRightChild(null);
	    } 
		else {
	    	IBinaryTreeNode<T> currentNode = root;
	    	IBinaryTreeNode<T> parentNode;
	    	
	    	while (true) {
	            parentNode = currentNode;
	            
	            if (newNode.getValue().compareTo(currentNode.getValue()) == 1) {
	                currentNode = currentNode.getRightChild();
	                
	                if (currentNode == null) {
	                    parentNode.setRightChild(newNode);
	                    return;
	                    
	                } else {
	                    currentNode = currentNode.getLeftChild();
	                    if (currentNode == null) {
	                        parentNode.setLeftChild(newNode);
	                        return;
	                    }
	                }
	           }
		   }
		}
	}
	

	
	public IBinaryTreeNode<T> getRootNode(){
		return root;
	}
	
	
	
	
	int deep(IBinaryTreeNode<T> d33p){
	    if(d33p==null){
	        return 0;
	    }
	    int leftDepth = deep(d33p.getLeftChild());
	    int rightDepth = deep(d33p.getRightChild());
	    return rightDepth>leftDepth?rightDepth+1:leftDepth+1;
	}
	
	
	
	
	public boolean isFull() {
		
		if(root==null){
	         return false;
	      }
	      if(root.getLeftChild()==null&&root.getRightChild()==null){
	          return true;
	      }
	     int leftDepth = deep(root.getLeftChild());
	     int rightDepth = deep(root.getRightChild());
	     if(leftDepth!=rightDepth){
	        return false;
	     }
	    if(root.getLeftChild()&& root.getRightChild()){
	       return true;
	    }else{
	       return false;
	    }
	       
	}
	
	
	
	public BinarySearchTree() {
		
	
	}


}
