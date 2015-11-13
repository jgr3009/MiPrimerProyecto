import java.awt.Color;
import java.awt.event.MouseEvent;



import acm.program.*;
import acm.graphics.*;

/*
 * Autor: Jorge García Rojo
 * 
 * Este programa es un ejemplo de como utilizar los eventos de ratón
 * 
 */

public class EjemploEventos extends GraphicsProgram{
	
	GRect rectangulo;
	
	public void init(){
		setSize(800, 400);
		//Con este comando se dice que vas a utilizar el ratón
		addMouseListeners();
		rectangulo = new GRect(70, 40);
		rectangulo.setFillColor(Color.CYAN);
		rectangulo.setFilled(true);
		add(rectangulo, 100, 400);
	
	}
	
	public void mouseMoved (MouseEvent evento){
		rectangulo.setLocation(evento.getX(), evento.getY());
	}
}
