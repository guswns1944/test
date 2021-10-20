package chap08.exam01.string;

public class StrisngMethod {

	public static void main(String[] args) {
		// *문자열 만들기 : str1 이라는 변수에 "abcdefg" 라는 값을 넣어보자
		
		String str1 = "abcdefg";
		System.out.println(str1);
		
		//String 이 class 이기 때문에 가능한 방법
		String str2 = new String("abcdefg");
		System.out.println(str2);
		
		//String 이 char 배열로 간주 되기 때문에 가능한 방법
		char[] alphabet = {'a','b','c','d','e','f'};
		String str3 = new String(alphabet); //( ) 생성자
		System.out.println(str3);
	}

}
