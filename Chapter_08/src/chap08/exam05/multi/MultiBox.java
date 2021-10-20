package chap08.exam05.multi;

public class MultiBox<K,V> { //두개의 타입을 지정 하도록...(두개이상 가능함)
	
	
	private K key;
	private V value;
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
	

	
	
}
