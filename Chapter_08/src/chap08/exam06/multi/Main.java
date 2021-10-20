package chap08.exam06.multi;

public class Main {

	public static void main(String[] args) {
		
		//객체화시 타입지정 할 때 순서가 변경되면 안된다.
		//그래서 필드들을 보면서 객체화를 해야한다.
		Employee<Integer, String, Integer, Integer, Long, Float, Boolean, String> box
		= new Employee<Integer, String, Integer, Integer, Long, Float, Boolean, String>();
		//그리고 객체화 한 내용도 가독성이 좋지 않다.
		
		//Employee 에대한 객체화를 해주는데, 이때 8개에 맞는 타입을 지정해준다. 
		
		
		//1. 안에 값을 넣을때 
		//box에 지정해준 타입에 맞는 값을 넣어준다.
		box.setNum(1); //객체화된 box 의 num 은 Integer 타입으로 1로 셋팅한다.
		box.setName("홍길동");
		box.setAge(20);
		box.setMonth(250);
		box.setMoney((long)500000);
		box.setPlus(300f);
		box.setMerry(false);
		box.setHobby("피아노");
		
		//2.값 꺼내기
		int num = box.getAge(); //꺼낼때에는 객체화 했던 box에서 원하는 정보를 가져온다.
		System.out.println("나이 : "+num); //num에 넣어 시스템 아웃으로 출력한다.
		System.out.println("취미 : "+box.getHobby()); 
		
		//객체화 했던 변수에 바로 값을 넣고 꺼낼수 있다.
		//여러개를 직접 관리 해줘야하는 단점
		
	}

}
