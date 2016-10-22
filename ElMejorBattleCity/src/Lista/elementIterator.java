package Lista;
import java.util.Iterator;
import java.util.*;

public class elementIterator<E> implements Iterator<E> {

	protected PositionList<E> lista;
	protected Position<E> cursor;
	
	public elementIterator(PositionList<E> l){
		lista=l;
	 try{
		if (lista.isEmpty())
		  cursor=null;
		else cursor=lista.first();
	 }catch(EmptyListException e) {System.out.println(e.getMessage());}
	}
	public boolean hasNext(){
		return cursor!=null;
	}
	public E next(){
	  try {
		E aux=null;
		    if (cursor == null)
		    	System.out.println("No tiene siguiente");
		    else {  aux=cursor.element();
		            if (cursor == lista.last())
		            	cursor=null;
		            else cursor=lista.next(cursor);
		    }
		      return aux;
	} catch (EmptyListException e) { System.out.println(e.getMessage());
	} catch (InvalidPositionException e) {System.out.println(e.getMessage());
	} catch (BoundaryViolationException e) {System.out.println(e.getMessage());
	} return null;
	      
	 
	}
	
	
	
}
