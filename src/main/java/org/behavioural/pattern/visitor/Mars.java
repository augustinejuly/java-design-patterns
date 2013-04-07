package org.behavioural.pattern.visitor;

public class Mars implements PlanetElement{

	public Float convertEarthWeight(float weightOnEarth){
		return weightOnEarth * 0.377f;
	}

	public String getPlanetInfo(){
		return "Diameter: 6,794 km, Mass: 6.4219e23 kg";
	}

	@Override
	public <T> T accept(PlanetVisitor<T> planetVisitor) {
		return planetVisitor.visit(this);
	}

}
