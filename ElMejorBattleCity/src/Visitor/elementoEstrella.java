package Visitor;

import Logica.Logica;
import Logica.Mapa;


public class elementoEstrella implements elementoPower {
	
	private Mapa m;

	public void set(Logica log, Mapa map){
		m=map;
	}
	
	//-----------------------------------------------------------------

	@Override
	public boolean dejoPasar(Visitor v) {
		
		return true;
	}

	@Override
	public boolean afectar(Visitor v) {
		if(v.meAfecta(this))			
	      		 m.getJugador().cambiarNivel();
		
		return v.meAfecta(this);
		
	}

}
