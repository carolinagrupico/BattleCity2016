package Visitor;

public class elementoAcero implements Elemento{
	
	public elementoAcero(){
		
	}

	@Override
	public boolean dejoPasar(Visitor v) {
		return v.puedePasar(this);
	}
	
	public boolean afectar(Visitor v){
		return false;
	}
	

}
