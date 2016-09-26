package Obstaculos;


import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class Cesped extends Obstaculo{
	
	 public Cesped(){
		 super();
		 graf = new ImageIcon(getClass().getResource("/Iconos/cesped.png"));
	 }
	 
	 
	 public void cargarObstaculo(JPanel panelMapa){
			leerArchivo('a',panelMapa);
		}
	
	
}
