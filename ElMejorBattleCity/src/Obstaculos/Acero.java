package Obstaculos;


import javax.swing.Icon;
import javax.swing.ImageIcon;

import Visitor.Visitor;




public class Acero extends Obstaculo{	
	
	 public Acero(){
		 super();
		 graf = new ImageIcon(getClass().getResource("/Iconos/acero.png"));
		 
	 }
	 
	 
	 public String getNombre(){
			return "acero";
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
