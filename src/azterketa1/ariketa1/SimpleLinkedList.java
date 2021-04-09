package azterketa1.ariketa1;

public class SimpleLinkedList<String> {

    private String data;
    private DoubleNode<String> first;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public DoubleNode<String> getFirst() {
        return first;
    }

    public void setFirst(DoubleNode<String> first) {
        this.first = first;
    }

    public SimpleLinkedList(String data, DoubleNode<String> first) {
        this.data = data;
        this.first = first;
    }

    public void addFirst(String a){
        if(first == null){
            DoubleNode<String> berria = new DoubleNode<String>(a,null,null);
            first = berria;
        }
        else{
            DoubleNode<String> berria = new DoubleNode<String>(a,null,null);
            berria.next = first;
            first.prev = berria;
            first = berria;
        }
    }

    public void addLast(String a){
        DoubleNode<String> u = first;
        if(first == null){
            DoubleNode<String> berria = new DoubleNode<String>(a,null,null);
            first = berria;
        }
        else{
            DoubleNode<String> berria = new DoubleNode<String>(a,null,null);
            u.next = berria;
            berria.prev = u;
            u = u.next;
        }
    }


}
