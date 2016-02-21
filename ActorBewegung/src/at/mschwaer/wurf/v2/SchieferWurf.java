package at.mschwaer.wurf.v2;
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
	private Ball myball;

	/***
	 * 
	 * Konstruktor Schiefer Wurf 
	 */
	SchieferWurf () {
		super(500, 500);
		this.show();
	    p = getPanel();
	    myball = new Ball(p);
	    //p.setRefreshEnabled(true);
	    p.window(0,500,0,500);
	    this.addActor(myball, new Location(0,0));
	    this.setSimulationPeriod(30);
	    doRun();
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
