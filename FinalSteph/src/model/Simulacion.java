package model;

import java.util.LinkedList;

import processing.core.PApplet;

public class Simulacion {
	private PApplet app; 
	LinkedList<Persona> persona = new LinkedList<Persona>();
	LinkedList<Contador> contador = new LinkedList<Contador>();
	ContadorColor contadorColCompare; 
	private String txt [];
	
	public Simulacion(PApplet app){
		this.app=app;
		contadorColCompare = new ContadorColor(); 
		
		 txt= app.loadStrings("./textTxt.txt"); 
		
	}
	
	
	
	public void loadString() {
		
		
		
		 
		 for (int i = 1; i < txt.length; i++) {
				String [] txtSplit = txt[i].split(":"); 
				int numero=Integer.parseInt(txtSplit[1]);
		 }
		 
		
	}
	
	
}
