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

public class navalRulesView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	
	public navalRulesView() {
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
				navalView frame = new navalView();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(275, 329, 108, 39);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Bataille navale");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(215, 10, 220, 67);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel2 = new JLabel("Nb joueur : 2 (joueur + ordinateur)");
		lblNewLabel2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel2.setBounds(170, 75, 342, 39);
		contentPane.add(lblNewLabel2);
		
		JLabel lblNewLabel3 = new JLabel("Chaque joueur place simultanément ses navires sur une grille.");
		lblNewLabel3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel3.setBounds(28, 124, 599, 53);
		contentPane.add(lblNewLabel3);
		
		JLabel lblNewLabel4 = new JLabel("Tu dois trouver les navires adverses pour gagner.");
		lblNewLabel4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel4.setBounds(65, 171, 509, 53);
		contentPane.add(lblNewLabel4);
		
		JLabel lblNewLabel5 = new JLabel("Si tous tes navires coulent, tu as perdu.");
		lblNewLabel5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel5.setBounds(65, 211, 509, 53);
		contentPane.add(lblNewLabel5);
		
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
