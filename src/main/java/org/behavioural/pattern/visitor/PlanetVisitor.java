package org.behavioural.pattern.visitor;

public interface PlanetVisitor<T> {

	public T visit(Mercury mercury);

	public T visit(Mars mars);

	public T visit(Uranus uranus);

}
