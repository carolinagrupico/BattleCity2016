package Lista;

import java.util.Iterator;



public class ListaDE<E> implements PositionList<E> {

	protected Nodo<E> cabeza,cola;
	protected int size;
	
	public ListaDE(){
		cabeza= new Nodo<E>(null,null,null);
		cola=new Nodo<E>(null,null,cabeza);
		cabeza.setSiguiente(cola);
		size=0;
	}
	public int size(){
		return size;
	}
	public boolean isEmpty(){
		return size==0;
	}
	public Position<E> first() throws EmptyListException {
		if (isEmpty())
			throw new EmptyListException("Lista vacia");
		return cabeza.getSiguiente();
	}
	public Position<E> last() throws EmptyListException{
		if (isEmpty())
			throw new EmptyListException("Lista vacia");
		return cola.getAnterior();
	}
	public Position<E> prev(Position<E> p) throws InvalidPositionException, BoundaryViolationException{
		Nodo<E> aux=checkPosition(p);
		if (aux.getAnterior() == cabeza)
			 throw new BoundaryViolationException("No hay anterior");
		 return aux.getAnterior();
	}
	public Position<E> next(Position<E> p ) throws InvalidPositionException, BoundaryViolationException{
		Nodo<E> aux=checkPosition(p);
		 if (aux.getSiguiente() == cola)
			 throw new BoundaryViolationException("No hay siguiente");
		return aux.getSiguiente();
	}
	protected Nodo<E> checkPosition(Position<E> p) throws InvalidPositionException{
	  try{	
		if (p == null)
			throw new InvalidPositionException("Posicion nula");
		   return (Nodo<E>) p;
	  }catch(ClassCastException e) {throw new InvalidPositionException("Posicion nula"); }
	}
	public void addFirst(E e){
		Nodo<E> nuevo= new Nodo<E>(e,cabeza.getSiguiente(),cabeza);
		cabeza.getSiguiente().setAnterior(nuevo);
		cabeza.setSiguiente(nuevo);
		size++; 
	}
	public void addLast(E e){
		if (isEmpty())
			addFirst(e);
		else { 
			Nodo<E> nuevo= new Nodo<E>(e,cola, cola.getAnterior());
			cola.getAnterior().setSiguiente(nuevo);
			cola.setAnterior(nuevo);
			size++;
		}
	}
	public void addBefore(Position<E> p, E e) throws InvalidPositionException{
		Nodo<E> aux= checkPosition(p);
		Nodo<E> nuevo=new Nodo<E> (e, aux, aux.getAnterior());
		aux.getAnterior().setSiguiente(nuevo);
		aux.setAnterior(nuevo);
		size++;
	}
	public void addAfter(Position<E> p, E e) throws InvalidPositionException{
		Nodo<E> aux=checkPosition(p);
		Nodo<E> nuevo=new Nodo<E>(e, aux.getSiguiente(),aux);
		aux.getSiguiente().setAnterior(nuevo);
		aux.setSiguiente(nuevo);
		size++;
	}
	public E set(Position<E> p, E e) throws InvalidPositionException{
		if (isEmpty())
		  throw new InvalidPositionException("Lista vacia");
		Nodo<E> aux=checkPosition(p);
		
	    E v=aux.element();
	    aux.setElement(e);
	    return v;
	}
	public E remove(Position<E> p) throws InvalidPositionException{
		Nodo<E> aux= checkPosition(p);
		if ( isEmpty())
			throw new InvalidPositionException("Lista vacia");
		E v=aux.element();
		if (aux==cabeza){
			cabeza.getSiguiente().setAnterior(null);
			cabeza=cabeza.getSiguiente();
		}
		else if (aux==cola){
			   cola.getAnterior().setSiguiente(null);
			   cola= cola.getAnterior();
		}
		      else{ aux.getSiguiente().setAnterior(aux.getAnterior());
		            aux.getAnterior().setSiguiente(aux.getSiguiente());
		      }
		size--;
	  return v;
	}
	public Iterator<E> iterator(){
		return new elementIterator<E>(this);
	}
	public Iterable<Position<E>> positions(){
		PositionList<Position<E>> nueva= new ListaDE<Position<E>>();
		Position<E> p=null;
		Position<E> u=null;
		try{
		if (!isEmpty()){
			p=first();
			u=last();
		  while(p != null){
			  nueva.addLast(p);
			   if (p == u)
				  p=null;
			   else p=next(p);
		  }
		}
	  return nueva;
		}
		catch ( BoundaryViolationException e ) {System.out.println(e.getMessage());}
		catch ( InvalidPositionException e ) {System.out.println(e.getMessage());}
		catch ( EmptyListException e ) {System.out.println(e.getMessage());}
		return null;
	}
	public void eliminar(PositionList<E> b){
		for(E e: b)
			eliminarAux(e);
		
	}
	public void eliminarAux(E e){
		int cant=0;
		try{
		 for(Position<E> p: positions()){
			 cant++;
			 if (p.element().equals(e) && cant % 2 != 0)
				 remove(p);
		 }
		}catch (InvalidPositionException f) {System.out.println(f.getMessage());}
	}
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
