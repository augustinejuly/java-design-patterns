package org.pattern.adaptor;

/**
 *The class adapter extends the adaptee class and 
 *adds the desired methods to the adapter.
 *It is a kind of an IS A Relationship
 */
public class ClassAdaptorForSquare extends RectangleAdaptee implements TargetSquare{

	@Override
	public int findAreaOfSquareint (int sideOfaSquare) {
		return super.findAreaOfRectangle(sideOfaSquare, sideOfaSquare);
	}
}
