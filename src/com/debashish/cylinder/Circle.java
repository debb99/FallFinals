package com.debashish.cylinder;

public abstract class Circle {
	public Circle(int r) {
		radius = r;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getCircumference() {
		return 2 * Math.PI * radius;
	}

	public String toString() {
		return "radius = " + radius;
	}

	public abstract boolean equals(Object obj);

	protected int radius;
}