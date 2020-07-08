package com.ravi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AbstractionTest {
	
	//creating object of inherited class from abstract class
	SmartPhoneExtends phone=new SmartPhoneExtends();
	
	//calling methods
	String phone1=phone.apple();
	String phone2=phone.nokia();
	String phone3=phone.samsung();

	@Test
	void test() {
		
		//comparing objects with string
		assertEquals("Apple Iphone X",phone1);
		assertEquals("Nokia s6",phone2);
		assertEquals("Samsung Galaxy S20",phone3);
		
		//comparion object returning true if object are not equal
		assertFalse(phone1==phone2);
		assertFalse(phone2==phone3);
		
		//return true if not null
		assertNotNull("galaxy s10",phone3);
		assertNotNull("Nokia K10",phone2);
		assertNotNull("Iphone 10s",phone1);
		
	}

}
