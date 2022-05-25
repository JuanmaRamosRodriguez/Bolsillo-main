package controlador;

import java.util.ArrayList;
import beans.Usuario;
import modelo.ModeloUsuario;


public class Controlador {
	
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
	

}