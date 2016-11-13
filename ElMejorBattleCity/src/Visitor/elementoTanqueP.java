package Visitor;

import Logica.Logica;
import Logica.Mapa;

public class elementoTanqueP implements elementoPower{
	
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
		if(v.meAfecta(this)){		
			m.getJugador().setVidas(m.getJugador().getVidas()+1);
			}
		return v.meAfecta(this);
		
	}


}
