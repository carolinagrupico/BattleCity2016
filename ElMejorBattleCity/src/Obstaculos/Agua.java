package Obstaculos;


import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Agua extends Obstaculo{
	
	
	 public Agua(){
		 super();
		 graf = new ImageIcon(getClass().getResource("/Iconos/agua.png"));
	 }
	 
	 
	 
	 public String getNombre(){
			return "agua";
		}
	 public Icon getIcon(){
			return graf;
		 }
}
