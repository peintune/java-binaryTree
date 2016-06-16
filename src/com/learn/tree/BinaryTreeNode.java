package com.learn.tree;

public class BinaryTreeNode
{
    private String name=null;
    private String data=null;
    private BinaryTreeNode leftTreeNode=null;
    private BinaryTreeNode rightTreeNode=null;
    public BinaryTreeNode(String name,String data)
    {
        this.name=name;
        this.data=data;
    }
    public String getName(){
        return this.name;
    }
    public String getData(){
        return this.data;
    }
    public BinaryTreeNode getLeftChild(){
        return this.leftTreeNode;
    }
    public BinaryTreeNode getRightChild(){
        return this.rightTreeNode;
    }
    public void setLeftChild(BinaryTreeNode treeNode){
        this.leftTreeNode=treeNode;
    }
    public void setRightChild(BinaryTreeNode treeNode){
        this.rightTreeNode=treeNode;
    }
    public String parse(){
        if(null==this.leftTreeNode&&null==this.rightTreeNode){
            return "\""+this.name+"\"";
        }else{
            String result="{\""+this.name+"\":[";
            String leftChildParseResult="null";
            String rightChildParseResult="null";
            if(this.leftTreeNode!=null){
                leftChildParseResult=this.leftTreeNode.parse();
            }
            if(this.rightTreeNode!=null){
                rightChildParseResult=this.rightTreeNode.parse();
            }
            result+=leftChildParseResult+","+rightChildParseResult+"]}";
            return result;
        }
    }
    @Override
    public String toString(){
        return this.name+" : "+this.data;
    }
}
