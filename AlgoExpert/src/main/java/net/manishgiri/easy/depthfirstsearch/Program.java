package net.manishgiri.easy.depthfirstsearch;

import java.util.ArrayList;
import java.util.List;

class Program {
    // Do not edit the class below except
    // for the depthFirstSearch method.
    // Feel free to add new properties
    // and methods to the class.
    //Stack<Node> nodes = new Stack<>();
    static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();


        Node(String name) {
            this.name = name;
        }

        List<String> depthFirstSearch(List<String> array) {
            // Write your code here.
            array.add(name);
            for(Node node: children)
                node.depthFirstSearch(array);
            return array;
        }

        Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }
    }
}
