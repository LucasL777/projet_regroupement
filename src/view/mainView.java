package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class mainView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public mainView() {
		System.out.println("*main view launched*");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 668, 422);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Shifumi");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("*main view closed*");
				setVisible(false);
				shifumiRulesView frame = new shifumiRulesView();
			}
		});
		btnNewButton.setBounds(46, 55, 238, 52);
		contentPane.add(btnNewButton);
		
		JButton btnDevineLeNombre = new JButton("Devine le nombre");
		btnDevineLeNombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("*main view closed*");
				setVisible(false);
				guessnombreRulesView frame = new guessnombreRulesView();
			}
		});
		btnDevineLeNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDevineLeNombre.setBounds(46, 154, 238, 52);
		contentPane.add(btnDevineLeNombre);
		
		JButton btnCalculatrice = new JButton("Calculatrice");
		btnCalculatrice.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCalculatrice.setBounds(373, 55, 238, 52);
		btnCalculatrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("*main view closed*");
				setVisible(false);
				calculatorView frame = new calculatorView();
			}
		});
		contentPane.add(btnCalculatrice);
	}
}
