package model;

import java.util.ArrayList;
import java.util.LinkedList;

import processing.core.PApplet;

public class Simulacion {
	
	private PApplet app; 
	private ArrayList<Persona> personas;
	LinkedList<Contador> contadorList = new LinkedList<Contador>();
	ContadorColor contadorColCompare; 
	private String txt [];
	
	public Simulacion(PApplet app){
		this.app=app;
		contadorColCompare = new ContadorColor(); 
		personas = new ArrayList<Persona>();
		 this.txt= app.loadStrings("./datos.txt"); 
		
	}
	
	
	
	public void loadString() {
		
		
		
		 
		 for (int i = 1; i < txt.length; i++) {
				String [] txtSplit = txt[i].split(":"); 
				int numero=Integer.parseInt(txtSplit[1]);
				
				if(txtSplit[0].contentEquals("sanas")) {
					System.out.println("printlo");
					
					
					
				}
                if(txtSplit[0].contentEquals("infectados")) {
					
				}
                if(txtSplit[0].contentEquals("recuperados")) {
					
				}
				
		 }
		 
		
	}
	
	
	public void pintarPersonas() {
		for (int i = 0; i < personas.size(); i++) {
			personas.get(i).pintar();
		}
	}
	
	
	
}
