import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class AltRelacao {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AltRelacao window = new AltRelacao();
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
	public AltRelacao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 581, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUtilizadorActual = new JLabel("Utilizador Actual:");
		lblUtilizadorActual.setBounds(10, 11, 88, 14);
		frame.getContentPane().add(lblUtilizadorActual);
		
		JLabel lblIdRelaoA = new JLabel("ID Rela\u00E7\u00E3o a alterar:");
		lblIdRelaoA.setBounds(10, 46, 118, 14);
		frame.getContentPane().add(lblIdRelaoA);
		
		textField = new JTextField();
		textField.setBounds(127, 43, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(9, 227, 89, 23);
		frame.getContentPane().add(btnCancelar);
		
		JButton btnAlterarRelao = new JButton("Alterar Rela\u00E7\u00E3o");
		btnAlterarRelao.setBounds(108, 227, 133, 23);
		frame.getContentPane().add(btnAlterarRelao);
		
		JButton btnRemoverRelao = new JButton("Remover Rela\u00E7\u00E3o");
		btnRemoverRelao.setBounds(262, 227, 133, 23);
		frame.getContentPane().add(btnRemoverRelao);
		
		JScrollPane scrollPane1 = new JScrollPane();
		scrollPane1.setBounds(10, 71, 152, 133);
		frame.getContentPane().add(scrollPane1);
		
		JScrollPane scrollPane2 = new JScrollPane();
		scrollPane2.setBounds(171, 71, 152, 133);
		frame.getContentPane().add(scrollPane2);
		
		JScrollPane scrollPane3 = new JScrollPane();
		scrollPane3.setBounds(333, 71, 152, 133);
		frame.getContentPane().add(scrollPane3);
	}
}
