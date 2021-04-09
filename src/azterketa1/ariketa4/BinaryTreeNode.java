package azterketa1.ariketa4;

import javax.print.attribute.IntegerSyntax;
import java.util.HashMap;

public class BinaryTreeNode<T> {
    protected T content;
    protected BinaryTreeNode<T> left;
    protected BinaryTreeNode<T> right;
}

public class BinaryTree<T> {
    protected int count;
    protected BinaryTreeNode<T> root;
}

public class Produktu{
    private int salmentak;
    private String izena;

    public String getIzena(){
        return izena;
    }

    public int getSalmentak(){
        return salmentak;
    }
}

public class ProduktuenZuhaitza extends BinaryTree<Produktu>{
    public HashMap<String,Integer> zuhaitzaHTBihurtu(){
        HashMap<String, Integer> emaitza = new HashMap<String,Integer>(1000);
        convertir(emaitza,super.root);
        return emaitza;
    }

    private void convertir(HashMap<String,Integer> a , BinaryTreeNode<Produktu> nodo){
        if(nodo != null){
            if(a.containsKey(nodo.content.getIzena())){
                Integer viejo = a.get(nodo.content.getIzena());
                viejo = viejo + nodo.content.getSalmentak();
                a.put(nodo.content.getIzena(),viejo);
            }
            else{
                a.put(nodo.content.getIzena(),nodo.content.getSalmentak());
            }
            convertir(a,nodo.left);
            convertir(a,nodo.right);
        }
    }
}
