package Bala;

import java.awt.Point;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import Tanques.GameEnMovimiento;

import Visitor.*;

public abstract class Bala extends GameEnMovimiento{
	
	private int velocidad;
	protected int dir;
	protected Visitor V;
	protected elementoBala E;
	
	public Bala(int x,int y,int d,int v,int NroSerie){
		
		ancho=20;
		altura=20;
		this.NroSerie = NroSerie;
		dir=d;
		posicion = new Point(x,y);
		velocidad=v;
		
		E = new elementoBala();
		
		
		imagen= new Icon[4];
		
		imagen[0] = new ImageIcon(getClass().getResource("/Iconos/balaA.png"));
	    imagen[1] = new ImageIcon(getClass().getResource("/Iconos/balaAb.png"));
	    imagen[3] = new ImageIcon(getClass().getResource("/Iconos/balaDer.png"));
	    imagen[2] = new ImageIcon(getClass().getResource("/Iconos/balaIzq.png"));
		
	}
	
	
	//-----------------------------------------------------------------------------------
	
	public int getDireccion(){
		return dir;
	}
	
	public Visitor getVisitor(){
		return V;
	}
	
	public Elemento getElemento(){
		return E;
	}

	public int getVelocidad(){
		return velocidad;
	}
	
	
}
