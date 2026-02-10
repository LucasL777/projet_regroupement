package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class guessnombreRulesView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	
	public guessnombreRulesView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 429);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				guessnombreView frame = new guessnombreView();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(275, 329, 108, 39);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Devine le nombre");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(173, 10, 312, 67);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel2 = new JLabel("Nb joueur : 1");
		lblNewLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel2.setBounds(154, 85, 342, 39);
		contentPane.add(lblNewLabel2);
		
		JLabel lblNewLabel3 = new JLabel("Le joueur doit trouver un nombre.");
		lblNewLabel3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel3.setBounds(164, 133, 358, 53);
		contentPane.add(lblNewLabel3);
		
		JLabel lblNewLabel4 = new JLabel("L'ordinateur lui répond par 'plus grand' ou 'plus petit'.");
		lblNewLabel4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel4.setBounds(78, 196, 509, 53);
		contentPane.add(lblNewLabel4);
		
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnQuitter.setBounds(10, 329, 108, 39);
		btnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				mainView frame = new mainView();
			}
		});
		contentPane.add(btnQuitter);
	}

}
