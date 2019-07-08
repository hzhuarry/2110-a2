package a2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DLinkedListTest {

	@Test
	void test() {
		DLinkedList<Integer> dll = new DLinkedList<Integer>();
		assertEquals(dll.size(), 0);
		dll.add(1);
		dll.add(2);
		dll.add(3);
		assertEquals(dll.toString(), "[1, 2, 3]");
		assertEquals(dll.toStringRev(), "[3, 2, 1]");
		assertEquals(dll.get(0), 1);
		assertEquals(dll.get(1), 2);
		assertEquals(dll.get(2), 3);
		assertThrows(IndexOutOfBoundsException.class, ()-> {dll.get(3);});
		assertThrows(IndexOutOfBoundsException.class, ()-> {dll.get(-1);});
		
		DLinkedList<Integer> dll2 = new DLinkedList<Integer>();
		dll2.add(1);
		dll2.add(2);
		dll2.add(3);
		dll2.add(4);
		assertEquals(dll2.get(3), 4);
		dll2.set(0, 5);
		assertEquals(dll2.get(0), 5);
		assertThrows(IndexOutOfBoundsException.class, ()-> {dll.set(-1, 5);});
		assertThrows(IndexOutOfBoundsException.class, ()-> {dll.set(10, 5);});
//		dll2.add(0, 4);
//		assertEquals(dll2.get(0), 4);
//		assertEquals(dll2.get(1), 5);
//		dll2.add(1, 5);
//		assertEquals(dll2.get(0), 5);
//		assertEquals(dll2.get(1), 5);
//		assertEquals(dll2.get(2), 2);
		dll2.remove(0);
		assertEquals(dll2.size(), 3);
		assertEquals(dll2.get(0), 2);
		dll2.remove(1);
		assertEquals(dll2.get(1), 4);
		dll2.remove(1);
		assertEquals(dll2.get(0), 2);
		assertThrows(IndexOutOfBoundsException.class, ()-> {dll2.get(1);});
		
		DLinkedList<Integer> dll3 = new DLinkedList<Integer>();
		dll3.add(1);
		dll3.add(2);
		dll3.add(3);
		dll3.add(4);
		dll3.add(3,5);
		assertEquals(5, dll3.get(3));
		
		DLinkedList<Integer> dll4 = new DLinkedList<Integer>();
		dll4.add(1);
		dll4.add(2);
		dll4.add(3);
		dll4.add(4);
		dll4.add(0, 5);
		assertEquals(5, dll4.get(0));
		dll4.add(1, 6);
		assertEquals(6, dll4.get(0));
		
		DLinkedList<Integer> dll5 = new DLinkedList<Integer>();
		dll5.add(0, 1);
		assertEquals(1, dll5.get(0));
	
	}

}
