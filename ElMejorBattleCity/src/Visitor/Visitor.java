package Visitor;
import Obstaculos.*;
import Tanques.*;

public interface Visitor {
	
	public boolean puedePasar(Ladrillo e);
	public boolean puedePasar(Acero e);
	public boolean puedePasar(Agua e);
	public boolean puedePasar(Cesped e);
	public boolean puedePasar(Aguila e);
	public boolean puedePasar(Enemigo e);
	public boolean puedePasar(Jugador j);
	
	public boolean destruyo();
	
	
}
