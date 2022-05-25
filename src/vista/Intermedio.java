package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Intermedio extends JFrame {

	private JPanel contentPane;

	public Intermedio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalir.setBounds(342, 184, 106, 34);
		contentPane.add(btnSalir);
		
		JButton btnReintentar = new JButton("Reintentar");
		btnReintentar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pregunta1 pregunta1= new Pregunta1();
				pregunta1.setVisible(true);
				dispose();
			}
		});
		btnReintentar.setBounds(34, 185, 116, 33);
		contentPane.add(btnReintentar);
		
		JLabel lblGameOver = new JLabel("GAME OVER");
		lblGameOver.setFont(new Font("Verdana", Font.PLAIN, 30));
		lblGameOver.setBounds(34, 51, 197, 65);
		contentPane.add(lblGameOver);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon("imagenes\\drodaimo.jpg"));
		lblFondo.setBounds(0, 0, 484, 261);
		contentPane.add(lblFondo);
	}
}
