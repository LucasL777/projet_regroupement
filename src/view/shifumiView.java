package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.shifumiController;

import javax.swing.JButton;
import javax.swing.SwingConstants;

public class shifumiView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private int score_player = 0;
	private int score_computer = 0;
	private int player; 
	private int computer;

	/**
	 * Create the frame.
	 */
	public shifumiView() {
		System.out.println("*shifumi view launched*");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 429);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		score_player = 0;
		score_computer = 0;

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPlayer = new JLabel("Player : 0");
		lblPlayer.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblPlayer.setBounds(521, 10, 120, 38);
		contentPane.add(lblPlayer);
		
		JLabel lblComputer = new JLabel("Computer : 0");
		lblComputer.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblComputer.setBounds(0, 10, 167, 38);
		contentPane.add(lblComputer);
		
		JLabel lblNewLabel_1 = new JLabel("Partie en cours...");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(161, 98, 326, 44);
		contentPane.add(lblNewLabel_1);
		
		JButton btnRock = new JButton("Rock");
		btnRock.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRock.setBounds(119, 189, 120, 54);
		btnRock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					player = shifumiController.rock();
					computer = shifumiController.computerChoice();
					int winner = shifumiController.compare(player, computer);
					if(winner == 1) {
						lblNewLabel_1.setText("Le joueur gagne.");
						score_player += 1;
						lblPlayer.setText("Player : " + String.valueOf(score_player));
					}else if(winner == 2) {
						lblNewLabel_1.setText("L'ordinateur gagne.");
						score_computer += 1;
						lblComputer.setText("Computer : " + String.valueOf(score_computer));
					}else {
						lblNewLabel_1.setText("Egalité.");
					}
					Thread.sleep(2000);
					lblNewLabel_1.setText(shifumiController.result(score_player, score_computer));
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		contentPane.add(btnRock);
		
		JButton btnPaper = new JButton("Paper");
		btnPaper.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPaper.setBounds(259, 189, 120, 54);
		btnPaper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					player = shifumiController.paper();
					computer = shifumiController.computerChoice();
					int winner = shifumiController.compare(player, computer);
					if(winner == 1) {
						lblNewLabel_1.setText("Le joueur gagne.");
						score_player += 1;
						lblPlayer.setText("Player : " + String.valueOf(score_player));
					}else if(winner == 2) {
						lblNewLabel_1.setText("L'ordinateur gagne.");
						score_computer += 1;
						lblComputer.setText("Computer : " + String.valueOf(score_computer));
					}
					else {
						lblNewLabel_1.setText("Egalité.");
					}
					Thread.sleep(2000);
					lblNewLabel_1.setText(shifumiController.result(score_player, score_computer));
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		contentPane.add(btnPaper);
		
		JButton btnScissors = new JButton("Scissors");
		btnScissors.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnScissors.setBounds(401, 189, 120, 54);
		btnScissors.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					player = shifumiController.scissors();
					computer = shifumiController.computerChoice();
					int winner = shifumiController.compare(player, computer);
					if(winner == 1) {
						lblNewLabel_1.setText("Le joueur gagne.");
						score_player += 1;
						lblPlayer.setText("Player : " + String.valueOf(score_player));
					}else if(winner == 2) {
						lblNewLabel_1.setText("L'ordinateur gagne.");
						score_computer += 1;
						lblComputer.setText("Computer : " + String.valueOf(score_computer));
					}
					else {
						lblNewLabel_1.setText("Egalité.");
					}
					Thread.sleep(2000);
					lblNewLabel_1.setText(shifumiController.result(score_player, score_computer));
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		contentPane.add(btnScissors);
		
	}
}
