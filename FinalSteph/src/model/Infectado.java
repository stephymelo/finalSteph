package model;

import processing.core.PApplet;

public class Infectado extends Persona {
	private boolean infectado;
	public Infectado(PApplet app,int posX,int posY) {
		super(app,posX,posY);
		
			      
			    
			   
		
	}
	
	  public void run(){
      	while (infectado) {
  			try {
  				Thread.sleep(14000);
  				infectado=false;
  			} catch (InterruptedException e) {
  				// TODO Auto-generated catch block
  				e.printStackTrace();
  			}
  		}
      }
  
	public void pintar() {
		app.fill(255,0,0);
		app.ellipse(posX,posY,radio*2,radio*2);
		
	}
	public boolean isInfectado() {
		return infectado;
	}
	public void setInfectado(boolean infectado) {
		this.infectado = infectado;
	}
	
	

}
