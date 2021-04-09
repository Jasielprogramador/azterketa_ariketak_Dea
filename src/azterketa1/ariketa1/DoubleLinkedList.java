package azterketa1.ariketa1;

public class DoubleLinkedList<T> {
    DoubleNode<T> first;
}
    class ListaDePalabras extends DoubleLinkedList<String> {
        public SimpleLinkedList<String> obtenerContexto(String pal, Integer n){
            SimpleLinkedList<String> emaitza = new SimpleLinkedList<String>(null,null);
            DoubleNode<String> u = emaitza.getFirst();

            DoubleNode<String> unekoa = super.first;

            boolean jokoTxarra = false;

       while(unekoa.getData() != pal){
           unekoa = unekoa.next;
       }

       emaitza.add(pal);

       int i = 0;

       DoubleNode<T> aux = unekoa.prev;

       while(i<n && aux != null){
           emaitza.addFirst(aux.getData());
           aux = aux.prev;
       }

       i = 0;
       aux = unekoa.next
       while(i<n && aux != null){
           emaitza.addLast(aux.getData());
           aux = aux.next;
       }

