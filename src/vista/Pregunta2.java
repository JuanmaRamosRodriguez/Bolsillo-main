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
		
		JButton btnEspañol = new JButton("Espa\u00F1ol");
		btnEspañol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Intermedio intermedio = new Intermedio();
				intermedio.setVisible(true);
				dispose();
			}
		});
		btnEspañol.setBounds(215, 117, 126, 27);
		contentPane.add(btnEspañol);
		
		JButton btnFrances = new JButton("Franc\u00E9s");
		btnFrances.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Intermedio intermedio = new Intermedio();
				intermedio.setVisible(true);
				dispose();
			}
		});
		btnFrances.setBounds(81, 155, 124, 27);
		contentPane.add(btnFrances);
		
		JButton btnChinoMandarin = new JButton("Chino Mandar\u00EDn");
		btnChinoMandarin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pregunta3 pregunta3 = new Pregunta3();
				pregunta3.setVisible(true);
				dispose();
			}
		});
		btnChinoMandarin.setBounds(215, 155, 126, 27);
		contentPane.add(btnChinoMandarin);
		
		JButton btnIngles = new JButton("Ingl\u00E9s");
		btnIngles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Intermedio intermedio = new Intermedio();
				intermedio.setVisible(true);
				dispose();
			}
		});
		btnIngles.setBounds(81, 117, 126, 27);
		contentPane.add(btnIngles);
		
		JLabel lblPregunta = new JLabel("\u00BFCu\u00E1l es el idioma m\u00E1s hablado del mundo?");
		lblPregunta.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblPregunta.setForeground(Color.WHITE);
		lblPregunta.setBounds(44, 66, 331, 27);
		contentPane.add(lblPregunta);
		
		JLabel labelFondo2 = new JLabel("");
		labelFondo2.setIcon(new ImageIcon("imagenes\\pisarradoramio (2).png"));
		labelFondo2.setBounds(0, 0, 484, 261);
		contentPane.add(labelFondo2);
		
		JLabel lblFondo1 = new JLabel("");
		lblFondo1.setIcon(new ImageIcon("imagenes\\clase.jpg"));
		lblFondo1.setBounds(0, 0, 484, 261);
		contentPane.add(lblFondo1);
	}

}
