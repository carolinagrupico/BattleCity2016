package Visitor;



public class visitorBalaJugador implements Visitor {
	
	public visitorBalaJugador(){
		
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
		return true;
	}

	@Override
	public boolean puedePasar(elementoCesped e) {
		return true;
	}

	@Override
	public boolean puedePasar(elementoAguila e) {
		return false;
	}



	@Override
	public boolean puedePasar(elementoEnemigo e) {
		return false;
	}


	@Override
	public boolean puedePasar(elementoJugador j) {
		return true;
	}
	
	public boolean meAfecta(elementoPower e){
		return false;
	}
	
	
	public boolean destruyo(){
		return true;
	}

}