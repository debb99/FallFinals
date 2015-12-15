package com.debashish.cylinder;

public class Cylinder extends Circle // subclass of Circle class
{

	/**
	 * constructor
	 * @param r: the radius of the cylinder
	 * @param h: the height of the cylinder
	 */
	public Cylinder(int r, int h)
	{
		super(r);
		this.height = h;
	}

	/**
	 * Determine the volume of the cylinder using the formula
	 * volume equals area of the base times the height
	 * @return: the volume
	 */
	public double getVolume( )
	{
		return getArea() * height;
	}

	/**
	 * @return a string that is the string "Cylinder: " followed by
	 * the radius followed by the height followed by the volume
	 */
	public String toString( )
	{
		return "Cylinder: " + "radius = " + radius + " height = " + height + " volume = " + getVolume();
	}

	/**
	 * @return: true when the volume of this is equal to the volume of obj
	 *          return false when the volumes are different
	 */
	public boolean equals(Object obj)
	{
		// two cylinders are equal if they have the same volume
		return this.getVolume() == ((Cylinder)obj).getVolume();
	}

	private int height; // the height of the cylinder
}