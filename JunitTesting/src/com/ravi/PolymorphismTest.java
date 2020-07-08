package com.ravi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PolymorphismTest {

	AxisBank bank=new AxisBank(); //creating object of the child class which is AxisBank
	
	String customerName1=bank.axisCustomer(); //calling axisCustomer method from the child class AxisBank
	String customerName2=bank.iciciCustomer(); //calling iciciCustomer method from child class who is override from its parent class which is ICICIBank
	
	@Test
	void runtimePolymorphismTest()
	{
		
		//comparing the value of customerName1
		assertEquals("Ajay Prajapati",customerName1);
		
		//comparing the value of customerName2
		assertEquals("Suraj Kumar",customerName2);
		
		//return true if customerName1 not equal to customerName2
		assertFalse(customerName1==customerName2);
	}
	
	//Creating object for Calculation class
	Calculation cal=new Calculation();
	
	int number1=cal.sum(5, 5); //calling sum method with two arguments and pass value
	int number2=cal.sum(5, 2, 3); //calling sum method which is overloading to sum method with two arguments
	
	
	@Test
	void compileTimePolymorphism()
	{
		//comparing the value of number1
		assertEquals(10,number1);
				
		//comparing the value of number2
		assertEquals(10,number2);
				
		//return true if number1 equal to number2
		assertTrue(number1==number2);
	}
	
	

}
