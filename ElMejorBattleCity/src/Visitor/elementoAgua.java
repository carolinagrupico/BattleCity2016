package Visitor;

public class elementoAgua implements Elemento{

	@Override
	public boolean dejoPasar(Visitor v) {
		return v.puedePasar(this);
	}

	@Override
	public boolean afectar(Visitor v) {
		return false;
	}
	
	

}
