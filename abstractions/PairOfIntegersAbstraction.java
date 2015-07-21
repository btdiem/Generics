package abstractions;



public abstract class PairOfIntegersAbstraction extends PairAbstraction implements PairSpecification{

	
	public static final int DEFAULT_FIRST =0;
	public static final int DEFAULT_SECOND =0;
	
	public abstract void setFirst(Object o);

	public abstract void setSecond(Object o);
	
    public abstract Integer getFirst();
    	
    public abstract Integer getSecond();
    
    public PairOfIntegersAbstraction(){
    	
		setFirst(DEFAULT_FIRST); 
		setSecond (DEFAULT_SECOND);
	}
	
	public PairOfIntegersAbstraction(PairOfIntegersAbstraction poi){
		
     	setFirst(poi.getFirst()); 
		setSecond(poi.getSecond());
	}
	
	public PairOfIntegersAbstraction(Integer first, Integer second){
		
		setFirst(first); 
		setSecond(second);
	}


    
}
