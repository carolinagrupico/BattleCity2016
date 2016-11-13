package PowerUp;

import javax.swing.ImageIcon;

import Visitor.*;

public class Granada extends Power {
	
	public Granada(){
		super();
		e = new elementoGranada();
		graf= new ImageIcon(getClass().getResource("/Iconos/granada.jpg"));
	}

	
}
