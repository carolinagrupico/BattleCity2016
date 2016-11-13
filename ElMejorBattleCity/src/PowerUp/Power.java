package PowerUp;

import java.awt.Image;
import Visitor.*;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Logica.Componente;


public class Power extends Componente{
	
	protected Icon graf;
	protected elementoPower e;
	
	public Power(){
		label= new JLabel();  
		ancho=25;
		altura=25;
	}
	
	//-----------------------------------------------------------------
	
	public void set(Point p){
		    rec = new Rectangle(p.x,p.y,ancho,altura);
	    	label.setBounds(rec);
	        ImageIcon aux=(ImageIcon) graf;
	 	    Icon icono = new ImageIcon(aux.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
	 	    label.setIcon(icono);
	}

	//-----------------------------------------------------------------


	public elementoPower getElemento() {
		return e;
	}

	



	

	
}
