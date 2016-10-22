package Obstaculos;




import javax.swing.Icon;
import javax.swing.ImageIcon;

import Visitor.Visitor;



public class Ladrillo extends Obstaculo{	
	
	 public Ladrillo(){
		 super();
		 graf = new ImageIcon(getClass().getResource("/Iconos/Ladrillo.png"));

	 }	 
	 
	 
	
	public String getNombre(){
		return "ladrillo";
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
