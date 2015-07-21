/**
 * 
 */
package templates;

import abstractions.PairAbstraction;
import abstractions.PairSpecification;

/**
 * @author btdiem
 *
 */
public class GenericPair<T> extends PairAbstraction implements PairSpecification{

	T first;
	T second;
	
	public GenericPair(T first, T second) {
		// TODO Auto-generated constructor stub
		this.first = first;
		this.second = second;
	}


	public GenericPair(GenericPair<T> poi) {
		// TODO Auto-generated constructor stub
		this.first = poi.getFirst();
		this.second = poi.getSecond();
	}


	@Override
	public T getFirst() {
		// TODO Auto-generated method stub
		return this.first;
	}


	@Override
	public T getSecond() {
		// TODO Auto-generated method stub
		return this.second;
	}


	@SuppressWarnings("unchecked")
	@Override
	public void setSecond(Object o) {
		// TODO Auto-generated method stub
		
		this.second = (T)o;
	}


	@SuppressWarnings("unchecked")
	@Override
	public void setFirst(Object o) {
		// TODO Auto-generated method stub
		this.first = (T)o;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first == null) ? 0 : first.hashCode());
		result = prime * result + ((second == null) ? 0 : second.hashCode());
		return result;
	}

	public static<T> void swap(GenericPair<T> poi) {
		// TODO Auto-generated method stub
		T temp = poi.getFirst();
		poi.setFirst(poi.getSecond());
		poi.setSecond(temp);
	}

	@Override
	public boolean equals(Object thing){
		
		if (thing ==null) return false;
		if ( this == thing) return true;
		if(! (thing instanceof GenericPair)){
			return false;
		}
		GenericPair<?> other = (GenericPair<?>)thing; 
		return (this.first.equals(other.first) && this.second.equals(other.second));
	}
}


