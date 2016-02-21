package at.mschwaer.wurf.v2;

import java.awt.Color;

import ch.aplu.jgamegrid.Actor;
import ch.aplu.jgamegrid.GGPanel;
import ch.aplu.jgamegrid.Location;

/**
 *  Einfacher Ball von JGameGrid
 * @author mschwaer
 * 
 * 
 *
 */
public class Ball extends Actor{
	private int counter= 0;
	private double t = 0;
	private double g = 9.98;
	private double v0 = 3;
	private double b = 45;
	private double vx, vy, x, y;
	private final double speedFactor = 0.1;
	private GGPanel p;
	
	/***
	 *  Ball Constructor
	 */
	public Ball(GGPanel pIn) {
	    super(false, "sprites/ball.gif", 2);
	    double angle = 0, speed = 0;
        angle = 45;
        speed = 60;
        p = pIn;

	    vx = Math.cos(angle*Math.PI/180) * speed;
	    vy = Math.sin(angle*Math.PI/180) * speed;
	}
	
	@Override
	public void act() {
		double t = speedFactor * counter;
	    x = vx* t;
	    y = vy* t - (t*t*0.5*g);
	    
	   //System.out.println(counter + " " + t+ " " + x + " " +y);
	   p.color(Color.white);
	   //p.point((int)x,(int)y);
	   p.circle(x,100+y,5,false);
	   this.setLocation(new Location((int)x, 400-(int)y));
	   counter ++;
	   if (100 +y < 0) this.setActEnabled(false);;		
	}
}
