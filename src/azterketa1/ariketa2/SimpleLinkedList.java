package azterketa1.ariketa2;

import azterketa1.ariketa1.DoubleNode;

public class SimpleLinkedList<T> {

    private T data;
    private DoubleNode<T> first;

    public SimpleLinkedList(T data, DoubleNode<T> first) {
        this.data = data;
        this.first = first;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DoubleNode<T> getFirst() {
        return first;
    }

    public void setFirst(DoubleNode<T> first) {
        this.first = first;
    }
}
