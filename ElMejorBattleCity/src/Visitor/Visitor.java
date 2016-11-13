package Visitor;



public interface Visitor {

	public boolean puedePasar(elementoLadrillo e);

	public boolean puedePasar(elementoAcero e);

	public boolean puedePasar(elementoAgua e);

	public boolean puedePasar(elementoCesped e);

	public boolean puedePasar(elementoAguila e);

	public boolean puedePasar(elementoEnemigo e);

	public boolean puedePasar(elementoJugador j);
	
	public boolean meAfecta(elementoPower e);

	public boolean destruyo();

}
