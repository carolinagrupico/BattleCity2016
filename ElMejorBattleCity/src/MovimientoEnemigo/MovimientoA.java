package MovimientoEnemigo;

import java.util.Random;

public class MovimientoA implements Movimiento{
	private int direccion;
	private int cantPasos;
	
	public MovimientoA(){
		establecerDireccion();
		establecerCantPasos();
	}
	
	
	
	@Override
	public void establecerDireccion() {
		Random rand = new Random(); 		 
   	 	int x = rand.nextInt(4);
   	 	direccion=x;
		
	}

	@Override
	public int obtenerDireccion() {
		if(cantPasos==0){
			establecerDireccion();
			establecerCantPasos();
		}
		cantPasos--;
			
		return direccion;
	}


	
	public void establecerCantPasos(){
		Random rand = new Random(); 		 
   	 	int x = rand.nextInt(9);
   	 	cantPasos=x+1;
	} 
	
}
