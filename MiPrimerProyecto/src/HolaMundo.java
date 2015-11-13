import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class HolaMundo extends acm.program.GraphicsProgram {

	public void run(){
		GRect rectangulo = new GRect(40,90);
		rectangulo.setFilled(true);
		rectangulo.setFillColor(Color.BLUE);
		rectangulo.setColor(Color.red);
		rectangulo.setLocation(20, 50);
		add(rectangulo);
	}
}
