package com.ravi;

public class AxisBank extends ICICIBank
{
	public String axisCustomer() //method for returning customer name
	{
		return "Ajay Prajapati";
	}
	
	@Override
	public String iciciCustomer()   //override iciciCustomer method from ICICIBank class
	{
		return "Suraj Kumar";
	}

}
