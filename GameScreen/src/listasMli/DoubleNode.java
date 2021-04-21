package listasMli;

public class DoubleNode<T> {
    private DoubleNode<T> next;
    private DoubleNode<T> prev;
    private T value;

    public DoubleNode() {
        this.next = null;
        this.prev = null;
        this.value = null;
    }

    public DoubleNode<T> getNext() {
        return next;
    }

    public void setNext(DoubleNode<T> next) {
        this.next = next;
    }

    public DoubleNode<T> getPrev() {
        return prev;
    }

    public void setPrev(DoubleNode<T> prev) {
        this.prev = prev;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}
