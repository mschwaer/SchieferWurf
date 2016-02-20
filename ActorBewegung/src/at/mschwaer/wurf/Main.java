package at.mschwaer.wurf;

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
public class Main extends GameGrid {
	private GGPanel p;
	private Ball2 myball;
	private Ball2 myball2;

	/***
	 * 
	 * Konstruktor Schiefer Wurf 
	 */
	Main() {
		super(500, 500);
		this.show();
	    p = getPanel();
	    //p.setRefreshEnabled(true);
	    p.window(0,500,0,500);
	    myball = new Ball2(new SchieferWurfMove(new Location(0,0),0.0,80,70),p);
	    this.addActor(myball, new Location(0,0));
	    myball2 = new Ball2(new SchieferWurfMove(new Location(0,0),0.0,60,50),p);
	    this.addActor(myball2, new Location(0,0));

	    this.setSimulationPeriod(30);
	    doRun();
  
    }

	/***
	 * Und noch eine kleine Bla Bal Main
	 * @param args
	 */
	public static void main(String[] args)
	{
	  new Main();
	}
}