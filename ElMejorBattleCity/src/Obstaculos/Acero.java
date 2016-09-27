package Obstaculos;

import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Acero extends Obstaculo{	
	
	 public Acero(){
		 super();
		 graf = new ImageIcon(getClass().getResource("/Iconos/acero.png"));
		 
	 }
	 
	 
	 public String getNombre(){
			return "acero";
		}
	 public Icon getIcon(){
			return graf;
		 }
	
}
