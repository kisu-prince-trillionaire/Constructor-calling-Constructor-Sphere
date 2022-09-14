package com.sphere;

public class Sphere {
	public int radius = 1;
	public double xCenter;
	public double yCenter;
	public double zCenter;
	
	public Sphere() {
		radius = 1;
	}
	
	public Sphere(double x, double y, double z) {
		this();
		xCenter = x;
		yCenter = y;
		zCenter = z;
	}
	
	public Sphere(int r, double x, double y, double z) {
		this(x,y,z);
		radius = r;
		xCenter = x;
		yCenter = y;
		zCenter = z;
	}
	
	@Override
	public String toString() {
		return "Sphere [radius=" + radius + ", xCenter=" + xCenter + ", yCenter=" + yCenter + ", zCenter=" + zCenter
				+ "]";
	}
	
}
