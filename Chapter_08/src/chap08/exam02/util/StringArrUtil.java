package chap08.exam02.util;

public class StringArrUtil {

	public static void main(String[] args) {
		
		
		String string = "abcdefg"; //String 자료형의 string 변수에 "abcdefg" 값을 넣는다.
		String stringReult; //String 자료형의 stringReult 변수 선언
		int intResult; //int 타입의 intResult 변수 선언
		char charResult, charResult1, charResult2, charResult3; //char 타입의 charResult 변수 선언
		
		//문자열은 캐릭터 배열임을 생각해서 만든 메서드
		
		//1. 문자열의 길이
		System.out.println("string 의 길이 : "+string.length());
		
		//2. 특정 인덱스 문자 가져오기
		charResult = string.charAt(3);
		System.out.println("3번 인덱스에 있는 문자 : "+charResult);
		
		//3. 잘라내기
		stringReult = string.substring(1, 5); //1번 부터 보여주고, 5번부터 잘라라
		System.out.println(stringReult);
		
		//4. 문자열 -> 캐릭터 배열
		char[] charArr = string.toCharArray();
		for (char c : charArr) {
			System.out.println(c);
		}
		
		//5. 특정 문자 기준으로 나누기 -> 배열로 반환
		string = "가/나/다/라/마/바/사"; //하나의 문자열을 [가,나,다,라,마,나,사] 로 나누어 주는것 //string 에 값 넣어주기
		String[] strArr = string.split("/"); // String 배열의 이름은 strArr이고 안에 string에서 split를 이용하여 "/" 기준으로 나누어준다. 
		System.out.println(strArr[2]);
		
		//특정 문자 위치 찾기 
		string = "abcdabcdabcdabcd";
		intResult = string.indexOf("a"); //a라는 문자가 몇번 인덱스에 있는가?
		System.out.println("a 의 위치 : "+intResult);
		intResult = string.lastIndexOf("a"); //a라는 문자가 몇번 인덱스에 있는가? (단, 뒤에서 부터)
		System.out.println("a 의 위치 : "+intResult);
		System.out.println();
		
		
		
		string = "abcdabcdabcdabcd";
		
		intResult = 0; // intResult 의 값을 0으로 초기화한다.
		//while 문 실행
		while(intResult>-1) { //while 문 실행조건은 intResult 의 값이 -1 보다 클때 조건문을 실행한다. (즉, 0부터 실행)
			
			intResult = string.indexOf("a",intResult); //fromIndex 메서드를 사용하여 intResult 부터 a 문자열이 처음 등장하는 인덱스를 intResult 에 넣어준다
			
			if(intResult>-1) { //만약 반환된 인덱스가 -1 보다 크다면 
			
				System.out.println("a 의 위치 : "+intResult);  //intResult 를 출력하고
				
				intResult++; // 1씩 증가
			}
			
			
			
			//indexOf 에 값이없으면 -1 반환
		
			
			
			
			//과제
//			charResult = string.charAt(0);
//			charResult1 = string.charAt(4);
//			charResult2 = string.charAt(8);
//			charResult3 = string.charAt(12);
//			System.out.println("a의 위치 : "+charResult+charResult1+charResult2+charResult3);
	//	
		
		}
		
		

	}
}