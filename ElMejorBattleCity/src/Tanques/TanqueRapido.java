package Tanques;

import javax.swing.ImageIcon;



public class TanqueRapido extends Enemigo {

	public TanqueRapido() {
		super();
		velocidadM=6;
		puntos=200;
		golpesQueResiste=1;
		velocidadDisparo=2;
		
		// asigno imagenes al arreglo de imagenes, para luego acceder a ellas.
		
		
	    imagen[0] = new ImageIcon(getClass().getResource("/Iconos/TRArriba.jpg"));
	    imagen[1] = new ImageIcon(getClass().getResource("/Iconos/TRABajo.jpg"));
	    imagen[2] = new ImageIcon(getClass().getResource("/Iconos/TRDerecha.jpg"));
	    imagen[3] = new ImageIcon(getClass().getResource("/Iconos/TRIzquierda.jpg"));
		
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
