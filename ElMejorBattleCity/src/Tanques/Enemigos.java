package Tanques;

import java.awt.Point;

public abstract class Enemigos extends Tanque{
	
	protected int puntos;
	protected int golpesQueResiste;
	protected int velocidadDisparo;
	protected boolean avanzar;
	protected int ultimaDireccion;

	public Enemigos() {
		super();
		posicion = new Point(120,1);
		avanzar=true;
		ultimaDireccion=1;
		
	}
	
	public abstract int getPuntos();
	public abstract int getGolpes();
	public abstract int getVelocidadDisparo();
	
	
	
	public boolean getAvanzar(){
		return avanzar;
	}
	
	public int getUltimaDireccion(){
		return ultimaDireccion;
	}
	
	public void setAvanzar(boolean a){
		avanzar=a;
	}
	
	public void setUltimaDireccion( int n){
		ultimaDireccion=n;
	}
	

}
