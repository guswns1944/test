package chap08.exam06.multi;

public class Employee <A, B,C,D,E,F,G,H> { //8개의 generic 을 선언

	private A num; //접근제한자 private 으로 두고 각  변수명 지정
	private B name;
	private C age;
	private D month;
	private E money;
	private F plus;
	private G merry;
	private H hobby;
	
	// private 접근제한자로 getter 와 setter 으로 셋팅을 해줘 외부에서 접근할 수 있도록 해준다.
	
	public A getNum() {
		return num;
	}
	public void setNum(A num) {
		this.num = num;
	}
	public B getName() {
		return name;
	}
	public void setName(B name) {
		this.name = name;
	}
	public C getAge() {
		return age;
	}
	public void setAge(C age) {
		this.age = age;
	}
	public D getMonth() {
		return month;
	}
	public void setMonth(D month) {
		this.month = month;
	}
	public E getMoney() {
		return money;
	}
	public void setMoney(E money) {
		this.money = money;
	}
	public F getPlus() {
		return plus;
	}
	public void setPlus(F plus) {
		this.plus = plus;
	}
	public G getMerry() {
		return merry;
	}
	public void setMerry(G merry) {
		this.merry = merry;
	}
	public H getHobby() {
		return hobby;
	}
	public void setHobby(H hobby) {
		this.hobby = hobby;
	}
	
	
	
	
}
