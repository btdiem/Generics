package tests;

import models.PairOfIntegers3;



public class JUnit_PairOfIntegers3Test extends JUnit_PairOfIntegersAbstractionTest{
	
	
	@Override
	public void setUp() {
		
		defaultPair = new PairOfIntegers3();
		copiedPair = new PairOfIntegers3( (PairOfIntegers3) defaultPair);
		nonDefaultPair = new PairOfIntegers3(1,2);
	}
	

}
