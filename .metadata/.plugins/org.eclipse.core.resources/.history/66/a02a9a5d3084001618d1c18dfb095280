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

public abstract class Obstaculo {

  protected JLabel label;
  protected Icon graf;
  protected int ancho=25;
  protected int alto=25;
	
	 public Obstaculo(){
		  
		  
	  }
	  
	  
	//lee del archivo, crea y carga un nuevo JLabel al panel del mapa
	  public void leerArchivo(char c,JPanel panelMapa){
		
		 
		   try{
					FileReader f = new FileReader(getClass().getResource("/Archivo/primerNivel.txt").getFile());
			        BufferedReader b = new BufferedReader(f);
			        String cadena="";
			        char d;
			        int t=0;
			        
			        int y=1;
			        
			        while((cadena = b.readLine())!=null) {
			        	int x=1;
			        	for (int i = 0; i < cadena.length(); i++){
			      		   d = cadena.charAt(i);
			      		   x=x+25;
			                if (c == d){ //insertar bien las posiciones 
			           
			                	label = new JLabel();
			                	panelMapa.add(label); // ver esto
			                	label.setBounds(x, y, ancho, alto);
			                    ImageIcon aux=(ImageIcon) graf;
			             	    Icon icono = new ImageIcon(aux.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
			             	   label.setIcon(icono);
			             	   
			                }
			            }
			          y=y+25;
			        }
			        
			 b.close();
			 
		 }catch (IOException e) {
			 System.out.println("Error en obstaculo - leerArchivo. ");
		 }	 
		   
	    }
	    



	public abstract void cargarObstaculo(JPanel panelMapa);
		
 }




