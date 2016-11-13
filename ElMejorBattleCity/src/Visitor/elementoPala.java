package Visitor;


import Lista.InvalidPositionException;
import Logica.Logica;
import Logica.Mapa;
import Obstaculos.*;

public class elementoPala implements elementoPower {
	
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
			
			Obstaculo nuevo;
			
			int x=m.getAguila().getPosicion().x-25;
			int y=m.getAguila().getPosicion().y-25;
			
			for(int i=0; i<2 ; i++){
				int aux = x;
				for(int j=0; j<3 ; j++){
					if(m.getAguila().getPosicion().x!=aux || m.getAguila().getPosicion().y!=y){
						
						nuevo = new Acero();
						nuevo.set(aux, y);
						
						if(m.verificarColision(nuevo.getRectangulo())!=null){
							m.borrar(m.verificarColision(nuevo.getRectangulo()).element().getGrafico(0));
							try {
								m.getObstaculo().remove(m.verificarColision(nuevo.getRectangulo()));
								} catch (InvalidPositionException e) {}
							}
						
						m.getObstaculo().addFirst(nuevo);
						m.insertar(nuevo.getGrafico(0), nuevo.getRectangulo());
						
						
					}
					aux+=25;
				}
				y+=25;
			}
			
			}
		return v.meAfecta(this);
		
	}
}
