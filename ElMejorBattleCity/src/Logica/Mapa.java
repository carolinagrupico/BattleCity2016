package Logica;
import Tanques.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Rectangle.*;

import javax.swing.JPanel;
import javax.swing.Timer;

import java.util.Iterator;

import Lista.*;
import Obstaculos.*;
import PowerUp.*;


public class Mapa {

	private Jugador jugador;
	private JPanel panelMapa;
	private JPanel panel1;
	private Enemigo[] enemigosEnBatalla;
	private PositionList<Obstaculo> lista;
	private PositionList<Bala> balas;
	private int anchoPanel1;
	private int altoPanel1;
	private Obstaculo obs;private int enemigosMuertos;
    private Power poder;
	
	public Mapa(JPanel panel){
		
		panelMapa=panel;
		altoPanel1=panel.getHeight();
		anchoPanel1=panel.getWidth();
		jugador=new Jugador();
		enemigosEnBatalla = new Enemigo[4];
		lista= new ListaDE<Obstaculo>();
		balas= new ListaDE<Bala>();
		enemigosMuertos=0;
		
	}
	
	private void leerArchivo(){
		
		   try{
					FileReader f = new FileReader(getClass().getResource("/Archivo/primerNivel.txt").getFile());
			        BufferedReader b = new BufferedReader(f);
			        String cadena="";
			        char d;
			        int y=1;
			        
			        while((cadena = b.readLine())!=null) {
			        	int x=1;
			        	for (int i = 0; i < cadena.length(); i++){
			      		   d = cadena.charAt(i);
			      		   
			                if (d == 'l')
			                  obs= new Ladrillo();
			                	else if(d=='a')
			                	   obs=new Acero();
			                	      else if(d=='c')
			                		       obs= new Agua();
			                		       else if(d =='A')
			                				     obs= new Aguila();
			                			        else if(d=='e')
			                					     obs= new Cesped();
			                   
			             if (obs!=null){
			            	 lista.addLast(obs); 
			            	 obs.set(panelMapa, x, y);   
			             }
			             obs=null;
			             x+=25; 
			          }
			          y+=25;
			        }
			        
			 b.close();
			 
		 }catch (IOException e) {
			 System.out.println("Error en obstaculo - leerArchivo. ");
		 }	 
		   
	    }
	
	public void iniciarCarga(){ 
		jugador.insertar(panelMapa,jugador.getGrafico(0),jugador.getRectangulo());
        leerArchivo();
	}
	
	public void cargarEnemigo(Enemigo enemigo){
		enemigo.insertar(panelMapa, enemigo.getGrafico(1),enemigo.getRectangulo());
		boolean inserte=false;
		for(int i=0; i<enemigosEnBatalla.length && !inserte; i++){
			if(enemigosEnBatalla[i]==null){
				inserte=true;
				enemigosEnBatalla[i]=enemigo;
			}
		}
		
	}
	

	
	public Jugador getJugador(){
		return jugador;
	}
	
	
	public Enemigo[] getEnemigo(){
		return  enemigosEnBatalla;
	}
	
	public PositionList<Bala> getBalas(){
		return balas;
	}
	
	public int cantEnemigosEnMapa(){
		int cant=0;
		for(int i=0; i<enemigosEnBatalla.length; i++){
			if(enemigosEnBatalla[i]!=null)
				cant++;
		}
		return cant;
	}
	
	
	public void cargarDisparo(Bala bala){
		bala.insertar(panelMapa, bala.getGrafico(0), bala.getRectangulo());
		balas.addLast(bala);		
		
	}
	
	public void moverTanque(int dir,Tanque t){
		if(!hayColision(t,dir))
			t.mover(dir);
		t.actualizarGrafico(dir);
		t.setUltimaDireccion(dir);
	}
	
	
	
	
	public void moverDisparo(Position<Bala> posBala){
		if(!hayColision(posBala.element(),posBala.element().getDireccion()))			
			posBala.element().mover(posBala.element().getDireccion());
		else{
				try {
					balas.remove(posBala);
					posBala.element().borrar(panelMapa, posBala.element().getGrafico(0));
				} catch (InvalidPositionException e){}
			}		
		
	}
	
		
	
	private Rectangle simuladorRectangulo(int dir,Componente t){
		Rectangle aux = new Rectangle(t.getRectangulo().x,t.getRectangulo().y,t.getRectangulo().width,t.getRectangulo().height);
		if(dir==0){
			aux.setLocation(t.getRectangulo().x, t.getRectangulo().y-t.getVelocidad());
			}
			else if(dir==1){
				aux.setLocation(t.getRectangulo().x, t.getRectangulo().y+t.getVelocidad());
					}
					else if(dir==2){
						aux.setLocation(t.getRectangulo().x-t.getVelocidad(), t.getRectangulo().y);
							}
							else if(dir==3){
								aux.setLocation(t.getRectangulo().x+t.getVelocidad(), t.getRectangulo().y);
									}
		return aux;
	}
	
	
	
	//Verifico si hay colision con obstaculos que no me permitan avanzar.
	//Si un obstaculo no me deja avanzar,entonces realizar accion determinada y retornar true.
	
	private boolean hayColision(GameEnMovimiento g,int dir){
		
		Rectangle aux = simuladorRectangulo(dir,g);
		
		//Recorro obstaculos
		for(Position<Obstaculo> p : lista.positions()){
			if(p.element().getRectangulo().intersects(aux) && !p.element().dejoPasar(g)){
				if(p.element().meDestruye(g)){
					try {					
						lista.remove(p);	
						p.element().borrar(panelMapa, p.element().getGrafico());						
					
					} catch (InvalidPositionException e) {}
					}					
				return true;
				}
			}
			
		 //Recorro enemigos
		for(int i=0;i<enemigosEnBatalla.length; i++){
				if(enemigosEnBatalla[i]!=null && !enemigosEnBatalla[i].equals(g))
					if(enemigosEnBatalla[i].getRectangulo().intersects(aux) && !enemigosEnBatalla[i].dejoPasar(g)){
						if(enemigosEnBatalla[i].meDestruye(g)){
							jugador.setPuntos(enemigosEnBatalla[i].getPuntos()); 
							enemigosEnBatalla[i].borrar(panelMapa,enemigosEnBatalla[i].getGrafico(0));
							enemigosEnBatalla[i]=null;
							
							enemigosMuertos++;
							 if (enemigosMuertos == 4){
								 insertarPower();
							     enemigosMuertos=0;
							     
							}
						return true;
					}
				}
			}
			
		if(jugador.getRectangulo().intersects(aux) && !jugador.dejoPasar(g))
			return true;		
		
			
		//powe up usar implementarlo con visitor. igual que obstaculos.
		
		
		return false;
		
	}
	
	
		private void insertarPower(){
			int posx= (int)((500+1)*(Math.random()));
			int posy= (int)((460+1)*(Math.random()));
			
			Point pos= new Point(posx,posy);
			
			int power= (int)((5+1)*(Math.random())); 
			crearPower(power);
			
			poder.insertar(panelMapa, poder.getGrafico(pos), poder.getRectangulo());
			
		}
		
		private void crearPower(int i){
		  
			if (i==0)
				poder= new Casco();
			else if (i==1)
				   poder= new Estrella();
			else if (i==2)
				   poder= new Granada();
			else if (i==3)
				   poder = new Pala();
			else if (i==4)
				   poder= new Reloj();
			else if (i==5)
				   poder= new tanque();
			
		}
		
	
}
