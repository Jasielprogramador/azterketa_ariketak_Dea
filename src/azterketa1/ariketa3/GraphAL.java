package azterketa1.ariketa3;

import azterketa1.ariketa2.SimpleLinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class GraphAL {
    protected final int DEFAULT_CAPACITY = 100;
    protected int numVertices;
    protected LinkedList<Integer>[] adjList;
    protected T[] vertices;

}

public class GrafoLaberinto extends GraphAL<String>{
    public SimpleLinkedList<String> bilatuBidea(String hasiera,String bukaera){
        Queue<Integer> aztertuGabeak = new LinkedList<>();
        boolean[] aztertuak = new boolean[numVertices];

        aztertuGabeak.add(getIndex(hasiera));
        aztertuak[getIndex(hasiera)] = true;
        Integer[] anterior = new Integer[numVertices];

        SimpleLinkedList<String> emaitza = new SimpleLinkedList<>();

        boolean aurkitua = false;

        for(int i = 0;i<numVertices;i++){
            aztertuak[i] = false;
            anterior[i] = -1;
        }

        while(!aztertuGabeak.isEmpty() && !aurkitua){
            Integer a = aztertuGabeak.remove();
            if(a == getIndex(bukaera)){
                aurkitua = true;
            }
            else{
                for(int i = 0;i<numVertices;i++){
                    if(aztertuak[adjList[a].get(i)] == false){
                        anterior[i] = a;
                        aztertuGabeak.add(adjList[a].get(i));
                        aztertuak[adjList[a].get(i)] = true;
                    }
                }
            }
        }
        if(aurkitua){
            Integer ind = getIndex(amaiera);
            while(getIndex(hasiera) != ind){
                emaitza.addFirst(vertices[ind]);
                ind = anterior[ind];
            }
            emaitza.addFirst(vertices[ind]);
        }
        return emaitza;
    }
}
