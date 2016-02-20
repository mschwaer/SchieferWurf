package at.mschwaer.wurf;

import ch.aplu.jgamegrid.Location;


public class SchieferWurfMove implements IMove {

	private Location mLoc;
	private double mTime=0;
	private int mSpeed=0;
	private int mAngle=0;
	private double vx,vy;
	private double speedFactor = 1;
	private double g = 9.98;
	
	SchieferWurfMove(Location l, double t, int s, int a){
		mLoc =l;
		mTime =t;
		mSpeed =s;
		mAngle = a;
	}
	
	@Override
	public void setTime(double t) {
		// TODO Auto-generated method stub
		mTime =t;
	}

	@Override
	public Location getLocation() {
		// TODO Auto-generated method stub
		calculateLocation();
		return mLoc;
	}

	private void calculateLocation() {
	    vx = Math.cos(mAngle*Math.PI/180) * mSpeed;
	    vy = Math.sin(mAngle*Math.PI/180) * mSpeed;
	    
		double t = speedFactor * mTime;
		mLoc = new Location((int)(vx* t),(int)(vy* t - (t*t*0.5*g)));
	}
}
