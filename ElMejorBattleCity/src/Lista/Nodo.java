package Lista;

public class Nodo<E> implements Position<E> {

	protected E rotulo;
	protected Nodo<E> siguiente, anterior;
	
	public Nodo(E e, Nodo<E> sig, Nodo<E> ant){
		rotulo=e;
		siguiente=sig;
		anterior=ant;
	}
	public Nodo(E e){
		this(e, null, null);
	}
	public E element(){
		return rotulo;
	}
	public void setElement(E e){
		rotulo=e;
	}
	public void setSiguiente(Nodo<E> e){
		siguiente=e;
	}
	public void setAnterior(Nodo<E> e){
		anterior=e;
	}
	public Nodo<E> getSiguiente(){
		return siguiente;
	}
	public Nodo<E> getAnterior(){
		return anterior;
	}
	
	
	
}
