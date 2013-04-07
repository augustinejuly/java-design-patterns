package org.behavioural.pattern.visitor;

public interface PlanetElement {

	public <T> T accept(PlanetVisitor<T> planetVisitor);

}
