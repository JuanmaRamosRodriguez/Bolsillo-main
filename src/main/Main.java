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
}