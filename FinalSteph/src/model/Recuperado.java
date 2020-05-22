package model;

import processing.core.PApplet;

public class Recuperado extends Persona {
	
	public Recuperado(PApplet app) {
		super(app);
		
	}

	public void pintar() {
		app.fill(0,0,255);
		app.ellipse(posX,posY,radio*2,radio*2);
		
	}

}
