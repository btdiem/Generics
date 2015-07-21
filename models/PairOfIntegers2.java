package models;

import abstractions.PairOfIntegersAbstraction;
import abstractions.PairSpecification;

public class PairOfIntegers2 extends PairOfIntegersAbstraction implements PairSpecification{
	
	Integer first;
	Integer second;
	
	public PairOfIntegers2(){
		
		super();
	}
	
	public PairOfIntegers2(PairOfIntegers2 poi){
		
		super(poi);
	}
	
	public PairOfIntegers2(Integer first, Integer second){
		
		super(first,second);
	}

	
	public Integer getFirst() {
		
		return first;
	}

   	
	public Integer getSecond() {
		
		return second;
	}
	
	
	public void setFirst(Object o) throws IllegalArgumentException{
		
		if (!( o instanceof Integer)) throw (new IllegalArgumentException("Can't assign a non Integer"));
		first = (Integer) o; 
		
	}

	
	public void setSecond(Object o) throws IllegalArgumentException {
		
		if (!( o instanceof Integer)) throw (new IllegalArgumentException("Can't assign a non Integer"));
		second = (Integer) o;
		
	}
	
	
	

}
