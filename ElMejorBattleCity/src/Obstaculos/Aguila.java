package Obstaculos;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class Aguila extends Obstaculo{
	
	 public Aguila(){
		 super();
		 graf = new ImageIcon(getClass().getResource("/Iconos/aguila.png"));
	 }
	 
	 
	 public void cargarObstaculo(JPanel panelMapa){
			leerArchivo('A',panelMapa);
		}
	}
	
	

