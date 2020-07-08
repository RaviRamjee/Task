package com.ravi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InheritanceTest {

	Courier2 courier=new Courier2();  //creating object of Courier2 class
	
	//call the methods of Courier1 and Courier2 class
	String courierName1=courier.dtdc(); 
	String courierName2=courier.blueDart();
	
	//testing by different methods
	@Test
	void test1()
	{
		assertEquals("Indian Postal Service",courierName1); //comparing the value of courierName1 with string
	}
	
	@Test
	void test2()
	{
		assertEquals("BlueDart courier",courierName2); //comparing the value of courierName2 with string
	}
	
	@Test
	void test3()
	{
		assertFalse(courierName1==courierName2); //it is return true if courierName1 object not equal to couriername2
	}
	

}
