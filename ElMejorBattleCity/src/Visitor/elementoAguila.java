package Visitor;

public class elementoAguila implements Elemento{
	
	public elementoAguila(){}

	@Override
	public boolean dejoPasar(Visitor v) {
		return v.puedePasar(this);
	}
	
	public boolean afectar(Visitor v){
		return v.destruyo();
	}
	

}
