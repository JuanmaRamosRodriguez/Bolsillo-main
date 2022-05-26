package main;

import BBDD.conexion;
import beans.Usuario;
import vista.Inicio;

public class Main{
	/*Conecta a conexion de BBDD y arranca el programa*/
 public static void main(String[] args){
	 conexion.conectar();
	 new Inicio();
	
	 }
 			/*Modifica el usuario*/
	public void modificarUsuario(Usuario usuario) {
		String nombre = usuario.getNombre();
		String dni = usuario.getDni();
		int edad= usuario.getEdad();
		String hobby = usuario.getHobby();
		
			/*Sentencia que modificaría los datos del usuario*/  /*He intentado hacer que funcione este botón de refrescar de todas las formas posibles pero no consigo hacer que funciones*/ 
		conexion.ejecutarUpdate("UPDATE usuario SET nombre='"+nombre+"', dni='"+dni+"', edad='"+edad+"', hobby ='"+hobby+"' WHERE nombre = "+nombre+";");
		
	}
 }
