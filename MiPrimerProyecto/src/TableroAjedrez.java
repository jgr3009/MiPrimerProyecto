
import acm.program.*;
import acm.graphics.*;

/*
 * La clase TableroAjedrez dibujará un tablero de ajedrez
 * en un GraphicsProgram
 * 
 * Definir tres constantes al inicio de la clase
 * 
 * N_FILAS que va a guardar el número de filas del tablero
 * N_COLUMNAS que va a guardar el número de columnas del tablero
 * TAMANO_CASILLA almacenará el tamaño en pixels de cada casilla del tablero
 */

public class TableroAjedrez extends GraphicsProgram{

	private static int N_FILAS = 8;
	private static int N_COLUMNAS = 8;
	private static int TAMANO_CASILLA = 80;

	public void run(){
		for (int j=0; j< N_COLUMNAS; j++){
			for(int i=0; i< N_FILAS; i++){
				GRect casilla = new GRect(TAMANO_CASILLA, TAMANO_CASILLA);
				if ((i+j)%2 == 1){
					casilla.setFilled(true);
				}
				casilla.setLocation(i*TAMANO_CASILLA, j*TAMANO_CASILLA);
				add(casilla);
			}
		}
	}
}