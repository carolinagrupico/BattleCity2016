	package Tanques;

import javax.swing.ImageIcon;


public class TanqueBasico extends Enemigo {

	public TanqueBasico() {
		super();
		velocidadM=2;
		velocidadDisparo=2;
		puntos=100;
		vidas=1;
		
		imagen[0] = new ImageIcon(getClass().getResource("/Iconos/tbArriba.jpg"));
	    imagen[1] = new ImageIcon(getClass().getResource("/Iconos/tbAbajo.jpg"));
	    imagen[2] = new ImageIcon(getClass().getResource("/Iconos/tbDerecha.jpg"));
	    imagen[3] = new ImageIcon(getClass().getResource("/Iconos/tbIzquierda.jpg"));
	}

	

	

}
