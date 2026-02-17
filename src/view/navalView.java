package view;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.JCheckBox;
import javax.swing.JButton;


import java.util.HashSet;
import java.util.Set;


public class navalView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private int NBNavire = 11;
	private Set<String> positions = new HashSet<>();


	public navalView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 429);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Place tes navires");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(160, 10, 324, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Navires restants : " + NBNavire);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 76, 195, 38);
		contentPane.add(lblNewLabel_1);
		
		JCheckBox A1 = new JCheckBox("");
		A1.setBounds(250, 124, 21, 21);
		A1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(A1.isSelected()) {
					NBNavire -=1;
					positions.add("A1");
				}else {
					NBNavire += 1;
					positions.remove("A1");
				}
				lblNewLabel_1.setText("Navires restants : " + NBNavire);
			}
		});
		contentPane.add(A1);
		
		JCheckBox A2 = new JCheckBox("");
		A2.setBounds(273, 124, 21, 21);
		A2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(A2.isSelected()) {
					NBNavire -=1;
					positions.add("A2");
				}else {
					NBNavire += 1;
					positions.remove("A2");
				}
				lblNewLabel_1.setText("Navires restants : " + NBNavire);
			}
		});
		contentPane.add(A2);
		
		JCheckBox A3 = new JCheckBox("");
		A3.setBounds(296, 124, 21, 21);
		A3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(A3.isSelected()) {
					NBNavire -= 1;
					positions.add("A3");
				}else {
					NBNavire +=1;
					positions.remove("A3");
				}
				lblNewLabel_1.setText("Navires restants : " + NBNavire);
			}
		});
		contentPane.add(A3);
		
		JCheckBox A4 = new JCheckBox("");
		A4.setBounds(319, 124, 21, 21);
		A4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(A4.isSelected()) {
					NBNavire -=1;
					positions.add("A4");
				}else {
					NBNavire += 1;
					positions.remove("A4");
				}
				lblNewLabel_1.setText("Navires restants : " + NBNavire);
			}
		});
		contentPane.add(A4);
		
		JCheckBox A5 = new JCheckBox("");
		A5.setBounds(342, 124, 21, 21);
		A5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(A5.isSelected()) {
					NBNavire -=1;
					positions.add("A5");
				}else {
					NBNavire += 1;
					positions.remove("A5");
				}
				lblNewLabel_1.setText("Navires restants : " + NBNavire);
			}
		});
		contentPane.add(A5);
		
		JCheckBox A6 = new JCheckBox("");
		A6.setBounds(365, 124, 21, 21);
		A6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(A6.isSelected()) {
					NBNavire -=1;
					positions.add("A6");
				}else {
					NBNavire += 1;
					positions.remove("A6");
				}
				lblNewLabel_1.setText("Navires restants : " + NBNavire);
			}
		});
		contentPane.add(A6);
		
		JCheckBox B1 = new JCheckBox("");
		B1.setBounds(250, 147, 21, 21);
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(B1.isSelected()) {
					NBNavire -=1;
					positions.add("B1");
				}else {
					NBNavire += 1;
					positions.remove("B1");
				}
				lblNewLabel_1.setText("Navires restants : " + NBNavire);
			}
		});
		contentPane.add(B1);
		
		JCheckBox B2 = new JCheckBox("");
		B2.setBounds(273, 147, 21, 21);
		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(B2.isSelected()) {
					NBNavire -=1;
					positions.add("B2");
				}else {
					NBNavire += 1;
					positions.remove("B2");
				}
				lblNewLabel_1.setText("Navires restants : " + NBNavire);
			}
		});
		contentPane.add(B2);
		
		JCheckBox B3 = new JCheckBox("");
		B3.setBounds(296, 147, 21, 21);
		B3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(B3.isSelected()) {
					NBNavire -=1;
					positions.add("B3");
				}else {
					NBNavire += 1;
					positions.remove("B3");
				}
				lblNewLabel_1.setText("Navires restants : " + NBNavire);
			}
		});
		contentPane.add(B3);
		
		JCheckBox B4 = new JCheckBox("");
		B4.setBounds(319, 147, 21, 21);
		B4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(B4.isSelected()) {
					NBNavire -=1;
					positions.add("B4");
				}else {
					NBNavire += 1;
					positions.remove("B4");
				}
				lblNewLabel_1.setText("Navires restants : " + NBNavire);
			}
		});
		contentPane.add(B4);
		
		JCheckBox B5 = new JCheckBox("");
		B5.setBounds(342, 147, 21, 21);
		B5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(B5.isSelected()) {
					NBNavire -=1;
					positions.add("B5");
				}else {
					NBNavire += 1;
					positions.remove("B5");
				}
				lblNewLabel_1.setText("Navires restants : " + NBNavire);
			}
		});
		contentPane.add(B5);
		
		JCheckBox B6 = new JCheckBox("");
		B6.setBounds(365, 147, 21, 21);
		B6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(B6.isSelected()) {
					NBNavire -=1;
					positions.add("B6");
				}else {
					NBNavire += 1;
					positions.remove("B6");
				}
				lblNewLabel_1.setText("Navires restants : " + NBNavire);
			}
		});
		contentPane.add(B6);
		
		JCheckBox C1 = new JCheckBox("");
		C1.setBounds(250, 170, 21, 21);
		C1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(C1.isSelected()) {
					NBNavire -=1;
					positions.add("C1");
				}else {
					NBNavire += 1;
					positions.remove("C1");
				}
				lblNewLabel_1.setText("Navires restants : " + NBNavire);
			}
		});
		contentPane.add(C1);
		
		JCheckBox C2 = new JCheckBox("");
		C2.setBounds(273, 170, 21, 21);
		C2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(C2.isSelected()) {
					NBNavire -=1;
					positions.add("C2");
				}else {
					NBNavire += 1;
					positions.remove("C2");
				}
				lblNewLabel_1.setText("Navires restants : " + NBNavire);
			}
		});
		contentPane.add(C2);
		
		JCheckBox C3 = new JCheckBox("");
		C3.setBounds(296, 170, 21, 21);
		C3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(C3.isSelected()) {
					NBNavire -=1;
					positions.add("C3");
				}else {
					NBNavire += 1;
					positions.remove("C3");
				}
				lblNewLabel_1.setText("Navires restants : " + NBNavire);
			}
		});
		contentPane.add(C3);
		
		JCheckBox C4 = new JCheckBox("");
		C4.setBounds(319, 170, 21, 21);
		C4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(C4.isSelected()) {
					NBNavire -=1;
					positions.add("C4");
				}else {
					NBNavire += 1;
					positions.remove("C4");
				}
				lblNewLabel_1.setText("Navires restants : " + NBNavire);
			}
		});
		contentPane.add(C4);
		
		JCheckBox C5 = new JCheckBox("");
		C5.setBounds(342, 170, 21, 21);
		C5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(C5.isSelected()) {
					NBNavire -=1;
					positions.add("C5");
				}else {
					NBNavire += 1;
					positions.remove("C5");
				}
				lblNewLabel_1.setText("Navires restants : " + NBNavire);
			}
		});
		contentPane.add(C5);
		
		JCheckBox C6 = new JCheckBox("");
		C6.setBounds(365, 170, 21, 21);
		C6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(C6.isSelected()) {
					NBNavire -=1;
					positions.add("C6");
				}else {
					NBNavire += 1;
					positions.remove("C6");
				}
				lblNewLabel_1.setText("Navires restants : " + NBNavire);
			}
		});
		contentPane.add(C6);
		
		JCheckBox D1 = new JCheckBox("");
		D1.setBounds(250, 193, 21, 21);
		D1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(D1.isSelected()) {
					NBNavire -=1;
					positions.add("D1");
				}else {
					NBNavire += 1;
					positions.remove("D1");
				}
				lblNewLabel_1.setText("Navires restants : " + NBNavire);
			}
		});
		contentPane.add(D1);
		
		JCheckBox D2 = new JCheckBox("");
		D2.setBounds(273, 193, 21, 21);
		D2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(D2.isSelected()) {
					NBNavire -=1;
					positions.add("D2");
				}else {
					NBNavire += 1;
					positions.remove("D2");
				}
				lblNewLabel_1.setText("Navires restants : " + NBNavire);
			}
		});
		contentPane.add(D2);
		
		JCheckBox D3 = new JCheckBox("");
		D3.setBounds(296, 193, 21, 21);
		D3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(D3.isSelected()) {
					NBNavire -=1;
					positions.add("D3");
				}else {
					NBNavire += 1;
					positions.remove("D3");
				}
				lblNewLabel_1.setText("Navires restants : " + NBNavire);
			}
		});
		contentPane.add(D3);
		
		JCheckBox D4 = new JCheckBox("");
		D4.setBounds(319, 193, 21, 21);
		D4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(D4.isSelected()) {
					NBNavire -=1;
					positions.add("D4");
				}else {
					NBNavire += 1;
					positions.remove("D4");
				}
				lblNewLabel_1.setText("Navires restants : " + NBNavire);
			}
		});
		contentPane.add(D4);
		
		JCheckBox D5 = new JCheckBox("");
		D5.setBounds(342, 193, 21, 21);
		D5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(D5.isSelected()) {
					NBNavire -=1;
					positions.add("D5");
				}else {
					NBNavire += 1;
					positions.remove("D5");
				}
				lblNewLabel_1.setText("Navires restants : " + NBNavire);
			}
		});
		contentPane.add(D5);
		
		JCheckBox D6 = new JCheckBox("");
		D6.setBounds(365, 193, 21, 21);
		D6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(D6.isSelected()) {
					NBNavire -=1;
					positions.add("D6");
				}else {
					NBNavire += 1;
					positions.remove("D6");
				}
				lblNewLabel_1.setText("Navires restants : " + NBNavire);
			}
		});
		contentPane.add(D6);
		
		JCheckBox E1 = new JCheckBox("");
		E1.setBounds(250, 216, 21, 21);
		E1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(E1.isSelected()) {
					NBNavire -=1;
					positions.add("E1");
				}else {
					NBNavire += 1;
					positions.remove("E1");
				}
				lblNewLabel_1.setText("Navires restants : " + NBNavire);
			}
		});
		contentPane.add(E1);
		
		JCheckBox E2 = new JCheckBox("");
		E2.setBounds(273, 216, 21, 21);
		E2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(E2.isSelected()) {
					NBNavire -=1;
					positions.add("E2");
				}else {
					NBNavire += 1;
					positions.remove("E2");
				}
				lblNewLabel_1.setText("Navires restants : " + NBNavire);
			}
		});
		contentPane.add(E2);
		
		JCheckBox E3 = new JCheckBox("");
		E3.setBounds(296, 216, 21, 21);
		E3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(E3.isSelected()) {
					NBNavire -=1;
					positions.add("E3");
				}else {
					NBNavire += 1;
					positions.remove("E3");
				}
				lblNewLabel_1.setText("Navires restants : " + NBNavire);
			}
		});
		contentPane.add(E3);
		
		JCheckBox E4 = new JCheckBox("");
		E4.setBounds(319, 216, 21, 21);
		E4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(E4.isSelected()) {
					NBNavire -=1;
					positions.add("E4");
				}else {
					NBNavire += 1;
					positions.remove("E4");
				}
				lblNewLabel_1.setText("Navires restants : " + NBNavire);
			}
		});
		contentPane.add(E4);
		
		JCheckBox E5 = new JCheckBox("");
		E5.setBounds(342, 216, 21, 21);
		E5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(E5.isSelected()) {
					NBNavire -=1;
					positions.add("E5");
				}else {
					NBNavire += 1;
					positions.remove("E5");
				}
				lblNewLabel_1.setText("Navires restants : " + NBNavire);
			}
		});
		contentPane.add(E5);
		
		JCheckBox E6 = new JCheckBox("");
		E6.setBounds(365, 216, 21, 21);
		E6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(E6.isSelected()) {
					NBNavire -=1;
					positions.add("E6");
				}else {
					NBNavire += 1;
					positions.remove("E6");
				}
				lblNewLabel_1.setText("Navires restants : " + NBNavire);
			}
		});
		contentPane.add(E6);
		
		JCheckBox F1 = new JCheckBox("");
		F1.setBounds(250, 239, 21, 21);
		F1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(F1.isSelected()) {
					NBNavire -=1;
					positions.add("F1");
				}else {
					NBNavire += 1;
					positions.remove("F1");
				}
				lblNewLabel_1.setText("Navires restants : " + NBNavire);
			}
		});
		contentPane.add(F1);
		
		JCheckBox F2 = new JCheckBox("");
		F2.setBounds(273, 239, 21, 21);
		F2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(F2.isSelected()) {
					NBNavire -=1;
					positions.add("F2");
				}else {
					NBNavire += 1;
					positions.remove("F2");
				}
				lblNewLabel_1.setText("Navires restants : " + NBNavire);
			}
		});
		contentPane.add(F2);
		
		JCheckBox F3 = new JCheckBox("");
		F3.setBounds(296, 239, 21, 21);
		F3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(F3.isSelected()) {
					NBNavire -=1;
					positions.add("F3");
				}else {
					NBNavire += 1;
					positions.remove("F3");
				}
				lblNewLabel_1.setText("Navires restants : " + NBNavire);
			}
		});
		contentPane.add(F3);
		
		JCheckBox F4 = new JCheckBox("");
		F4.setBounds(319, 239, 21, 21);
		F4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(F4.isSelected()) {
					NBNavire -=1;
					positions.add("F4");
				}else {
					NBNavire += 1;
					positions.remove("F4");
				}
				lblNewLabel_1.setText("Navires restants : " + NBNavire);
			}
		});
		contentPane.add(F4);
		
		JCheckBox F5 = new JCheckBox("");
		F5.setBounds(342, 239, 21, 21);
		F5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(F5.isSelected()) {
					NBNavire -=1;
					positions.add("F5");
				}else {
					NBNavire += 1;
					positions.remove("F5");
				}
				lblNewLabel_1.setText("Navires restants : " + NBNavire);
			}
		});
		contentPane.add(F5);
		
		JCheckBox F6 = new JCheckBox("");
		F6.setBounds(365, 239, 21, 21);
		F6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(F6.isSelected()) {
					NBNavire -=1;
					positions.add("F6");
				}else {
					NBNavire += 1;
					positions.remove("F6");
				}
				lblNewLabel_1.setText("Navires restants : " + NBNavire);
			}
		});
		contentPane.add(F6);
		
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(250, 295, 136, 46);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(NBNavire > 0) {
					lblNewLabel.setText("Il vous reste des navires");
				}else if(NBNavire < 0) {
					lblNewLabel.setText("Il y a trop de navires");
				}else if(NBNavire == 0) {
					setVisible(false);
					navalView2 frame = new navalView2(positions);
				}
				
			}
		});
		contentPane.add(btnNewButton);

		
		
	}
}
