package EjerciciosDeInterfaz;

//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

public class SerieNumeros extends JFrame {

	private JPanel contentPane;
	private JTextField inpNumero1;
	private JTextField inpNumero2;
	private JTextField inpIteraciones;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SerieNumeros frame = new SerieNumeros();
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
	public SerieNumeros() {
		setTitle("Gerardo Alberto Cruz Rojo 19100163");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		inpNumero1 = new JTextField();
		inpNumero1.setBounds(57, 29, 86, 20);
		contentPane.add(inpNumero1);
		inpNumero1.setColumns(10);
		
		inpNumero2 = new JTextField();
		inpNumero2.setBounds(57, 60, 86, 20);
		contentPane.add(inpNumero2);
		inpNumero2.setColumns(10);
		
		inpIteraciones = new JTextField();
		inpIteraciones.setBounds(57, 91, 86, 20);
		contentPane.add(inpIteraciones);
		inpIteraciones.setColumns(10);
		
		JTextPane txtSerie = new JTextPane();
		txtSerie.setBounds(57, 131, 278, 20);
		contentPane.add(txtSerie);
		
		JButton btnGenerar = new JButton("Generar");
		btnGenerar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int Contador=1,Suma;
				String Cadena="";
				String Nuro1=inpNumero1.getText();
				String Nuro2=inpNumero2.getText();
				String TxtIndice=inpIteraciones.getText();
				int Indice=Integer.parseInt(TxtIndice);
				int Nro1=Integer.parseInt(Nuro1);
				int Nro2=Integer.parseInt(Nuro2);
				
				Cadena=Cadena+Nuro1+" "+Nuro2;
				while(Contador<=Indice){
					Suma=Nro1+Nro2;
					Cadena=Cadena+"  "+Suma;
					Nro1=Nro2;
					Nro2=Suma;
					Contador++;
				}
				txtSerie.setText(Cadena);
			}
			
			
		});
		btnGenerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnGenerar.setBounds(57, 215, 89, 23);
		contentPane.add(btnGenerar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(ABORT);
			}
		});
		btnSalir.setBounds(303, 215, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel = new JLabel("Indique el primer numero");
		lblNewLabel.setBounds(149, 32, 148, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblIndiqueElSegundo = new JLabel("Indique el segundo numero");
		lblIndiqueElSegundo.setBounds(149, 63, 148, 14);
		contentPane.add(lblIndiqueElSegundo);
		
		JLabel lblIteraciones = new JLabel("# iteraciones");
		lblIteraciones.setBounds(149, 94, 148, 14);
		contentPane.add(lblIteraciones);
	}
}
