package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import BBDD.conexion;
import beans.Usuario;

public class ModeloUsuario {

    public void crearUsuarios(Usuario usuario) {
    	conexion.conectar();
        String nombre = usuario.getNombre();
        String dni = usuario.getDni();
        int edad = usuario.getEdad();
        String hobby = usuario.getHobby();

        conexion.ejecutarUpdate("INSERT INTO usuario (nombre, dni, edad, hobby) VALUES ('"+nombre+"', '"+dni+"','"+edad+"','"+hobby+"');");
    }
    
    public void borrarUsuarios() {
    	conexion.ejecutarUpdate("delete from usuario");
    	
    }
    
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
        }
        return usuarios;
    }

    public void borrarUsuarios(String Usuario) {
        conexion.ejecutarUpdate("DELETE FROM usuarios WHERE usuario="+Usuario+";");
    }

    public void modificarUsuarios(Usuario usuario) {

        String nombre = Usuario.getNombre();
        String dni = Usuario.getDni();
        int edad = Usuario.getEdad();
        String hobby = Usuario.getHobby();

        conexion.ejecutarUpdate("UPDATE Usuario SET usuario='"+nombre+"','"+dni+"','"+edad+"','"+hobby+"");
    }
}