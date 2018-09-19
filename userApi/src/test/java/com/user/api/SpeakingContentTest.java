package com.user.api;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpeakingContentTest  {

	SpeakingContent speakingContent;
	
	@Autowired
	IWordSelection wordSelectionByDivision;
	
	@Autowired
	IWordSelection wordSelectionByDivisionAndNumber;
	
	@Test
	public void saySomethingWithNumberNormal() {
		
		
		speakingContent = new SpeakingContent(wordSelectionByDivision); 
		
		Assert.assertTrue(speakingContent.saySomething(100, 3, 5));
		
		
		speakingContent = new SpeakingContent(wordSelectionByDivisionAndNumber); 
		
		Assert.assertTrue(speakingContent.saySomething(100, 3, 5));
	}
	
	@Test(expected = ArithmeticException.class)
	public void saySomethingWithNumberException() {
		
		
		speakingContent = new SpeakingContent(wordSelectionByDivision); 
		
		speakingContent.saySomething(100, 0, 5);
		
		speakingContent.saySomething(100, 3, 0);
		
		
		speakingContent = new SpeakingContent(wordSelectionByDivisionAndNumber); 
		speakingContent.saySomething(100, 0, 5);
		speakingContent.saySomething(100, 3, 0);
	}

}
