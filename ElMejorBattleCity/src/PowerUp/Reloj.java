package PowerUp;

import javax.swing.ImageIcon;

import Visitor.*;

public class Reloj extends Power{
	
	public Reloj(){
		super();
		e = new elementoTimer();
		graf= new ImageIcon(getClass().getResource("/Iconos/reloj.jpg"));
	}
	
	
}
