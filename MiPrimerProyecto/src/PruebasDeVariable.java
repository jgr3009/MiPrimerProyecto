import acm.program.*;
import acm.graphics.*;

/*
 * Este programa sirve para hacer pruebas de declaración
 * de distintas variables
 * 
 *  y para el primer contacto con el depurador de código
 */


public class PruebasDeVariable extends GraphicsProgram{

	int numeroEntero = 42;
	int numero2 = 13;
	
	double numeroDecimal =0.5;
	
	boolean mentiroso = false;
	
	char caracter = 'a';
	
	String palabra = "hola 3423$%·3";
	
	public void run(){
		numeroEntero = 12;
		ejemploAmbitoVariables();
	}
	
	private void ejemploAmbitoVariables(){
		int numero3 = numeroEntero;
		numero3 = numero2;
	}
}
