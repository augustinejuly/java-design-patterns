package org.pattern.builder;

public interface MobilePhoneBuilder {

	public void defineModelName();

	public void defineBodySpecification();

	public void defineMemorySpeicification();

	public void defineCameraSpeicification();

	public void defineBatterySpecification();

	public void defineOSSpecification();

	public MobilePhone getMobilePhone();

}
