/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author F
 */
public class handler_visual {

    ArrayList<JFrame> container_handler;
 
    busqueda b;
    busqueda_real br;
    path p;
    

    public handler_visual() {
        Instantion();
        Init();
        Display();
    }

    private void Instantion() {
        b = new busqueda();
        br = new busqueda_real();
        p = new path();
        
        this.container_handler = new ArrayList();
      
      
    }

    private void Init() {
        this.container_handler.add(b);
         b.setNext(br);
       
        
        this.container_handler.add(br);
         br.setBefore(b);
         br.setNext(p);

         this.container_handler.add(p);
         p.setBefore(br);

    }
    
    private void Display(){
        if(!this.container_handler.isEmpty()){
        this.container_handler.get(0).setVisible(true);
       
        }
    }
    
 
}
