package Obstaculos;


import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Agua extends Obstaculo{
	
	
	 public Agua(){
		 super();
		 graf = new ImageIcon(getClass().getResource("/Iconos/agua.png"));
	 }
	 
	 
	 public void cargarObstaculo(JPanel panelMapa){
			leerArchivo('b',panelMapa);
		}
	
	
}
