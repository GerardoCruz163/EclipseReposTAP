package EjerciciosDeInterfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPreguntas extends JFrame {
	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPreguntas frame = new VentanaPreguntas();
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
	public VentanaPreguntas() {
		
        
		
		String[] Preguntas = new String[5];
		Preguntas[0]="Provee herramientas de desarrollo para la creación de programas en Java:";
		Preguntas[1]="Año en que fue publicado Java como componente fundamental:";
		Preguntas[2]="Dos ceros, dos cuatro =";
		Preguntas[3]="Nombre completo de miguel hidalgo:";
		Preguntas[4]="Persona que revoluciono el mundo de los smartphones en 2007:";
		
		setTitle("Quizz Jerry");
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblPregunta = new JLabel("");
		lblPregunta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		lblPregunta.setBounds(10, 38, 526, 14);
		contentPane.add(lblPregunta);
		
		JRadioButton radOpcionA = new JRadioButton("a)");
		radOpcionA.setBounds(21, 96, 109, 23);
		contentPane.add(radOpcionA);
		
		JRadioButton radOpcionB = new JRadioButton("b)");
		radOpcionB.setBounds(21, 122, 109, 23);
		contentPane.add(radOpcionB);
		
		JRadioButton radOpcionC = new JRadioButton("c)");
		radOpcionC.setBounds(21, 149, 109, 23);
		contentPane.add(radOpcionC);
		
		JButton btnEvaluar = new JButton("Evaluar");
		btnEvaluar.setBounds(263, 227, 291, 23);
		contentPane.add(btnEvaluar);
		
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
									
					lblPregunta.setText(Preguntas[1]);	
					
			    
			}
		});
		btnSiguiente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnSiguiente.setBounds(151, 227, 102, 23);
		contentPane.add(btnSiguiente);
		
		JButton btnAnterior = new JButton("Anterior");
		btnAnterior.setBounds(21, 227, 109, 23);
		contentPane.add(btnAnterior);
		
		ButtonGroup radOpciones = new ButtonGroup();
		radOpciones.add(radOpcionA);
		radOpciones.add(radOpcionB);
		radOpciones.add(radOpcionC);
		
		
		
		
		
		lblPregunta.setText(Preguntas[0]);
		
		
		
	}

}
