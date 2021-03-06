package com.prop45.Graph;

import static com.prop45.searchtacp.Cargando_database.terminal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;
import static jdk.nashorn.internal.objects.NativeMath.round;

public class Graph {
    private ArrayList<ArrayList<Node>> adj = new ArrayList<>();

    private static ArrayList<Node> datPaper;
    private static ArrayList<Node> datAuthor;
    private static ArrayList<Node> datTerm;
    private static ArrayList<Node> datConference;

    private ArrayList<Aresta> datPaperConference;
    private ArrayList<Aresta> datPaperAuthor;
    private ArrayList<Aresta> datPaperTerm;

    //Conversors de ID
    //La clau és l'ID del fitxer, el valor és el de la matriu
    private Map<Integer,Integer> conPaper = new Hashtable<>();
    private Map<Integer,Integer> conAuthor = new Hashtable<>();
    private Map<Integer,Integer> conTerm = new Hashtable<>();
    private Map<Integer,Integer> conConference = new Hashtable<>();

    private int lastIdNode = 0;

    public Graph(){}
    public void actualitzarRelevanciaGraph() {
        String salida = terminal.getText();
        int pcg = 0;
        terminal.setText(salida + "Calculando Page Rank\n");
        salida = terminal.getText();
        int indice_ultima_linea = terminal.getDocument().getLength();
        terminal.setCaretPosition(indice_ultima_linea);
        for(int i=0;i<10;i++){
            //salida = terminal.getText();
            terminal.setText(salida + pcg +".00%");
            indice_ultima_linea = terminal.getDocument().getLength();
            terminal.setCaretPosition(indice_ultima_linea);
            for (Node n1 : datPaper) actualizarRelevancia(n1);
            for (Node n1 : datAuthor) actualizarRelevancia(n1);
            for (Node n1 : datConference) actualizarRelevancia(n1);
            for (Node n1 : datTerm) actualizarRelevancia(n1);
            pcg += 10;
        }
        //salida = terminal.getText();
        terminal.setText(salida + "100.00%\n\n");
        indice_ultima_linea = terminal.getDocument().getLength();
        terminal.setCaretPosition(indice_ultima_linea);
        
    }
    public void printAdj(){
        int pos = 0;
        for (ArrayList<Node> list:adj) {
            System.out.print("IMPRIMINT posicio "+pos+" ");
            for (Node n: list) {
                System.out.print(n.getId()+" "+n.getName()+" Grado="+n.getGrado()+" ");
            }
            System.out.print("\n");
            ++pos;
        }
    }

    public Node getNode(String name, String tipo){
        return buscarNodo(name,tipo);
    }
    
    public static boolean existsNode(String name, String tipo) {
        return buscarNodo(name,tipo) != null;
    }

    private static Node buscarNodo(String name,String tipo){
        switch(tipo){
            case "Paper":
                for (Node n:datPaper
                        ) {
                    if(n.getName().equals(name))return n;
                }
                break;
            case "Term":
                for (Node n:datTerm
                        ) {
                    if(n.getName().equals(name))return n;
                }
                break;
            case "Conference":
                for (Node n:datConference
                        ) {
                    if(n.getName().equals(name))return n;
                }
                break;
            case "Author":
                for (Node n:datAuthor
                        ) {
                    if(n.getName().equals(name))return n;
                }
                break;
        }
        return null;
    }

    public ArrayList<Node> buscarAdjecencies(String name, String tipus1, String tipus2){
        //Si no es paper no hace falta filtar porque todos sus adyacentes seran paper
        ArrayList<Node> resultat = new ArrayList<>();
        Node n = this.buscarNodo(name,tipus1);

        ArrayList<Node> provisional = this.buscarAdjecencies(n.getId(),tipus1);
        if(tipus1.equals("Paper")){
            for (Node j:provisional) {
                if(j.getTipus().equals(tipus2)){
                    resultat.add(j);
                }
            }
        }
        else resultat = provisional;
        return (ArrayList<Node>) resultat.clone();
    }

    public ArrayList<Node> buscarAdjecencies(int id, String tipus){
        switch (tipus){
            //Primer buscar l'id traduït
            //Després accedir a adj i retornar la llista.
            case "Author":
                return adj.get(conAuthor.get(id));
            case "Paper":
                return adj.get(conPaper.get(id));
            case "Conference":
                return adj.get(conConference.get(id));
            case "Term":
                return adj.get(conTerm.get(id));
        }
        return null;
    }

