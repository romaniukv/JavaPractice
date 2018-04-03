package pract5.task4;

public class RedBlackTree<T extends Comparable<T>> {

    private Node root;
    private Node nil;


    enum NodeColor{
        RED, BLACK, NONE
    }

    public class Node {
        private T value;
        private NodeColor nodeColor;
        private Node parent;
        private Node left;
        private Node right;


        public Node(T o, NodeColor color) {
            value = value;
            color = color;
            parent = nil;
            left = nil;
            right = nil;
        }

        public boolean isFree() {
            return value == null || value == nil;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public void setParent(Node parent) {
            this.parent = parent;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }

    public void add(T o) {
        Node node = root, temp = nil;
        Node newNode = new Node((T)o, NodeColor.RED);
        while(node != null && node != nil && !node.isFree()) {
            temp = node;
            if(newNode.getValue().compareTo(node.getValue()) < 0)
                node = node.getLeft();
            else
                node = node.getRight();
        }
        newNode.setParent(temp);
        if(temp == nil)
            root.setValue(newNode.getValue());
        else {
            if(newNode.getValue().compareTo(temp.getValue()) < 0)
                temp.setLeft(newNode);
            else
                temp.setRight(newNode);
        }
        newNode.setLeft(nil);
        newNode.setRight(nil);
        fixInsert(newNode);
    }

    private void fixInsert(Node newNode) {

    }

}
