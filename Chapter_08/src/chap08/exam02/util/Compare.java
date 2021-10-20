package chap08.exam02.util;

public class Compare {

	public static void main(String[] args) {
		
		String str = "문자열을";
		str += " 추가하면";
		str += " 각 객체가 생성된다.";
		System.out.println(str);     // 이 경우 객체가 3개 생성된다. string 누적합을 사용할때 좋은 방법이 아님 (+=)
		
		StringBuffer buffer = new StringBuffer("문자열을"); //자료형 StringBuffer 객체화 하여 초기값 설정
		buffer.append(" 추가하면"); //초기값에 계속 누적
		buffer.append(" 한 객체의 크기가 늘어난다.");
		System.out.println("StringBuffer : "+buffer); // 이 경우 객체가 1개만 생성된다.
		
		StringBuilder builder = new StringBuilder("문자열을 ");
		builder.append("추가하면");
		builder.append(" 한 객체의 크기가 늘어난다.");
		System.out.println("StringBuilder : "+builder);
	}

}
