package Tanques;

import javax.swing.ImageIcon;



public class TanqueRapido extends Enemigos {

	public TanqueRapido() {
		super();
		velocidad=14;
		puntos=200;
		golpesQueResiste=1;
		velocidadDisparo=2;
		
		// asigno imagenes al arreglo de imagenes, para luego acceder a ellas.
		
		imagen[0] = new ImageIcon(getClass().getResource("/Iconos/TRABajo.jpg"));
	    imagen[1] = new ImageIcon(getClass().getResource("/Iconos/TRArriba.jpg"));
	    imagen[2] = new ImageIcon(getClass().getResource("/Iconos/TRIzquierda.jpg"));
	    imagen[3] = new ImageIcon(getClass().getResource("/Iconos/TRDerecha.jpg"));
		
	}

	@Override
	public void setVelocidad(int i) {
		velocidad=i;
		
		
	}

	@Override
	public int getVelocidad() {
		
		return velocidad;
	}

	@Override
	public int getPuntos() {
		return  puntos;
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
