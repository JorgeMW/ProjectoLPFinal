import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Inserir {

	private JFrame frame;
	private JTextField tFID;
	private JTextField tFNome;
	private JTextField tFMorada;
	private JTextField tFNIF;
	private JTextField tFEstadoCivil;
	private JTextField tFEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inserir window = new Inserir();
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
	public Inserir() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 285, 323);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("ID:");
		label.setBounds(52, 49, 35, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Nome:");
		label_1.setBounds(35, 77, 52, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Morada:");
		label_2.setBounds(27, 105, 60, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("NIF:");
		label_3.setBounds(44, 130, 43, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Estado civil:");
		label_4.setBounds(10, 158, 77, 14);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("E-Mail:");
		label_5.setBounds(35, 183, 52, 14);
		frame.getContentPane().add(label_5);
		
		tFID = new JTextField();
		tFID.setBounds(78, 46, 153, 20);
		frame.getContentPane().add(tFID);
		tFID.setColumns(10);
		
		tFNome = new JTextField();
		tFNome.setBounds(78, 74, 153, 20);
		frame.getContentPane().add(tFNome);
		tFNome.setColumns(10);
		
		tFMorada = new JTextField();
		tFMorada.setBounds(78, 102, 153, 20);
		frame.getContentPane().add(tFMorada);
		tFMorada.setColumns(10);
		
		tFNIF = new JTextField();
		tFNIF.setBounds(78, 130, 153, 20);
		frame.getContentPane().add(tFNIF);
		tFNIF.setColumns(10);
		
		tFEstadoCivil = new JTextField();
		tFEstadoCivil.setBounds(78, 155, 153, 20);
		frame.getContentPane().add(tFEstadoCivil);
		tFEstadoCivil.setColumns(10);
		
		tFEmail = new JTextField();
		tFEmail.setBounds(78, 183, 153, 20);
		frame.getContentPane().add(tFEmail);
		tFEmail.setColumns(10);
		
		JLabel lblAdicionarUtilizador = new JLabel("Adicionar Utilizador");
		lblAdicionarUtilizador.setBounds(106, 21, 153, 14);
		frame.getContentPane().add(lblAdicionarUtilizador);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(142, 213, 89, 23);
		frame.getContentPane().add(btnAdicionar);
	}
}
