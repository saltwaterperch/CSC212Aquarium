package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;

public class Fish {

	int x;
	int y;
	Color color;
	boolean facingLeft;
	boolean isLittle;

	// constructor: construct a fish at position with color
public Fish(Color color, int startX, int startY,  
		boolean facingLeft, boolean isLittle) 
{
	this.x = startX;
	this.y = startY;
	this.color = color;
	// no need for these here?
	this.facingLeft = facingLeft;
	this.isLittle = isLittle;
	
	
}
	// nest if statements
	public void draw(Graphics2D window) {
		this.swim();
		
		// if its small, go through small draw and check for 
		// which way it's facing
		if ( this.isLittle) {
			if (this.facingLeft) {
			DrawFish.smallFacingRight(window, this.color,
					this.x, this.y);
			DrawFish.smallFacingLeft(window, this.color,
					this.x, this.y);
		} } else {
			// if fish is big
			DrawFish.facingLeft(window,
					this.color, this.x, this.y);
			DrawFish.facingLeft(window,
					this.color, this.x, this.y);

		}
	
		
	}
	
	

	public void swim() {
		this.y += 1;
	}
	
}
