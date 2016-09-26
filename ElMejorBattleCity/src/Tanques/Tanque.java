package Tanques;

import java.awt.Image;
import java.awt.Point;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;


public abstract class Tanque {
	protected JLabel graficoTanque;
	protected int velocidad;
	protected Point posicion;
	protected Icon [] imagen;
	protected final int ancho=20;
	protected final int altura=20;
	
	
	
	
	public Tanque(){		
		
		imagen= new Icon[4];
	
		
	}
	
	
	public void insertarEnPanel(JPanel panelMapa){
		panelMapa.add(getGrafico());
		//setBounds()? 
	}
	
	public void eliminarDelPanel(JPanel panelMapa){
		
	//	panelMapa.remove(graficoTanque);
		graficoTanque.setIcon(null);
		graficoTanque=null;		
		
	}
	
	
	public abstract void setVelocidad(int i); 	
	public abstract int getVelocidad();	
	
	
	
	
	//Actualiza el icono y lo setea en la nueva posicion que fue actualizada
	private void actualizarGrafico(int dir){		
		
	   ImageIcon aux=(ImageIcon) imagen[dir];
	   Icon icono = new ImageIcon(aux.getImage().getScaledInstance(graficoTanque.getWidth(), graficoTanque.getWidth(), Image.SCALE_DEFAULT));
	   graficoTanque.setIcon(icono);
	   graficoTanque.setBounds(posicion.x, posicion.y, ancho, altura);
     
	}
	
	
	//Actualiza posicion del JLabel
	
	public void mover(int dir){		
	        
	   if (dir == 0){
		   if(posicion.y-getVelocidad()>0)
			posicion.setLocation(posicion.x, posicion.y-getVelocidad());
			
			}
			else if (dir == 1){
				 if(posicion.y+getVelocidad()<444)
					posicion.setLocation(posicion.x, posicion.y+getVelocidad());
					 				 
		    	}
				else if (dir == 2){
					if(posicion.x - getVelocidad()>-2)
						posicion.setLocation(posicion.x - getVelocidad(), posicion.y);
					
				   }
					else if  (dir == 3){
						if(posicion.x + getVelocidad()<308)
							
							posicion.setLocation(posicion.x + getVelocidad(), posicion.y);
						
					 }

      actualizarGrafico(dir);
      
	
	}
	
	
	
	public JLabel getGrafico(){
		
		if (graficoTanque == null){
            graficoTanque= new JLabel();
            graficoTanque.setBounds(posicion.x, posicion.y, ancho, altura);
            ImageIcon aux=(ImageIcon) imagen[0]; //es un icono
     	    Icon icono = new ImageIcon(aux.getImage().getScaledInstance(graficoTanque.getWidth(), graficoTanque.getHeight(), Image.SCALE_DEFAULT));
     	    graficoTanque.setIcon(icono);
        }
		
	  return graficoTanque;
	}
	
}