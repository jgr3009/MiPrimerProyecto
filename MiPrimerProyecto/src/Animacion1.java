import java.awt.Color;
import java.awt.color.*;

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

/*
 * Autor: Jorge García Rojo
 * Este programa muestra la técnica básica de la animación
 * 
 * Va a mover un GRect desde la coordenada (0,0) hasta 
 * la esquina inferior derecha
 * 
 */
public class Animacion1 extends GraphicsProgram{

	private static int LADO = 20;

	//número de pasos en los que recorre la distancia
	private static int N_PASOS = 12000;

	public void run(){
		RandomGenerator aleatorio = new RandomGenerator();
		for (int i=0; i<N_PASOS; i++){
		//creamos el rectángulo
		int anchoCirculo = aleatorio.nextInt(400);
		GOval circulo = new GOval (anchoCirculo,anchoCirculo);
		//lo pintamos de un color
		circulo.setFilled(true);
		circulo.setFillColor(aleatorio.nextColor());
		add(circulo,aleatorio.nextInt(1024),aleatorio.nextInt(768));
		pause(30);
		}

//		for (int i=0; i< N_PASOS; i++){
//			cuadrado.move(aleatorio.nextInt(-2,2),aleatorio.nextInt(-2,2));
//			pause(10);
//
//
//		}
	}
}
