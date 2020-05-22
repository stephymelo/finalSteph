package model;

import processing.core.PApplet;

public abstract class Persona implements Runnable{
	protected PApplet app; 
	protected int posX, posY,radio, dirX, dirY; 
	protected int color; 
	protected boolean moviendo;

	
	public Persona (PApplet app,int posX,int posY) {
		
		this.app= app; 
		this.posX= posX; 
		this.posY= posY; 
		this.radio=7;
		this.dirX = 1; 
		this.dirY = 1; 
	
		
	}
	
	
	public abstract void pintar();
	
	public void run() {
		
		while(moviendo) {
			try {
				mover();
				Thread.sleep(20);
			}catch(InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
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
 



	


	public int getRadio() {
		return radio;
	}


	public void setRadio(int radio) {
		this.radio = radio;
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


	public boolean isMoviendo() {
		return moviendo;
	}


	public void setMoviendo(boolean moviendo) {
		this.moviendo = moviendo;
	}
	
	
	
	
	
	
	
}
