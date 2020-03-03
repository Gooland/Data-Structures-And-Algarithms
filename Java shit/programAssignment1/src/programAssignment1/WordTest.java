package programAssignment1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WordTest {

	@Test
	void testWord0Param() 
	{
		Word w = new Word();
		assertEquals("", w.word);
	}
	
	@Test
	void testWord1Param() 
	{
		Word w;
		try {
			w = new Word("wake");
			assertEquals("wake", w.getWord());
		} catch (IllegalArgumetnException e) {
			assertFalse(true);
		}
	
		try {
			w = new Word("wdf48561");
		} catch (IllegalArgumetnException e) {
			assertFalse(false);
		}
		
		try {
			w = new Word("");
		} catch (IllegalArgumetnException e) {
			assertFalse(false);
		}
	}
	
	@Test
	void testEquals() 
	{
		Word w;
		try {
			w = new Word("forgot");
			String s="sssss";
			assertFalse(w.equals(s));
			Object obj = w;
			assertTrue(w.equals(obj));
			obj = new Word("forgot");
			assertTrue(w.equals(obj));
			obj = new Word("jeraldo");
			assertFalse(w.equals(obj));
		} catch (IllegalArgumetnException e) {
			assertFalse(true);
		}
	}
	
	@Test
	void testEqualsIgnoreCase() 
	{
		Word w;
		try {
			w = new Word("forgot");
			String s="sssss";
			assertFalse(w.equalsIgnoreCase(s));
			Object obj = w;
			assertTrue(w.equalsIgnoreCase(obj));
			obj = new Word("FORgot");
			assertTrue(w.equalsIgnoreCase(obj));
			obj = new Word("jeraldo");
			assertFalse(w.equalsIgnoreCase(obj));
		} catch (IllegalArgumetnException e) {
			assertFalse(true);
		}
	}

	@Test
	void testProperNoun0Param() 
	{
		ProperNoun w = new ProperNoun();
		assertEquals("", w.word);
	}
	
	@Test
	void testProperNoun1Param() 
	{
		Word w;
		try {
			w = new ProperNoun("York");
			assertEquals("York", w.getWord());
		} catch (IllegalArgumetnException e) {
			assertFalse(true);
		}
	
		try {
			w = new ProperNoun("Wdf48561");
		} catch (IllegalArgumetnException e) {
			assertFalse(false);
		}
		
		try {
			w = new ProperNoun("");
		} catch (IllegalArgumetnException e) {
			assertFalse(false);
		}
		
		try {
			w = new ProperNoun("sldjflsd");
		} catch (IllegalArgumetnException e) {
			assertFalse(false);
		}
		
		try {
			w = new ProperNoun("LJLSJL");
		} catch (IllegalArgumetnException e) {
			assertFalse(false);
		}
	}
	
	@Test
	void testAcronym0Param() 
	{
		Acronym w = new Acronym();
		assertEquals("", w.word);
	}
	
	@Test
	void testAcronym1Param() 
	{
		Word w;
		try {
			w = new Acronym("YMCA");
			assertEquals("YMCA", w.getWord());
		} catch (IllegalArgumetnException e) {
			assertFalse(true);
		}
	
		try {
			w = new Acronym("WHD48561");
		} catch (IllegalArgumetnException e) {
			assertFalse(false);
		}
		
		try {
			w = new Acronym("");
		} catch (IllegalArgumetnException e) {
			assertFalse(false);
		}
		
		try {
			w = new Acronym("sldjflsd");
		} catch (IllegalArgumetnException e) {
			assertFalse(false);
		}
		
		try {
			w = new Acronym("LJklsJL");
		} catch (IllegalArgumetnException e) {
			assertFalse(false);
		}
	}
	
	
}
