package chap08.exam09.inherit;

public class Main {

	public static void main(String[] args) {
		
		//뒤 제너릭 안의 타입은 생략가능 (다이아몬드 연산자)
		//효율성은 별로 
		//앞에 있는 것을 참조해서 쓰는것이기 때문에 효율성이 떨어짐, 잘 사용하지 않음
		DetailInfo<String, Integer, String> info = new DetailInfo<>();
		
		info.setName("홍길동");
		info.setAge(42);
		info.setHobby("영화");
		
		System.out.println(info.getName());
		System.out.println(info.getAge());
		System.out.println(info.getHobby());
		
	}

}
