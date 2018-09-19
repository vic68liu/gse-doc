package com.user.api.impl;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import com.user.api.IWordSelection;

@Service
public class WordSelectionByDivision implements IWordSelection {

	@Override
	public String selectAWord(int currentNumber, int firstCheckNumber,int secondCheckNumber ) throws  ArithmeticException{
		
		String result = "" + currentNumber;
		
		try {
			
			if(currentNumber%3==0) {
				result = "Fizz";
			} 
			if(currentNumber%5==0) {
				result = "Buzz";
			}
			if(currentNumber%3==0 && currentNumber%5==0) {
				result = "FizzBuzz";
			}
			
		}catch(IllegalArgumentException e) {
			throw e;
		}
		return result;
	}

}
