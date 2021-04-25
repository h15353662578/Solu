package com.hs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Huasheng
 * @Date 2021/04/21/10:30
 * @Description
 * 前序遍历 迭代方法遍历二叉树
 */
public class DieDai {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> treeStack = new Stack();
        if(root==null){
            return result;
        }
        treeStack.push(root);
        while(!treeStack.isEmpty()){
            TreeNode tempNode = treeStack.pop();
            if(tempNode != null){
                result.add(tempNode.val);
                treeStack.push(tempNode.left);
                treeStack.push(tempNode.right);
            }
        }
        return result;
    }





    class Solution {
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList<Integer>();
            preorder(root, res);
            return res;
        }

        public void preorder(TreeNode root, List<Integer> res) {
            if (root == null) {
                return;
            }
            res.add(root.val);
            preorder(root.left, res);
            preorder(root.right, res);
        }
    }

    public static void main2(String[] args) {

    }
}