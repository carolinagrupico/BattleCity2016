package Obstaculos;

import javax.swing.ImageIcon;
import javax.swing.JPanel;



public class Acero extends Obstaculo{	
	
	 public Acero(){
		 super();
		 graf = new ImageIcon(getClass().getResource("/Iconos/acero.png"));
		 
	 }
	 
	 public void cargarObstaculo(JPanel panelMapa){
		leerArchivo('a',panelMapa);
	}
	
	
	
}