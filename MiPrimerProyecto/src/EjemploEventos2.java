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

public class EjemploEventos2 extends GraphicsProgram{
	
	GOval circulo;
	
	public void init(){
		setSize(800, 400);
		//Con este comando se dice que vas a utilizar el ratón
		addMouseListeners();

	
	}
	
	//mouseMoved es llamado cada vez que se mueve el ratón
	public void mouseMoved (MouseEvent evento){
		
	}
	
	//mouseClicked es llamado cada vez que se hace click 
	//en la pantalla
	public void mouseClicked (MouseEvent evento){
		circulo = new GOval(70, 40);
		circulo.setFillColor(Color.CYAN);
		circulo.setFilled(true);
		add(circulo, evento.getX(), evento.getY());
	}
	
}
