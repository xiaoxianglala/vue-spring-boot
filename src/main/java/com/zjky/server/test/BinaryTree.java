package com.zjky.server.test;

import com.zjky.server.ZjkyServerApplication;
import org.springframework.boot.SpringApplication;

/**
 * @ClassName BinaryTree
 * @Description TODO
 * @Author ysy
 * @Date 2020/4/9 10:32
 **/
public class BinaryTree {
    private BNode root;
    public BinaryTree(){
        root = null;
    }
/**
 * @Author ysy
 * @Description 新增二叉树节点
 * @Date 2020/4/9 11:55
 * @Param [key, data]
 * @return void
 **/
    public void insertBNode(int key,double data){
        //插入一个新节点，给新节点赋值
        BNode node = new BNode();
        node.key = key;
        node.data = data;
        if (null == root){
            root = node;
        }else {
            BNode current = root;
            BNode parent;
            //查询孩子节点，直到无孩子节点，然后进行插入新的节点
            while (true){
                //改操作让current进行判断孩子节点是否存在，让parent进行插入操作，都是同一节点
                parent = current;
                //是否是插入左节点，否则是右节点
                if (key <=current.data){
                    current = current.leftChild;
                    if (null == current){
                        //将新节点插入到当前节点的左子节点
                        parent.leftChild = node;
                        //新节点的父节点为当前节点
                        node.parent = parent;
                        return;
                    }
                }else {
                    current = current.rightChild;
                    if (null == current){
                        parent.rightChild = node;
                        node.parent = parent;
                        return;
                    }
                }
            }
        }
    }

    /**
     * @Author ysy
     * @Description //TODO查询数中对应节点的数据
     * @Date 2020/4/9 12:00
     * @Param [key]
     * @return com.zjky.server.test.BinaryTree.BNode
     **/
    public BNode findKey(int key){
        BNode current = root;
        //当前节点的key是否是需要查询的key
        while (current.key != key){
            //key直小于等于当前的key的话，那么往树的左孩子进行查询
            if (key <= current.key){
                current = current.leftChild;
            }else {
                current =current.rightChild;
            }
            if (current == null){
                return null;
            }
        }
    return current;
    }

    class BNode{
        public int key;
        public double data;
        public BNode parent;
        public BNode leftChild;
        public BNode rightChild;
        public void displayNode() {
            System.out.println("{" + key + ":" + data + "}");
        }

    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insertBNode(1,2);
        binaryTree.insertBNode(4,3);

    }

}
