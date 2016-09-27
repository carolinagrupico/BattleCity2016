package GUI;

import javax.swing.Timer;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import Logica.Logica;
import Logica.Mapa;
import Logica.Tablero;
import Obstaculos.*;
import Tanques.Jugador;
import Tanques.Tanque;

public class GUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
 
    private Toolkit t = Toolkit.getDefaultToolkit();
    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private int anchoPantalla= screenSize.width;
    private int altoPantalla= screenSize.width;
    protected int altoPanel1=altoPantalla/3+50;
    protected int anchoPanel1=anchoPantalla/4+anchoPantalla/8+50;
	protected Logica logica;
	protected Tablero tablero;
    /**
	 * Launch the application.
	 */
    
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, anchoPantalla/2+50, altoPantalla/3+50);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.DARK_GRAY);
		contentPane.add(panel1);
		panel1.setForeground(Color.GREEN);
		panel1.setBounds(0, 0,anchoPanel1, altoPanel1);
		panel1.setLayout(null);
    	
		
		logica=new Logica(panel1,panel1);
		
	
		addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent arg0) {
				logica.getMapa().mover(arg0.getKeyCode(),logica.getMapa().getJugador());
			}
		});
		
		addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				if (e.VK_B==e.getKeyCode()){
					logica.getMapa().eliminarEnemigo();
				}
			}
		});
		
		
		tiempoCargarEnemigos();
		tiempoMoverEnemigos();

	}
		
	private void tiempoCargarEnemigos(){
		 Timer timer = new Timer (5000, new ActionListener ()
         {
             public void actionPerformed(ActionEvent e)
             {
            	if(logica.getMapa().cantEnemigosEnMapa()<4)
            	  if(logica.getTablero().disponibles())
            		 logica.insertarEnemigo();
             }
         });
         timer.start();

	}
	
	
	private void tiempoMoverEnemigos(){
		 Timer timer = new Timer (80, new ActionListener ()
        {
            public void actionPerformed(ActionEvent e)
            {
            	logica.moverEnemigos();
            }
        });
        timer.start();

	}
	
	
		
		
}
	
	

