package Visitor;

public class elementoJugador  implements Elemento{
	
	public elementoJugador(){
		
	}

	@Override
	public boolean dejoPasar(Visitor v) {
		
		return v.puedePasar(this);
	}

	@Override
	public boolean afectar(Visitor v) {
		return v.destruyo();
	}

	

}
