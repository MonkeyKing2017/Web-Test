package com.ares.user.testT;

public class TreeNode<Value extends Comparable<? super Value>> {
    private Value value;
    private TreeNode left;
    private TreeNode right;
 
    public Value getValue() {
        return value;
    }
 
    public void setValue(Value value) {
        this.value = value;
    }
 
    public TreeNode getLeft() {
        return left;
    }
 
    public void setLeft(TreeNode left) {
        this.left = left;
    }
 
    public TreeNode getRight() {
        return right;
    }
 
    public void setRight(TreeNode right) {
        this.right = right;
    }
 
    public TreeNode(Value value){
        this.value = value;
    }
}
