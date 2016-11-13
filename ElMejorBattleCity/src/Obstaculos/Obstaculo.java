package Obstaculos;
import Logica.*;
import Visitor.*;

import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public abstract class Obstaculo extends Componente  {

  protected Icon graf;
  protected Mapa m;
  protected Elemento E;
	
	 public Obstaculo(){
		 label= new JLabel();  
		 ancho=25;
		 altura=25;
	}
	 
	//-----------------------------------------------------------------
    
	 public  Elemento getElemento(){
		 return E;
	 }
	 
	//-----------------------------------------------------------------

	 public void set(int x,int y){
		 	posicion = new Point(x,y);
		    rec = new Rectangle(x,y,ancho,altura);
	    	label.setBounds(rec);
	        ImageIcon aux=(ImageIcon) graf;
	 	    Icon icono = new ImageIcon(aux.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
	 	    label.setIcon(icono);
	 }
	 
	 
   //-----------------------------------------------------------------

   public abstract String getNombre();
   
   public abstract Icon getIcon();
  
   //-----------------------------------------------------------------
  
   		
 }




