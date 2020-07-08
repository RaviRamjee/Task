package com.ravi;

public class Courier2 extends Courier1 
{
    
    public String blueDart()
    {
    	return "BlueDart courier"; //returning the courier name
    }
    
    @Override
    public String dtdc() //overriding the method of parent class which is Courier1
    {
    	return "Indian Postal Service";  //returning courier name
    }
}
