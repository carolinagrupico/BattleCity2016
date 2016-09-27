package Logica;

import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Obstaculos.CargarObstaculo;
import Tanques.Enemigos;
import Tanques.Tanque;

public  class Componente {
   protected JLabel label;
   private CargarObstaculo c;
 
   
   public Componente(){
	   
   }
   
   public void insertar(JPanel panelMapa, JLabel l){
	   panelMapa.add(l);
   }
   public void borrar(JPanel panelMapa,JLabel l){
	   panelMapa.remove(l);
	   panelMapa.revalidate();
	   panelMapa.repaint();
   }
   
   public JLabel getGrafico(){
	   return label;
   }
   
   public void cargarObstaculos(JPanel panelMapa){
	   c= new CargarObstaculo();
	   c.leerArchivo(panelMapa);
	   
   }
   
   
   
   
}
