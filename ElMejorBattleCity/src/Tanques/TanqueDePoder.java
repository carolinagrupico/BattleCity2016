package Tanques;

import javax.swing.ImageIcon;



public class TanqueDePoder extends Enemigos {

	public TanqueDePoder() {
		super();
		velocidad=10;
		puntos=300;
		golpesQueResiste=1;
		velocidadDisparo=3;
		
		// asigno imagenes al arreglo de imagenes, para luego acceder a ellas.
		
		imagen[0] = new ImageIcon(getClass().getResource("/Iconos/TPAbajo.png"));
	    imagen[1] = new ImageIcon(getClass().getResource("/Iconos/TPArriba.jpg"));
	    imagen[2] = new ImageIcon(getClass().getResource("/Iconos/TPIzquierda.png"));
	    imagen[3] = new ImageIcon(getClass().getResource("/Iconos/TPDerecha.png"));
		
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
