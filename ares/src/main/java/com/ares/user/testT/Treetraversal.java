package com.ares.user.testT;
//package com.ares.user.test;
//
//import java.util.LinkedList;
//
//public class Treetraversal {
//    /**
//     * 前序遍历，先根遍历
//     *
//     * @param node 树的根
//     */
//    public static void preOrder(TreeNode node) {
//        if (node == null) return;
//        System.out.print(node.getValue() + "\t");
//        preOrder(node.getLeft());
//        preOrder(node.getRight());
//    }
// 
//    /**
//     * 中序遍历，中根遍历
//     *
//     * @param node 树的根
//     */
//    public static void inOrder(TreeNode node) {
//        if (node == null) return;
//        inOrder(node.getLeft());
//        System.out.print(node.getValue() + "\t");
//        inOrder(node.getRight());
//    }
// 
//    /**
//     * 后序遍历，后根遍历
//     *
//     * @param node 树的根
//     */
//    public static void postOrder(TreeNode node) {
//        if (node == null) return;
//        postOrder(node.getLeft());
//        postOrder(node.getRight());
//        System.out.print(node.getValue() + "\t");
//    }
// 
//    /**
//     * 层序遍历，层次遍历
//     *
//     * @param node 树的根
//     */
//    public static void levelOrder(TreeNode node) {
//        LinkedList<TreeNode> queue = new LinkedList<>();
//        queue.add(node);
//        while (!queue.isEmpty()) {
//            TreeNode cur = queue.pop();
//            System.out.print(cur.getValue() + "\t");
//            if (cur.getLeft() != null) queue.add(cur.getLeft());
//            if (cur.getRight() != null) queue.add(cur.getRight());
//        }
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
//        preOrder(root);//A   B   D   E   G   C   F  
//        System.out.println();
//        inOrder(root);//D   B   G   E   A   C   F  
//        System.out.println();
//        postOrder(root);//D   G   E   B   F   C   A
//        System.out.println();
//        levelOrder(root);//A   B   C   D   E   F   G
//    }
//} 
