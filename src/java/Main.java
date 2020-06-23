import bfs.Node;


public class Main {
    public static void main(String[] args) {
        Node<Integer> start = new Node<>(10);
        Node<Integer> firstNeighbor = new Node<>(2);
        start.setConnection(firstNeighbor);

        Node<Integer> firstNeighborNeighbor = new Node<>(3);
        firstNeighbor.setConnection(firstNeighborNeighbor);
        firstNeighborNeighbor.setConnection(start);

        Node<Integer> secondNeighbor = new Node<>(4);
        start.setConnection(secondNeighbor);

        System.out.println(Node.search(4, firstNeighborNeighbor));


    }
}
