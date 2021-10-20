package chap08.exam04.generic;

public class Box<T> { // 값이 어떤게 들어올지 모른다.

	private T value; //값을 넣을때 Type 을 지정해 주겟다

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
		
	
	
}
