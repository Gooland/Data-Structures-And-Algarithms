import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuestionsTest {

	@Test
	void ChoiceQuestion0ParamTest()
	{
		ChoiceQuestion q = new ChoiceQuestion();
		assertEquals("No Text Given", q.getText());
		assertEquals(-1, q.getNumber());
		assertEquals(0, q.getChoices());
	}
	
	@Test
	void ChoiceQuestion2ParamTest()
	{
		ChoiceQuestion q = new ChoiceQuestion(4, "melons?", 6);
		assertEquals("melons?", q.getText());
		assertEquals(4, q.getNumber());
		assertEquals(6, q.getChoices());
	}
	
	@Test
	void FillInQuestion2ParamTest()
	{
		FillInQuestion q = new FillInQuestion(4, "melons?");
		assertEquals("melons?", q.getText());
		assertEquals(4, q.getNumber());
		assertEquals("", q.getAwnser());
	}
	
	@Test
	void setTests()
	{
		Question q = new Question();
		q.setText("what is the dencity of the sun?");
		assertEquals("what is the dencity of the sun?", q.getText());
		
		q.setNumber(3);
		assertEquals(3, q.getNumber());
		
		ChoiceQuestion chQ = new ChoiceQuestion();
		chQ.setChoices(3);
		assertEquals(3, chQ.getChoices());
		
		FillInQuestion fIQ = new FillInQuestion();
		fIQ.setAwnser("Ds");
		assertEquals("Ds", fIQ.getAwnser());
	}
	
	@Test
	void equalsTest()
	{
		Question q = new Question();
		Object obj = null;
		assertFalse(q.equals(obj));
		
		obj = q;
		assertTrue(q.equals(obj));
		
		String s = "ball";
		assertFalse(q.equals(s));
		
		obj = new Question();
		assertTrue(q.equals(obj));
	
		obj = new Question(3, "rango");
		assertFalse(q.equals(obj));
	
		q=new Question(3, null);
		assertFalse(q.equals(obj));
		
		obj= new Question(3, null);
		assertTrue(q.equals(obj));
		
		q=new Question(3, "have you seen Ligma?");
		obj= new Question(3, "whats Ligma?");
		assertFalse(q.equals(obj));
	}
	
	@Test
	void toStringTest()
	{
		Question q = new Question(4, "melons?");
		assertEquals("4. melons?", q.toString());
	}
	
	@Test
	void compareToTest()
	{
		Question q = new Question(4, "melons?");
		String s = "sir";
		assertEquals(-1, q.compareTo(s));
		
		Question q2 = new Question(3, "buck");
		assertEquals(1, q.compareTo(q2));
		
		q2 = new Question(5, "buck");
		assertEquals(-1, q.compareTo(q2));
		
		q = new Question(5, "stuck");
		assertEquals(1, q.compareTo(q2));
		
		q = new Question(5, "alp");
		assertEquals(-1, q.compareTo(q2));
		
		q = new Question(5, "buck");
		assertEquals(0, q.compareTo(q2));
	}
	
	

}
