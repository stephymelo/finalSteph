package model;

import processing.core.PApplet;

public class Infectado extends Persona {
	
	public Infectado(PApplet app) {
		super(app);
//		Runnable curar =
//			    new Runnable(){
//			        public void run(){
//			        	while (vivo) {
//			    			try {
//			    				Thread.sleep(14000);
//			    				vivo=false;
//			    			} catch (InterruptedException e) {
//			    				// TODO Auto-generated catch block
//			    				e.printStackTrace();
//			    			}
//			    		}
//			        }
//			    };
//			    
//			    new Thread(curar).start();
		
	}
	public void pintar() {
		app.fill(255,0,0);
		app.ellipse(posX,posY,radio*2,radio*2);
		
	}
	

}
