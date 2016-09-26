package Logica;
import Obstaculos.*;
import Tanques.*;

import java.awt.Image;
import java.awt.Point;
import java.awt.event.KeyEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Mapa {

	private Tanque jugador;
	private JPanel panelMapa;
	private TablaObstaculos T_obs;
	
	private Enemigos[] enemigosEnBatalla;
	private Tanque enemigoDePrueba;

	protected JPanel panel1;
	
	protected int anchoPanel1;
	protected int altoPanel1;
	
	
	public Mapa(JPanel panel){
		
		panelMapa=panel;
		altoPanel1=panel.getHeight();
		anchoPanel1=panel.getWidth();
		jugador=new Jugador();
		
		
		enemigosEnBatalla = new Enemigos[4];
		
	}
	
	
	public void iniciarCarga(){ // Este metodo solo se ejecuta al iniciar el juego.
		
		
		jugador.insertarEnPanel(panelMapa);
		cargarObstaculos();
		
	}
	
	
	
	private void cargarObstaculos(){
		T_obs = new TablaObstaculos();
		T_obs.recorrer(panelMapa);
		
	}
	

	public void cargarEnemigos(Enemigos e){
		e.insertarEnPanel(panelMapa);
		boolean inserte=false;
		for(int i=0; i<enemigosEnBatalla.length && !inserte; i++){
			if(enemigosEnBatalla[i]==null){
				inserte=true;
				enemigosEnBatalla[i]=e;
			}
		}
	}
	
	public void eliminarEnemigo(){
		boolean elimine=false;
		for(int i=0; i<enemigosEnBatalla.length && !elimine; i++){
			if(enemigosEnBatalla[i]!=null){
				enemigosEnBatalla[i].eliminarDelPanel(panelMapa);
				enemigosEnBatalla[i]=null;
				elimine=true;
			}
		}
			
	}
	
	public void mover(int dir,Tanque t){ 
		 int direccion=4; 
		 if(dir==KeyEvent.VK_UP) 
	 		direccion=0; 
		 	else if(dir==KeyEvent.VK_DOWN)
		 			direccion=1;
		 		else if(dir==KeyEvent.VK_LEFT)
		 			direccion=2;
		 			else if(dir==KeyEvent.VK_RIGHT)
		 					direccion=3;
	 		
	 	if(direccion!=4)	
	 		t.mover(direccion);
	 	
		}
	
	public Tanque getJugador(){
		return jugador;
	}
	
	
	public Enemigos[] getEnemigo(){
		return  enemigosEnBatalla;
	}
	
	public int cantEnemigosEnMapa(){
		int cant=0;
		for(int i=0; i<enemigosEnBatalla.length; i++){
			if(enemigosEnBatalla[i]!=null)
				cant++;
		}
		return cant;
	}
	
}