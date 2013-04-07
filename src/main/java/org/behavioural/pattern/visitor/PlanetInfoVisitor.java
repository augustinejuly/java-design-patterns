package org.behavioural.pattern.visitor;

public class PlanetInfoVisitor implements PlanetVisitor<String>{

	@Override
	public String visit(Mercury mercury) {
		return "Diameter: 4,880 km , Mass: 3.30e23 kg";
	}

	@Override
	public String visit(Mars mars) {
		return "Diameter: 6,794 km, Mass: 6.4219e23 kg";
	}

	@Override
	public String visit(Uranus uranus) {
		return "Diameter: 51,118 km, Mass: 8.683e25 kg";
	}

}
