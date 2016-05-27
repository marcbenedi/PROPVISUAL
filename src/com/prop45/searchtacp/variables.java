/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prop45.searchtacp;

import com.prop45.Consulta.Consulta;
import com.prop45.DataBase.GraphDataBase;
import com.prop45.DataBase.RelacionDataBase;
import com.prop45.Graph.Graph;
import com.prop45.Graph.Node;
import com.prop45.Paths.Norma;
import com.prop45.Paths.Relacion;
import java.util.ArrayList;

/**
 *
 * @author Miquel Baena
 */
public class variables {
    
    public static Relacion r = new Relacion("nombre_por_defecto");
    public static ArrayList<String> valors = new ArrayList<>();
    public static ArrayList<String> tags = new ArrayList<>();
    public static ArrayList<Norma> normes= new ArrayList<>();
    public static ArrayList<Node> result = new ArrayList<>();
    
    public static boolean primera_clausula_predpath = true;
    public static int numero_items = 0;
    public static int index = 0;
    public static int num_del_select = 0;
    public static boolean definiendo_pred_path = false;
    public static boolean primer_del_cami = true;
    public static boolean ultim_es_paper = false;
    public static int num_words = 0;
    public static int num_pred_path_selected = -1;
    public static int num_pred_path_user_selected = -1;
    private static boolean admin = false;
    private static String usuario = "";
    private static boolean user = false;
    private static boolean surt = false;
    private static String path = "";
    public static Consulta c;
    public static Graph grafo;
    public static GraphDataBase gdb;
    public static RelacionDataBase rdb;
    public static RelacionDataBase userrdb;
    private static int id = 0;
    private static boolean guardat = true;
    private static final String inst_busquedanormal = "Aquestes son les instruccions";
    private static final String realizar_busqueda= "Bienvenido a la pantalla de búsqueda de caminos, donde puedes escoger  \ncamino" +
            "/plantilla quieres buscar. \nCon el botón \"Predefined Path\" puedes usar un camino ya definido(sea \npredeterminado por el programa o por ti) o" +
            " crearlo al momento usando los tipos \nbásicos(Term, Paper, Conference, Author) para ir definiendo cada nodo " +
            "para el \ncamino que quieres usar. \nTambién podrás añadirle clausulas, donde debes especificar las 3 casillas a la " +
            "\nderecha de \"Añadir mas clausulas\", en este orden: la posición del 1r nodo, la \nposición del 2o nodo y su relación.\n" +
            "Las posibles relaciones son: \n'E' que significa iguales\n'D' que significa diferentes \n'L' que significa mayor que (alfabéticamente) \n'M' " +
            "que significa menor que (alfabéticamente) \nTambién puedes usarlas en minúscula ('l','d','e' y 'm') " +
            "que hará que en la tercera \ncasilla añadas una cadena de carácteres para compararla con el nodo que \nespecifiques " +
            "en la 2a casilla. \n"+"Cuando estés listo, clica en \"Realizar Búsqueda\".";
    public static final String escoger_predefined_path="Bienvenido a la pantalla para escoger tu path predefinido, tienes dos opciones: \n"+
            "Escoger un camino predeterminado que hayas definido anteriormente o bien \nescoger un camino de los predeterminados ofrecidos" +
            " por el programa. En ambos casos, solo tienes que seleccionar el número identificador del camino a escoger y clicar en \"Escoger Path\". " +
            " \nAl hacerlo el path escogido quedará actualizado, y en cuando selecciones \n\"Continuar\" el path escogido se cargará en el programa principal." +
            "\nPuedes también presionar \"Exit\" si decides que ya no quieres usar un camino \npredeterminado.";
    public static final String  crear_predefined_path="Bienvenido a la pantalla para crear tu path predefinido y ver cuales hay \npredefinidos." +
            " \nPara definir tu propio path" +
            " clica en los botones de cada tipo de nodo, así se \nañadirán. También podrás añadirle clausulas, donde debes especificar las 3 " +
            "\ncasillas a la " +
            "derecha de \"Añadir mas clausulas\", en este orden: la posición del 1r \nnodo, la posición del 2o nodo y su relación.\n" +
            "Las posibles relaciones son: \n'E' que significa iguales \n'D' que significa diferentes \n'L' que significa mayor que (alfabéticamente) \n'M' " +
            "que significa menor que (alfabéticamente) \n" +
            "También puedes usarlas en minúscula ('l','d','e' y 'm') " +
            "que hará que en la tercera \ncasilla añadas una cadena de carácteres para compararla con el nodo que \nespecifiques " +
            "en la 2a casilla. \n"+
            "Cuando hayas acabado de definir tu camino clica en \"Submit\" para que se añada ala base de datos.";
    public static final String modo_administrador="Bienvenido al modo administrador. \nPara cada opción hay una imagen de un disquete a tu derecha " +
            "que se usa para \nrealizar el cambio." +
            " \nEn la parte superior izquierda podrás gestionar los usuarios: " +
            "añadir nuevos(sean admin o user), cambiar la contraseña de uno ya existente, eliminar un usuario, o \ncambiar los permisos (admin o user" +
            ") de un usuario ya existente. \n" +
            "Abajo a la izquierda podrás gestionar los nodos, añadir y eliminarlos, al añadir un nodo no tendrá ninguna arista " +
            "y al eliminarlo se eliminarán todas las aristas \nadyacentes a él. \n" +
            "En la parte superior derecha tenemos un pequeño historial donde tenemos los \ncambios realizados recientemente. \n" +
            "Finalmente, en la parte inferior derecha podremos gestionar las aristas de nuestrografo. " +
            "Deberemos de seleccionar los dos nodos y el tipo" +
            "de relación entre ellos, y  podemos añadir o eliminar aristas.";
    public static boolean isNumeric(String str)  {
      try  
      {  
        int d = Integer.parseInt(str);  
      }  
      catch(NumberFormatException nfe)  
      {  
        return false;  
      }  
      return true;  
    }    
    public static void setAdmin() {
        admin = true;
    }
    public static void setfalseAdmin() {
        admin = false;
    }
    public static boolean isAdmin() {
        return admin;
    }   
    public static void setUser() {
        user = true;
    }
    public static boolean isUser() {
        return user;
    }
    public static void setUsuario(String a) {
        usuario = a;
    }
    public static String getUsuario() {
        return usuario;
    }
     public static void setPath(String a) {
        path = a;
    }
    public static String getPath() {
        return path;
    }
    public static void setSurt() {
        surt = true;
    }
    public static boolean isSurt() {
        return surt;
    }
    public static void setNextid(int i) {
        id = i;
    } 
    public static int getNextid() {
    return id;
    }
    public static void Cambisnoguardats() {
        guardat = false;
    }
    public static void Guardat() {
        guardat = true;
    }
    public static boolean isGuardat() {
        return guardat;
    }
    public static String getInst_Busqueda_Normal() {
        return inst_busquedanormal;
    }
    public static String getInst_Realizar_Busqueda() {
        return realizar_busqueda;
    }
    public static String getInst_Escoger_Path_Predefinido(){return escoger_predefined_path;}
    public static String getInst_Crear_Path_Predefinido(){return crear_predefined_path;}
    public static String getInst_Modo_Admin(){return modo_administrador;}
}
