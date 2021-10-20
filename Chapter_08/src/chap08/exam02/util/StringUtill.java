package chap08.exam02.util;

public class StringUtill {

	public static void main(String[] args) {
		/*String 사용하는 유용한 메서드들..*/
		
		String string ="abcdefg"; //String 자료형에 string 변수명 설정, 값은 abcdefg
		
		String stringResult; //String 타입의 stringResult 변수 선언
		int intResult; //int 타입의 intResult 변수 선언
		boolean boolResult; //boolean 타입의 boolResult 변수 선언
		
		/*문자열 비교*/
		boolResult = string.equals("abc");  //string 변수에 있는 값이 "abc" 으 값과 같은지에 대한 값을 boolResult
		System.out.println("두 문자가 같습니까?"+boolResult);

		
		/*문자열 포함*/
		boolResult = string.contains("abc"); //contains 포함하는가
		System.out.println("abc 를 포함 하는가? "+boolResult);
	
		
		/*문자열 교체*/
		stringResult = string.replace("abc", "ABC");
		System.out.println(string+" => "+stringResult);
	
		
		/*앞뒤 공백 제거*/
		System.out.println();
		string=" 가나다라마바사";
		stringResult = string.trim();
		System.out.println(string);
		System.out.println(stringResult);
		
		/*문자열 찾기*/
//		1. 특정 문자열로 시작되는가?
		string = "[img]uploadFile.png"; //string 의 값에  "[img]uploadFile.png" 입력
		boolResult = string.startsWith("[img]"); // 
		System.out.println("[img] 로 시작하는 녀석인가? "+boolResult);
		
//		2. 특정 문자열로 끝나는가?
		boolResult = string.endsWith(".png"); //string 값에서 .png에 있는값이 있는지 비교 있으면 true 없으면  false
		System.out.println(".png 로 끝나는가 ? "+boolResult);
		
//		3. 일치하지 않는 갯수는 몇개인가?
		intResult = string.compareTo("[img]uploadFile.pn");
		System.out.println("일치하지 않는 문자 갯수 : "+intResult);
		
		
	}

}
