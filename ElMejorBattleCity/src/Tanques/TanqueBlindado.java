package Tanques;

import javax.swing.ImageIcon;



public class TanqueBlindado extends Enemigo {

	public TanqueBlindado() {
		super();
		velocidadM=4;
		puntos=400;
		golpesQueResiste=4;
		velocidadDisparo=2;
		
		// asigno imagenes al arreglo de imagenes, para luego acceder a ellas.
		
		
	    imagen[0] = new ImageIcon(getClass().getResource("/Iconos/TBLArriba.jpg"));
	    imagen[1] = new ImageIcon(getClass().getResource("/Iconos/TBLAbajo.jpg"));
	    imagen[2] = new ImageIcon(getClass().getResource("/Iconos/TBLDerecha.jpg"));
	    imagen[3] = new ImageIcon(getClass().getResource("/Iconos/TBLIzquierda.jpg"));
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
