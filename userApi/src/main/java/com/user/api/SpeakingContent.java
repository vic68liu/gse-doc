package com.user.api;

import org.springframework.boot.SpringBootConfiguration;

public class SpeakingContent {
	
	IWordSelection tWordSelection;
	
	public SpeakingContent(IWordSelection tWordSelection) {
		this.tWordSelection = tWordSelection;
	}

	public boolean  saySomething(int count,int  firstCheckNumber, int secondCheckNumber) throws IllegalArgumentException{
		
		boolean result = true;
		
		for(int i=1;i<count;i++) {
			
			try {
				System.out.println(this.tWordSelection.selectAWord(i, firstCheckNumber, secondCheckNumber));
				
			}catch(IllegalArgumentException e) {
				
				result = false;
				
				throw e;
				
			}
		}
		
		return result;
		
	}
}
