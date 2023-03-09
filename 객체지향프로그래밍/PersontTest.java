package 객체지향프로그래밍;

public class PersontTest {
	public static void main(String[] args) {
		Person p1 = new Person(); //객체의 생성: new 키워드 + 생성자 호출
		p1.name = "강민승";
		p1.age = 27;
		p1.eat();
		
		Person p2 = new Person();
		p2.name = "홍승길";
		p2.age = 27;
		p2.eat ();
		
		
		
	}
}
