import java.util.Arrays;
import java.util.Objects;
import java.util.stream.IntStream;

public class Tuple {
	/**
	 * @invar | tuple != null
	 * @representationObject
	 */
	private final Object[] tuple;
	
	/**
	 * 
	 * @pre | tuple != null
	 * @pre | IntStream.range(0,tuple.length).allMatch(i -> tuple[i] != null)
	 * @post | IntStream.range(0,tuple.length).allMatch(i -> getTuple()[i] == tuple[i])
	 */
	Tuple(Object ...tuple){
		if (tuple == null) {
			throw new IllegalArgumentException("tuple must not be null");
		}
		for (Object value:tuple) {
			if (value == null) {
				throw new IllegalArgumentException("tuple must not c null");
			}
		}
		this.tuple = tuple;
	}
	
	/**
	 * @pre | this.getLenght() > index 
	 * @post | result != null
	 */
	public Object getValueAt(int index) {
		return this.tuple[index]; 
	}
	
	/**
	 * @pre | this.getTuple() != null
	 * @post | result == this.getTuple().length 
	 */
	public int getLenght() {
		return tuple.length;
	}
	
	/**
	 * 
	 * @inspects | this 
	 * @creates | result 
	 * @post result != null 
	 *	
	 */
	public Object[] getTuple() {
		return tuple.clone();
	}
	
	@Override
	public String toString(){
		String res = "(";
		for (Object value:tuple) {
			res += value.toString() + ",";
		}
		return res + ')';
	}
	
	@Override 
	public boolean equals(Object other) {
		return other instanceof Tuple tuple && Arrays.equals(tuple.tuple, this.tuple);
	}
	
	@Override 
	public int hashCode() {
		return Objects.hash(this.tuple);
	}

}


