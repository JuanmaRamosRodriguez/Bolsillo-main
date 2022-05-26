package LecturaEscritura;
import java.io.*;

public class Lectura {
			
	
	
	public static void main(String[] args) {
		
		String MensajeAEscribir = "Esto es una prueba";
		String MensajeLeido=" ";
		
		
		try {
			
			FileWriter fichero = new FileWriter("FicheroDeTuPutaMadre.txt");
			fichero.write(MensajeAEscribir);
			fichero.close();
		}catch (Exception ex) {ex.printStackTrace();}
		
		try {
			
			FileReader lector = new FileReader("FicheroDeTuPutaMadre.txt");
			BufferedReader BR = new BufferedReader(lector);
			MensajeLeido = BR.readLine();
			
		}catch (Exception ex) {ex.printStackTrace();}
		
	}		
}
