package Logica;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import Lista.Position;
import State.*;
import Tanques.*;


public class Logica {
     private Mapa mapa;
     private Tablero tablero;
  
     protected int anchoPanel1;
     protected int altoPanel1;
    
     
     public Logica(JPanel panel1,JPanel panel2){
    	 
    	 mapa=new Mapa(panel1);
    	 tablero=new Tablero(panel2);
    	 mapa.iniciarCarga();
    	 tablero.insertarTab();
    	 insertarEnemigo();
    	 
     } 
     
     public Mapa getMapa(){
    	 return mapa;
     }
     
    
     
     public void insertarEnemigo(){
    	 Enemigo enemigo = tablero.getEnemigo();
    	 mapa.cargarEnemigo(enemigo);
    	 
     }
     
     public void insertarBalaEnMapa(Tanque t){
    	 int dir =t.getUltimaDireccion();
    	 Bala b = new Bala(t.posicion.x,t.posicion.y,dir);
    	 mapa.cargarDisparo(b);
     }
     
      
     
     public void cambiarNivel(int nivel){
    	 Estado state=null;
    	 if(nivel==1)
    		 state = new Nivel1();
    	 else if(nivel==2)
    		 	state = new Nivel2();
    		 else if(nivel==3)
    			 	state = new Nivel3();
    			 else if(nivel==4)
    				 	state = new Nivel4();
    	 if(state!=null){
    		 mapa.getJugador().setEstado(state); 
    		 mapa.getJugador().cambiarNivel();
    	 }
    	 
     }
     
     public void iniciarJuego(){
    	 CargarEnemigos();
    	 MoverEnemigos();
    	 MoverDisparos();
    //	 DisparoEnemigo();
    	 
     }
     
     private void CargarEnemigos(){
		 Timer timer = new Timer (5000, new ActionListener ()
         {
             public void actionPerformed(ActionEvent e)
             {
            	if(mapa.cantEnemigosEnMapa()<4)
            	   if(tablero.disponibles())
            		   insertarEnemigo();
             }
         });
         timer.start();

	}
	
     private void DisparoEnemigo(){
    	 Timer timer = new Timer (3000, new ActionListener ()
         {
             public void actionPerformed(ActionEvent e)
             {
             	for(int i=0; i<4;i++){
        			 if(mapa.getEnemigo()[i]!=null)
        				 insertarBalaEnMapa(mapa.getEnemigo()[i]);
             	}       		
             }
         });
         timer.start();
     }
	
	private void MoverEnemigos(){
		 Timer timer = new Timer (75, new ActionListener ()
        {
            public void actionPerformed(ActionEvent e)
            {
            	for(int i=0; i<4;i++){
       			 if(mapa.getEnemigo()[i]!=null)
       			   mapa.moverTanque(mapa.getEnemigo()[i].getUltimaDireccion(), mapa.getEnemigo()[i]);
       		 }       		
            }
        });
        timer.start();
	}
	
	private void MoverDisparos(){
		 Timer timer = new Timer (25, new ActionListener ()
      {
          public void actionPerformed(ActionEvent e)
          {
        	  for(Position<Bala> pos : mapa.getBalas().positions()){
          		mapa.moverDisparo(pos);
          	 }
          	
          }
      });
      timer.start();

	}
     

}
