package cs321.btree;

public class Node<T extends Comparable<T>> {

    private Node<T> parent;
    private Node<T>[] children;
    private T value;

    public Node(T value , int degree) {
        this.value = value;
        this.children = new Node[degree];
    }
    public Node(T value, Node<T> parent , int degree) {
        this.value = value;
        this.parent = parent;
        this.children = new Node[degree];
    }

    public Node<T> getParent() {
        return parent;
    }
    public void setParent(Node<T> parent) {
        this.parent = parent;
    }
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }

    public Node<T>[] getChildren() {
        return children;
    }

    public void addChild(Node<T> child) {
        int index = 0;
        while(children[index] != null && children[index].getValue().compareTo(child.getValue()) > 0 && index < children.length - 1) {
            index++;
        }
        if(index == children.length) {
            // write fancy split stuff but I'm lazy will finish later
            /*TODO*/
        }
        if(children[index] == null) {
            children[index] = child;
        }
        else {
            while( children[index] != null && index < children.length - 1) {
                Node<T> temp = children[index];
                children[index] = child;
                child = temp;
            }
        }
    }

}
