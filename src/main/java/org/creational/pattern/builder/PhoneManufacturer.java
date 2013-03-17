package org.creational.pattern.builder;

/**
 * This class plays the role of a director in builder pattern.
 * It is assumed that this manufacturer can build any mobile phone if an appropriate builder 
 * is injected into it's constructor. 
 */
public class PhoneManufacturer {

	private MobilePhoneBuilder mobilePhoneBuilder;

	public PhoneManufacturer(MobilePhoneBuilder mobilePhoneBuilder) {
		super();
		this.mobilePhoneBuilder = mobilePhoneBuilder;
	}

	public void constructMobilePhone(){
		mobilePhoneBuilder.defineOSSpecification();
		mobilePhoneBuilder.defineMemorySpeicification();
		mobilePhoneBuilder.defineBatterySpecification();
		mobilePhoneBuilder.defineBodySpecification();
		mobilePhoneBuilder.defineCameraSpeicification();
		mobilePhoneBuilder.defineModelName();
	}

	public MobilePhone getMobilePhone(){
		return mobilePhoneBuilder.getMobilePhone();
	}

}
