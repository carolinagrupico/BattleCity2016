package Visitor;

public class elementoCesped implements Elemento{
	
	public elementoCesped(){}

	@Override
	public boolean dejoPasar(Visitor v) {
		return v.puedePasar(this);
	}
	
	public boolean afectar(Visitor v){
		return false;
	}
	
	
}
