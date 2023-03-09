package test05;


public class Person {
	//static 키워드 -> 클래스 변수 -> 이 클래스로 생성되는 모든 인스턴스가 공유
	static String species = "호모 사피엔스 사피엔스";
	
	
	//static 키워드가 없으면 -> 인스턴스 변수
	String name; //멤버 변수
	int age;
	
	//생성자를 만들지 않고...
	//만약에 설계도에 생성자가 하나도 없다면,
	// JVM이 기본생성자를 추가해줌.
	// Person()이라는 것을 만들어줌
	
	public Person() {
		this("정민우", 31);  //자기 자신을 호출한겨
	}
	//위에 애로 밑에 애 호출 가능
	public Person(String name, int age) {
		//this 키워드를 이용해서 인스턴스의 멤버에 접근
		this.name = name;  //객체가 가지고 있는 name = 파라미터가 가지고 있는 네밍
		this.age = age;
	}
	//생성자 오버로딩도 가능함
	
	
	
	
	
	public int add(int a, int b) {
		return a+b;
	}
	public double add(double a, double b) {
		return a + b;
	}
	// 메서드 오버로딩의 장점
	// = 다양한 자료형에 대해 메서드를 만들 때 
	//- 이름을 똑같이 할 수 있음
	// addInt(), addDouble()
	
	public void study(String subject) {
		double probability = Math.random();
		System.out.println(subject + "를 공부한다");
		System.out.println("알고리즘 문제를 풉니다.");
		if (probability < 0.9999)
			return;
		
		System.out.println("게임을 합니다.");
		System.out.println("lol");
	}

//	public int add(double a, double b) {
//		return a+b; 
//	} // 반환형만 다른 것은 안된다. 의미가 없음
	
	public void eat() {
		//지역변수
		String dish = "짜장면";
		
	}
}
