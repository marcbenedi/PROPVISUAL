package com.prop45.FuncionsAuxiliars;

import com.prop45.Graph.Node;

import java.util.Comparator;

/**
 * Created by Marc on 27/05/2016.
 */
public class NodoComparadorGrado implements Comparator<Node> {
    @Override
    public int compare(Node o1, Node o2) {
        if(o1.getGrado()>o2.getGrado())return 1;
        else if (o1.getGrado()==o2.getGrado())return 0;
        else return -1;
    }
}
