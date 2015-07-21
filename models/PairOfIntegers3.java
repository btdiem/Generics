/**
 * 
 */
package models;

import java.util.ArrayList;
import java.util.Arrays;

import abstractions.PairOfIntegersAbstraction;
import abstractions.PairSpecification;

/**
 * @author btdiem
 *
 */
public class PairOfIntegers3 extends PairOfIntegersAbstraction implements
		PairSpecification {

	ArrayList<Integer> pair;
	
	public PairOfIntegers3() {
		super();
	}

	public PairOfIntegers3(int first, int second) {
		super(first, second);
		
	}

	public PairOfIntegers3(PairOfIntegers3 defaultPair) {
		super(defaultPair.getFirst(), defaultPair.getSecond());
	}

	/* (non-Javadoc)
	 * @see abstractions.PairSpecification#swap()
	 */
	@Override
	public void swap() {
		Integer tmp = getFirst();
		setFirst(getSecond());
		setSecond(tmp);
	}

	/* (non-Javadoc)
	 * @see abstractions.PairSpecification#getFirst()
	 */
	@Override
	public Integer getFirst() {
		// TODO Auto-generated method stub
		return pair.get(0);
	}

	/* (non-Javadoc)
	 * @see abstractions.PairSpecification#getSecond()
	 */
	@Override
	public Integer getSecond() {
		// TODO Auto-generated method stub
		return pair.get(1);
	}

	/* (non-Javadoc)
	 * @see abstractions.PairSpecification#setFirst(java.lang.Object)
	 */
	@Override
	public void setFirst(Object o) {
		// TODO Auto-generated method stub
		initialize();
		pair.set(0, (Integer)o);
	}

	/* (non-Javadoc)
	 * @see abstractions.PairSpecification#setSecond(java.lang.Object)
	 */
	@Override
	public void setSecond(Object o) {
		// TODO Auto-generated method stub
		initialize();
		pair.set(1, (Integer)o);
	}

	/* (non-Javadoc)
	 * @see abstractions.PairSpecification#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + pair.get(0) + ", " + pair.get(1) + ")";
	}

	/* (non-Javadoc)
	 * @see abstractions.PairSpecification#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null){
			return false;
		}
		if (this == obj){
			return true;
		}
		
		PairOfIntegers3 other = (PairOfIntegers3)obj;
		return (this.getFirst().equals(other.getFirst()) && (this.getSecond().equals(other.getSecond())));
	}
	
	private void initialize(){
		if (pair == null){
			pair = new ArrayList<>(Arrays.asList(DEFAULT_FIRST, DEFAULT_SECOND));
		}
	}
	
}
