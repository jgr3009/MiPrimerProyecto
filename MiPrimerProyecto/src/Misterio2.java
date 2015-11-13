/*
 * Autor Jorge Garc�a Rojo
 * 
 * Se trata de ejecutar la traza en lapiz y papel. 
 * La idea es que si te ha funcionado correctamente
 * te tiene que salir lo que has hecho tu con la traza. 
 * 
 */

import acm.program.*;


public class Misterio2 extends ConsoleProgram
{

	public void run(){
		fantasma(5);
	}

	private void fantasma(int x){
		int y = 0;
		for (int i = 1; i < x; i++)	{
			y = bruja(y , esqueleto (x , i));
		}
		println("fantasma: x = " + x + ", y = " + y);
	}

	private int bruja (int x, int y){
		x = 10 * x + y;
		println("bruja: x = " + x + ", y = " + y);
		return x;
	}

	private int esqueleto (int x, int y){
		return x/y;
	}
}
