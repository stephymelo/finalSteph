package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

import Exceptionss.ExceptionUnico;
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
				
				if(txtSplit[0].toLowerCase().trim().contentEquals("sanas")) {
					System.out.println("printlo");
					contadorList.add(new Contador(txtSplit[0],numero,0x7008000,200,10,app));
					
					for (int j = 0; j < numero; j++) {
						Persona s = new Sano(app,(int)app.random(10,500),(int)app.random(10,500));
						personas.add(s);
						new Thread(s).start();
					}
					
				}
                if(txtSplit[0].toLowerCase().trim().contentEquals("infectados")) {
                	contadorList.add(new Contador(txtSplit[0],numero,0x7FFF0000,200,10,app));
                	
                	for (int j = 0; j < numero; j++) {
						Persona s = new Infectado(app,(int)app.random(10,500),(int)app.random(10,500));
						personas.add(s);
						new Thread(s).start();
						
					}
					
				}
                if(txtSplit[0].toLowerCase().trim().contentEquals("recuperados")) {
                	contadorList.add(new Contador(txtSplit[0],numero,0x70000FF,200,10,app));
                	for (int j = 0; j < numero; j++) {
						Persona s = new Recuperado(app,(int)app.random(10,500),(int)app.random(10,500));
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
			
//			for (int j = 0; j < personas.size(); j++) {
//				personas.get(j).setInfectado(true);
//					
//				
//			} para hacer que corra el hilo de infectado a recuperado
		
			
		}
		
		
		try {
			for (int j = 0; j < personas.size(); j++) {
				if (personas.get(j) instanceof Infectado) {
					if(personas.size()>30) {
						throw new ExceptionUnico("contagiado"); 
						
					}
					
					
				}
          
			
			}	
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
			
		}
		
		
		
	}
	
	

	public void infection() {
		
//		 new Thread(personas).start();
	}
	
	
	public void pintarPersonas() {
		for (int i = 0; i < personas.size(); i++) {
			personas.get(i).pintar();
		}
		
		for(Contador c :contadorList) {
			c.pintar();
			
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
	
	public LinkedList<Contador> getContadorList() {
		return contadorList;
	}

	public void setContadorList(LinkedList<Contador> contadorList) {
		this.contadorList = contadorList;
	}

	

	
}
