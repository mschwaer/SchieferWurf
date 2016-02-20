import java.awt.Color;
import java.awt.Point;

import ch.aplu.jgamegrid.GGPanel;
import ch.aplu.jgamegrid.GameGrid;
import ch.aplu.jgamegrid.Location;
import ch.aplu.util.Complex;
import ch.aplu.util.Monitor;

/***
 *  Juhe
 * @author mschwaer
 *
 */
public class SchieferWurf extends GameGrid {
	private GGPanel p;
	private Ball myball = new Ball();
	private int counter= 0;
	private double t = 0;
	private double g = 9.98;
	private double v0 = 3;
	private double b = 45;
	private double vx, vy, x, y;
	private final double speedFactor = 0.1;
	/***
	 * 
	 * Konstruktor Schiefer Wurf 
	 */
	SchieferWurf () {
		super(500, 500);
		this.show();
	    p = getPanel();
	    //p.setRefreshEnabled(true);
	    p.window(0,500,0,500);
	    this.addActor(myball, new Location(0,0));
	    this.setSimulationPeriod(30);
	    doRun();
	    
	    double angle = 0, speed = 0;
        angle = 45;
        speed = 60;

	    vx = Math.cos(angle*Math.PI/180) * speed;
	    vy = Math.sin(angle*Math.PI/180) * speed;
	    //vx = Math.cos(angle) * speed;
	    //vy = Math.sin(angle) * speed;
	    System.out.println(vx + " " +vy);
		p.color(Color.RED);
		p.circle(250,250,15,true);
    }

	/**
	 *  Hauptactor in der Zelle
	 */
	public void act(){

	    //vy = vy + 9.81 * speedFactor;
	    //vx = vx + 1 * speedFactor;
		double t = speedFactor * counter;
	    x = vx* t;
	    y = vy* t - (t*t*0.5*g);
	    
	   System.out.println(counter + " " + t+ " " + x + " " +y);
	   p.color(Color.white);
	   //p.point((int)x,(int)y);
	   p.circle(x,100+y,5,false);
	   myball.setLocation(new Location((int)x, 400-(int)y));
	   counter ++;
	   if (100 +y < 0) this.doPause();
	}
	
	   
	/***
	 * Und noch eine kleine Bla Bal Main
	 * @param args
	 */
	public static void main(String[] args)
	{
	  new SchieferWurf();
	}
}
