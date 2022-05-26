package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import BBDD.conexion;
import beans.Usuario;

public class ModeloUsuario {
			/*Esto te sirve para crear el usuario*/
    public void crearUsuarios(Usuario usuario) {
    	conexion.conectar();
        String nombre = usuario.getNombre();
        String dni = usuario.getDni();
        int edad = usuario.getEdad();
        String hobby = usuario.getHobby();

        conexion.ejecutarUpdate("INSERT INTO usuario (nombre, dni, edad, hobby) VALUES ('"+nombre+"', '"+dni+"','"+edad+"','"+hobby+"');");
    }
    		/*Esto te borra el usuario*/
    public void borrarUsuarios() {
    	conexion.ejecutarUpdate("delete from usuario");
    	
    }
    		/*Aquí refrescamos para ver al usuario*/
    public ArrayList<Usuario> refrescarUsuarios(){
        // TODO: Hacer la petición a BBDD para recoger los usuarios//
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        ResultSet resultado = conexion.ejecutarSentencia("SELECT * FROM usuario;");
        try {
            while(resultado.next()) {
                String nombre = resultado.getString("nombre");
                String dni = resultado.getString("dni");
                int edad = resultado.getInt("edad");
                String hobby = resultado.getString("hobby");
                usuarios.add(new Usuario( nombre, dni, edad, hobby));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }/*Te devuelve usuarios*/
        return usuarios;
    }
		
    
    		/*Modifica los datos del Usuario*/
    public void modificarUsuarios(Usuario usuario) {
        String nombre = Usuario.getNombre();
        String dni = Usuario.getDni();
        int edad = Usuario.getEdad();
        String hobby = Usuario.getHobby();
        	/*Sentencia que modifica usuario*/
        conexion.ejecutarUpdate("UPDATE USUARIO SET nombre='"+nombre+"', dni='"+dni+"', edad='"+edad+"', hobby ='"+hobby+"'  WHERE nombre = '"+nombre+"';");
    }
}