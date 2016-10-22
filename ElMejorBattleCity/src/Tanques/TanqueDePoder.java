package Tanques;

import javax.swing.ImageIcon;



public class TanqueDePoder extends Enemigo{

	public TanqueDePoder() {
		super();
		velocidadM=4;
		puntos=300;
		golpesQueResiste=1;
		velocidadDisparo=3;
		
		// asigno imagenes al arreglo de imagenes, para luego acceder a ellas.
		
		
	    imagen[0] = new ImageIcon(getClass().getResource("/Iconos/TPArriba.jpg"));
	    imagen[1] = new ImageIcon(getClass().getResource("/Iconos/TPAbajo.png"));
	    imagen[2] = new ImageIcon(getClass().getResource("/Iconos/TPDerecha.png"));
	    imagen[3] = new ImageIcon(getClass().getResource("/Iconos/TPIzquierda.png"));
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
