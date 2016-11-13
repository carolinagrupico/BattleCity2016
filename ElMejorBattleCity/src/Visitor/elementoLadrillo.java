package Visitor;

public class elementoLadrillo implements Elemento{
	
	public elementoLadrillo(){}

	@Override
	public boolean dejoPasar(Visitor v) {
		return v.puedePasar(this);
	}
	

	public boolean afectar(Visitor v){
		return v.destruyo();
	}

	
}
