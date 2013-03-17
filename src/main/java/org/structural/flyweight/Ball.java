package org.structural.flyweight;

public class Ball {

	private int size;

	private BALL_COLOR color;
	
	public static int ballCounter;

	public Ball() {
		//to keep track of how many balls created
		ballCounter++;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public BALL_COLOR getColor() {
		return color;
	}

	public void setColor(BALL_COLOR color) {
		this.color = color;
	}

}
