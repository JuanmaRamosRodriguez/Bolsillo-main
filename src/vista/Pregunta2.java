package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pregunta2 extends JFrame {

	private JPanel contentPane;

	public Pregunta2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAlemn = new JButton("Espa\u00F1ol");
		btnAlemn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Intermedio intermedio = new Intermedio();
				intermedio.setVisible(true);
				dispose();
			}
		});
		btnAlemn.setBounds(215, 117, 126, 27);
		contentPane.add(btnAlemn);
		
		JButton btnFrancs = new JButton("Franc\u00E9s");
		btnFrancs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Intermedio intermedio = new Intermedio();
				intermedio.setVisible(true);
				dispose();
			}
		});
		btnFrancs.setBounds(81, 155, 124, 27);
		contentPane.add(btnFrancs);
		
		JButton btnB = new JButton("Chino Mandar\u00EDn");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pregunta3 pregunta3 = new Pregunta3();
				pregunta3.setVisible(true);
				dispose();
			}
		});
		btnB.setBounds(215, 155, 126, 27);
		contentPane.add(btnB);
		
		JButton btnNewButton = new JButton("Ingl\u00E9s");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Intermedio intermedio = new Intermedio();
				intermedio.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(81, 117, 126, 27);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("\u00BFCu\u00E1l es el idioma m\u00E1s hablado del mundo?");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setBounds(44, 66, 331, 27);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel labelFondo = new JLabel("");
		labelFondo.setIcon(new ImageIcon("imagenes\\pisarradoramio (2).png"));
		labelFondo.setBounds(0, 0, 484, 261);
		contentPane.add(labelFondo);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("imagenes\\clase.jpg"));
		lblNewLabel_1.setBounds(0, 0, 484, 261);
		contentPane.add(lblNewLabel_1);
	}

}
