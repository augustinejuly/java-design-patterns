package org.behavioural.pattern.visitor;

public class PlanetInfoVisitor implements PlanetVisitor<String>{

	@Override
	public String visit(Mercury mercury) {
		return mercury.getPlanetInfo();
	}

	@Override
	public String visit(Mars mars) {
		return mars.getPlanetInfo();
	}

	@Override
	public String visit(Uranus uranus) {
		return uranus.getPlanetInfo();
	}

}
