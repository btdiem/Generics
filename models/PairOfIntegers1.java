/**
 * 
 */
package models;

import templates.GenericPair;
import abstractions.PairOfIntegersAbstraction;
import abstractions.PairSpecification;

/**
 * @author btdiem
 *
 */
public class PairOfIntegers1 extends PairOfIntegersAbstraction implements PairSpecification {

	private GenericPair<Integer> pairsInteger;
	
	
	public PairOfIntegers1(){
		super();
	}
	

	public PairOfIntegers1(Integer first, Integer second) {
		// TODO Auto-generated constructor stub
		super(first, second);
	}

	public PairOfIntegers1(PairOfIntegers1 defaultPair) {
		
		super(defaultPair);
	}

	@Override
	public void swap() {
		// TODO Auto-generated method stub
		Integer tmp = getFirst();
		setFirst(getSecond());
		setSecond(tmp);
	}

	@Override
	public Integer getFirst() {
		return pairsInteger.getFirst();
	}

	@Override
	public Integer getSecond() {
		return pairsInteger.getSecond();
	}

	@Override
	public void setFirst(Object first) {
		// TODO Auto-generated method stub
		initialize();
		pairsInteger.setFirst(first);
	}

	@Override
	public void setSecond(Object second) {
		initialize();
		pairsInteger.setSecond(second);
	}
	
	private void initialize(){
		if (pairsInteger == null){
			pairsInteger = new GenericPair<Integer>(DEFAULT_FIRST, DEFAULT_SECOND);
		}
	}
	

}
