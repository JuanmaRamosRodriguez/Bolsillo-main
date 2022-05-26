package controlador;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import beans.Usuario;
import modelo.ModeloUsuario;


public class Controlador {
			/*Métodos de usuario*/
	public static void crearUsuarios(Usuario usuario){
        new ModeloUsuario().crearUsuarios(usuario);
    }
	public static void borrarUsuarios() {
		new ModeloUsuario().borrarUsuarios();
	}
	public ArrayList<Usuario> refrescartodosUsuarios() {
		ArrayList<Usuario> usuarios = new ModeloUsuario().refrescarUsuarios();
		return usuarios;
	}
	public void modificarUsuario(Usuario usuario) {
		new ModeloUsuario().modificarUsuarios(usuario);
		JOptionPane.showMessageDialog(null, "¡Has modificado los datos del usuario!");
		
	}
	

}