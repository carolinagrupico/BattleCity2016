package Tanques;

import javax.swing.ImageIcon;


public class TanqueBasico extends Enemigos {

	public TanqueBasico() {
		super();
		velocidad=7;
		puntos=100;
		golpesQueResiste=1;
		velocidadDisparo=1;
		
		// asigno imagenes al arreglo de imagenes, para luego acceder a ellas.
		
		imagen[0] = new ImageIcon(getClass().getResource("/Iconos/tbAbajo.jpg"));
	    imagen[1] = new ImageIcon(getClass().getResource("/Iconos/tbAbajo.jpg"));
	    imagen[2] = new ImageIcon(getClass().getResource("/Iconos/tbIzquierda.jpg"));
	    imagen[3] = new ImageIcon(getClass().getResource("/Iconos/tbDerecha.jpg"));
		
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
