package chap08.exam08.gmethod;

public class Main {

	public static void main(String[] args) { //헷갈리면 스킵해도 괜찮음 
		
		Gmethod gm = new Gmethod();
		gm.method1("신현선");
		gm.method1(100);
		gm.method1(true);
		
		System.out.println(gm.method2(100));
		System.out.println(gm.method2("홍길동"));
		System.out.println(gm.method2('A'));

		Box<String> box =gm.method3("구디 아카데미");
		System.out.println(box.getT());
	}

}
