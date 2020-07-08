package com.ravi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncapsulationTest
{
	
	@Test
	void test() {
		Employee emp=new Employee(); //Employee class object
		
		//calling setters method to set values
	    emp.setEmpNo(01);
	    emp.setEmpName("Rahul");
	    emp.setEmpAge(25);
	    emp.setEmpAddress("Banglore");
	    
	    //calling getters method to get the values
	    int empNo=emp.getEmpNo();
	    String empName=emp.getEmpName();
	    int empAge=emp.getEmpAge();
	    String empAddress=emp.getEmpAddress();
	    
	    //comaparing objects 
	    assertEquals(01,empNo);
	    assertEquals("Rahul",empName);
	    assertEquals(25,empAge);
	    assertEquals("Banglore",empAddress);
	    
	    //comparing object with string and return true if object is not null
	    assertNotNull(empName,"Ravi");
	    assertNotNull(empAddress,"Banglore");
	    
	    
	}

}
