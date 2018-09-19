package com.user.api.impl;

import org.springframework.stereotype.Service;

import com.user.api.IWordSelection;

@Service
public class WordSelectionByDivisionAndNumber implements IWordSelection{

	@Override
	public String selectAWord(int currentNumber, int firstCheckNumber,int secondCheckNumber ) throws ArithmeticException {
		
		String result = "" + currentNumber;
		
		String currentNumberStr = currentNumber + "";
		String firstCheckNumberStr = firstCheckNumber + "";
		String secondCheckNumberStr = secondCheckNumber + "";
		
		try {
			
			if(currentNumber%firstCheckNumber==0 || currentNumberStr.contains(firstCheckNumberStr)) {
				result = "Fizz";
			}
			
			if(currentNumber%secondCheckNumber==0 || currentNumberStr.contains(secondCheckNumberStr)) {
				result = "Buzz";
			}
			
			if((currentNumber%firstCheckNumber==0 && currentNumber%secondCheckNumber==0) || (currentNumberStr.contains(firstCheckNumberStr) && currentNumberStr.contains(secondCheckNumberStr))) {
				result = "FizzBuzz";
			}
			
		}catch(IllegalArgumentException e) {
			throw e;
		}
		
		return result;
	}

}
