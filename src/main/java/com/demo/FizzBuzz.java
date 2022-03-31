package com.demo;

public class FizzBuzz 
{
    String processNumber(int num)
	{	
    	// Copy your code here
	    
	   if (number % 3 == 0 && number % 5 == 0) {
		   return "FizzBuzz";
	   }
	    if (number % 3 == 0) {
		    return "Fizz";
	    }
	    if (number % 5 == 0) {
		    return "Buzz";
	    }
	    return String.valueOf(number);
    }
	String processNumbers (int[] numList)
	{
    	// Copy your code here
		return "1";
	}

}
