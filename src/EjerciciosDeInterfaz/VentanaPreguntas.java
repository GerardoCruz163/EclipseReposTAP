package EjerciciosDeInterfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
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
	
	int i=-1;
	
	int total=0;
	
	private JPanel contentPane;
	private JButton btnEvaluar;
	private JButton btnAnterior;
	private JButton btnSiguiente;

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
		Preguntas[0]="1. Provee herramientas de desarrollo para la creación de programas en Java:";
		Preguntas[1]="2. Año en que fue publicado Java como componente fundamental:";
		Preguntas[2]="3. Dos ceros, dos cuatro:";
		Preguntas[3]="4. Nombre completo de miguel hidalgo:";
		Preguntas[4]="5. Persona que revoluciono el mundo de los smartphones, implementando la pantalla multiTouch en 2007:";	
		
		String[] RespuestasPregunta1= new String[3];
		RespuestasPregunta1[0]="a) JRE";
		RespuestasPregunta1[1]="b) JDK";
		RespuestasPregunta1[2]="c) JVM";
		
		String[] RespuestasPregunta2= new String[3];
		RespuestasPregunta2[0]="a) 1995";
		RespuestasPregunta2[1]="b) 2001";
		RespuestasPregunta2[2]="c) 1983";
		
		String[] RespuestasPregunta3= new String[3];
		RespuestasPregunta3[0]="a) 2044";
		RespuestasPregunta3[1]="b) 0044";
		RespuestasPregunta3[2]="c) 0024";
		
		String[] RespuestasPregunta4= new String[3];
		RespuestasPregunta4[0]="a) Miguel Hidalgo de Costilla";
		RespuestasPregunta4[1]="b) Miguel Hidalgo y Costilla";
		RespuestasPregunta4[2]="c) Miguel Gregorio Antonio Ignacio Hidalgo y Costilla Gallaga Mandarte y Villaseñor";
		
		String[] RespuestasPregunta5= new String[3];
		RespuestasPregunta5[0]="a) Bill Gates";
		RespuestasPregunta5[1]="b) Elon Musk";
		RespuestasPregunta5[2]="c) Steve Jobs";
		
		String[] Respuestas= new String[5];
		Respuestas[0]="";
		Respuestas[1]="";
		Respuestas[2]="";
		Respuestas[3]="";
		Respuestas[4]="";
		
		
		setTitle("GERARDO ALBERTO CRUZ ROJO - 19100163");
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 662, 300);
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
		lblPregunta.setBounds(10, 38, 626, 14);
		contentPane.add(lblPregunta);
		
		
		JRadioButton radOpcionA = new JRadioButton("");
		radOpcionA.setBounds(21, 96, 533, 23);
		contentPane.add(radOpcionA);
		
		JRadioButton radOpcionB = new JRadioButton("");
		radOpcionB.setBounds(21, 122, 533, 23);
		contentPane.add(radOpcionB);
		
		JRadioButton radOpcionC = new JRadioButton("");
		radOpcionC.setBounds(21, 149, 533, 23);
		contentPane.add(radOpcionC);
		ButtonGroup radOpciones = new ButtonGroup();
		radOpciones.add(radOpcionA);
		radOpciones.add(radOpcionB);
		radOpciones.add(radOpcionC);
		
		
		
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnSiguiente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {	
				i++;
				switch(i) {
				case 0:
				lblPregunta.setText(Preguntas[1]);
				radOpcionA.setText(RespuestasPregunta2[0]);
				radOpcionB.setText(RespuestasPregunta2[1]);
				radOpcionC.setText(RespuestasPregunta2[2]);
				if(radOpcionB.isSelected()) {
				Respuestas[0]="b";
				}else {
				Respuestas[0]="d";
				}
				radOpciones.clearSelection();
				break;
				case 1:
				lblPregunta.setText(Preguntas[2]);
				radOpcionA.setText(RespuestasPregunta3[0]);
				radOpcionB.setText(RespuestasPregunta3[1]);
				radOpcionC.setText(RespuestasPregunta3[2]);
				if(radOpcionA.isSelected()) {
				Respuestas[1]="a";
				}else {
				Respuestas[1]="d";
				}
				radOpciones.clearSelection();
				break;
				case 2:
				lblPregunta.setText(Preguntas[3]);
				radOpcionA.setText(RespuestasPregunta4[0]);
				radOpcionB.setText(RespuestasPregunta4[1]);
				radOpcionC.setText(RespuestasPregunta4[2]);
				if(radOpcionC.isSelected()) {
				Respuestas[2]="c";
				}else {
				Respuestas[2]="d";
				}
				radOpciones.clearSelection();
				break;
				case 3:
				lblPregunta.setText(Preguntas[4]);
				radOpcionA.setText(RespuestasPregunta5[0]);
				radOpcionB.setText(RespuestasPregunta5[1]);
				radOpcionC.setText(RespuestasPregunta5[2]);
				if(radOpcionC.isSelected()) {
				Respuestas[3]="c";
				}else {
				Respuestas[3]="d";
				}
				radOpciones.clearSelection();
				break;
				case 4:
				if(radOpcionC.isSelected()) {
				Respuestas[4]="c";
				}else {
				Respuestas[4]="d";
				}
				JOptionPane.showMessageDialog(null, "No hay mas Preguntas!!!");
				break;
				default: i--;
				break;
				}
				
			}
		});
		btnSiguiente.setBounds(151, 227, 102, 23);
		contentPane.add(btnSiguiente);
		
		btnEvaluar = new JButton("Evaluar");
		btnEvaluar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int Total=0;
				if(Respuestas[0]=="b") {
				Total++;
				}
				if(Respuestas[1]=="a") {
				Total++;
				}
				if(Respuestas[2]=="c") {
				Total++;
				}
				if(Respuestas[3]=="c") {
				Total++;
				}
				if(Respuestas[4]=="c") {
				Total++;
				}
				JOptionPane.showMessageDialog(null, "Score: "+Total+"/5");
			
			}
		});
		btnEvaluar.setBounds(263, 227, 291, 23);
		contentPane.add(btnEvaluar);
		
		btnAnterior = new JButton("Anterior");
		btnAnterior.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				i--;
				switch(i) {
				case -1:
				lblPregunta.setText(Preguntas[0]);
				radOpcionA.setText(RespuestasPregunta1[0]);
				radOpcionB.setText(RespuestasPregunta1[1]);
				radOpcionC.setText(RespuestasPregunta1[2]);
				break;
				case 0:
				lblPregunta.setText(Preguntas[1]);
				radOpcionA.setText(RespuestasPregunta2[0]);
				radOpcionB.setText(RespuestasPregunta2[1]);
				radOpcionC.setText(RespuestasPregunta2[2]);
				radOpciones.clearSelection();
				break;
				case 1:
				lblPregunta.setText(Preguntas[2]);
				radOpcionA.setText(RespuestasPregunta3[0]);
				radOpcionB.setText(RespuestasPregunta3[1]);
				radOpcionC.setText(RespuestasPregunta3[2]);
				radOpciones.clearSelection();
				break;
				case 2:
				lblPregunta.setText(Preguntas[3]);
				radOpcionA.setText(RespuestasPregunta4[0]);
				radOpcionB.setText(RespuestasPregunta4[1]);
				radOpcionC.setText(RespuestasPregunta4[2]);
				radOpciones.clearSelection();
				break;
				case 3:
				lblPregunta.setText(Preguntas[4]);
				radOpcionA.setText(RespuestasPregunta5[0]);
				radOpcionB.setText(RespuestasPregunta5[1]);
				radOpcionC.setText(RespuestasPregunta5[2]);
				radOpciones.clearSelection();
				break;
				default:
				i++;
				JOptionPane.showMessageDialog(null, "No hay mas Preguntas!!!");
				break;
				}			
			
			}
		});
		btnAnterior.setBounds(21, 227, 109, 23);
		contentPane.add(btnAnterior);
		
		lblPregunta.setText(Preguntas[0]);
			radOpcionA.setText(RespuestasPregunta1[0]);
			radOpcionB.setText(RespuestasPregunta1[1]);
			radOpcionC.setText(RespuestasPregunta1[2]);
			
			
			
		
			
		    
			
			
			
		
	}

}
