package model;

import processing.core.PApplet;

public class Contador implements Comparable <Contador> {
	private PApplet app;
	private String nombre;
	private int numero;
	private int color;
	private int posX,posY;
	
	public Contador(String nombre,int numero,int color,int posX,int posY,PApplet app) {
		this.app=app;
		this.nombre=nombre;
		this.numero=numero;
		this.color=color;
		this.posX=posX;
		this.posY=posY;
		
		
	}
	
	
	
	public void pintar() {
		app.fill(color);
		app.text(nombre,posX,posY);
		app.text(numero,posX+30,posY);
				
	}

	@Override
	public int compareTo(Contador numero) {
		return  this.numero-numero.getNumero();
		
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public int getColor() {
		return color;
	}



	public void setColor(int color) {
		this.color = color;
	}



	public int getPosX() {
		return posX;
	}



	public void setPosX(int posX) {
		this.posX = posX;
	}



	public int getPosY() {
		return posY;
	}



	public void setPosY(int posY) {
		this.posY = posY;
	}

}
