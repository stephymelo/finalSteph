package model;

import processing.core.PApplet;

public class Sano extends Persona {

	public Sano(PApplet app) {
		super(app);
		
	}

	@Override
	public void pintar() {
		app.fill(0,255,0);
		app.ellipse(posX,posY,radio*2,radio*2);
		
	}


}
