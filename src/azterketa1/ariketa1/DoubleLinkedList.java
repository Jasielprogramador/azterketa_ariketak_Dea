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

            while(unekoa != null){                  //N:DoubleNode-a errekorritzeko
                if(unekoa.getData() == pal) {
                    for (int i = 0; i < n; i++) {      //M:emaitzan, listan n zenbaki ezkerrerantz dagoen
                                                        //double node-a lortzeko
                        if (unekoa.prev == null) {
                            jokoTxarra = true;
                            break;
                        } else {
                            unekoa = unekoa.prev;
                        }
                    }

                    if (jokoTxarra != true) {
                        while (unekoa.getData() != pal) {       //A:emaitzan, listan n zenbaki ezkerrerantz dauden
                                                                //zenbakiak jartzeko
                            if (emaitza == null) {
                                emaitza.setFirst(unekoa);
                            } else {
                                u = unekoa;
                                u = u.next;
                            }
                        }

                        for (int i = 0; i < n; i++) {           //B:emaitzan, listan n zenbaki eskuinerantz dauden
                                                                //zenbakiak jartzeko
                            if (emaitza == null) {
                                emaitza.setFirst(unekoa);
                            } else {
                                u = unekoa;
                                u = u.next;
                            }
                        }

                    }
                }
            }
            return emaitza;
        }
    }

    //Kasu honetan kostua O(N*(M+A+B)) izango litzateke, hau da, kuadratikoa izango litzateke
