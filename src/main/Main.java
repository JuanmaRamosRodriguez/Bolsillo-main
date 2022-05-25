package main;

import BBDD.conexion;
import vista.Inicio;

public class Main{
	
 public static void main(String[] args){
	 conexion.conectar();
	 new Inicio();
	
	 }
 }
