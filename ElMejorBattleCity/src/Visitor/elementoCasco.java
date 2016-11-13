package Visitor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import Logica.Logica;
import Logica.Mapa;

public class elementoCasco implements elementoPower {
	
	private Mapa m;

	public void set(Logica log, Mapa map){
		m=map;
		
	}
	
	@Override
	public boolean dejoPasar(Visitor v) {
		
		return true;
	}

	@Override
	public boolean afectar(Visitor v) {
		if(v.meAfecta(this)){
			m.getJugador().setInmortal(true);
			Timer timer = new Timer (30000, new ActionListener (){
   			 public void actionPerformed(ActionEvent e){
   				      		m.getJugador().setInmortal(false);
   			 	}
   		 	});
			timer.start();
            timer.setRepeats(false);
		}
		
		return v.meAfecta(this);
		
	}
}
