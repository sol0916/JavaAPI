package day13.generic.good;

import day13.generic.bad.Person;

public class MainClass {

	public static void main(String[] args) {
		
		ABC<String> abc = new ABC<>(); 
		
		abc.setT("홍길동");
		String name = abc.getT();
		
		ABC<Person> abc2 = new ABC<>(); //생성자 꺽쇠는 생략 가능
		
		abc2.setT(new Person());
		Person p = abc2.getT();
		
		ABC<Object> abc3 = new ABC<>();
		
		//제네릭 타입은 원시 타입 x
		//Integer로 사용해야 합니다
		//ABC<int> abc4 = new ABC<>();
		ABC<Integer> abc4 = new ABC<>();
		
		
		////////////////////////////////////////
		
		DEF<Integer, String> def = new DEF<>();
		
	
		

	}

}
