package org.creational.pattern.builder;

import org.creational.pattern.builder.AppleMobilePhoneBuilder;
import org.creational.pattern.builder.MobilePhone;
import org.creational.pattern.builder.MobilePhoneBuilder;
import org.creational.pattern.builder.PhoneManufacturer;
import org.creational.pattern.builder.SamsungMobilePhoneBuilder;
import org.junit.Assert;
import org.junit.Test;


public class BuilderTest {

	@Test
	public void testBuilderPattern() throws Exception {

		MobilePhoneBuilder samsungMobileBuilder = new SamsungMobilePhoneBuilder();
		MobilePhoneBuilder appleMobileBuilder = new AppleMobilePhoneBuilder();

		PhoneManufacturer phoneManufacturer = new PhoneManufacturer(samsungMobileBuilder);
		phoneManufacturer.constructMobilePhone();
		MobilePhone samsungMobilePhone = phoneManufacturer.getMobilePhone();

		//Assert that it is samsung mobile
		Assert.assertTrue("Samsung SIII".equals(samsungMobilePhone.getModelName()));

		phoneManufacturer = new PhoneManufacturer(appleMobileBuilder);
		phoneManufacturer.constructMobilePhone();
		MobilePhone appleMobilePhone = phoneManufacturer.getMobilePhone();
		//Assert that it is an apple mobile
		Assert.assertTrue("iPhone5".equals(appleMobilePhone.getModelName()));
	}
}
