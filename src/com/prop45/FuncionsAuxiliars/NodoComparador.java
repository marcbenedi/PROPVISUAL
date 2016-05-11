package com.prop45.FuncionsAuxiliars;

import com.prop45.Graph.Node;

import java.util.Comparator;

public class NodoComparador implements Comparator<Node> {
    @Override
    public int compare(Node o1, Node o2) {
        if(o1.getRelevancia()>o2.getRelevancia())return 1;
        else if (o1.getRelevancia()==o2.getRelevancia())return 0;
        else return -1;
    }
}