package Logica;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Random;

import javax.swing.JPanel;

import GUI.GUI;
import Tanques.Enemigos;
import Tanques.Tanque;

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
    	 insertarEnemigo();
    	
    	 
     } 
     
     public Mapa getMapa(){
    	 return mapa;
     }
     
     public Tablero getTablero(){
    	 return tablero;
     }
     
     public void insertarEnemigo(){
    	 Enemigos enemigo = tablero.getEnemigo();
    	 mapa.cargarEnemigos(enemigo);
    	 
     }
     
     //este metodo deberia llamarse desde la GUI cada cierto tiempo 0.1 segundo ma o meno .
     public void moverEnemigos(){
    	
    		 for(int i=0; i<4;i++){
    			 if(mapa.getEnemigo()[i]!=null)
    				 /*if(mapa.getEnemigo()[i].getAvanzar()) // falta verificar colicion. Si no coliciona avanzar=true
    					 mapa.getEnemigo()[i].mover(mapa.getEnemigo()[i].getUltimaDireccion());
    				 else*/ mapa.getEnemigo()[i].mover(obtenerDireccion());
    		 }    	 
     }
     
     
     private int obtenerDireccion(){
    	 Random rand = new Random();
    	 int x = rand.nextInt(4);
    	 return x;
     }
     
     
     
     

}
