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

/**
 *
 * @author Miquel Baena
 */
public class variables {
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
    private static String inst_busquedanormal = "Aquestes son les instruccions";
    private static final String realizar_busqueda= "Bienvenido a la pantalla de búsqueda de caminos, donde puedes escoger qué camino" +
            "/plantilla quieres buscar.\n Con el botón Predefined Path puedes usar un camino ya definido(sea predeterminado por el programa o no) o" +
            " crearlo al momento usando los tipos básicos(Term, Paper, Conference, Author) para ir definiendo cada nodo " +
            "para el camino que quieres usar. También podrás añadirle clausulas, donde debes especificar las 3 casillas a la " +
            "derecha de Añadir mas clausulas, en este orden: la posición del 1r nodo, la posición del 2o nodo y su relación.\n" +
            "Las posibles relaciones son '=' que significa iguales, '!=' que significa diferentes, '>' que significa mayor que, y '<' " +
            "que significa menor que. \n"+" Cuando estés listo, clica en Realizar Búsqueda.";
    public static final String escoger_predefined_path="Bienvenido a la pantalla para escoger tu path predefinido, tienes dos opciones: \n"+
            " escoger un camino predeterminado que hayas definido anteriormente o bien escoger un camino de los predeterminados ofrecidos" +
            " por el programa. En ambos casos, solo tienes que seleccionar el número identificador del camino a escoger y clicar en Escoger Path." +
            " Al hacerlo el path escogido quedará actualizado, y en cuando selecciones Continuar el path escogido se cargará en el programa principal." +
            "\nPuedes también presionar Exit si decides que ya no quieres usar un camino predeterminado.";
    public static final String  crear_predefined_path="Bienvenido a la pantalla para crear tu path predefinido y ver cuales hay ya definidos." +
            " \n Para definir tu propio path" +
            " clica en los botones de cada tipo de nodo, así se añadirán. También podrás añadirle clausulas, donde debes especificar las 3 casillas a la " +
            "derecha de Añadir mas clausulas, en este orden: la posición del 1r nodo, la posición del 2o nodo y su relación.\n" +
            "Las posibles relaciones son '=' que significa iguales, '!=' que significa diferentes, '>' que significa mayor que, y '<' " +
            "que significa menor que. \n" +
            "Cuando hayas acabado de definir tu camino clica en Submit para que se añada a la base de datos.";
    public static final String modo_administrador="Bienvenido al modo administrador. \nPara cada opción hay una imagen de un disquete a la derecha" +
            "que se usa para realizar el cambio." +
            " \nEn la parte superior izquierda podrás gestionar los usuarios: " +
            "añadir nuevos(sean admin o user), cambiar la contraseña de uno ya existente, eliminar un usuario, o cambiar los permisos (admin o user" +
            ") de un usuario ya existente. \n" +
            "Abajo a la izquierda podremos gestionar los nodos, añadir y eliminarlos, al añadirlo un nodo no tendrá ninguna arista con otro" +
            "y al eliminarlo se eliminarán todas las aristas adyacentes a él. \n" +
            "En la parte superior derecha tenemos un pequeño historial donde tenemos los cambios realizados recientemente. \n" +
            "Finalmente, en la parte inferior derecha podremos gestionar las aristas de nuestro grafo. Deberemos de seleccionar los dos nodos y su tipo" +
            "y podemos añadir o eliminar aristas";
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
