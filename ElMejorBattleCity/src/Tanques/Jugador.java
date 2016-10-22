
package Tanques;
import java.awt.Point;

import javax.swing.*;

import Logica.Mapa;
import Obstaculos.Acero;
import Obstaculos.Agua;
import Obstaculos.Aguila;
import Obstaculos.Cesped;
import Obstaculos.Ladrillo;
import Visitor.Visitor;


public class Jugador extends Tanque{
	
	
   
	public Jugador(){
	  	super();
	  	posicion = new Point(103,432);
	  	puntos=0;
	  	velocidadM=2;
	  	ultimaDireccion=0;
	  	
	  	imagen[0] = new ImageIcon(getClass().getResource("/Iconos/jugadorArriba.png"));
	    imagen[1] = new ImageIcon(getClass().getResource("/Iconos/jugadorAbajo.png"));
	    imagen[2] = new ImageIcon(getClass().getResource("/Iconos/jugadorDerecho.png"));
	    imagen[3] = new ImageIcon(getClass().getResource("/Iconos/jugadorIzquierdo.png"));
	    
	}
	
	public void setVelocidad(int v){
		velocidadM=v;
	}
	

	
	public void setPuntos(int x){
		puntos=puntos+x;
	}
	

	public int getUltimaDireccion(){
		return ultimaDireccion;
	}

	@Override
	public void setUltimaDireccion(int d) {
		ultimaDireccion=d;
		
	}
	
	public boolean puedePasar(Enemigo e) {
		return false;
	}
	
	public boolean puedePasar(Jugador j){
		return true;
	}
	
	public boolean dejoPasar(Visitor v) {
		return v.puedePasar(this);
	}
	
	
}
