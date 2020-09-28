package Akif;

public class BinaryTree {
    private class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
        }

    }

    private Node root_node;

    public void add_Node(int data) {
        Node new_node = new Node(data);
        if(root_node==null)
            root_node = new_node;

    }

    public void add_left(int data) {

        Node current_node = root_node;
        while(current_node.left!=null) {
            current_node = current_node.left;
        }
        Node new_node = new Node(data);
        current_node.left = new_node;
    }

    public void add_right(int data) {

        Node current_node = root_node;
        while(current_node.right!=null) {
            current_node = current_node.right;
        }
        Node new_node = new Node(data);
        current_node.right = new_node;
    }



}
