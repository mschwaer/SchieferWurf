package at.mschwaer.wurf.v4;

import ch.aplu.jgamegrid.Location;


public class ZickZackMove implements IMove {

	private Location mLoc;
	private double mTime=0;
	private int mSpeed=0;
	private int mAngle=0;
	private double vx,vy;
	private double speedFactor = 0.25;

	
	ZickZackMove(Location l, double t, int s){
		mLoc =l;
		mTime =t;
		mSpeed =s;
	}
	
	@Override
	public void setTime(double t) {
		// TODO Auto-generated method stub
		mTime =t;
	}

	@Override
	public Location getLocation() {
		// TODO Auto-generated method stub
		int x;
		int y;
		double t = speedFactor * mTime;	 
		vx = 0.5 * mSpeed;
	    vy = Math.asin(Math.cos(t))*2/Math.PI * mSpeed;
   	    x = mLoc.getX()+ (int)(vx* t);
	    y = mLoc.getY()+(int)(vy);
		return new Location(x,y);
	}

}
