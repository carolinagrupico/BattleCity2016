package Obstaculos;


import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class Ladrillo extends Obstaculo{	
	
	 public Ladrillo(){
		 super();
		 graf = new ImageIcon(getClass().getResource("/Iconos/Ladrillo.png"));
	 }
	 
	 
	 public void cargarObstaculo(JPanel panelMapa){
			leerArchivo('l',panelMapa);
		}
	
	
}