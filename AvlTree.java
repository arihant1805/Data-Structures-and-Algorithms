class Node {
    int data;
    Node left, right;
    int balanceFactor;

    Node(int data) {
        this.data = data;
        this.balanceFactor = 0;
    }
}
public class AVLTree {
    static Node root;

    int height(Node node) {
        if (node == null)
            return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }

    public int getBalanceFactor(Node node) {
        if (node == null)
            return 0;
        return height(node.left) - height(node.right);
    }

    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        y.balanceFactor = getBalanceFactor(y);
        x.balanceFactor = getBalanceFactor(x);

        return x;
    }

    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        x.balanceFactor = getBalanceFactor(x);
        y.balanceFactor = getBalanceFactor(y);

        return y;
    }

    Node insert(Node node, int data) {
        if (node == null)
            return new Node(data);

        if (data < node.data)
            node.left = insert(node.left, data);
        else if (data > node.data)
            node.right = insert(node.right, data);
        else
            return node; // Duplicate data is not allowed

        node.balanceFactor = getBalanceFactor(node);

        int balance = getBalanceFactor(node);

        if (balance > 1) {
            if (data < node.left.data)
                return rightRotate(node);
            else if (data > node.left.data) {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if (balance < -1) {
            if (data > node.right.data)
                return leftRotate(node);
            else if (data < node.right.data) {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }
    public void insert(int data) {
        root = insert(root, data);
    }
    
    Node minValueNode(Node node) {
        Node current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }
    Node delete(Node node, int data) {
        if (node == null)
            return node;

        if (data < node.data)
            node.left = delete(node.left, data);
        else if (data > node.data)
            node.right = delete(node.right, data);
        else {
            if ((node.left == null) || (node.right == null)) {
                Node temp = null;
                if (temp == node.left)
                    temp = node.right;
                else
                    temp = node.left;

                if (temp == null) {
                    temp = node;
                    node = null;
                } else
                    node = temp;
            } else {
                Node temp = minValueNode(node.right);
                node.data = temp.data;
                node.right = delete(node.right, temp.data);
            }
        }

        if (node == null)
            return node;

        node.balanceFactor = getBalanceFactor(node);

        int balance = getBalanceFactor(node);

        if (balance > 1) {
            if (getBalanceFactor(node.left) >= 0)
                return rightRotate(node);
            else {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if (balance < -1) {
            if (getBalanceFactor(node.right) <= 0)
                return leftRotate(node);
            else {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }

    public void delete(int data) {
        root = delete(root, data);
    }
    
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        inorder(root.left);
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        inorder(root.right);
        System.out.println(root.data);
    }
    public static boolean search(int x,Node root){
        if(root==null){
            return false;
        }
        if(x==root.data){
            return true;
        }
        if(x<root.data){
            return search(x, root.left);
        }
        if(x>root.data){
            return search(x, root.right);
        }
        return false;
    }
    public boolean balance(Node root){
        int bf=getBalanceFactor(root);
        if(bf>1||bf<-1){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        AVLTree avlTree = new AVLTree();
        int arr[]={8,16,5,4,6,0,10,11,23,45};
        for(int i=0;i<10;i++){
            avlTree.insert(arr[i]);
            if(!avlTree.balance(root)){
                System.out.println("The code is not working properly");
            }
        }
        System.out.println(search(12, root));
        System.out.println(search(0, root));
        avlTree.delete(0);
        System.out.println(search(0, root));
        if(!avlTree.balance(root)){
                System.out.println("The code is not working properly");
            }else{
                System.out.println("The code successfully executed");
            }
    }
}
