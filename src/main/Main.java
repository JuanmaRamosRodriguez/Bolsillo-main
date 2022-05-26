package main;

import BBDD.conexion;
import beans.Usuario;
import vista.Inicio;

public class Main{
	
 public static void main(String[] args){
	 conexion.conectar();
	 new Inicio();
	
	 }
//MODIFICAR PRODUCTO
	public void modificarUsuario(Usuario usuario) {
		String nombre = usuario.getNombre();
		String dni = usuario.getDni();
		int edad= usuario.getEdad();
		String hobby = usuario.getHobby();
		
		
		conexion.ejecutarUpdate("UPDATE productos SET nombre='"+nombre+"', dni='"+dni+"', "
				+ "edad='"+edad+"', hobby ='"+hobby+"' WHERE usuario = "+usuario+";");
		
	}
 }
