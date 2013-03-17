package org.structural.pattern.adaptor;

/**
 *This class plays the role of an Adaptee. 
 *It provides a method findArea() to find area of rectangles only.
 */
public class RectangleAdaptee{

	public int findAreaOfRectangle(int width, int height){
		return width * height;
	}

}
