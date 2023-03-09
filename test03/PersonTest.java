package test03;

public class PersonTest {
	public static void main(String[] args) {
		
		
		Person p1 = new Person();
		int sum = p1.add(5,6);
		System.out.println(sum);
		p1.study("자바");
		
		double sum2 = p1.add(34.2, 102.1);
		System.out.println(sum);
		System.out.println(sum2);
	}
}
