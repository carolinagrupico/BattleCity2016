
package Tanques;
import java.awt.Point;

import javax.swing.*;

import Logica.Mapa;



public class Jugador extends Tanque{
   
	public Jugador(){
	  	super();
	  	posicion = new Point(120,400);
	  	
	  	velocidad=7;
	  	
	  	imagen[0] = new ImageIcon(getClass().getResource("/Iconos/jugadorArriba.png"));
	    imagen[1] = new ImageIcon(getClass().getResource("/Iconos/jugadorAbajo.png"));
	    imagen[2] = new ImageIcon(getClass().getResource("/Iconos/jugadorIzquierdo.png"));
	    imagen[3] = new ImageIcon(getClass().getResource("/Iconos/jugadorDerecho.png"));

	}
	
	public void setVelocidad(int v){
		velocidad=v;
	}
	

	@Override
	public int getVelocidad() {		
		return velocidad;
	}
}