package EjerciciosDeInterfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class PilaSwing extends JFrame {
	
	private JPanel contentPane;
	private JButton btnVerificar;
	private JTextField txtExpresion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PilaSwing frame = new PilaSwing();
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
	public PilaSwing() {
		setTitle("Gerardo Alberto Cruz Rojo 19100163");
		setAutoRequestFocus(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnVerificar = new JButton("Verificar");
		btnVerificar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Stack<String> varPila = new Stack<String>();
				String expresion= " ";
				char varCaracter=' ';
				int flagError=0;
				
				expresion= txtExpresion.getText();
				for(int x=0; x<expresion.length();x++) {
					varCaracter= expresion.charAt(x);
					if(varCaracter=='(') {
						varPila.push("abre...");
					}
					if(varCaracter==')') {
						if(varPila.size()==0) {
							flagError=1;
							break;
						}else {
							varPila.pop();
						}
					}
					
				}
				if(varPila.isEmpty()&& flagError==0) {
					JOptionPane.showMessageDialog(null, "La expresion es Correcta");
					
				}else {
					JOptionPane.showMessageDialog(null,"La expresion es Incorrecta");
				}
				
			}
		});
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnVerificar.setBounds(310, 104, 89, 23);
		contentPane.add(btnVerificar);
		
		txtExpresion = new JTextField();
		txtExpresion.setBounds(25, 59, 203, 20);
		contentPane.add(txtExpresion);
		txtExpresion.setColumns(10);
	}
}
