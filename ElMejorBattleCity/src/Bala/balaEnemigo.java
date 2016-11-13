package Bala;


import Visitor.*;

public class balaEnemigo extends Bala {	
	
	
	
	public balaEnemigo(int x,int y,int d,int v,int n){
		
		super(x,y,d,v,n);
		
		V = new visitorBalaEnemigo();
		
		
	}
	
	
	

}
