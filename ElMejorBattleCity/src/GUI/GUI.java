package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logica.Logica;


public class GUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int anchoPantalla;
	private int altoPantalla;
	private Logica logica;
	JPanel panel1, panelTablero;

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

	int direccion;

	/**
	 * Create the frame.
	 */
	public GUI() {

		anchoPantalla = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
		altoPantalla = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds((anchoPantalla / 3) - (getWidth() / 2), (altoPantalla / 6) - (getHeight() / 2), 500, 500);

		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		panel1 = new JPanel();
		panel1.setBackground(Color.BLACK);
		contentPane.add(panel1);
		panel1.setForeground(Color.GREEN);
		panel1.setBounds(0, 0, 400, 490);
		panel1.setLayout(null);

		panelTablero = new JPanel();
		panelTablero.setBackground(Color.LIGHT_GRAY);
		panelTablero.setBounds(400, 0, 100, 490);
		contentPane.add(panelTablero);
		panelTablero.setLayout(null);

		logica = new Logica(panel1, panelTablero, contentPane);
		logica.iniciarJuego(1);

		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent arg0) {

				direccion = 4;
				if (arg0.getKeyCode() == KeyEvent.VK_UP)
					direccion = 0;
				else if (arg0.getKeyCode() == KeyEvent.VK_DOWN)
					direccion = 1;
				else if (arg0.getKeyCode() == KeyEvent.VK_LEFT)
					direccion = 2;
				else if (arg0.getKeyCode() == KeyEvent.VK_RIGHT)
					direccion = 3;

				if (direccion != 4) {
                   logica.moverTanque2(direccion);
				}
			}
		});

		addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				if (e.VK_B == e.getKeyCode() && logica.puedeDisparar(logica.getMapa().getJugador())) {
					logica.getMapa().insertarBalaJugador(logica.getMapa().getJugador());
					logica.sonido("disparoJugador");
				}
			}
		});
	}
}
