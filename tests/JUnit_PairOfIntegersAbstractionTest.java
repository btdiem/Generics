package tests;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import abstractions.PairOfIntegersAbstraction;


public abstract class JUnit_PairOfIntegersAbstractionTest extends JUnit_PairAbstractionTest{

		
	/**
	 *  Should initialise defaultPair using default constructor with value (0,0)<br>
	 *  Should initialise nonDefaultPair using non-default constructor with value (1,2)<br>
	 *  Should initialise copiedPair using copy constructor on defaultPair <br>
	 */
	@Before
	public abstract void setUp();
	
    /**
     * The default integer values of first and second should be 0
     */
	@Override
	public void testDefaultConstructor() {
		
		Assert.assertEquals(PairOfIntegersAbstraction.DEFAULT_FIRST, defaultPair.getFirst());
		Assert.assertEquals(PairOfIntegersAbstraction.DEFAULT_SECOND, defaultPair.getSecond());
	}
	
	@Override
	public void testNonDefaultConstructor() {
		
		Assert.assertEquals(1, nonDefaultPair.getFirst());
		Assert.assertEquals(2, nonDefaultPair.getSecond());
	}
	
	@Override
	public void testGetFirst() {
		Assert.assertEquals(PairOfIntegersAbstraction.DEFAULT_FIRST, defaultPair.getFirst());
		
	}

	@Override
	public void testGetSecond() {
		Assert.assertEquals(PairOfIntegersAbstraction.DEFAULT_SECOND, defaultPair.getSecond());
		
	}


	@SuppressWarnings("deprecation")
	@Override
	public void testSetFirst() {
		
		for (int i =0; i<10; i++){
		    defaultPair.setFirst(new Integer(i));
		    Assert.assertTrue( (Integer) defaultPair.getFirst()== i);
		}
	 }
	
	@SuppressWarnings("deprecation")
	@Override
	public void testSetSecond() {
		
		for (int i =0; i<10; i++){
		    defaultPair.setSecond(new Integer(i));
		    Assert.assertTrue( (Integer) defaultPair.getSecond()== i);

		}
	 }
	
	@Test
	public 	void testEquals(){
		
		super.testEquals();
		
		copiedPair.setFirst(1);
		defaultPair.setFirst(2);

	}
	


}