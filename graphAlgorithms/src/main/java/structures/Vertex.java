package structures;

import java.util.ArrayList;
import java.util.List;

public class Vertex<T> {
    private String id;
    private T data;
    private final List<Vertex<T>> neighbors;

    public Vertex( String id, T data) {
        this.data = data;
        this.id = id;
        neighbors = new ArrayList<>();
    }

    public void connectVertex(Vertex<T> newVertex) {
        if (!neighbors.contains(newVertex)) {
            neighbors.add(newVertex);
            newVertex.getNeighbors().add(this);


        }
    }

    public List<Vertex<T>> getNeighbors() {
        return neighbors;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {

        String msj =    "Vertex{" +
                        "id='" + id + '\'' +
                        ", neighbors=";
                for(Vertex<T> vertex : neighbors){
                    msj += vertex.getId();
                }
                return msj += '}';
    }
}
