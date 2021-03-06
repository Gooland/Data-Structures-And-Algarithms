import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ListTest {

	@Test
	void testAddOnBottom() {
		List l = new List();
		l.addOnBottom("milk");
		assertEquals("milk",l.top.value);
		assertEquals("milk", l.bottom.value);
		assertEquals(null,l.top.next);
		assertEquals(1, l.size);
		assertEquals(l.top, l.bottom);
		l.addOnBottom("carrots");
		assertEquals("milk",l.top.value);
		assertEquals("carrots", l.bottom.value);
		assertEquals("carrots",l.top.next.value);
		assertEquals(null, l.bottom.next);
		assertEquals(2, l.size);
	}
	@Test
	void testAddOnTop() {
		List l = new List();
		l.addOnTop("milk");
		assertEquals("milk",l.top.value);
		assertEquals("milk", l.bottom.value);
		assertEquals(null,l.top.next);
		assertEquals(1, l.size);
		assertEquals(l.top, l.bottom);
		l.addOnTop("carrots");
		assertEquals("carrots",l.top.value);
		assertEquals("milk", l.bottom.value);
		assertEquals("milk",l.top.next.value);
		assertEquals(null, l.bottom.next);
		assertEquals(2, l.size);
	}
	
	@Test
	void testInsertAt() {
		List l = new List();
		l.insertAt(3,"milk");
		assertEquals("milk",l.top.value);
		assertEquals("milk", l.bottom.value);
		assertEquals(null,l.top.next);
		assertEquals(1, l.size);
		assertEquals(l.top, l.bottom);
		
		l.insertAt(0,"carrots");
		assertEquals("carrots",l.top.value);
		assertEquals("milk", l.bottom.value);
		assertEquals("milk",l.top.next.value);
		assertEquals(null, l.bottom.next);
		assertEquals(2, l.size);
		
		l.insertAt(1,"bread");
		assertEquals("carrots",l.top.value);
		assertEquals("milk", l.bottom.value);
		assertEquals("bread",l.top.next.value);
		assertEquals(null, l.bottom.next);
		assertEquals(3, l.size);
		
		l.insertAt(2,"cereal");
		assertEquals("carrots",l.top.value);
		assertEquals("milk", l.bottom.value);
		assertEquals("bread",l.top.next.value);
		assertEquals("cereal", l.top.next.next.value);
		assertEquals(null, l.bottom.next);
		assertEquals(4, l.size);
	}
	
	@Test
	void testAddBefore() {
		List l = new List();
		l.addBefore("milk", "chocolate");
		assertEquals("milk",l.top.value);
		assertEquals("milk", l.bottom.value);
		assertEquals(null,l.top.next);
		assertEquals(1, l.size);
		assertEquals(l.top, l.bottom);
		
		l.addBefore("carrots","milk");
		assertEquals("carrots",l.top.value);
		assertEquals("milk", l.bottom.value);
		assertEquals("milk",l.top.next.value);
		assertEquals(null, l.bottom.next);
		assertEquals(2, l.size);
		
		l.addBefore("beans","milk");
		assertEquals("carrots",l.top.value);
		assertEquals("beans",l.top.next.value);
		assertEquals("milk", l.bottom.value);
		assertEquals(null, l.bottom.next);
		assertEquals(3, l.size);
	}
	
	@Test
	void testAddAfter() {
		List l = new List();
		l.addAfter("milk", "chocolate");
		assertEquals("milk",l.top.value);
		assertEquals("milk", l.bottom.value);
		assertEquals(null,l.top.next);
		assertEquals(1, l.size);
		assertEquals(l.top, l.bottom);
		
		l.addAfter("carrots","milk");
		assertEquals("milk",l.top.value);
		assertEquals("carrots", l.bottom.value);
		assertEquals("carrots",l.top.next.value);
		assertEquals(null, l.bottom.next);
		assertEquals(2, l.size);
		
		l.addAfter("beans","milk");
		assertEquals("milk",l.top.value);
		assertEquals("beans",l.top.next.value);
		assertEquals("carrots", l.bottom.value);
		assertEquals(null, l.bottom.next);
		assertEquals(3, l.size);
	}
	
	@Test
	void testDeleteTop() {
		List l = new List();
		l.deleteTop();
		assertEquals(null, l.top);
		l.addOnTop("milk");
		l.deleteTop();
		assertEquals(null, l.top);
		assertEquals(null, l.bottom);
		l.addOnTop("milk");
		l.addOnTop("bread");
		l.addOnTop("lemons");
		l.deleteTop();
		assertEquals("bread",l.top.value);
		assertEquals("milk", l.top.next.value);
		assertEquals(2, l.size);
	}
	
	@Test
	void testDeleteBottom() {
		List l = new List();
		l.deleteBottom();
		assertEquals(null, l.top);
		assertEquals(null, l.bottom);
		l.addOnTop("milk");
		l.deleteBottom();
		assertEquals(null, l.top);
		assertEquals(null, l.bottom);
		l.addOnTop("milk");
		l.addOnTop("bread");
		l.addOnTop("lemons");
		l.deleteBottom();
		assertEquals("bread",l.bottom.value);
		assertEquals("lemons", l.top.value);
		assertEquals(2, l.size);
	}
	
	@Test
	void testContains() {
		List l = new List("turkey");
		assertEquals(l.top,l.bottom);
		assertEquals("turkey", l.top.value);
		assertEquals(1,l.size);
		l.addOnTop("milk");
		l.addOnTop("bread");
		l.addOnTop("lemons");
		assertFalse(l.contains("kittens"));
		assertTrue(l.contains("bread"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
