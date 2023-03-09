package test05;

public class PersonTest {
	public static void main(String[] args) {
		
		
//		Person p1 = new Person(); 
		//new Person에 빨간줄이 뜨는데 파라미터가 있도록 만들어서 파라미터를 줘야함
		Person p1 = new Person("박사홍",27);
		Person p2 = new Person();
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		
//		int sum = p1.add(5,6);
//		System.out.println(sum);
//		p1.study("자바");
//		
//		double sum2 = p1.add(34.2, 102.1);
//		System.out.println(sum);
//		System.out.println(sum2);
	}
}

//this
//참조 변수로써 객체 자신을 가리킴
//this를 이용해서 자신의 멤버 접근 가능
//지역변수(매개변수)와 필드의 이름이 동일할 경우 필드임을 식별할 수 있게 함.
//객체에 대한 참조 이므로 static 영역에서 this 사용 불가
