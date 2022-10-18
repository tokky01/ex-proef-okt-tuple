import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TupleTest {
	@Test
	public void test() {
		
		Object bla2 = "bla";
		Tuple tuple1 = new Tuple(bla2,4,false);
		Tuple tuple2 = new Tuple("bla",4,false);
		assertEquals(tuple1,tuple2);
		
		Object bla = tuple1.getValueAt(0);
		bla = 2;
		bla2= "bli";
		
		assertEquals(bla,2);
		assertEquals(tuple1,tuple2);
		
		
	}
}
