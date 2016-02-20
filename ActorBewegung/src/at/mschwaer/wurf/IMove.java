package at.mschwaer.wurf;

import ch.aplu.jgamegrid.Location;

public interface IMove {
	public void setStartLocation(Location l);
	public void setTime(double t);
	public void setSpeed(int s);
	public void setAngle(int a);
	public Location getLocation();
}
