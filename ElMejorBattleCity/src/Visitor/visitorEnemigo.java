package Visitor;



public class visitorEnemigo implements Visitor{

public visitorEnemigo(){
		
	}

	@Override
	public boolean puedePasar(elementoLadrillo e) {
		
		return false;
	}

	@Override
	public boolean puedePasar(elementoAcero e) {
		return false;
	}

	@Override
	public boolean puedePasar(elementoAgua e) {
		return false;
	}

	@Override
	public boolean puedePasar(elementoCesped e) {
		return true;
	}

	@Override
	public boolean puedePasar(elementoAguila e) {
		return false;
	}	

	public boolean puedePasar(elementoEnemigo e) {
		return true;
	}
	
	public boolean puedePasar(elementoJugador j){
		return false;
	}
	
	public boolean meAfecta(elementoPower e){
		return false;
	}
	
	public boolean destruyo() {
		return false;
	}
}