package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

import Exceptionss.ExceptionUnico;
import myExceptions.Exception1;
import processing.core.PApplet;

public class Simulacion {
	
	private PApplet app; 
	private ArrayList<Persona> personas;
	LinkedList<Contador> contadorList;
	ContadorColor contadorColor; 
	private String txt [];
	
	public Simulacion(PApplet app){
		this.app=app;
		contadorColor = new ContadorColor(); 
		personas = new ArrayList<Persona>();
		 this.txt= app.loadStrings("./datos.txt"); 
		 contadorList = new LinkedList<Contador>();
		
	}
	
	
	
	public void loadString() {
		
		
		
		 
		 for (int i = 1; i < txt.length; i++) {
				String [] txtSplit = txt[i].split(":"); 
				int numero=Integer.parseInt(txtSplit[1]);
				
				if(txtSplit[0].contentEquals("sanas")) {
					System.out.println("printlo");
					contadorList.add(new Contador(txtSplit[0],numero,0x7008000,200,10,app));
					
					for (int j = 0; j < numero; j++) {
						Persona s = new Sano(app);
						personas.add(s);
						new Thread(s).start();
					}
					
				}
                if(txtSplit[0].contentEquals("infectados")) {
                	contadorList.add(new Contador(txtSplit[0],numero,0x7FFF0000,200,10,app));
                	
                	for (int j = 0; j < numero; j++) {
						Persona s = new Infectado(app);
						personas.add(s);
						new Thread(s).start();
					}
					
				}
                if(txtSplit[0].contentEquals("recuperados")) {
                	contadorList.add(new Contador(txtSplit[0],numero,0x70000FF,200,10,app));
                	for (int j = 0; j < numero; j++) {
						Persona s = new Recuperado(app);
						personas.add(s);
						new Thread(s).start();
					}
				}
				
		 }
		 
			for (int i = 0; i < personas.size(); i++) {
				for (int j = 0; j < personas.size(); j++) {
					
					choqueInfectado(personas.get(i), personas.get(j));
					
				}
			}
		
	}
	
	
	
	
	

	
	public void choqueInfectado(Persona a,Persona b) {
		if(PApplet.dist(a.posX, a.posY, b.posX, b.posY)<=14 && a!=b) {
			personas.remove(a);
			personas.add(b);
			
		}
		
		
		try {
			for (int j = 0; j < personas.size(); j++) {
			if()
				throw new ExceptionUnico("contagiado"); 
			
			}	
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
			
		}
		
		
		
	}
	
	

	
	
	
	public void pintarPersonas() {
		for (int i = 0; i < personas.size(); i++) {
			personas.get(i).pintar();
		}
	}
	
	
	public void ordenarLista() {
		
		if(app.mouseX>100&&app.mouseY>400&&app.mouseX<100+150&&app.mouseY<450) {
			Collections.sort(contadorList);
			
		}

		if(app.mouseX>350&&app.mouseY>400&&app.mouseX<350+150&&app.mouseY<450) {
			Collections.sort(contadorList,contadorColor);	
			
		}
		
	}
	
}
