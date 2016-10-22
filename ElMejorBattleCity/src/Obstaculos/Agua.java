package Obstaculos;


import javax.swing.Icon;
import javax.swing.ImageIcon;

import Visitor.Visitor;


public class Agua extends Obstaculo{
	
	
	 public Agua(){
		 super();
		 graf = new ImageIcon(getClass().getResource("/Iconos/agua.png"));
	 }
	 
	 
	 
	 public String getNombre(){
			return "agua";
		}
	 public Icon getIcon(){
			return graf;
		 }


	
	@Override
	public boolean dejoPasar(Visitor v) {
		return v.puedePasar(this);
	}
	public boolean meDestruye(Visitor v){
		return false;
	}
	
}
