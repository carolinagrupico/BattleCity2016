package Tanques;

import java.awt.Point;

public abstract class Enemigos extends Tanque{
	
	
	protected int golpesQueResiste;
	protected int velocidadDisparo;
	protected boolean avanzar;


	public Enemigos() {
		super();
		posicion = new Point(100,1);
		avanzar=true;
		ultimaDireccion=1;
	}
	
	//-----------------------------------------------------------------

	public abstract int getGolpes();
	public abstract int getVelocidadDisparo();
	
	//-----------------------------------------------------------------
	
	public boolean puedePasar(Tanque e) {
		return true;
	}	
		
	

}
