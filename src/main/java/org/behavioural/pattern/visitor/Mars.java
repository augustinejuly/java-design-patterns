package org.behavioural.pattern.visitor;

public class Mars implements PlanetElement{

	@Override
	public <T> T accept(PlanetVisitor<T> planetVisitor) {
		return planetVisitor.visit(this);
	}

}
