package at.mschwaer.wurf.v3;

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
	private int ySize;
	private int xSize;
	/***
	 *  Ball Constructor
	 */
	Ball(IMove tMove, GGPanel pin,int inYSize, int inXSize) {
	    super(false, "sprites/ball.gif", 2);
	    myMove = tMove;
	    p = pin;
	    lrt = new LoResTimer();
	    lrt.start();
	    ySize = inYSize;
	    xSize = inXSize;
	}
	
	public void act() {
	   t = lrt.getTime()/100000.0;
	   //System.out.println(t); 
	   myMove.setTime(t);	
	   p.color(Color.white);
	   p.circle(myMove.getLocation().getX(),myMove.getLocation().getY(),5,false);
	   this.setLocation(new Location((int) myMove.getLocation().getX(),ySize- (int) myMove.getLocation().getY()));
	   if (myMove.getLocation().getY() < 0 || myMove.getLocation().getX() > xSize) this.setActEnabled(false);
	}
	
}
