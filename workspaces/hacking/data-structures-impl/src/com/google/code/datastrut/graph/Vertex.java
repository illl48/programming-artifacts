package com.google.code.datastrut.graph;

import com.google.code.datastrut.list.List;

public class Vertex<Type> {

    private Type value;
    private List<Type> connections;
    private boolean visited;

    public Vertex(Type newValue, List<Type> connections) {
        this.value = newValue;
        this.connections = connections;
    }

    public Type getValue() {
        return value;
    }

    public void setAsVisited() {
        this.visited = true;
    }

    public void setAsNotVisited() {
        this.visited = false;
    }

    public boolean hasBeenVisited() {
        return visited;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vertex other = (Vertex) obj;
        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }

    public List<Type> getConnections() {
        return connections;
    }

    @Override
    public String toString() {
        return "Vertex " + (visited ? "Visited" : "Not Visited") +  " [value=" + value + ", connections=" + connections + "]";
    }

}
