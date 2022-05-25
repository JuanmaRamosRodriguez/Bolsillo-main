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
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pregunta5 extends JFrame {

	private JPanel contentPane;

	public Pregunta5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnOpcion4 = new JButton("Haber estudio!");
		btnOpcion4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fin fin = new Fin();
				fin.setVisible(true);
				dispose();
			}
		});
		btnOpcion4.setBounds(182, 155, 161, 23);
		contentPane.add(btnOpcion4);
		
		JButton btnOpcion3 = new JButton("Jajaj Salu2");
		btnOpcion3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fin fin = new Fin();
				fin.setVisible(true);
				dispose();
			}
		});
		btnOpcion3.setBounds(46, 155, 127, 23);
		contentPane.add(btnOpcion3);
		
		JButton btnOpcion2 = new JButton("Nos vemos en Junio");
		btnOpcion2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fin fin = new Fin();
				fin.setVisible(true);
				dispose();
			}
		});
		btnOpcion2.setBounds(182, 121, 161, 23);
		contentPane.add(btnOpcion2);
		
		JButton btnOpcion1 = new JButton("Puede ser..");
		btnOpcion1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fin fin = new Fin();
				fin.setVisible(true);
				dispose();
			}
		});
		btnOpcion1.setBounds(46, 121, 126, 23);
		contentPane.add(btnOpcion1);
		
		JLabel lblNewLabel = new JLabel("\u00BFMa\u00F1ana ser\u00E1 el \u00FAltimo d\u00EDa de clases?");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(46, 56, 313, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblFondo2 = new JLabel("");
		lblFondo2.setIcon(new ImageIcon("C:\\Users\\Juanma\\eclipse-workspace\\Bolsillo-main\\imagenes\\pisarradoramio (2).png"));
		lblFondo2.setBounds(-11, 11, 495, 223);
		contentPane.add(lblFondo2);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon("C:\\Users\\Juanma\\eclipse-workspace\\Bolsillo-main\\imagenes\\clase.jpg"));
		lblFondo.setBounds(0, 0, 484, 261);
		contentPane.add(lblFondo);
	}
}
