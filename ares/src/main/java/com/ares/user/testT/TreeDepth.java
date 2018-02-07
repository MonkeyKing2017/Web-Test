package com.ares.user.testT;
//package com.ares.user.test;
//
//public class TreeDepth {
//    public static int treeDepth(TreeNode node) {
//        if (node == null) return 0;
//        return Math.max(treeDepth(node.getLeft()), treeDepth(node.getRight())) + 1;
//    }
// 
//    public static void main(String[] args) {
//        //创建一颗树，一个样例
//        TreeNode<Character> root = new TreeNode<>('A');
//        root.setLeft(new TreeNode<>('B'));
//        root.getLeft().setLeft(new TreeNode<>('D'));
//        root.getLeft().setRight(new TreeNode<>('E'));
//        root.getLeft().getRight().setLeft(new TreeNode<>('G'));
//        root.setRight(new TreeNode<>('C'));
//        root.getRight().setRight(new TreeNode<>('F'));
// 
//        int depth = treeDepth(root);
//        System.out.println(depth);//4
//    }
//}
