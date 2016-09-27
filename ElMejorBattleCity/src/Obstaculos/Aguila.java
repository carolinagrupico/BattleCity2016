package Obstaculos;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class Aguila extends Obstaculo{
	
	 public Aguila(){
		 super();
		 graf = new ImageIcon(getClass().getResource("/Iconos/aguila.png"));
	 }
	 
	 
	 
	 public String getNombre(){
			return "aguila";
		}
	 public Icon getIcon(){
			return graf;
		 }
	}
	
	

