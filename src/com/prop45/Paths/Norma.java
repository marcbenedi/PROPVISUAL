package com.prop45.Paths;


public class Norma {
    private int indx1, indx2;
    private char operator;

            /*
            *OPERADORES
            *    Indice2 es un indice de Tag    Indice2 es un entero
            * >             M                           m
            * <             L                           l
            * =             E                           e
            * !=            D                           d
             */


    public Norma(){}
    public Norma(char operator,int indx1, int indx2) {
        this.indx1 = indx1;
        this.indx2 = indx2;
        this.operator = operator;
    }

    public int getIndx1() {
        return indx1;
    }

    public void setIndx1(int indx1) {
        this.indx1 = indx1;
    }

    public int getIndx2() {
        return indx2;
    }

    public void setIndx2(int indx2) {
        this.indx2 = indx2;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }
}