    public Graph (ArrayList<Node> datPaper,
                  ArrayList<Node> datAuthor,ArrayList<Node> datTerm,ArrayList<Node> datConference,
                  ArrayList<Aresta> datPaperConference,
                  ArrayList<Aresta> datPaperAuthor, ArrayList<Aresta> datPaperTerm){
        this.datPaper = (ArrayList<Node>) datPaper;
        this.datAuthor = (ArrayList<Node>) datAuthor;
        this.datTerm = (ArrayList<Node>) datTerm;
        this.datConference = (ArrayList<Node>) datConference;
        this.datPaperConference = (ArrayList<Aresta>) datPaperConference;
        this.datPaperAuthor = (ArrayList<Aresta>) datPaperAuthor;
        this.datPaperTerm = (ArrayList<Aresta>) datPaperTerm;
        this.load();
        //this.modificar();
    }

    private void load(){ //Guillem: he canviat les creadores perque sino el projecte em petava xk si
        //Funció interna que serverix per assignar id's i fer la matriu d'adjecències
        //Primer fem la conversió dels id i els afegim a la llista d'adjecències
        for (Node n:datPaper) {
            conPaper.put(n.getId(),lastIdNode);
            adj.add(lastIdNode,new ArrayList<Node>());
            ++lastIdNode;
        }

        for (Node n:datAuthor) {
            conAuthor.put(n.getId(),lastIdNode);
            adj.add(lastIdNode,new ArrayList<Node>());
            ++lastIdNode;
        }
        for (Node n:datTerm) {
            conTerm.put(n.getId(),lastIdNode);
            adj.add(lastIdNode,new ArrayList<Node>());
            ++lastIdNode;
        }
        for (Node n:datConference) {
            conConference.put(n.getId(),lastIdNode);
            adj.add(lastIdNode,new ArrayList<Node>());
            ++lastIdNode;
        }
        //LLegim les relacions i les afegim a la llista d'adjecències
        for (Aresta a: datPaperConference) {
            Node p = a.getNode1();
            Node c = a.getNode2();

            adj.get(conPaper.get(p.getId())).add(c);
            adj.get(conConference.get(c.getId())).add(p);
        }
        for (Aresta a: datPaperAuthor) {
            Node p = a.getNode1();
            Node au = a.getNode2();

            adj.get(conPaper.get(p.getId())).add(au);
            adj.get(conAuthor.get(au.getId())).add(p);
        }
        for (Aresta a: datPaperTerm) {
            Node p = a.getNode1();
            Node t = a.getNode2();

            adj.get(conPaper.get(p.getId())).add(t);
            adj.get(conTerm.get(t.getId())).add(p);
        }
    }
    public void actualizarRelevancia(Node n1){
        double r=0;
        Node n = buscarNodo(n1.getName(),n1.getTipus());
        String tipo = n.getTipus();
        ArrayList<Node> ad = this.buscarAdjecencies(n.getId(),tipo);
        int nd=0;
        for (Node j: ad
                ) {
            nd += (j.getRelevancia()/j.getGrado());
        }
        r=((1-0.85)/adj.size())+0.85*(nd);
        DecimalFormat df = new DecimalFormat("###############0.00");
        String rele = df.format(n.getRelevancia()+r);
        //System.out.println(rele);
        
        //System.out.println(Double.parseDouble( rele.replace(",",".") ));
        n.setRelevancia(Double.parseDouble( rele.replace(",",".") ));
        //n.setRelevancia(1);
    }

