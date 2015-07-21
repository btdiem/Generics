package tests;

import models.PairOfIntegers1;



public class JUnit_PairOfIntegers1Test extends JUnit_PairOfIntegersAbstractionTest{
	
	
	@Override
	public void setUp() {
		
		defaultPair = new PairOfIntegers1();
		copiedPair = new PairOfIntegers1( (PairOfIntegers1) defaultPair);
		nonDefaultPair = new PairOfIntegers1(1,2);
	}
	

}
