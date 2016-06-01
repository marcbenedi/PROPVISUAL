package com.prop45.DataBase;

import com.prop45.Graph.*;
import static com.prop45.searchtacp.Cargando_database.terminal;
import com.sun.jmx.snmp.agent.SnmpUserDataFactory;

import java.io.*;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GraphDataBase extends DataBase {
    private ArrayList<Node> datPaper;
    private ArrayList<Node> datAuthor;
    private ArrayList<Node> datTerm;
    private ArrayList<Node> datConference;
    private ArrayList<Aresta> datPaperConference;
    private ArrayList<Aresta> datPaperAuthor;
    private ArrayList<Aresta> datPaperTerm;

    public GraphDataBase() {
        this.datPaper = new ArrayList<>();
        this.datAuthor = new ArrayList<>();
        this.datTerm = new ArrayList<>();
        this.datConference = new ArrayList<>();
        this.datPaperConference = new ArrayList<>();
        this.datPaperAuthor = new ArrayList<>();
        this.datPaperTerm = new ArrayList<>();
    }
    private void loadPaper() {
        String path = route + "\\paper.txt";
        readFile(path, datPaper, "Paper");
    }
    private void savePaper() {
        String path = route + "\\paper.txt";
        saveFile(path, datPaper);
    }
    private void loadPaperR() {
        String path = route + "\\paper.txt";
        readFileR(path, datPaper, "Paper");
    }
    private void savePaperR() {
        String path = route + "\\paper.txt";
        saveFileR(path, datPaper);
    }


    private void loadAuthor() {
        String path = route + "\\author.txt";
        readFile(path, datAuthor,"Author");
    }
    private void saveAuthor() {
        String path = route + "\\author.txt";
        saveFile(path, datAuthor);
    }
    private void loadAuthorR() {
        String path = route + "\\author.txt";
        readFileR(path, datAuthor,"Author");
    }
    private void saveAuthorR() {
        String path = route + "\\author.txt";
        saveFileR(path, datAuthor);
    }


    private void loadTerm() {
        String path = route + "\\term.txt";
        readFile(path, datTerm,"Term");
    }
    private void saveTerm() {
        String path = route + "\\term.txt";
        saveFile(path, datTerm);
    }
    private void loadTermR() {
        String path = route + "\\term.txt";
        readFileR(path, datTerm,"Term");
    }
    private void saveTermR() {
        String path = route + "\\term.txt";
        saveFileR(path, datTerm);
    }


    private void loadConference() {
        String path = route + "\\conf.txt";
        readFile(path, datConference,"Conf");
    }
    private void saveConference() {
        String path = route + "\\conf.txt";
        saveFile(path, datConference);
    }
    private void loadConferenceR() {
        String path = route + "\\conf.txt";
        readFileR(path, datConference,"Conf");
    }
    private void saveConferenceR() {
        String path = route + "\\conf.txt";
        saveFileR(path, datConference);
    }

    private void loadArestaPaperConference(int id_aresta) {
        String path = route + "\\paper_conf.txt";
        String tipus = "Conference";
        readFileAresta(path, datPaperConference, id_aresta, tipus);
    }
    private void savePaperAuthor(){
        String path = route + "\\paper_author.txt";

        try {
            FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i=0;i<this.datPaperAuthor.size();i++){
                bw.write(datPaperAuthor.get(i).getNode1().getId()+"\t"+datPaperAuthor.get(i).getNode2().getId()+"\n");

            }
            bw.close();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void savePaperConf(){
        String path = route + "\\paper_conf.txt";

        try {
            FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i=0;i<this.datPaperConference.size();i++){
                bw.write(datPaperConference.get(i).getNode1().getId()+"\t"+datPaperConference.get(i).getNode2().getId()+"\n");

            }
            bw.close();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void savePaperTerm(){
        String path = route + "\\paper_term.txt";

        try {
            FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i=0;i<this.datPaperTerm.size();i++){
                bw.write(datPaperTerm.get(i).getNode1().getId()+"\t"+datPaperTerm.get(i).getNode2().getId()+"\n");

            }
            bw.close();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void loadArestaPaperAuthor(int id_aresta) {
        String path = route + "\\paper_author.txt";
        String tipus = "Author";
        readFileAresta(path, datPaperAuthor, id_aresta, tipus);
    }

    private void loadArestaPaperTerm(int id_aresta) {
        String path = route + "\\paper_term.txt";
        String tipus = "Term";
        readFileAresta(path, datPaperTerm, id_aresta, tipus);
    }

    private Node busqueda_node_id(int id, String tipus){
        //busca un node en les llistes internes
        int i = 0;
        if (tipus.equals("Paper")) {
            while (i < datPaper.size() && datPaper.get(i).getId()!= id) {
                ++i;
            }
            if(i == datPaper.size())return null;
            return datPaper.get(i);
        }
        else if (tipus.equals("Conference")) {
            while (i < datConference.size() && datConference.get(i).getId() != id) {
                ++i;
            }
            if(i == datConference.size())return null;
            return datConference.get(i);
        }
        else if (tipus.equals("Author")) {
            while (i < datAuthor.size() && datAuthor.get(i).getId() != id) {
                ++i;
            }
            if(i == datAuthor.size())return null;
            return datAuthor.get(i);
        }
        else if (tipus.equals("Term")) {
            while (i < datTerm.size() && datTerm.get(i).getId() != id) {
                ++i;
            }
            if(i == datTerm.size())return null;
            return datTerm.get(i);
        }

        return null;
    }

    private void readFileAresta(String r, ArrayList<Aresta> aL, int id_aresta, String tipus) {
        //Llegeix un fitxer de relacions de l'enunciat
        try {
            FileReader file = new FileReader(r);
            BufferedReader reader = new BufferedReader(file);
            String par1 = "";
            String par2 = "";
            int id1 = 0;
            int id2 = 0;

            String line = reader.readLine();
            while (line != null) {
                if (line != null) {
                    int i = 0;
                    while (line.charAt(i) != '\t') i++;

                    id1 = Integer.parseInt(line.substring(0, i));
                    id2 = Integer.parseInt(line.substring(i + 1,line.length()));
                    Node paperaresta = busqueda_node_id(id1, "Paper"); // porque esto
                    Node altrearesta = busqueda_node_id(id2, tipus);
                    aL.add(new Aresta(id_aresta, 0, paperaresta, altrearesta)); // int int int int parameter
                }
                line = reader.readLine();
                ++id_aresta;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public void safe(Graph g) {
        //Escriu la informaciﾃｳ del graph als fitxers
        /*this.saveAuthor();
        this.saveConference();
        this.savePaper();
        this.saveTerm();*/
        this.saveAuthorR();
        this.saveConferenceR();
        this.savePaperR();
        this.saveTermR();

        this.savePaperAuthor();
        this.savePaperConf();
        this.savePaperTerm();

    }
    /*public void safeR(Graph g) {
        //Escriu la informaciﾃｳ del graph als fitxers
        this.saveAuthorR();
        this.saveConferenceR();
        this.savePaperR();
        this.saveTermR();

        this.savePaperAuthor();
        this.savePaperConf();
        this.savePaperTerm();
    }*/

    public Graph load(){
        //llegeix tots els fitxers i crea el graph
        /*loadAuthor();
        loadConference();
        loadPaper();
        loadTerm();*/
        int indice_ultima_linea;
        
        String salida = terminal.getText();
        terminal.setText(salida + "\n" + "Cargando data base\n");
        indice_ultima_linea = terminal.getDocument().getLength();
        terminal.setCaretPosition(indice_ultima_linea);
        
        salida = terminal.getText();
        terminal.setText(salida + "14.28%");
        indice_ultima_linea = terminal.getDocument().getLength();
        terminal.setCaretPosition(indice_ultima_linea);
        loadAuthorR();
        //loadAuthor();
        
        //salida = terminal.getText();
        terminal.setText(salida + "28.57%");
        indice_ultima_linea = terminal.getDocument().getLength();
        terminal.setCaretPosition(indice_ultima_linea);
        loadConferenceR();
        //loadConference();
        
        //salida = terminal.getText();
        terminal.setText(salida + "48.84%");
        indice_ultima_linea = terminal.getDocument().getLength();
        terminal.setCaretPosition(indice_ultima_linea);
        loadPaperR();
        //loadPaper();
        
        //salida = terminal.getText();
        terminal.setText(salida + "57.12%"); 
        indice_ultima_linea = terminal.getDocument().getLength();
        terminal.setCaretPosition(indice_ultima_linea); 
        loadTermR();
        //loadTerm();
        

        int id_aresta = 0;
        
        //salida = terminal.getText();
        terminal.setText(salida + "71.40%");
        indice_ultima_linea = terminal.getDocument().getLength();
        terminal.setCaretPosition(indice_ultima_linea);
        loadArestaPaperConference(id_aresta);
        
        //salida = terminal.getText();
        terminal.setText(salida + "85.68%");
        indice_ultima_linea = terminal.getDocument().getLength();
        terminal.setCaretPosition(indice_ultima_linea);
        loadArestaPaperAuthor(id_aresta);
        
        //salida = terminal.getText();
        terminal.setText(salida + "99.96%");
        indice_ultima_linea = terminal.getDocument().getLength();
        terminal.setCaretPosition(indice_ultima_linea);
        loadArestaPaperTerm(id_aresta);

        
        //salida = terminal.getText();
        terminal.setText(salida + "100.00%\n\n");
        indice_ultima_linea = terminal.getDocument().getLength();
        terminal.setCaretPosition(indice_ultima_linea);


        return new Graph(datPaper,datAuthor,datTerm,datConference,datPaperConference,
                datPaperAuthor,datPaperTerm);
    }
    /*public Graph loadR(){
        //llegeix tots els fitxers i crea el graph
        loadAuthorR();
        loadConferenceR();
        loadPaperR();
        loadTermR();
        int id_aresta = 0;
        loadArestaPaperConference(id_aresta);
        loadArestaPaperAuthor(id_aresta);
        loadArestaPaperTerm(id_aresta);

        return new Graph(datPaper,datAuthor,datTerm,datConference,datPaperConference,
                datPaperAuthor,datPaperTerm);
    }*/

    private void saveFile(String r, ArrayList<Node> aL){
        try {
            FileWriter fw= new FileWriter(r);
            BufferedWriter bw = new BufferedWriter(fw);

            for(int i =0 ; i<aL.size();i++){
                bw.write(aL.get(i).getId()+"\t"+aL.get(i).getName()+"\n");
            }
            bw.close();
            fw.close();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void saveFileR(String r, ArrayList<Node> aL){
        try {
            FileWriter fw= new FileWriter(r);
            BufferedWriter bw = new BufferedWriter(fw);

            for(int i =0 ; i<aL.size();i++){
                String s = String.valueOf(aL.get(i).getRelevancia());
                bw.write(aL.get(i).getId()+"\t"+aL.get(i).getName()+"\t"+s+"\n");
                //System.out.println(aL.get(i).getId()+"\t"+aL.get(i).getName()+"\t"+s+"\n");
            }
            bw.close();
            fw.close();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void readFile(String r, ArrayList<Node> aL, String tipo) {
        //llegeix els fitxers dels nodes
        try {
            FileReader file = new FileReader(r);
            BufferedReader reader = new BufferedReader(file);

            String par1 = "";
            String par2 = "";

            String line = reader.readLine();
            while (line != null) {
                if (line != null) {
                    int i = 0;
                    while (line.charAt(i) != '\t') i++;
                    switch(tipo){
                        case "Paper": aL.add(new NodePaper(Integer.parseInt(line.substring(0, i)),
                                line.substring(i + 1, line.length()))); break;
                        case "Author": aL.add(new NodeAuthor(Integer.parseInt(line.substring(0, i)),
                                line.substring(i + 1, line.length()))); break;
                        case "Conf": aL.add(new NodeConference(Integer.parseInt(line.substring(0, i)),
                                line.substring(i + 1, line.length()))); break;
                        case "Term": aL.add(new NodeTerm(Integer.parseInt(line.substring(0, i)),
                                line.substring(i + 1, line.length()))); break;
                    }
                }
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void readFileR(String r, ArrayList<Node> aL, String tipo) {
        //llegeix els fitxers dels nodes
        try {
            FileReader file = new FileReader(r);
            BufferedReader reader = new BufferedReader(file);

            String par1 = "";
            String par2 = "";

            String line = reader.readLine();
            while (line != null) {
                if (line != null) {
                    int i = 0;
                    while (line.charAt(i) != '\t') i++;
                    int j=i+1;//abans nomes i
                    while(line.charAt(j) != '\t') j++;
                    switch(tipo){
                        case "Paper": aL.add(new NodePaper(Integer.parseInt(line.substring(0, i)),
                                line.substring(i+1, j), Double.parseDouble(line.substring(j+1, line.length())))); break;
                        case "Author": aL.add(new NodeAuthor(Integer.parseInt(line.substring(0, i)),
                                line.substring(i+1, j), Double.parseDouble(line.substring(j+1, line.length())))); break;
                        case "Conf": aL.add(new NodeConference(Integer.parseInt(line.substring(0, i)),
                                line.substring(i+1, j), Double.parseDouble(line.substring(j+1, line.length())))); break;
                        case "Term": aL.add(new NodeTerm(Integer.parseInt(line.substring(0, i)),
                                line.substring(i+1, j), Double.parseDouble(line.substring(j+1, line.length())))); break;
                    }
                }
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
