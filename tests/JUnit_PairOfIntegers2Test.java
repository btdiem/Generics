package tests;

import models.PairOfIntegers2;

public class JUnit_PairOfIntegers2Test extends JUnit_PairOfIntegersAbstractionTest{

	
	@Override
	public void setUp() {
		
		defaultPair = new PairOfIntegers2();
		copiedPair = new PairOfIntegers2( (PairOfIntegers2) defaultPair);
		nonDefaultPair = new PairOfIntegers2(1,2);
	}

	
}
