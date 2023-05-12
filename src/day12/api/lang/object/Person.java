package day12.api.lang.object;

public class Person extends Object implements Cloneable{

	//모든 클래스는 Object를 상속받습니다
	
	private String name;
	private int age;
	
	public Person(String name) {
		this.name = name;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//오버라이드
	//alt + shift + s
	@Override
	public boolean equals(Object obj) {

		//멤버변수 name 값이 같다면 true반환
		if(obj instanceof Person) {
			Person p = (Person)obj;
			
			if(p.getName()!=null) {
				if(p.getName().equals(this.name)) {
					return true;
				}
				
			}
		}		
		return false;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age="+ age + "]";
	}


	@Override
	protected void finalize() throws Throwable {
		//객체가 사라지는 시점에서 자동으로 실행
		System.out.println(this.name + "님이 소멸되었습니다");
	}


	/*
	 * 객체 복사 메서드
	 * clone()을 오버라이드 하면, 외부에서 사용이 가능해집니다
	 * 클래스는 Cloneable 인터페이스를 상속받아야 합니다
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
			
	
}
