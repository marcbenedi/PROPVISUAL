package com.prop45.User.Domini;

import java.util.Scanner;

/**
 *
 * @author toni_
 * 
 * Classe d'un usuari normal, aquesta conte els atributs
 * principals de l'usuari, com nom de l'usuari, contrasenya, etc..
 * A mes, conté també les funcions bàsiques per a gestionar aquests atributs,
 * també anomenades "getters" i "setters", entre d'altres com guardar perfil.
 */

public class UsuariNormal extends UsuariConvidat {
    private String user_name;
    private String password;
    
    
    //CONSTRUCTORA SENSE PARÀMETRES
    public UsuariNormal() {
    }
    
    //CONSTRUCTORA AMB PARÀMETRES
    public UsuariNormal(String usuari, String password) {
        this.user_name = usuari;
        this.password = password;
    }
    
    /*  Retorna el nom de l'usuari.
    Pre:    Cap.
    Post:   Retorna el nom d'usuari.
    */
    public String consultar_username() {
        return user_name;
    }
    
    /*  Retorna la contrasenya.
    Pre:    Cap.
    Post:   Retorna la contrasenya.
    */
    public String consultar_password() {
        System.out.println("Entra el teu username:");
        Scanner sc = new Scanner(System.in);                
        String pass;
        String user = sc.next();
        if (!CtrlUsuaris.ExisteixUsuari(user)) System.out.println("No existeix l'usuari");
        else if (user.equals(user_name)) { 
            System.out.println("Usuari correcte");
            pass = CtrlUsuaris.consultar_password(user);
            if (pass.equals(password)) System.out.println("La teva contrasenya és: "+pass);
            return password;
        }
        return "No has seguit el procediment correctament";
    }   
    
    /*  Modifca el nom de l'usuari.
    Pre:    Cap.
    Post:   El nom de l'usuari ha quedat modificat.
    */
    public void modifica_user() {
        Integer i;
        String pass = null;
        Scanner sc = new Scanner(System.in);
        if (!CtrlUsuaris.ExisteixUsuari(user_name)) {
            System.out.println("Usuari no-existent");
        }
        else {
            System.out.print("El teu usuari és: ");
            System.out.println(user_name);
            System.out.print(".");
            System.out.println("Si desitjeu modificar-lo marqueu 1.");
            System.out.println("Altrament no es modificara l'usuari.");
            Integer h = sc.nextInt();
            if (h == 1) {
                boolean contrasenya = false;
                i = 1;
                while (i <= 3 && !contrasenya) {
                    System.out.println("Escriu la contrasenya de l'usuari");
                    pass = sc.next();
                    if (!CtrlUsuaris.ExisteixUsuari_contrasenya(user_name,pass)) {
                        System.out.println("Contrasenya incorrecta.");
                        System.out.println("Et queden "+(3-i)+" intents");
                    }
                    else {
                        System.out.println("Password correcta.");
                        contrasenya = true;
                    }
                    ++i;
                }
                if (i > 3) {
                    System.out.println("Se t'han acabat tots els intents.");
                }
                else if (contrasenya) {
                    System.out.println("Escriu el nou username:");
                    String nou_user = sc.next();
                    if (!CtrlUsuaris.ExisteixUsuari(nou_user)) {
                        CtrlUsuaris.modificar_usuari(user_name,nou_user,pass);
                        System.out.println("Username modificat correctament.");
                        user_name = nou_user;
                    }
                    else {
                        System.out.println("Aquest usuari ja existeix. Torna-ho a provar");                          
                    }
                }
            }
        }
    }
    
    /*  Modifica l'atribut password.
    Pre:    Cap.
    Post:   password ha quedat modificada per unaltra.
    */
    public void modifica_pass() {
        Integer i;
        String pass = null;
        Scanner sc = new Scanner(System.in);
        if (!CtrlUsuaris.ExisteixUsuari(user_name)) {
            System.out.println("Usuari no-existent");
        }
        else {
            System.out.print("El teu usuari és: ");
            System.out.println(user_name);
            System.out.print(".");
            System.out.println("Si desitjeu modificar la contrasenya marqueu 1.");
            System.out.println("Altrament no es modificara la contrasenya.");
            Integer h = sc.nextInt();
            if (h == 1) {
                boolean contrasenya = false;
                i = 1;
                while (i <= 3 && !contrasenya) {
                    System.out.println("Escriu la contrasenya de l'usuari");
                    pass = sc.next();
                    if (!CtrlUsuaris.ExisteixUsuari_contrasenya(user_name,pass)) {
                        System.out.println("Contrasenya incorrecta.");
                        System.out.println("Et queden "+(3-i)+" intents");
                    }
                    else {
                        System.out.println("Password correcta.");
                        contrasenya = true;
                    }
                    ++i;
                }
                if (i > 3) {
                    System.out.println("Se t'han acabat tots els intents.");
                }
                else if (contrasenya) {
                    System.out.println("Escriu la nova contrasenya:");
                    String new_pass = sc.next();
                    CtrlUsuaris.modificar_password(user_name,pass,new_pass);
                    System.out.println("Contrasenya de l'usuari modificada correctament.");
                    password = new_pass;
                }
            }
        }
    }

    
}
