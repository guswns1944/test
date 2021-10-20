package chap08.exam07.classtype;

public class Main {

	public static void main(String[] args) {
		
		Employee<Info> emp = new Employee<Info>(); 
		//  Employee �겢�옒�뒪�뒗 <Info>�쓽 ���엯�쑝濡� 諛쏆쓣寃껋씠怨� �씠瑜� 媛앹껜�솕�븳�떎.

		//1. �븞�뿉 媛믪쓣 �꽔�쓣�븣 
		//emp �뿉 �뱾�뼱媛� ���엯 媛앹껜瑜� 留뚮뱾怨�
		Info info = new Info(); //Info �겢�옒�뒪 媛앹껜�솕 �쁽�옱 Info �겢�옒�뒪�뿉�뒗 �븘臾닿쾬�룄 �뾾�쓬
		
		Info test = new Info();
		
		info.setEmp_no(1);
		info.setName("홍길동");
		info.setAge(20);
		info.setSalary(250);
		info.setAssets((long)500000);
		info.setCommision(300f);
		info.setMerryed(false);
		info.setHobby("축구");
		
		System.out.println(test);
		System.out.println(emp.getAbc());
		//洹� 媛앹껜瑜� emp �븞�뿉 �꽔�뒗�떎.
		emp.setAbc(info);
		//2. 媛믪쓣 爰쇰궪 �븣 
		
		test = emp.getAbc();
		int age = test.getAge();
		String name = test.getName();
		System.out.println(name+":"+age);
		
		
	}
	
}
