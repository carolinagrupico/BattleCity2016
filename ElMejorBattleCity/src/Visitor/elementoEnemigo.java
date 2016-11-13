package Visitor;

public class elementoEnemigo implements Elemento {
	
	public elementoEnemigo(){
		
	}
	@Override
	public boolean dejoPasar(Visitor v) {
		return v.puedePasar(this);
	}
	
	

	public boolean afectar(Visitor v){
		return v.destruyo();
	}
	
	

}
