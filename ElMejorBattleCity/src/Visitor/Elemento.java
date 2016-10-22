package Visitor;

public interface Elemento {
	
	public boolean dejoPasar(Visitor v); 
	public boolean meDestruye(Visitor v);
}
