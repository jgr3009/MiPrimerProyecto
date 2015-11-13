

import acm.graphics.*;
import acm.program.GraphicsProgram;


public class Piramide extends GraphicsProgram{

	private static final int ANCHO_LADRILLO = 30;
	private static final int ALTO_LADRILLO = 12;
	private static final int LADRILLOS_BASE = 14;
	private static final int ANCHO_PANTALLA = 800;
	private static final int ALTO_PANTALLA = 600;

	public void run(){
		setSize(ANCHO_PANTALLA, ALTO_PANTALLA);
		//almacena el desplazamiento inicial desde la pared para que
		//quede centrada la piramide
		int desplazamiento = (ANCHO_PANTALLA/2) - (LADRILLOS_BASE * ANCHO_LADRILLO/2);
		int x=0;
		int y=0;
		for (int j=0; j<LADRILLOS_BASE; j++){
			//actualizo el desplazamiento para que se mueva a la izquierda medio ladrillo
			//así consigo la forma de la pirámide
			desplazamiento = desplazamiento-ANCHO_LADRILLO/2;
			//el bucle interno controla las filas de la pirámide
			for (int i=j; i< LADRILLOS_BASE; i++){
				GRect casilla = new GRect(ANCHO_LADRILLO,ALTO_LADRILLO);
				//calcula la posición de la coordenada x
				x = desplazamiento+i*ANCHO_LADRILLO;
				//calcula la posición de la coordenada y. Le restamos 40 para ajustar el
				//pequeño trozo de pantalla que se pierde en el applet
				y = ALTO_PANTALLA-40 -j*ALTO_LADRILLO;
				add (casilla,x,y);
				pause(50);
			}
		}
	}
}