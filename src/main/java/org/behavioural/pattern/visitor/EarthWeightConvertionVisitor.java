package org.behavioural.pattern.visitor;

public class EarthWeightConvertionVisitor  implements PlanetVisitor<Float>{

	private float weightOnEarth;

	public EarthWeightConvertionVisitor(float weightOnEarth) {
		this.weightOnEarth = weightOnEarth;
	}

	@Override
	public Float visit(Mercury mercury) {
		return mercury.convertEarthWeight(weightOnEarth);
	}

	@Override
	public Float visit(Mars mars) {
		return mars.convertEarthWeight(weightOnEarth);
	}

	@Override
	public Float visit(Uranus uranus) {
		return uranus.convertEarthWeight(weightOnEarth);
	}

}
