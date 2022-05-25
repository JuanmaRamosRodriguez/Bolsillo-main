package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Window;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pregunta3 extends JFrame {

	private JPanel contentPane;

	public Pregunta3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnChewbbaca = new JButton("Chewbbaca");
		btnChewbbaca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Intermedio intermedio = new Intermedio();
				intermedio.setVisible(true);
				dispose();
			}
		});
		btnChewbbaca.setBounds(209, 169, 111, 26);
		contentPane.add(btnChewbbaca);
		
		JButton btnShubbaca = new JButton("Xiwaka");
		btnShubbaca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Intermedio intermedio = new Intermedio();
				intermedio.setVisible(true);
				dispose();
			}
		});
		btnShubbaca.setBounds(209, 133, 111, 25);
		contentPane.add(btnShubbaca);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("imagenes\\chewbacca.jpg"));
		lblNewLabel_2.setBounds(155, 61, 100, 61);
		contentPane.add(lblNewLabel_2);
		
		JButton botonVerdadero = new JButton("Chewvacca");
		botonVerdadero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Intermedio intermedio = new Intermedio();
				intermedio.setVisible(true);
				dispose();
			}
		});
		botonVerdadero.setBounds(81, 132, 106, 26);
		contentPane.add(botonVerdadero);
		
		JButton botonFalso = new JButton("Chewbacca");
		botonFalso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pregunta4 pregunta4 = new Pregunta4();
				pregunta4.setVisible(true);
				dispose();
			}
		});
		botonFalso.setBounds(81, 169, 106, 26);
		contentPane.add(botonFalso);
		
		JLabel labelPreguntaUno = new JLabel("\u00BFC\u00F3mo se escribe el nombre de este ser?");
		labelPreguntaUno.setForeground(Color.WHITE);
		labelPreguntaUno.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		labelPreguntaUno.setBounds(71, 37, 300, 26);
		contentPane.add(labelPreguntaUno);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("imagenes\\pisarradoramio (2).png"));
		lblNewLabel_1.setBounds(0, 11, 484, 228);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("imagenes\\clase.jpg"));
		lblNewLabel.setBounds(0, 0, 484, 261);
		contentPane.add(lblNewLabel);
	}
}
