package Obstaculos;


import javax.swing.Icon;
import javax.swing.ImageIcon;

import Visitor.Visitor;


public class Cesped extends Obstaculo{
	
	 public Cesped(){
		 super();
		 graf = new ImageIcon(getClass().getResource("/Iconos/cesped.png"));
	 }
	 
	 
	
	 public String getNombre(){
			return "cesped";
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
