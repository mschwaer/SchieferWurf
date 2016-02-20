package at.mschwaer.wurf;

import java.awt.Color;
import java.awt.Panel;

import ch.aplu.jgamegrid.Actor;
import ch.aplu.jgamegrid.GGPanel;
import ch.aplu.jgamegrid.Location;
import ch.aplu.util.LoResTimer;

/**
 *  Einfacher Ball von JGameGrid
 * @author mschwaer
 * 
 * 
 *
 */
public class Ball extends Actor{

	private IMove myMove;
	private GGPanel p;
	private LoResTimer lrt;
	private double t=0;
	/***
	 *  Ball Constructor
	 */
	Ball(IMove tMove, GGPanel pin) {
	    super(false, "sprites/ball.gif", 2);
	    myMove = tMove;
	    //myMove.setAngle(45);
	    //myMove.setSpeed(60);
	    p = pin;
	    lrt = new LoResTimer();
	    lrt.start();
	}
	
	public void act() {
	   t = lrt.getTime()/100000.0;
	   System.out.println(t); 
	   myMove.setTime(t);	
	   p.color(Color.white);
	   //p.point((int)x,(int)y);
	   p.circle(myMove.getLocation().getX(),myMove.getLocation().getY(),5,false);
	   this.setLocation(new Location((int) myMove.getLocation().getX(),500- (int) myMove.getLocation().getY()));
	   if (myMove.getLocation().getY() < 0) this.setActEnabled(false);
	}
	
}
