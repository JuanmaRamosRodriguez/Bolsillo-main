package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Controlador;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class Fin extends JFrame {

	private JPanel contentPane;

	
	public Fin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 100, 487, 271);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTexto = new JLabel("Felicidades compa\u00F1ero, nos vemos!");
		lblTexto.setBackground(SystemColor.textText);
		lblTexto.setForeground(new Color(0, 0, 0));
		lblTexto.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblTexto.setBounds(10, 24, 451, 31);
		contentPane.add(lblTexto);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelFinal panelFinal= new PanelFinal();
				panelFinal.setVisible(true);
				dispose();
			}
		});
		btnSalir.setBounds(326, 183, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setToolTipText("");
		lblFondo.setIcon(new ImageIcon("imagenes\\fonddoraemon (1).jpg"));
		lblFondo.setBounds(0, 0, 485, 232);
		contentPane.add(lblFondo);
	}

}
