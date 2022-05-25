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
		
		JButton btnNewButton_3 = new JButton("11.2.11");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Intermedio intermedio = new Intermedio();
				intermedio.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setBounds(194, 137, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("11.0.11");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pregunta5 pregunta5 = new Pregunta5();
				pregunta5.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(78, 137, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("11.1.01");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Intermedio intermedio = new Intermedio();
				intermedio.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(194, 103, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("11.1.11");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Intermedio intermedio = new Intermedio();
				intermedio.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(78, 103, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("\u00BFQu\u00E9 versi\u00F3n de java estamos usando en clase?");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(57, 54, 304, 38);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Juanma\\eclipse-workspace\\Bolsillo-main\\imagenes\\pisarradoramio (2).png"));
		lblNewLabel_1.setBounds(-10, 21, 494, 210);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Juanma\\eclipse-workspace\\Bolsillo-main\\imagenes\\clase.jpg"));
		lblNewLabel.setBounds(0, 0, 484, 261);
		contentPane.add(lblNewLabel);
	}
}
