package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import beans.Usuario;
import controlador.Controlador;
import javax.swing.JLabel;
import java.awt.Font;

public class PanelFinal extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButto;
	private JTable table;
	private JLabel lblNewLabel;
	private JButton btnNewButton;

	public PanelFinal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setVisible(true);
		DefaultTableModel dtm = new DefaultTableModel();
        contentPane.setLayout(null);
        table = new JTable(dtm);
        table.setBounds(10, 11, 414, 149);
        contentPane.add(table);
       
        dtm.addColumn("nombre");
        dtm.addColumn("dni");
        dtm.addColumn("edad");
        dtm.addColumn("hobby");
		
		
		JButton btnRefrescar = new JButton("Refrescar");
		btnRefrescar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Usuario> usuarios = new Controlador().refrescartodosUsuarios();
                dtm.getDataVector().removeAllElements();
                dtm.fireTableDataChanged();


                for(Usuario usuario : usuarios){
                    Object[] fila = new Object[4];
                    fila[0] = usuario.getNombre();
                    fila[1] = usuario.getDni();
                    fila[2] = usuario.getEdad();
                    fila[3] = usuario.getHobby();

                    dtm.addRow(fila);
                }
			}
		});
		btnRefrescar.setBounds(171, 194, 93, 23);
		contentPane.add(btnRefrescar);
		
		lblNewLabel = new JLabel("\u00DAltimo jugador que acert\u00F3 todas las preguntas");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(44, 171, 369, 23);
		contentPane.add(lblNewLabel);
		
		btnNewButton = new JButton("Salirdel juego");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(WIDTH);
			}
		});
		btnNewButton.setBounds(154, 228, 125, 23);
		contentPane.add(btnNewButton);
		
	
				
		}

	}
