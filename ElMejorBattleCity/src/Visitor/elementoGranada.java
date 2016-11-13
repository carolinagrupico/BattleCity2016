package Visitor;
import Logica.*;

public class elementoGranada implements elementoPower {
	
	private Logica l;
	private Mapa m;

	public void set(Logica log, Mapa map){
		m=map;
		l=log;
	}
	
	@Override
	public boolean dejoPasar(Visitor v) {
		
		return true;
	}

	@Override
	public boolean afectar(Visitor v) {
		if(v.meAfecta(this)){// si granada afecta a visitor 		
			for(int i = 0 ; i<m.getArregloEnemigo().length ; i++){
				if(m.getArregloEnemigo()[i]!=null){
					m.borrar(m.getArregloEnemigo()[i].getGrafico(0));
					m.getArregloEnemigo()[i]=null;
					l.setMuertes();
					}
				}
			}
		return v.meAfecta(this);
		
	}

}
