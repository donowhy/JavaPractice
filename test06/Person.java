package test06;


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
	
	
	public void sleep() {
		System.out.println("잠을 잡니다.");
	
	
		
	}
}
