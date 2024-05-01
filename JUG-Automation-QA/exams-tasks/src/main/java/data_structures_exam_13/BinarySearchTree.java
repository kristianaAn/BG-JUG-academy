package data_structures_exam_13;

import java.util.*;

public class BinarySearchTree {
    private Node root;
    private List<Node> nodeList = new ArrayList<>();

    public BinarySearchTree() {
    }

    public BinarySearchTree(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public List<Node> getNodeList() {
        return nodeList;
    }

    public void setNodeList(List<Node> nodeList) {
        this.nodeList = nodeList;
    }

    public boolean insert(int value) {
        System.out.println(nodeList);
        System.out.println(getNodeList());
        return nodeList.add(new Node(value));
    }

    public boolean search(int value) {
        return this.nodeList.stream().anyMatch(node1 -> node1.getValue() == value);
    }

    public java.util.List<Integer> traverse() {
        List<Node> collect = this.nodeList.stream().distinct()
                .sorted(Comparator.comparingInt(Node::getValue))
                .toList();

        Set<Integer> value = new LinkedHashSet<>();
        for (int i = 0; i < collect.size(); i++) {
            value.add(collect.get(i).getValue());
        }

        return new ArrayList<>(value);

    }

}
