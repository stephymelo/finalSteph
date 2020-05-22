package controller;

import model.Simulacion;

import java.util.LinkedList;

import model.Contador;
import processing.core.PApplet;

public class ControllerMain {
	private Simulacion sim;
	private PApplet app;
	
	public ControllerMain(PApplet app) {
		this.app=app;
		this.sim=new Simulacion(app);
	}
	
	
	public void pintar() {
		sim.pintarPersonas();
	}
	
	public void sort() {
		sim.ordenarLista();
		
	}
	
	public LinkedList<Contador> contadorList() {
		return sim.getContadorList();
	} 
	

}
