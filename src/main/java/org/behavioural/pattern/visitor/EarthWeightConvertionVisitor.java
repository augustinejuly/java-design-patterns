package org.behavioural.pattern.visitor;

public class EarthWeightConvertionVisitor  implements PlanetVisitor<Float>{

	private float weightOnEarth;

	public EarthWeightConvertionVisitor(float weightOnEarth) {
		this.weightOnEarth = weightOnEarth;
	}

	@Override
	public Float visit(Mercury mercury) {
		return weightOnEarth * 0.378f;
	}

	@Override
	public Float visit(Mars mars) {
		return weightOnEarth * 0.377f;
	}

	@Override
	public Float visit(Uranus uranus) {
		return weightOnEarth * 0.889f;
	}

}
