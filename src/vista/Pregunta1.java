package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pregunta1 extends JFrame {

	private JPanel contentPane;

	public Pregunta1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 100, 500, 299);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton botonRojo = new JButton("Rojo");
		botonRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Intermedio intermedio = new Intermedio();
				intermedio.setVisible(true);
				dispose();
			}
			
		});
		botonRojo.setBounds(213, 143, 89, 26);
		contentPane.add(botonRojo);
		
		JButton botonAmarillo = new JButton("Amarillo");
		botonAmarillo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pregunta2 pregunta2 = new Pregunta2();
				pregunta2.setVisible(true);
				dispose();
			}
			
			
		});
		botonAmarillo.setBounds(114, 108, 89, 27);
		contentPane.add(botonAmarillo);
		
		JButton botonAzul = new JButton("Azul");
		botonAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Intermedio intermedio = new Intermedio();
				intermedio.setVisible(true);
				dispose();
			}
		});
		botonAzul.setBounds(213, 108, 89, 27);
		contentPane.add(botonAzul);
		
		JButton botonVerde = new JButton("Verde");
		botonVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Intermedio intermedio = new Intermedio();
				intermedio.setVisible(true);
				dispose();
			}
		});
		botonVerde.setBounds(114, 143, 89, 26);
		contentPane.add(botonVerde);
		
		JLabel labelPregunta = new JLabel("\u00BFDe qu\u00E9 color era Doraemon originalmente?");
		labelPregunta.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		labelPregunta.setForeground(Color.WHITE);
		labelPregunta.setBounds(64, 58, 320, 27);
		contentPane.add(labelPregunta);
		
		JLabel lblFondo2 = new JLabel("");
		lblFondo2.setIcon(new ImageIcon("imagenes\\pisarradoramio (2).png"));
		lblFondo2.setBounds(0, 11, 484, 234);
		contentPane.add(lblFondo2);
		
		JLabel lblFondo1 = new JLabel("");
		lblFondo1.setIcon(new ImageIcon("imagenes\\clase.jpg"));
		lblFondo1.setBounds(0, 0, 484, 260);
		contentPane.add(lblFondo1);
	}
}
