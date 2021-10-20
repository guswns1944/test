package chap08.exam03.obj;

public class Main {

	public static void main(String[] args) {
		
		
		Box box= new Box();
		box.setValue(123);
		
		//택배가 왔다(그런데 아무런 정보가 없다)
		//들어갈때 뭐가 들어갔는지 정보를 알고 있어야 열 수 있다.
		//그래서 어떤것이 들어갔는지 확인 작업이 필요하다.
		int val = (int)box.getValue();
		System.out.println("val : "+val);
		

	}

}
