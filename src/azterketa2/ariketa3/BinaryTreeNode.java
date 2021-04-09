package azterketa2.ariketa3;

import azterketa1.ariketa2.SimpleLinkedList;
import azterketa1.ariketa4.BinaryTree;

public class BinaryTreeNode<T> {
    protected T content;
    protected BinaryTreeNode<T> left;
    protected BinaryTreeNode<T> right;
}

public class BinarySearchTree<T>{
    protected BinaryTreeNode<T> root;
    protected int count;
}

public class MiArbol extends BinarySearchTree<String>{
    public double numMedioDeElementos(SimpleLinkedList<String> l){
        Node<String> uneko = l.getFirst();
        BinaryTreeNode<String> u = super.root;
        int luzeera = 0;
        int kont = 0;

        while(uneko != null){
            if(u.content.compareTo(unekoa.content)==0){
                luzeera++;
                uneko = uneko.next;
                kont++;
            }
            else if(u.content.compareTo(unekoa.content)<0){
                luzeera++;
                u = u.left;
            }
            else if(u.content.compareTo(unekoa.content)>0){
                luzeera++;
                u = u.right;
            }
        }

        return luzeera/kont;
    }
}
