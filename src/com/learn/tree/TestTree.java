package com.learn.tree;

public class TestTree
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        BinaryTreeNode root=  generateATree();
        String parseResult=root.parse();
        System.out.println(parseResult);
    }
    
    public static BinaryTreeNode generateATree(){
        BinaryTreeNode root=new BinaryTreeNode("A", "a");
        BinaryTreeNode bNode=new BinaryTreeNode("B", "b");
        BinaryTreeNode cNode=new BinaryTreeNode("C", "c");
        BinaryTreeNode dNode=new BinaryTreeNode("D", "d");
        BinaryTreeNode eNode=new BinaryTreeNode("E", "e");
        BinaryTreeNode fNode=new BinaryTreeNode("F", "f");
        
        root.setLeftChild(bNode);
        root.setRightChild(cNode);
        bNode.setLeftChild(dNode);
        bNode.setRightChild(eNode);
        cNode.setLeftChild(fNode);
        return root;
    }
}