    public void afegirNode(Node n){
        String tipus = n.getTipus();
        switch (tipus){
            //S'ha d'afegir a la llista correponent
            //S'ha d'afegir a la llista d'adjecències
            //S'ha d'afegir al convertidor
            case "Author":
                datAuthor.add(n);
                conAuthor.put(n.getId(),lastIdNode);
                break;
            case "Paper":
                datPaper.add(n);
                conPaper.put(n.getId(),lastIdNode);
                break;
            case "Conference":
                datConference.add(n);
                conConference.put(n.getId(),lastIdNode);
                break;
            case "Term":
                datTerm.add(n);
                conTerm.put(n.getId(),lastIdNode);
                break;
        }
        adj.add(lastIdNode,new ArrayList<Node>());
        ++lastIdNode;
    }
    public void eliminarNode(String name,String tipus){
        //S'ha d'eliminar de la llista del tipus
        //del convertidor
        //de la llista d'adjecències
        Node n = this.buscarNodo(name,tipus);
        int idSistema = 0;
        ArrayList <Aresta> perEliminar = new ArrayList<>();
        switch (tipus){
            case "Author":
                idSistema = conAuthor.get(n.getId());
                conAuthor.remove(n.getId());
                datAuthor.remove(n);
                for(Aresta a: datPaperAuthor){
                    if(a.getNode2().getName()==n.getName()){
                        perEliminar.add(a);
                    }
                }
                datPaperAuthor.removeAll(perEliminar);
                break;
            case "Paper":
                idSistema = conPaper.get(n.getId());
                conPaper.remove(n.getId());
                datPaper.remove(n);
                
                break;
            case "Conference":
                idSistema = conConference.get(n.getId());
                conConference.remove(n.getId());
                datConference.remove(n);
                
                for(Aresta a: datPaperConference){
                    if(a.getNode2().getName()==n.getName()){
                        perEliminar.add(a);
                    }
                }
                datPaperConference.removeAll(perEliminar);
                
                break;
            case "Term":
                idSistema = conTerm.get(n.getId());
                conTerm.remove(n.getId());
                datTerm.remove(n);
                
                for(Aresta a: datPaperTerm){
                    if(a.getNode2().getName()==n.getName()){
                        perEliminar.add(a);
                    }
                }
                datPaperTerm.removeAll(perEliminar);
                
                break;
        }
        //Eliminar adjecències
        for (Node no: adj.get(idSistema)) {
            //Disminuir grado d'adjecencies del nodo
            no.setGrado(no.getGrado()-1);
            int idConvertit = 0;
            ArrayList<Node> revisar = new ArrayList<>();
            switch (no.getTipus()){
                case "Author":
                    idConvertit = conAuthor.get(no.getId());
                    
                    for(Aresta a: datPaperAuthor){
                    if(a.getNode2().getName()==no.getName()){
                        perEliminar.add(a);
                    }
                }
                datPaperAuthor.removeAll(perEliminar);
                    
                    break;
                case "Paper":
                    idConvertit = conPaper.get(no.getId());
                    break;
                case "Conference":
                    idConvertit = conConference.get(no.getId());
                    
                        for(Aresta a: datPaperConference){
                    if(a.getNode2().getName()==no.getName()){
                        perEliminar.add(a);
                    }
                }
                datPaperConference.removeAll(perEliminar);
                    
                    break;
                case "Term":
                    idConvertit = conTerm.get(no.getId());
                    
                        for(Aresta a: datPaperTerm){
                    if(a.getNode2().getName()==no.getName()){
                        perEliminar.add(a);
                    }
                }
                datPaperTerm.removeAll(perEliminar);
                    
                    break;
            }
            revisar = adj.get(idConvertit);
            revisar.remove(n);
        }
        //Eliminar la llista d'adjecències
        //adj.remove(idSistema);
        //Proba de si funciona la chapuza
        n.setName("eliminat"+lastIdNode);
        adj.set(idSistema,new ArrayList<>());
        //++lastIdNode;
    }

    public Aresta getAresta(Node n1, Node n2){
        switch (n2.getTipus()){
            case "Author":
                for (Aresta a:datPaperAuthor
                        ) {
                    if (a.getNode1().equals(n1) && a.getNode2().equals(n2))return a;
                }
                return null;
            case "Conference":
                for (Aresta a:datPaperConference
                        ) {
                    if (a.getNode1().equals(n1) && a.getNode2().equals(n2))return a;
                }
                return null;
            case "Term":
                for (Aresta a:datPaperTerm
                        ) {
                    if (a.getNode1().equals(n1) && a.getNode2().equals(n2))return a;
                }
                return null;
        }
        return null;
    }
    
    public boolean existsAresta(Node n1, Node n2) {
        return !(getAresta(n1,n2)==null);
    }

    public void afegirAresta(Node n1, Node n2, boolean b1){
        if (existsAresta(n1,n2)){
            b1 = true;
            return;
        }

        //no comprovem si existeix l'aresta
        //n1.setGrado(n1.getGrado()+1);//paper
        //n2.setGrado(n2.getGrado()+1);
        int ids1 = 0,ids2 = 0;
        ids1 = conPaper.get(n1.getId());
        switch (n2.getTipus()){
            case "Author":
                datPaperAuthor.add(new Aresta(0,0,n1,n2));
                ids2 = conAuthor.get(n2.getId());
                break;
            case "Conference":
                datPaperConference.add(new Aresta(0,0,n1,n2));
                ids2 = conConference.get(n2.getId());
                break;
            case "Term":
                datPaperTerm.add(new Aresta(0,0,n1,n2));
                ids2 = conTerm.get(n2.getId());
                break;
        }
        adj.get(ids1).add(n2);
        adj.get(ids2).add(n1);

    }
    public void eliminarAresta(Node n1, Node n2, boolean b2){
        Aresta a = getAresta(n1,n2);
        if(a.equals(null)){
            b2 = true;
            return;
        }
        n1.setGrado(n1.getGrado()-1);
        n2.setGrado(n2.getGrado()-1);
        int ids1 = conPaper.get(n1.getId());
        int ids2 = 0;
        switch (n2.getTipus()){
            case "Author":
                datPaperAuthor.remove(a);
                ids2 = conAuthor.get(n2.getId());
                break;
            case "Conference":
                datPaperConference.remove(a);
                ids2 = conConference.get(n2.getId());
                break;
            case "Term":
                datPaperTerm.remove(a);
                ids2 = conTerm.get(n2.getId());
                break;
        }
        adj.get(ids1).remove(n2);
        adj.get(ids2).remove(n1);
    }

}