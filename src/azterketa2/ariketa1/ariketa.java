package azterketa2.ariketa1;

import java.util.LinkedList;

public class ariketa {

    public boolean estan(LinkedList<Integer> a, LinkedList<Integer> b){
        Node<Integer> ua = a.first;
        Node<Integer> ub = b.first;

        while(ub != null && ua!=null){
            if (ub.data == ua.data) {
                ua = ua.next;
                ub = ub.next;
            }
            else{
                ub = ub.next;
            }
        }

        if(ua == null){
            return true;
        }
        else{
            return false;
        }

    }

    //Kostua O(N) izango litzateke
}
