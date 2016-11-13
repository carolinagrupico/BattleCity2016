package Tanques;

import Visitor.*;

import java.util.Random;

import javax.swing.Icon;




public abstract class Tanque extends GameEnMovimiento{
	
	protected int puntos;
	
	protected int ultimaDireccion;
	protected int velocidadDisparo;
	protected int velocidadM;
	protected Visitor V;
	protected Elemento E;
	protected int vidas;
	protected int disparoSimultaneo;

	
	public Tanque(){		
		imagen= new Icon[4];
		ancho=20;
		altura=20;
		
		Random rand = new Random(); 		 
   	 	NroSerie = rand.nextInt(100);
		
	}
	
	//----------------------------------------------------------------
	
	public void setUltimaDireccion(int d) {
		ultimaDireccion=d;
		
	}
	
	public void setVelocidad(int v){
		velocidadM=v;
	}
	
	
	public void setVidas(int x){
		vidas=x;
	}
	
	//--------------------------------------------------------
	
	
	public abstract int getUltimaDireccion();
	
	
	public int getVelocidad(){
		return velocidadM;
	}
	
	public int getVidas(){
		return vidas;
	}
	
	public Visitor getVisitor(){
		return V;
	}
	
	public Elemento getElemento(){
		return E;
	}
	
	public int getPuntos(){
		return puntos;
	}	
	
	public int getVelocidadDisparo(){
		return velocidadDisparo;
	}
	
	
	
	public int getDisparosSimultaneos(){
		return disparoSimultaneo;
	}
	
	
}
