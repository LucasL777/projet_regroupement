package view;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;

import controller.calculatorController;

public class calculatorView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nb1;
	private JTextField nb2;


	public calculatorView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 668, 422);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculatrice");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(212, 10, 225, 31);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Quitter");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(10, 339, 105, 36);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("*calculator view closed*");
				setVisible(false);
				mainView frame = new mainView();
			}
		});
		contentPane.add(btnNewButton);
		
		JLabel lblErreur = new JLabel("");
		lblErreur.setHorizontalAlignment(SwingConstants.CENTER);
		lblErreur.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblErreur.setBounds(132, 298, 366, 31);
		contentPane.add(lblErreur);
		
		JLabel ope = new JLabel("");
		ope.setHorizontalAlignment(SwingConstants.CENTER);
		ope.setFont(new Font("Tahoma", Font.PLAIN, 25));
		ope.setBounds(227, 106, 51, 50);
		contentPane.add(ope);
		
		JLabel res = new JLabel("");
		res.setFont(new Font("Tahoma", Font.PLAIN, 16));
		res.setBounds(521, 106, 51, 50);
		contentPane.add(res);
		
		nb1 = new JTextField();
		nb1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nb1.setHorizontalAlignment(SwingConstants.CENTER);
		nb1.setBounds(59, 105, 158, 50);
		contentPane.add(nb1);
		nb1.setColumns(10);
		
		nb2 = new JTextField();
		nb2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nb2.setHorizontalAlignment(SwingConstants.CENTER);
		nb2.setColumns(10);
		nb2.setBounds(288, 105, 158, 50);
		contentPane.add(nb2);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAdd.setBounds(132, 215, 85, 31);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ope.setText(btnAdd.getText());
			}
		});
		contentPane.add(btnAdd);
		
		JButton btnSous = new JButton("-");
		btnSous.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSous.setBounds(227, 215, 85, 31);
		btnSous.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ope.setText(btnSous.getText());
			}
		});
		contentPane.add(btnSous);
		
		JButton btnMult = new JButton("x");
		btnMult.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnMult.setBounds(322, 215, 85, 31);
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ope.setText(btnMult.getText());
			}
		});
		contentPane.add(btnMult);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDiv.setBounds(413, 215, 85, 31);
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ope.setText(btnDiv.getText());
			}
		});
		contentPane.add(btnDiv);
		
		JButton btnRes = new JButton("=");
		btnRes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRes.setBounds(456, 106, 51, 50);
		btnRes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (nb1.getText() == null || nb1.getText().isEmpty() ||
				        nb2.getText() == null || nb2.getText().isEmpty()) {
				        lblErreur.setText("Veuillez remplir les deux nombres !");
				        return; 
				    }
				if(ope.getText()=="+") {
					double ret = calculatorController.addition(Double.parseDouble(nb1.getText()), Double.parseDouble(nb2.getText()));
					res.setText(String.valueOf(ret));
					lblErreur.setText("");
				}else if(ope.getText()=="-") {
					double ret = calculatorController.soustraction(Double.parseDouble(nb1.getText()), Double.parseDouble(nb2.getText()));
					res.setText(String.valueOf(ret));
					lblErreur.setText("");
				}else if(ope.getText()=="x") {
					double ret = calculatorController.multiplication(Double.parseDouble(nb1.getText()), Double.parseDouble(nb2.getText()));
					res.setText(String.valueOf(ret));
					lblErreur.setText("");
				}else if(ope.getText()=="/"){
					double ret = calculatorController.division(Double.parseDouble(nb1.getText()), Double.parseDouble(nb2.getText()));
					res.setText(String.valueOf(ret));
					lblErreur.setText("");
				}else {
					lblErreur.setText("Aucun opérateur choisi");
					return;
				}
				
			}
		});
		contentPane.add(btnRes);
		
		
		
		
	}
}
