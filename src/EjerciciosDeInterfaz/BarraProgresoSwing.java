package EjerciciosDeInterfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Panel;

public class BarraProgresoSwing extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BarraProgresoSwing frame = new BarraProgresoSwing();
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
	public BarraProgresoSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 256);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JProgressBar barProgreso = new JProgressBar();
		barProgreso.setBounds(65, 56, 306, 29);
		contentPane.add(barProgreso);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Hilo objHilo=new Hilo("miHilo");
				Thread varHilo= new Thread(objHilo);
				
				ProgresoHilo objHilo2= new ProgresoHilo(barProgreso);
				Thread varHilo2 = new Thread(objHilo2);
				varHilo.start();
				varHilo2.start();
				
				
			}
		});
		btnIniciar.setBounds(119, 106, 201, 56);
		contentPane.add(btnIniciar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(119, 173, 201, 23);
		contentPane.add(btnSalir);
		
		Panel panel = new Panel();
		panel.setBounds(65, 23, 29, 29);
		contentPane.add(panel);
	}
}
