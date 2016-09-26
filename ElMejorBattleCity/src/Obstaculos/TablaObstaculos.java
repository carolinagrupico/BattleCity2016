package Obstaculos;

import javax.swing.JPanel;

public class TablaObstaculos {
	private Obstaculo [] obs;
	
	public TablaObstaculos(){
		
		obs = new Obstaculo[5];
		
		obs[0] = new Ladrillo();
		obs[1] = new Acero();
		obs[2] = new Agua();
		obs[3] = new Cesped();
		obs[4] = new Aguila();				
		
	}
	
	public void recorrer(JPanel panelMapa){
		for(int i=0 ; i<obs.length; i++)
			obs[i].cargarObstaculo(panelMapa);
		
	}

}
