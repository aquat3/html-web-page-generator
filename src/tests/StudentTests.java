package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.AnchorElement;
import model.ListElement;
import model.TagElement;
import model.TextElement;

public class StudentTests {

	@Test
	public void test1() {
		TextElement element = new TextElement("Roberto");
	String test=element.genHTML(0);
	assertTrue(test.contains("Roberto"));
	
	}

	
	@Test
	public void test2() {
		
		ListElement element = new ListElement(false, "");// not ordered list
		String test=element.genHTML(0);
		assertTrue(test.contains("ul"));
		
	}
	
	@Test
	public void test3() {
		AnchorElement element = new AnchorElement("http://www.google.com", "UMD", "");
		String test=element.genHTML(0);
		assertFalse(test.contains("google.co.uk")); 
	}
	@Test
	public void test4() {
		AnchorElement element = new AnchorElement("http://www.google.com", "UMD", "");
		TagElement.enableId(true);
		String test=element.genHTML(0);
		assertTrue(test.contains("id"));// checks if ids have been enabled 
	}
	@Test
	public void test5() {
		TextElement element = new TextElement("Roberto");
		String test=element.genHTML(0);
		assertFalse(test.contains("bob")); 
	}
	 
}
