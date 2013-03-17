package org.creational.pattern.builder;

public class SamsungMobilePhoneBuilder implements MobilePhoneBuilder{

	private MobilePhone mobilePhone;

	public SamsungMobilePhoneBuilder() {
		this.mobilePhone = new MobilePhone();
	}

	public void defineModelName() {
		mobilePhone.setModelName("Samsung SIII");
	}

	public void defineBodySpecification() {
		mobilePhone.setBodyDimension("136.6 x 70.6 x 8.6 mm (5.38 x 2.78 x 0.34 in)");
		mobilePhone.setWeight("133 g (4.69 oz)");
	}

	public void defineMemorySpeicification() {
		mobilePhone.setMemory("16/32/64 GB storage, 1 GB RAM");
	}

	public void defineCameraSpeicification() {
		mobilePhone.setCamera("8 MP, 3264x2448 pixels, autofocus, LED flash");
	}

	public void defineBatterySpecification() {
		mobilePhone.setBattery("Li-Ion 2100 mAh battery");
	}

	public void defineOSSpecification() {
		mobilePhone.setOS("Android OS, v4.0.4 (Ice Cream Sandwich)");
	}

	public MobilePhone getMobilePhone() {
		return this.mobilePhone;
	}

}
