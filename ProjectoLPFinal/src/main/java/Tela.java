import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Tela {

	private JFrame frame;
	private JTextField tFNome;
	private JTextField tFNIF;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela window = new Tela();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	public Tela() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 301);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPesquisarNome = new JLabel("Pesquisar Nome:");
		lblPesquisarNome.setBounds(10, 11, 120, 14);
		frame.getContentPane().add(lblPesquisarNome);
		
		tFNome = new JTextField();
		tFNome.setBounds(109, 8, 80, 20);
		frame.getContentPane().add(tFNome);
		tFNome.setColumns(10);
		
		JLabel lblPesquisarNif = new JLabel("Pesquisar NIF:");
		lblPesquisarNif.setBounds(206, 11, 100, 14);
		frame.getContentPane().add(lblPesquisarNif);
		
		tFNIF = new JTextField();
		tFNIF.setBounds(290, 8, 86, 20);
		frame.getContentPane().add(tFNIF);
		tFNIF.setColumns(10);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				
				
				
				
			}
		});
		btnPesquisar.setBounds(386, 7, 132, 23);
		frame.getContentPane().add(btnPesquisar);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(35, 77, 32, 14);
		frame.getContentPane().add(lblNome);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setBounds(52, 56, 15, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Morada:");
		lblNewLabel_1.setBounds(27, 98, 40, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NIF:");
		lblNewLabel_2.setBounds(44, 123, 23, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Estado civil:");
		lblNewLabel_3.setBounds(10, 148, 57, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblEmail = new JLabel("E-Mail:");
		lblEmail.setBounds(35, 173, 32, 14);
		frame.getContentPane().add(lblEmail);
		
		JLabel lID = new JLabel("ND");
		lID.setBounds(77, 56, 112, 14);
		frame.getContentPane().add(lID);
		
		JLabel lNome = new JLabel("ND");
		lNome.setBounds(77, 77, 112, 14);
		frame.getContentPane().add(lNome);
		
		JLabel lMorada = new JLabel("ND");
		lMorada.setBounds(77, 98, 112, 14);
		frame.getContentPane().add(lMorada);
		
		JLabel lNIF = new JLabel("ND");
		lNIF.setBounds(77, 123, 112, 14);
		frame.getContentPane().add(lNIF);
		
		JLabel lEstadoCivil = new JLabel("ND");
		lEstadoCivil.setBounds(77, 148, 112, 14);
		frame.getContentPane().add(lEstadoCivil);
		
		JLabel lEmail = new JLabel("ND");
		lEmail.setBounds(77, 173, 112, 14);
		frame.getContentPane().add(lEmail);
	}
}
