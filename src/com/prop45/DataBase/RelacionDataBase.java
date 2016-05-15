package com.prop45.DataBase;

import com.prop45.Paths.Norma;
import com.prop45.Paths.Relacion;
import static com.prop45.searchtacp.variables.getPath;
import static com.prop45.searchtacp.variables.getUsuario;

import java.io.*;
import java.util.ArrayList;

public class RelacionDataBase extends DataBase {

    ArrayList<Relacion> relacions = new ArrayList<>();

    public ArrayList<Relacion> getRelacions() {return (ArrayList<Relacion>) relacions.clone();}

    public void safe(ArrayList<Relacion>rat){
        //Escriu en el fitxer relacio.txt els camins predeterminats del paràmetre
        relacions = (ArrayList<Relacion>) rat.clone();

        try {
            File file_check = new File(getRoute().toString()+"\\relacion.txt");
            if(!file_check.exists()){
                file_check.createNewFile();
            }
            FileWriter fwr = new FileWriter(file_check);
            BufferedWriter bw = new BufferedWriter(fwr);
            for (Relacion re: relacions
                 ) {
                bw.write(re.getName()+"\t");
                for(int i=0;i<re.getTags().size();i++) {
                    if (i == re.getTags().size()-1) {
                        bw.write(re.getTag(i));
                    } else {
                        bw.write(re.getTag(i) + " ");
                    }
                }
                bw.write("\t");
                for(int i=0;i<re.getNormasSize();i++){
                    if(i == (re.getNormasSize()-1)){
                        bw.write(re.getNorma(i).getOperator()+" ");
                        bw.write(re.getNorma(i).getIndx1()+" ");
                        bw.write(re.getNorma(i).getIndx2()+"");
                    }else{
                        bw.write(re.getNorma(i).getOperator()+" ");
                        bw.write(re.getNorma(i).getIndx1()+" ");
                        bw.write(re.getNorma(i).getIndx2()+"\t");
                    }

                }
                bw.write("\n");
            }
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void safeuser(ArrayList<Relacion>rat){
        //Escriu en el fitxer relacio.txt els camins predeterminats del paràmetre
        relacions = (ArrayList<Relacion>) rat.clone();

        try {
            File file_check = new File(getRoute().toString()+"\\relacion_" + getUsuario() + ".txt");
            if(!file_check.exists()){
                file_check.createNewFile();
            }
            FileWriter fwr = new FileWriter(file_check);
            BufferedWriter bw = new BufferedWriter(fwr);
            for (Relacion re: relacions
                 ) {
                bw.write(re.getName()+"\t");
                for(int i=0;i<re.getTags().size();i++) {
                    if (i == re.getTags().size()-1) {
                        bw.write(re.getTag(i));
                    } else {
                        bw.write(re.getTag(i) + " ");
                    }
                }
                bw.write("\t");
                for(int i=0;i<re.getNormasSize();i++){
                    if(i == (re.getNormasSize()-1)){
                        bw.write(re.getNorma(i).getOperator()+" ");
                        bw.write(re.getNorma(i).getIndx1()+" ");
                        bw.write(re.getNorma(i).getIndx2()+"");
                    }else{
                        bw.write(re.getNorma(i).getOperator()+" ");
                        bw.write(re.getNorma(i).getIndx1()+" ");
                        bw.write(re.getNorma(i).getIndx2()+"\t");
                    }

                }
                bw.write("\n");
            }
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void load(){
        //Llegeix del fitxer relacio.txt
        try {
            FileReader f = new FileReader(getRoute().toString()+"\\relacion.txt");
            BufferedReader reader = new BufferedReader(f);

            String line = reader.readLine();
            String name;
            String tag;
            ArrayList<String> tags_list;
            int anti;

            while (line != null) {
                if (line != null) {
                    tags_list = new ArrayList<>();
                    Norma n;
                    Relacion r;
                    int i = 0;
                    //legim nom
                    while (line.charAt(i) != '\t') i++;
                    name = line.substring(0,i);
                    r = new Relacion(name);//Creem la relació i li donem nom
                    i++;
                    anti=i;
                    boolean tags = true;
                    //legim tags
                    while(tags){
                        //legir tag
                        while(line.charAt(i)!= ' ' && line.charAt(i) != '\t')++i;
                        tag = line.substring(anti,i);
                        tags_list.add(tag);
                        //mirem si es l'ultim tag o no
                        if (line.charAt(i)=='\t')tags=false;
                        i++;
                        anti = i;
                    }
                    //fem set de la tag_list de relacio
                    r.setTags(tags_list);
                    //++i;
                    int op1,op2;
                    char op;
                    boolean normes = true;
                    while(normes && i < line.length()){//S'ha de mirar que no sigui l'ultim per les relacions
                        //que no tener normes
                        op = line.charAt(i);
                        ++i;
                        ++i;
                        op1 = Character.getNumericValue(line.charAt(i));
                        ++i;
                        ++i;
                        op2 = Character.getNumericValue(line.charAt(i));
                        n = new Norma(op,op1,op2);
                        r.afegirNorma(n);
                        ++i;
                        //si no hi ha cap tabulador mes vol dir que era la ultima
                        //seria millor comparar amb \n pero no ho detecta
                        if(i>=line.length())normes = false;
                        if(normes)++i;
                    }
                    relacions.add(r);
                }
                line = reader.readLine();

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
    public void loaduser(){
        //Llegeix del fitxer relacio.txt
        try {
            FileReader f = new FileReader(getPath()+"\\recursos\\ficheros\\relacion_"+getUsuario()+".txt");
            BufferedReader reader = new BufferedReader(f);

            String line = reader.readLine();
            String name;
            String tag;
            ArrayList<String> tags_list;
            int anti;

            while (line != null) {
                if (line != null) {
                    tags_list = new ArrayList<>();
                    Norma n;
                    Relacion r;
                    int i = 0;
                    //legim nom
                    while (line.charAt(i) != '\t') i++;
                    name = line.substring(0,i);
                    r = new Relacion(name);//Creem la relació i li donem nom
                    i++;
                    anti=i;
                    boolean tags = true;
                    //legim tags
                    while(tags){
                        //legir tag
                        while(line.charAt(i)!= ' ' && line.charAt(i) != '\t')++i;
                        tag = line.substring(anti,i);
                        tags_list.add(tag);
                        //mirem si es l'ultim tag o no
                        if (line.charAt(i)=='\t')tags=false;
                        i++;
                        anti = i;
                    }
                    //fem set de la tag_list de relacio
                    r.setTags(tags_list);
                    //++i;
                    int op1,op2;
                    char op;
                    boolean normes = true;
                    while(normes && i < line.length()){//S'ha de mirar que no sigui l'ultim per les relacions
                        //que no tener normes
                        op = line.charAt(i);
                        ++i;
                        ++i;
                        op1 = Character.getNumericValue(line.charAt(i));
                        ++i;
                        ++i;
                        op2 = Character.getNumericValue(line.charAt(i));
                        n = new Norma(op,op1,op2);
                        r.afegirNorma(n);
                        ++i;
                        //si no hi ha cap tabulador mes vol dir que era la ultima
                        //seria millor comparar amb \n pero no ho detecta
                        if(i>=line.length())normes = false;
                        if(normes)++i;
                    }
                    relacions.add(r);
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
