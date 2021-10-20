package chap08.exam05.multi;

import chap08.exam03.obj.Box;

public class Main {

	public static void main(String[] args) {
		
		
		MultiBox<String, Integer> box = new MultiBox<String, Integer>();
		//값 넣기
		
		box.setKey("가나");
		box.setValue(123);
		
		//값 꺼내기
		String key =  box.getKey();
		int value = box.getValue(); 
		System.out.println(key+" : "+value);
	}

}
