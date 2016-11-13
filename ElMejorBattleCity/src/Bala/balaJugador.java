package Bala;

import Visitor.*;

public class balaJugador extends Bala {
	
	
	public balaJugador(int x,int y,int d,int v,int n){
		
		super(x,y,d,v,n);
		
		V = new visitorBalaJugador();		
		
		
	}	

}