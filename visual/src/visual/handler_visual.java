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
 
   /*1*/ busqueda b;
   /*2*/ busqueda_real br;
   /*3*/ path p;
   /*4*/ wait_busqueda wb;
   /*5*/ result r;
    

    public handler_visual() {
        Instantion();
        Init();
        Display();
    }

    private void Instantion() {
        b = new busqueda();
        br = new busqueda_real();
        p = new path();
        wb = new wait_busqueda();
        r= new result();
        
        
        this.container_handler = new ArrayList();
      
      
    }

    private void Init() {
        this.container_handler.add(b);
         b.setNext(br);
       
        
        this.container_handler.add(br);
         br.setBefore(b);
         br.setNext(wb);
         br.setPathOption(p);

         this.container_handler.add(p);
         p.setBefore(br);
         
         
          this.container_handler.add(wb);
          
           this.container_handler.add(r);
           r.setBusquedaJFrame(this.b);
         

    }
    
    private void Display(){
        if(!this.container_handler.isEmpty()){
        this.container_handler.get(0).setVisible(true);
       
        }
    }
    
 
}
