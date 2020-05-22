package view;

import controller.ControllerMain;
import processing.core.PApplet;

public class Main extends PApplet {
	
   private ControllerMain controller;
	
	
	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}

	public void settings() {
		size(800,600);
	}

	public void setup() {
		controller=new ControllerMain(this);
//		new Thread(log).start();
		

		
	}

	public void draw() {
		background(255);
		controller.pintar();
		
	
	   
   
	
	}
	

	
	
	public void mousePressed() {
		
	
		
		

	}
}
	