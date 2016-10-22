package Tanques;
import MovimientoEnemigo.*;
import Visitor.Visitor;

import java.awt.Point;

public abstract class Enemigo extends Tanque{
	
	
	protected int golpesQueResiste;
	protected int velocidadDisparo;
	protected Movimiento movimiento;


	public Enemigo() {
		super();
		posicion = new Point(100,1);		
		ultimaDireccion=1;
		movimiento= new MovimientoA();
	}
	
	
	public abstract int getGolpes();
	public abstract int getVelocidadDisparo();
	
	
	
	public int getUltimaDireccion(){
		return movimiento.obtenerDireccion();
	}	
	
	public void setUltimaDireccion(int d) {
		ultimaDireccion=d;
		
	}
	
	public boolean puedePasar(Enemigo e) {
		return true;
	}
	
	public boolean puedePasar(Jugador j){
		return false;
	}
	
	public boolean dejoPasar(Visitor v) {
		return v.puedePasar(this);
	}
	

}
