package DSA;
class Node{
    int data;
    Node left, right;

    Node(int data){
        this.data = data;
        left = right = null;
    }
}


public class BinarySearchTree {

    Node root  = null;

    public static void main(String args[]){

        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);
        bst.search(20);

        bst.print();

    }


    public void search(int key){

    }

    public void insert(int data) {

        insertRec(root, data);

    }

    public void insertRec(Node root, int data){

        if(root == null){
            root = new Node(data);
        }else{
            if(data < root.data){
                insertRec(root.left, data);
            }else{
                insertRec(root.right, data);
            }
        }
    }

    public void print(){

        while(root !=null){
            
        }

    }



}
