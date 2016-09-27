package Obstaculos;


import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class Cesped extends Obstaculo{
	
	 public Cesped(){
		 super();
		 graf = new ImageIcon(getClass().getResource("/Iconos/cesped.png"));
	 }
	 
	 
	
	 public String getNombre(){
			return "cesped";
		}
	 public Icon getIcon(){
			return graf;
		 }
}
