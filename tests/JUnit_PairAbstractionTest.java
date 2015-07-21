package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import abstractions.PairAbstraction;

public abstract class JUnit_PairAbstractionTest {
	
	protected static PairAbstraction defaultPair;
	protected static PairAbstraction nonDefaultPair;
	protected static PairAbstraction copiedPair;
	
	/**
	 *  Should initialise defaultPair using default constructor<br>
	 *  Should initialise nonDefaultPair using non-default constructor<br>
	 *  Should initialise copiedPair using copy constructor on defaultPair <br>
	 */
	@Before
	public abstract void setUp();
	
	@After
	public  void tearDown() {
		defaultPair = null;
		nonDefaultPair = null;
		copiedPair = null;
	}
	
	@Test
	public abstract void testDefaultConstructor();
	
	@Test
	public abstract void testNonDefaultConstructor();
	
	@Test
	public void testCopyConstructor() {
		
		Assert.assertEquals(copiedPair.getFirst(), defaultPair.getFirst());
		Assert.assertEquals(copiedPair.getSecond(), defaultPair.getSecond());	
	}
	
	@Test
	public  void testSwap(){
		
		Object first = defaultPair.getFirst();
		Object second = defaultPair.getSecond();
		
		defaultPair.swap();
		
		Assert.assertEquals(first, defaultPair.getSecond());
		Assert.assertEquals(second, defaultPair.getFirst());
	}
	
	@Test
	public  abstract void testGetFirst();
	
	@Test
	public 	abstract void testGetSecond();
	
	@Test
	public abstract	void testSetFirst();
	
	@Test
	public 	abstract void testSetSecond();
	
	@Test
	public void testToString (){
		
		Assert.assertEquals(defaultPair.toString(), 
				            "("+defaultPair.getFirst()+", "+defaultPair.getSecond()+")");
	}
	
	@Test
	public 	void testEquals(){
		Assert.assertEquals(defaultPair, defaultPair);
		Assert.assertEquals(nonDefaultPair, nonDefaultPair);
		Assert.assertEquals(copiedPair, copiedPair);
		Assert.assertEquals(copiedPair,defaultPair);
	}

}
