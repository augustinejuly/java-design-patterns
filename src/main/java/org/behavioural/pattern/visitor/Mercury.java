package org.behavioural.pattern.visitor;

public class Mercury implements PlanetElement{

	public Float convertEarthWeight(float weightOnEarth){
		return weightOnEarth * 0.378f;
	}

	public String getPlanetInfo(){
		return "Diameter: 4,880 km , Mass: 3.30e23 kg";
	}

	@Override
	public <T> T accept(PlanetVisitor<T> planetVisitor) {
		return planetVisitor.visit(this);
	}

}
