package Visitor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import Logica.Logica;
import Logica.Mapa;

public class elementoTimer implements elementoPower {
	
	private Logica l;

	public void set(Logica log, Mapa map){
		l=log;
	}
	
	@Override
	public boolean dejoPasar(Visitor v) {
		
		return true;
	}

	@Override
	public boolean afectar(Visitor v) {
		if(v.meAfecta(this)){
			l.DisparoEnemigo(false);
			l.MoverEnemigos(false);
			Timer timer = new Timer (20000, new ActionListener (){
	   			 public void actionPerformed(ActionEvent e){
	   				      		l.DisparoEnemigo(true);
	   				      		l.MoverEnemigos(true);
	   			 	}
	   		 	});
				timer.start();
	            timer.setRepeats(false);
			
			}
		return v.meAfecta(this);
		
	}

}
