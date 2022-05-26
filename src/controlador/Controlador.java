package controlador;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import beans.Usuario;
import modelo.ModeloUsuario;


public class Controlador {
	
	public static void crearUsuarios(Usuario usuario){
        new ModeloUsuario().crearUsuarios(usuario);
    }
	public static ArrayList<Usuario> borrarUsuarios() {
		new ModeloUsuario().borrarUsuarios();
		return null;
	}
	public ArrayList<Usuario> refrescartodosUsuarios() {
		ArrayList<Usuario> usuarios = new ModeloUsuario().refrescarUsuarios();
		return usuarios;
	}
	public void modificarUsuario(Usuario usuario) {
		new Usuario(null, null, 0, null).modificarUsuario(usuario);
		JOptionPane.showMessageDialog(null, "¡Has modificado correctamente el nuevo producto!");
		
	}
	

}