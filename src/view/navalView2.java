package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import controller.navalController;

public class navalView2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblMessage;
	private navalController controller;

	public navalView2(Set<String> positionsJoueur) {

		controller = new navalController(positionsJoueur);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 429);
		setVisible(true);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnQuitter.setBounds(10, 341, 119, 41);
		btnQuitter.setVisible(false);
		btnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("*bataille naval view2 closed*");
				setVisible(false);
				mainView frame = new mainView();
			}
		});
		contentPane.add(btnQuitter);

		JLabel lblTitre = new JLabel("Bataille Navale - Tour du joueur");
		lblTitre.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTitre.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitre.setBounds(100, 10, 450, 46);
		contentPane.add(lblTitre);
		

		lblMessage = new JLabel("");
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMessage.setBounds(205, 319, 370, 30);
		contentPane.add(lblMessage);

		char ligne = 'A';
		int y = 100;

		for(int i = 0; i < 6; i++) {

			int x = 250;

			for(int j = 1; j <= 6; j++) {

				String position = "" + ligne + j;

				JButton btn = new JButton("");
				btn.setBounds(x, y, 45, 30);

				btn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if(!controller.isTourJoueur()) return;

						String resultat = controller.tirJoueur(position);

						if(resultat.equals("Touché")) {
							btn.setText("X");
						} else if(resultat.equals("Raté")) {
							btn.setText("O");
						}

						btn.setEnabled(false);
						lblMessage.setText(resultat);

						if(controller.victoireJoueur()) {
							lblMessage.setText("Victoire du joueur !");
							btnQuitter.setVisible(true);
						}

						// Tour de l'ordi
						String tirOrdi = controller.tirOrdi();
						lblMessage.setText(lblMessage.getText() + " | " + tirOrdi);

						if(controller.victoireOrdi()) {
							lblMessage.setText("L'ordinateur a gagné !");
							btnQuitter.setVisible(true);
						}
					}
				});

				contentPane.add(btn);
				x += 50;
			}

			ligne++;
			y += 35;
		}
	}
}
