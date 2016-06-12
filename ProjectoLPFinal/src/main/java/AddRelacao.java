import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class AddRelacao {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddRelacao window = new AddRelacao();
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
	public AddRelacao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 466, 237);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel.setBounds(10, 51, 106, 105);
		frame.getContentPane().add(panel);
		
		JRadioButton rdbtnProfissional = new JRadioButton("Profissional");
		panel.add(rdbtnProfissional);
		
		JRadioButton rdbtnFamilia = new JRadioButton("Familia");
		panel.add(rdbtnFamilia);
		
		JRadioButton rdbtnAmigo = new JRadioButton("Amigo");
		panel.add(rdbtnAmigo);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_1.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel_1.setBounds(126, 54, 44, 86);
		frame.getContentPane().add(panel_1);
		
		JRadioButton radioButton_2 = new JRadioButton("1");
		panel_1.add(radioButton_2);
		
		JRadioButton radioButton_1 = new JRadioButton("2");
		panel_1.add(radioButton_1);
		
		JRadioButton radioButton = new JRadioButton("3");
		panel_1.add(radioButton);
		
		textField = new JTextField();
		textField.setBounds(183, 86, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(180, 117, 89, 23);
		frame.getContentPane().add(btnAdicionar);
		
		JLabel lblNomeUtilizador = new JLabel("Nome Utilizador:");
		lblNomeUtilizador.setBounds(183, 61, 106, 14);
		frame.getContentPane().add(lblNomeUtilizador);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setBounds(10, 35, 46, 14);
		frame.getContentPane().add(lblTipo);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setBounds(124, 35, 46, 14);
		frame.getContentPane().add(lblPeso);
		
		JLabel lblUtilizador = new JLabel("Utilizador");
		lblUtilizador.setBounds(106, 11, 193, 14);
		frame.getContentPane().add(lblUtilizador);
		
		JLabel lblUtilizadorAtual = new JLabel("Utilizador Atual:");
		lblUtilizadorAtual.setBounds(10, 11, 106, 14);
		frame.getContentPane().add(lblUtilizadorAtual);
	}
}
