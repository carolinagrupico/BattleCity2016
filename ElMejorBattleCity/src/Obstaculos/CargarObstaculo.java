package Obstaculos;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CargarObstaculo {
	
	protected Obstaculo[] obs;
	protected JLabel label;
	
	public CargarObstaculo(){
		
		obs = new Obstaculo[5];
		
		obs[0] = new Ladrillo();
		obs[1] = new Acero();
		obs[2] = new Agua();
		obs[3] = new Aguila();
		obs[4] = new Cesped();
		
	}
	
	public void leerArchivo(JPanel panelMapa){
	
		 
		   try{
					FileReader f = new FileReader(getClass().getResource("/Archivo/primerNivel.txt").getFile());
			        BufferedReader b = new BufferedReader(f);
			        String cadena="";
			        char d;
			        int y=1;
			        int cant=-1;
			        while((cadena = b.readLine())!=null) {
			        	int x=1;
			        	for (int i = 0; i < cadena.length(); i++){
			      		   d = cadena.charAt(i);
			      		   x=x+25;
			                if (d == 'l')
			                	obs[0].set(panelMapa, x, y);
			                else if(d=='b')
			                		obs[1].set(panelMapa, x, y);
			                	else if(d=='c')
			                			obs[2].set(panelMapa, x, y);
			                		else if(d =='d')
			                				obs[3].set(panelMapa, x, y);
			                			else if(d=='e')
			                					obs[4].set(panelMapa, x, y);
			                
			                
			                
			            }
			          y=y+25;
			        }
			        
			 b.close();
			 
		 }catch (IOException e) {
			 System.out.println("Error en obstaculo - leerArchivo. ");
		 }	 
		   
	    }
	
	

}
