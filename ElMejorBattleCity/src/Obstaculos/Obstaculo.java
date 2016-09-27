package Obstaculos;
import Logica.*;

import java.awt.Image;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class Obstaculo extends Componente{

  protected Icon graf;
  protected int ancho=25;
  protected int alto=25;
	
	 public Obstaculo(){
		  
		  
	  }
	  
	  

	  
	  
	 public void set(JPanel panelMapa,int x,int y){
			label = new JLabel();
	    	label.setBounds(x, y, ancho, alto);
	        ImageIcon aux=(ImageIcon) graf;
	 	    Icon icono = new ImageIcon(aux.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
	 	    label.setIcon(icono);
	 	    insertar(panelMapa,label);
			
		}
	 
   public abstract String getNombre();
   
   public abstract Icon getIcon();


		
 }




