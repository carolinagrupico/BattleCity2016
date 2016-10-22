package State;

import Tanques.Tanque;

public class Nivel1 implements Estado{

public Nivel1(){
		
	}
	public void ejecutarAccion(Tanque t){
	    t.setVelocidad(2);
	    
	}
	
}
