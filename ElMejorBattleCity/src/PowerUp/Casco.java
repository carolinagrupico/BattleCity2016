package PowerUp;

import javax.swing.ImageIcon;
import Visitor.*;

public class Casco extends Power{
	
	public Casco(){
		super();
		e = new elementoCasco();
		graf= new ImageIcon(getClass().getResource("/Iconos/casco.jpg"));
	}
	
}
	
	

