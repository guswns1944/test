package chap08.exam04.generic;

public class Main {

	public static void main(String[] args) {
		
		
		//박스 준비(어떤걸 담을지 정하라)
		//조건 : 클래스 타입으로 지정해야 함
		Box<Integer> box = new Box<Integer>();
		box.setValue(123);
		
		//택배가 왓다.
		int val = box.getValue();
		System.out.println(val);

	}

}
