import ch.aplu.jgamegrid.Actor;

/**
 *  Einfacher Ball von JGameGrid
 * @author mschwaer
 * 
 * 
 *
 */
public class Ball extends Actor{

	/***
	 *  Ball Constructor
	 */
	public Ball () {
	    super(false, "sprites/ball.gif", 2);
	}
	
	public void klo(){
		System.out.println("jjj");
	}
}
