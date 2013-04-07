package org.behavioural.pattern.visitor;

public class Uranus implements PlanetElement{

	public Float convertEarthWeight(float weightOnEarth){
		return weightOnEarth * 0.889f;
	}

	public String getPlanetInfo(){
		return "Diameter: 51,118 km, Mass: 8.683e25 kg";
	}

	@Override
	public <T> T accept(PlanetVisitor<T> planetVisitor) {
		return planetVisitor.visit(this);
	}

}
