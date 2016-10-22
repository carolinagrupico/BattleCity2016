package Obstaculos;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import Visitor.Visitor;


public class Aguila extends Obstaculo{
	
	 public Aguila(){
		 super();
		 graf = new ImageIcon(getClass().getResource("/Iconos/aguila.png"));
	 }
	 
	 
	 
	 public String getNombre(){
			return "aguila";
		}
	 public Icon getIcon(){
			return graf;
		 }

	
	
	@Override
	public boolean dejoPasar(Visitor v) {
		return v.puedePasar(this);
	}
	
	public boolean meDestruye(Visitor v){
		return v.destruyo();
	}
	
	
}
	
	

