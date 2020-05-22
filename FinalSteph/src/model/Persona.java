package model;

import processing.core.PApplet;

public abstract class Persona implements Runnable{
	protected PApplet app; 
	protected int posX, posY,  tamX, tamY, dirX, dirY; 
	protected int color; 

	
	public Persona (PApplet app,int posX,int posY,int tamX,int tamY,int color) {
		
		this.app= app; 
		this.posX= posX; 
		this.posY= posY; 
		this.tamX= tamX; 
		this.tamY= tamY; 
		this.color= color; 
		this.dirX = 1; 
		this.dirY = 1; 
	
		
	}
	
	
	public void pintar() {
		app.fill(color);
		app.ellipse(posX,posY,tamX,tamY);
	}
	
	public void run() {
		
		
	}
	
	public void mover() {
		posX += 1*dirX; 
		posY+= 1*dirY;
		
		if(posY<0||posY>600) {
			dirX *=-1; 
		}
		if(posX <0||posX>800) {
			dirY*=-1; 
		}
	}
	


	public int getposX() {
		return posX;
	}


	public void setposX(int posX) {
		this.posX = posX;
	}


	public int getposY() {
		return posY;
	}


	public void setposY(int posY) {
		this.posY = posY;
	}


	public int getTamX() {
		return tamX;
	}


	public void setTamX(int tamX) {
		this.tamX = tamX;
	}


	public int getTamY() {
		return tamY;
	}


	public void setTamY(int tamY) {
		this.tamY = tamY;
	}


	public int getdirY() {
		return dirY;
	}


	public void setdirY(int dirY) {
		this.dirY = dirY;
	}


	public int getDirY() {
		return dirY;
	}


	public void setDirY(int dirY) {
		this.dirY = dirY;
	}


	public int getColor() {
		return color;
	}


	public void setColor(int color) {
		this.color = color;
	}
	
	
	
	
	
	
	
}
