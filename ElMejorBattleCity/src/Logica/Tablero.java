package Logica;

import javax.swing.JPanel;
import Tanques.*;


public class Tablero {

	private JPanel panel2;
	private int cantEnemigos;
	
	

	public Tablero(JPanel panel2) {
		this.panel2=panel2;
		cantEnemigos=16;
	}
	
	public void insertarTab() {
		
	}
	
	public Enemigo getEnemigo(){
		Enemigo enemigo=null;
		if(cantEnemigos%4==0)
			enemigo=new TanqueBasico();
		if(cantEnemigos%4==1)
			enemigo=new TanqueBlindado();
		if(cantEnemigos%4==2)
			enemigo=new TanqueRapido();
		if(cantEnemigos%4==3)
			enemigo=new TanqueDePoder();
		
		cantEnemigos--;
		
		return enemigo;
		
	}
	
	public boolean disponibles(){
		return cantEnemigos>0;
	}
	

}
