package view;

import controller.ControllerMain;
import processing.core.PApplet;

public class Main extends PApplet {
	
   private ControllerMain controller;
	
	
	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}

	public void settings() {
		size(550,550);
	}

	public void setup() {
		controller=new ControllerMain(this);


		
	}

	public void draw() {
		background(255);
		controller.pintar();
		for (int i = 0; i < controller.contadorList().size(); i++) {
			controller.contadorList().get(i).pintar();	
		}
		
	botones();
	   
   
	
	}
	
	
	public void botones() {
		fill(255,240,80);
		rect(100,400,150,50);
		fill(0,240,80);
		rect(350,400,150,50);
	}

	
	
	public void mousePressed() {
		controller.sort();
		
	
		
		

	}
}
	