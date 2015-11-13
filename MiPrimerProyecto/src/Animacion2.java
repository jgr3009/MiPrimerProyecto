import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

/*
 * Autor: Jorge García Rojo
 * 
 * Realiza la animación pero con un bucle while
 * 
 */
public class Animacion2 extends GraphicsProgram{

	int velocidadX = 3;
	int velocidadY = 3;

	public void run(){

		GOval pelota = new GOval (20,20);
		pelota.setFilled(true);
		pelota.setFillColor(Color.MAGENTA);
		add(pelota);

		while (true){
			pelota.move(velocidadX,velocidadY);
			pause (5);
			//si la posicion x de la pelota es superior a 1024 es que ha tocado la pared 
			//derecha y tiene que volver
			if ((pelota.getLocation().getX() >1024)||(pelota.getLocation().getX() <0)){
				velocidadX = velocidadX * (-1);
			}
			//si la posicion y de la pelota es superior a 768 es que ha tocado el suelo 
			// tiene que volver
			if ((pelota.getLocation().getY() >768)||(pelota.getLocation().getY() <0)){
				velocidadY = velocidadY * (-1);
			}
		}
	}
}
