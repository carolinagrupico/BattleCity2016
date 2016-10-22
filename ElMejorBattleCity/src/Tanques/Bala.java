package Tanques;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Point;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Logica.Componente;
import Logica.Mapa;
import Obstaculos.Acero;
import Obstaculos.Agua;
import Obstaculos.Aguila;
import Obstaculos.Cesped;
import Obstaculos.Ladrillo;
import Visitor.Visitor;

public class Bala extends GameEnMovimiento {
	
	
	private int dir;
	
	
	
	public Bala(int x,int y,int d){
		super();
		dir=d;
		ancho=20;
		altura=20;		
		posicion = new Point(x,y);
		velocidadM=2;
		
		
		
		imagen= new Icon[4];
		
		imagen[0] = new ImageIcon(getClass().getResource("/Iconos/balaA.png"));
	    imagen[1] = new ImageIcon(getClass().getResource("/Iconos/balaAb.png"));
	    imagen[3] = new ImageIcon(getClass().getResource("/Iconos/balaDer.png"));
	    imagen[2] = new ImageIcon(getClass().getResource("/Iconos/balaIzq.png"));
		
	}
	
	
	public JLabel getGrafico(int i){
		if (label == null){
			label= new JLabel();
			label.setBounds(posicion.x, posicion.y, ancho, altura);
			rec = new Rectangle(posicion.x,posicion.y,ancho,altura);
            ImageIcon aux=(ImageIcon) imagen[i]; 
     	    Icon icono = new ImageIcon(aux.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
     	   label.setIcon(icono);
        }
		return label;
	}
	
	public int getDireccion(){
		return dir;
	}

	@Override
	public boolean puedePasar(Ladrillo e) {
		
		return false;
	}

	@Override
	public boolean puedePasar(Acero e) {
		return false;
	}

	@Override
	public boolean puedePasar(Agua e) {
		return true;
	}

	@Override
	public boolean puedePasar(Cesped e) {
		return true;
	}

	@Override
	public boolean puedePasar(Aguila e) {
		return false;
	}

	

	@Override
	public boolean dejoPasar(Visitor v) {
		return false;
	}
	
	public boolean destruyo(){
		return true;
	}

	@Override
	public boolean meDestruye(Visitor v) {
		return false;
	}


	@Override
	public boolean puedePasar(Enemigo e) {
		return false;
	}


	@Override
	public boolean puedePasar(Jugador j) {
		return true;
	}
	

}
