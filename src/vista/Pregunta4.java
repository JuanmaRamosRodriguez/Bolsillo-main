package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pregunta4 extends JFrame {

	private JPanel contentPane;

	public Pregunta4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn4 = new JButton("11.2.11");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Intermedio intermedio = new Intermedio();
				intermedio.setVisible(true);
				dispose();
			}
		});
		btn4.setBounds(194, 137, 89, 23);
		contentPane.add(btn4);
		
		JButton btn3 = new JButton("11.0.11");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pregunta5 pregunta5 = new Pregunta5();
				pregunta5.setVisible(true);
				dispose();
			}
		});
		btn3.setBounds(78, 137, 89, 23);
		contentPane.add(btn3);
		
		JButton btn2 = new JButton("11.1.01");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Intermedio intermedio = new Intermedio();
				intermedio.setVisible(true);
				dispose();
			}
		});
		btn2.setBounds(194, 103, 89, 23);
		contentPane.add(btn2);
		
		JButton btn1 = new JButton("11.1.11");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Intermedio intermedio = new Intermedio();
				intermedio.setVisible(true);
				dispose();
			}
		});
		btn1.setBounds(78, 103, 89, 23);
		contentPane.add(btn1);
		
		JLabel lblPregunta = new JLabel("\u00BFQu\u00E9 versi\u00F3n de java estamos usando en clase?");
		lblPregunta.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblPregunta.setForeground(Color.WHITE);
		lblPregunta.setBounds(57, 54, 304, 38);
		contentPane.add(lblPregunta);
		
		JLabel lblFondo2 = new JLabel("");
		lblFondo2.setIcon(new ImageIcon("imagenes\\pisarradoramio (2).png"));
		lblFondo2.setBounds(-10, 21, 494, 210);
		contentPane.add(lblFondo2);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon("imagenes\\clase.jpg"));
		lblFondo.setBounds(0, 0, 484, 261);
		contentPane.add(lblFondo);
	}
}
