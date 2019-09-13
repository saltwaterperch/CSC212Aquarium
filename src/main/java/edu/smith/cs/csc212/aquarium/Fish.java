package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;

public class Fish {

	int x;
	int y;
	Color color;
	// choose which method to call from DrawFish...Fish...()
	// boolean facingLeft;
	// boolean isLittle;

	// constructor: construct a fish at position with color
public Fish(Color color, int startX, int startY ) {
		// boolean facingLeft, boolean isLittle) {
	this.x = startX;
	this.y = startY;
	this.color = color;
	
	
}

	public void draw(Graphics2D window) {
		this.swim();
		DrawFish.facingRight(window, 
				this.color, this.x, this.y);
	}

	public void swim() {
		this.y += 1;
	}
	
}
