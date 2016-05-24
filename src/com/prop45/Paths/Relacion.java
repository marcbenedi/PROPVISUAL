package com.prop45.Paths;

import java.util.ArrayList;

public class Relacion {

    private String name;
    private ArrayList<String> tags;
    private ArrayList<Norma> normes;

    public Relacion(String name) {
        this.name = name;
        this.normes = new ArrayList<>();
        this.tags = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setTags(ArrayList<String> t) {
        this.tags = (ArrayList<String>) t.clone();
    }

    public void setNormas(ArrayList<Norma> t) {
        this.normes = (ArrayList<Norma>) t.clone();
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void afegirNorma(Norma n) {
        normes.add(n);
    }

    public void eliminarNorma(Norma n) {
        normes.remove(n);
    }

    public ArrayList<Norma> getNormas() {
        return (ArrayList<Norma>) normes.clone();
    }

    public String getTag(int index) {
        return tags.get(index);
    }

    public Norma getNorma(int index) {
        return normes.get(index);
    }

    public int getNormasSize() {
        return normes.size();
    }
}
