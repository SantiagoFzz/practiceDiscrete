package structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph<T> {
    private Map<String, Vertex<T>> vertexList;

    public Graph() {
        vertexList = new HashMap<>();
    }

    public List<Vertex<T>> dfsLoop(){
        

        return null;
    }

    public Vertex<T> getVertex(String id){
        return vertexList.get(id);
    }

    public void addVertex(String id, T data){
        vertexList.put(id, new Vertex<>(id, data));
    }

    public void connectVertex(String idV1, String idV2){
        Vertex<T> vertex1 = vertexList.get(idV1);
        Vertex<T> vertex2 = vertexList.get(idV2);

        try {
            if(vertex1 != null && vertex2 != null){
                vertex1.connectVertex(vertex2);
            }
            else{
                throw new RuntimeException();
            }
        } catch (RuntimeException e) {
            System.out.println("NO SE ENCONTRO ALGUNO DE LOS VERTICES");;
        }
    }

    public Map<String, Vertex<T>> getVertexList() {
        return vertexList;
    }

    public void setVertexList(Map<String, Vertex<T>> vertexList) {
        this.vertexList = vertexList;
    }
}
