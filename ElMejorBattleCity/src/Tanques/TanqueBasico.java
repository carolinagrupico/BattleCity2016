	package Tanques;

import javax.swing.ImageIcon;


public class TanqueBasico extends Enemigo {

	public TanqueBasico() {
		super();
		velocidadM=2;
		puntos=100;
		golpesQueResiste=1;
		velocidadDisparo=1;
		
		// asigno imagenes al arreglo de imagenes, para luego acceder a ellas.
		
		
	    imagen[0] = new ImageIcon(getClass().getResource("/Iconos/tbArriba.jpg"));
	    imagen[1] = new ImageIcon(getClass().getResource("/Iconos/tbAbajo.jpg"));
	    imagen[2] = new ImageIcon(getClass().getResource("/Iconos/tbDerecha.jpg"));
	    imagen[3] = new ImageIcon(getClass().getResource("/Iconos/tbIzquierda.jpg"));
	}

	@Override
	public void setVelocidad(int i) {
		velocidadM=i;
		
		
	}


	

	@Override
	public int getGolpes() {
		return golpesQueResiste;
	}

	@Override
	public int getVelocidadDisparo() {
		
		return velocidadDisparo;
	}

}
