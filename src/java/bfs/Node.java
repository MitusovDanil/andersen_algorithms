package bfs;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class Node<T> {
    T value;
    Set<Node<T>> neighbors;

    public Node(T value) {
        this.value = value;
        neighbors = new HashSet<>();
    }

    public static <T> Node<T> search(T value, Node<T> start) {
        Queue<Node<T>> queue = new ArrayDeque<>();
        Set<Node<T>> alreadyVisited = new HashSet<>();
        queue.add(start);

        Node<T> currentNode;

        while (!queue.isEmpty()) {
            currentNode = queue.remove();
            if (currentNode.getValue().equals(value)) {
                return currentNode;
            } else {
                alreadyVisited.add(currentNode);
                queue.addAll(currentNode.getNeighbors());
                queue.removeAll(alreadyVisited);
            }
        }
        return null;
    }

    public void setConnection(Node<T> neighbor) {
        if (this == neighbor) {
            throw new IllegalArgumentException("Невозможно соединить с этимже узлом");
        }

        this.neighbors.add(neighbor);
        neighbor.neighbors.add(this);
    }

    public T getValue() {
        return value;
    }

    public Set<Node<T>> getNeighbors() {
        return neighbors;
    }
}
