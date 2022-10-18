import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TupleTest {
	@Test
	public void test() {
		Tuple tuple1 = new Tuple(1,4,false);
		Tuple tuple2 = new Tuple(1,4,false);
		assertEquals(tuple1,tuple2);
		
		Object bla = tuple1.getValueAt(0);
		bla = 2;
		assertEquals(bla,2);
		assertEquals(tuple1,tuple2);
		
		
	}
}
