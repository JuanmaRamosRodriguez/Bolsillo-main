package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.Usuario;
import controlador.Controlador;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Color;

public class Inicio extends JFrame {
			/*Atributos*/
	private JPanel contentPane;
	private JTextField campoNombre;
	private JTextField campoDNI;
	private JTextField campoEdad;
	private JTextField campoHobby;

	public Inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 211, 293);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		
		JLabel lblImagen2 = new JLabel("");
		lblImagen2.setIcon(new ImageIcon("imagenes\\cascabaldoramioinvertio-removebg-preview.png"));
		lblImagen2.setBounds(0, 0, 56, 41);
		contentPane.add(lblImagen2);
		
		JLabel lblImagen = new JLabel("");
		lblImagen.setIcon(new ImageIcon("imagenes\\cascabaldoramio-removebg-preview.png"));
		lblImagen.setBounds(162, -2, 36, 43);
		contentPane.add(lblImagen);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(17, 52, 144, 2);
		contentPane.add(separator_4);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(17, 203, 144, 2);
		contentPane.add(separator_3);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(17, 90, 144, 2);
		contentPane.add(separator_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(17, 126, 144, 2);
		contentPane.add(separator_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 166, 144, 2);
		contentPane.add(separator);
		
		JLabel labelAdaquest = new JLabel("ADA Quest");
		labelAdaquest.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		labelAdaquest.setForeground(Color.BLACK);
		labelAdaquest.setHorizontalAlignment(SwingConstants.CENTER);
		labelAdaquest.setBounds(60, 11, 89, 15);
		contentPane.add(labelAdaquest);
		
		JLabel labelNombre = new JLabel("Nombre");
		labelNombre.setBounds(20, 65, 46, 14);
		contentPane.add(labelNombre);
		
		campoNombre = new JTextField();
		campoNombre.setBounds(75, 62, 86, 20);
		contentPane.add(campoNombre);
		campoNombre.setColumns(10);
		
		campoDNI = new JTextField();
		campoDNI.setColumns(10);
		campoDNI.setBounds(75, 98, 86, 20);
		contentPane.add(campoDNI);
		
		campoEdad = new JTextField();
		campoEdad.setColumns(10);
		campoEdad.setBounds(75, 135, 86, 20);
		contentPane.add(campoEdad);
		
		campoHobby = new JTextField();
		campoHobby.setColumns(10);
		campoHobby.setBounds(75, 172, 86, 20);
		contentPane.add(campoHobby);
		
		JLabel labelDni = new JLabel("DNI");
		labelDni.setBounds(20, 101, 46, 14);
		contentPane.add(labelDni);
		
		JLabel labelEdad = new JLabel("Edad");
		labelEdad.setBounds(20, 138, 46, 14);
		contentPane.add(labelEdad);
		
		JLabel labelHobby = new JLabel("Hobby");
		labelHobby.setBounds(20, 175, 46, 14);
		contentPane.add(labelHobby);
				/*Botón para entrar y jugar*/
		JButton entrar = new JButton("Jugar");
		entrar.setBounds(60, 216, 69, 23);
		contentPane.add(entrar);
		
		JLabel labelFondologin = new JLabel("");
		labelFondologin.setIcon(new ImageIcon("imagenes\\doramio.jpg"));
		labelFondologin.setBounds(0, 0, 222, 261);
		contentPane.add(labelFondologin);
		
		entrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controlador.borrarUsuarios(); /*Borra el usuario*/
				String nombre = campoNombre.getText();
				String dni = campoDNI.getText();
				int edad = Integer.parseInt(campoEdad.getText());
				String hobby = campoHobby.getText();
				Usuario usuario1 = new Usuario(nombre, dni, edad, hobby);
				Controlador.crearUsuarios(usuario1);/*Crea el usuario*/
				
				/*Llamar vistas*/
				Pregunta1 pregunta1 = new Pregunta1();
				pregunta1.setVisible(true);
				dispose();
			}
		});
	}
}