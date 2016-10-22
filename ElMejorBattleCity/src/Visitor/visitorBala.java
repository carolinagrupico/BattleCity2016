package Visitor;

import Obstaculos.Acero;
import Obstaculos.Agua;
import Obstaculos.Aguila;
import Obstaculos.Cesped;
import Obstaculos.Ladrillo;
import Tanques.Enemigo;
import Tanques.Jugador;
import Tanques.Tanque;

public class visitorBala implements Visitor{

	@Override
	public boolean puedePasar(Ladrillo e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean puedePasar(Acero e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean puedePasar(Agua e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean puedePasar(Cesped e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean puedePasar(Aguila e) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean destruyo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean puedePasar(Enemigo e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean puedePasar(Jugador j) {
		// TODO Auto-generated method stub
		return false;
	}

}
