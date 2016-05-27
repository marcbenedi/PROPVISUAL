package com.prop45.Consulta;

import com.prop45.FuncionsAuxiliars.FuncionsAuxiliars;
import com.prop45.FuncionsAuxiliars.NodoComparadorGrado;
import com.prop45.FuncionsAuxiliars.NodoComparadorPageRank;
import com.prop45.Graph.Graph;
import com.prop45.Graph.Node;
import com.prop45.Paths.Norma;
import com.prop45.Paths.Relacion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Consulta {

    private Graph g;
    public Consulta(Graph g){
        this.g=g;
    }

    public ArrayList<Node> consultar(Relacion re, ArrayList<String> valor, boolean pagerank){
        ArrayList<String> tags = re.getTags();

        if(tags.size()<2)return new ArrayList<>();

        ArrayList<Node> a;
        a = g.buscarAdjecencies(valor.get(0),tags.get(0),tags.get(1));

        if(pagerank)Collections.sort(a, new NodoComparadorPageRank().reversed());
        else Collections.sort(a, new NodoComparadorGrado().reversed());
        //No se si ordena de forma descendente
        //Els ordenem de forma descendent per valor de rellevància per així trobar primer els nodes
        //adjacents més rellevants.

        ArrayList<Node> midle = new ArrayList<>();
        ArrayList<Node> cami = new ArrayList<>();
        //afegeix el primer node al cami actual
        cami.add(g.getNode(valor.get(0),tags.get(0)));

        for(int i = 1; i < valor.size()-1;++i){//EL primer cas el tractem, i l'ultim
            // no s'ha de fer res ja que és el resultat
            if(!valor.get(i).equals("NULL")) {
                //Si és diferent de NULL hem de anar al nodo
                //System.out.println("Valor no null");
                for (Node n:a) {
                    if(n.getName().equals(valor.get(i))){
                        //System.out.println("Es el que estem buscant");
                        //Si és el node que estem buscant seguim endevant
                        cami.add(n);
                        ArrayList<Node> resTemp =g.buscarAdjecencies(n.getName(),n.getTipus(),tags.get(i+1));
                        //System.out.println("Hem buscar adj de "+n.getName());
                        passarNormes(re,cami,resTemp,i,a);
                        midle.addAll(resTemp);
                        cami.remove(n);
                    }
                    //else System.out.println("No es el que estem buscant"+n.getName());
                }
                Set abc = new HashSet<>();
                abc.addAll(midle);
                midle.clear();
                midle.addAll(abc);
                abc.clear();
                a.clear();
                a.addAll(midle);
                midle.clear();
            }
            else{
                //És null els hem d'agafar tots
                for (Node n:a) {
                    cami.add(n);
                    ArrayList<Node> resTemp =g.buscarAdjecencies(n.getName(),n.getTipus(),tags.get(i+1));
                    //System.out.println("Hem buscar adj de "+n.getName());
                    passarNormes(re,cami,resTemp,i,a);
                    midle.addAll(resTemp);
                    cami.remove(n);
                }
                Set abc = new HashSet<>();
                abc.addAll(midle);
                midle.clear();
                midle.addAll(abc);
                abc.clear();
                a.clear();
                a.addAll(midle);
                midle.clear();
            }
        }
        //Eliminem duplicats passant a set i depsres a llista un altre cop
        /*Set abc = new HashSet<>();
        abc.addAll(midle);
        midle.clear();
        midle.addAll(abc);*/
        //un cop son el resultat final s'ha de update page rank dels nodes finals
        //System.out.println(re.getName());
        /*for (Node n :a
                ) {
            g.actualizarRelevancia(n);
            //System.out.println(n.getRelevancia());
        }*/
        if(pagerank)Collections.sort(a, new NodoComparadorPageRank().reversed());
        else Collections.sort(a, new NodoComparadorGrado().reversed());
        return a;
    }

    private void passarNormes(Relacion re,
                              ArrayList<Node> cami,ArrayList<Node>comprovar, int i,ArrayList<Node>a){
        //Si ens passen i vol dir que tenim el resultat i+1
        i = i +1;
        //ArrayList<Node> aprobat = new ArrayList<>();
        Set<Node> suspes = new HashSet<>();//Fem set per evitar repetits
        //Només hem de comprovar les normes de la posició actual
        //ja que les altres ja hauràn estat comprovades anteriorment
        ArrayList<Norma> normes = re.getNormas();
        if(normes.size()==0)return;
        for (Norma n: normes) {
            //SI la norma va dirigida als nodes actuals
            if(n.getIndx2() == i || (n.getIndx1()==i-1 &&
                    (n.getOperator()=='m'||n.getOperator()=='l'||n.getOperator()=='e'||n.getOperator()=='d'))){
                //System.out.println("Estem passant normes");
                for (Node no:comprovar) {
                    //System.out.println(no.getName());
                    int cmp = n.getIndx1();
                    if (n.getIndx1()>1)cmp = 1;
                    if(passarNorma(cami.get(cmp),no,n.getIndx2(),n.getOperator(),a)){
                        //System.out.println("Ha aprobat :)");
                        //aprobat.add(no);
                    }
                    else{
                        //System.out.println("Suspes :(");
                        suspes.add(no);
                        //aprobat.remove(no);
                    }
                }
            }
            else{
                //System.out.println("La norma no va per nosaltres");
                //Si la norma no va per nosaltres
                //aprobat.addAll(comprovar);
            }
        }
        //Si es fa comprovar = aprobat no funciona (no s'apliquen els canvis)
        //comprovar.clear();
        comprovar.removeAll(suspes);
        //comprovar.addAll(aprobat);
    }
    private boolean passarNorma(Node a, Node b,int valor, char op,ArrayList<Node> enComu){
        int result;
        switch (op){
            case 'M':
                result = a.getName().compareTo(b.getName());
                if(result > 0)return true;
                return false;
            case 'm':
                ArrayList<Node> perComparar = g.buscarAdjecencies(b.getName(),b.getTipus(),enComu.get(0).getTipus());
                ArrayList<Node>interseccio = FuncionsAuxiliars.Funcions.intersection(enComu,perComparar);
                if(interseccio.size()>valor)return true;
                return false;
            case 'L':
                result = a.getName().compareTo(b.getName());
                if(result < 0)return true;
                return false;
            case 'l':
                ArrayList<Node> perComparar2 = g.buscarAdjecencies(b.getName(),b.getTipus(),enComu.get(0).getTipus());
                ArrayList<Node>interseccio2 = FuncionsAuxiliars.Funcions.intersection(enComu,perComparar2);
                if(interseccio2.size()<valor)return true;
                return false;
            case 'E':
                result = a.getName().compareTo(b.getName());
                if(result == 0)return true;
                return false;
            case 'e':
                ArrayList<Node> perComparar3 = g.buscarAdjecencies(b.getName(),b.getTipus(),enComu.get(0).getTipus());
                ArrayList<Node>interseccio3 = FuncionsAuxiliars.Funcions.intersection(enComu,perComparar3);
                if(interseccio3.size()==valor)return true;
                return false;
            case 'D':
                result = a.getName().compareTo(b.getName());
                if(result != 0)return true;
                return false;
            case 'd':
                ArrayList<Node> perComparar4 = g.buscarAdjecencies(b.getName(),b.getTipus(),enComu.get(0).getTipus());
                ArrayList<Node>interseccio4 = FuncionsAuxiliars.Funcions.intersection(enComu,perComparar4);
                if(interseccio4.size()!=valor)return true;
                return false;

        }
        return false;
    }
}
