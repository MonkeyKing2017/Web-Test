package com.ares.user.testT;
//package com.ares.user.test;
//
//public class LeafCounter {
//    public static int leafCount(TreeNode node) {
//        if (node == null) return 0;
//        if (node.getLeft() == null && node.getRight() == null) return 1;
//        return leafCount(node.getLeft()) + leafCount(node.getRight());
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
//        int count = leafCount(root);
//        System.out.println(count);//3
//    }
//}
