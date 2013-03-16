package org.pattern.builder;

public class AppleMobilePhoneBuilder implements MobilePhoneBuilder{

	private MobilePhone mobilePhone;

	public AppleMobilePhoneBuilder() {
		this.mobilePhone = new MobilePhone();
	}

	public void defineModelName() {
		mobilePhone.setModelName("iPhone5");
	}

	public void defineBodySpecification() {
		mobilePhone.setBodyDimension("123.8 x 58.6 x 7.6 mm (4.87 x 2.31 x 0.30 in)");
		mobilePhone.setWeight("112 g (3.95 oz)");
	}

	public void defineMemorySpeicification() {
		mobilePhone.setMemory("16/32/64 GB storage, 1 GB RAM");
	}

	public void defineCameraSpeicification() {
		mobilePhone.setCamera("8 MP, 3264x2448 pixels, autofocus, LED flash");
	}

	public void defineBatterySpecification() {
		mobilePhone.setBattery("Non-removable Li-Po 1440 mAh battery (5.45 Wh)");
	}

	public void defineOSSpecification() {
		mobilePhone.setOS("iOS 6, upgradable to iOS 6.1.2");
	}

	public MobilePhone getMobilePhone() {
		return this.mobilePhone;
	}

}
