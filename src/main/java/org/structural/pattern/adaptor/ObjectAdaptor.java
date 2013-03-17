package org.structural.pattern.adaptor;

/**
 *The Object adaptor contains object of an adaptee and adds the desired
 *methods to an adaptor.
 *It is a kind of HAS A Relationship
 */
public class ObjectAdaptor implements TargetSquare{

	private RectangleAdaptee rectangleAdaptee;

	public ObjectAdaptor(RectangleAdaptee rectangleAdaptee) {
		this.rectangleAdaptee = rectangleAdaptee;
	}

	@Override
	public int findAreaOfSquareint(int sideOfaSquare) {
		return rectangleAdaptee.findAreaOfRectangle(sideOfaSquare, sideOfaSquare);
	}

}
