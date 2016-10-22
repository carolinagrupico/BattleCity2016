package Logica;

import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import javax.swing.JPanel;

import Lista.*;
import Obstaculos.Obstaculo;



public abstract class Componente {
   protected JLabel label;
   protected Rectangle rec;
   protected Point posicion;
   protected Icon [] imagen;
   protected int velocidadM;
   protected  int ancho;
   protected int altura;
   
 
   
   public Componente(){
	   
   }
   
   
   public int getVelocidad() {		
		return velocidadM;
	}
   
   public void insertar(JPanel panelMapa, JLabel l,Rectangle r){
	   panelMapa.add(l);
	   panelMapa.scrollRectToVisible(r);
	   
   }
   
   
   public void borrar(JPanel panelMapa,JLabel l){
	   panelMapa.remove(l);
	   panelMapa.revalidate();
	   panelMapa.repaint();
   }
   
   
   public Rectangle getRectangulo(){
		return rec;
	}   
   
   
   
   public void actualizarGrafico(int dir){		
		
	   ImageIcon aux=(ImageIcon) imagen[dir];
	   Icon icono = new ImageIcon(aux.getImage().getScaledInstance(label.getWidth(), label.getWidth(), Image.SCALE_DEFAULT));
	   label.setIcon(icono);
	   label.setBounds(posicion.x, posicion.y, ancho, altura);
	   rec.setBounds(posicion.x, posicion.y, ancho, altura);
     
	}
	
	
	//Actualiza posicion del JLabel
	public void mover(int dir){		
	         
	   if (dir == 0){
		   if(posicion.y-velocidadM>0)
				   posicion.setLocation(posicion.x, posicion.y-velocidadM);
			
			}
			else if (dir == 1){
				 if(posicion.y+velocidadM<444)
					posicion.setLocation(posicion.x, posicion.y+velocidadM);
					 				 
		    	}
				else if (dir == 2){
					if(posicion.x - velocidadM>-2)
						posicion.setLocation(posicion.x - velocidadM, posicion.y);
					
				   }
					else if  (dir == 3){
						if(posicion.x + velocidadM<308)
							posicion.setLocation(posicion.x +velocidadM, posicion.y);
						
					 }

      actualizarGrafico(dir);
    }
	
   
  
   
}
