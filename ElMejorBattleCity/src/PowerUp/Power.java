package PowerUp;

import java.awt.Image;
import Visitor.*;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Logica.Componente;
import Obstaculos.Acero;
import Obstaculos.Agua;
import Obstaculos.Aguila;
import Obstaculos.Cesped;
import Obstaculos.Ladrillo;
import Tanques.GameEnMovimiento;
import Tanques.Tanque;
import Visitor.Elemento;
import Visitor.Visitor;

public class Power extends Componente implements Elemento{
	
	protected Icon graf;
	
	public Power(){
		ancho=25;
		altura=25;
	}
	
	public JLabel getGrafico(Point pos){
		label= new JLabel();
		rec = new Rectangle(pos.x,pos.y,ancho,altura);
		label.setBounds(rec);
        ImageIcon aux=(ImageIcon) graf; 
 	    Icon icono = new ImageIcon(aux.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
 	   label.setIcon(icono);
    
  return label;
	}

	@Override
	public boolean dejoPasar(Visitor v) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean meDestruye(Visitor v) {
		// TODO Auto-generated method stub
		return false;
	}

	

	
}