package Data_structure;
import java.util.*;
public class BinarySearchTreeds {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int x){
            this.data=x;
            left=null;
            right=null;
        }
    }
    public static Node create(Node root,int val){
            if(root == null){
                root = new Node(val);
            }
            if(root.data>val){
                root.left=create(root.left, val);
            }
            if(root.data<val){
                root.right=create(root.right, val);
            }
            return root;
    }
    public static Node delete(Node root,int x){
        if(root.data>x){
            root.left=delete(root.left, x);
        }
        else if(root.data<x){
            root.right=delete(root.right, x);
        }
        else{
            if(root.left==null&&root.right==null){
                return null;
            }
            if(root.left == null){
                return root.right;
            }
            else if(root.right ==null){
                return root.left;
            }
            Node IS = inorederSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right,IS.data);
        }
        return root;
    }
    public static Node inorederSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            System.out.print("");
            return;
            }
        inorder(root.left);
        System.out.print(root.data+",");
        inorder(root.right);
    }
    public static void main(String[] args){
        int value[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<value.length;i++){
            root=create(root,value[i]);
        }
        System.out.println(root.data);
        inorder(root);
        delete(root, 3);
        System.err.println();
        inorder(root);
    }
}
