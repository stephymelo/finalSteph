package model;

import processing.core.PApplet;

public class Sano extends Persona {

	public Sano(PApplet app,int posX,int posY) {
		super(app,posX,posY);
		
	}

	@Override
	public void pintar() {
		app.fill(0,255,0);
		app.ellipse(posX,posY,radio*2,radio*2);
		
	}


}
