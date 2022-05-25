package beans;

public class Usuario {
	private static String nombre;
	private static String dni;
	private static int edad;
	private static String hobby;
	
	public Usuario(String nombre, String dni, int edad, String hobby) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.hobby = hobby;	
	}
	
	public static String getNombre() {
		return nombre;
		
	}
	public static void setNombre(String nombre) {
		Usuario.nombre = nombre;
	}
	public static String getDni() {
		return dni;
	}
	public static void setDni(String dni) {
		Usuario.dni = dni;
	}
	public static int getEdad() {
		return edad;
	}
	public static void setEdad(int edad) {
		Usuario.edad = edad;
	}
	public static String getHobby() {
		return hobby;
	}
	public static void setHobby(String hobby) {
		Usuario.hobby = hobby;
	}
	
	public String toString() {
		return nombre;
	}
	
}