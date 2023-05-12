package day12.api.lang.wrapper;

public class AutoBoxingEx {

	public static void main(String[] args) {
		
		//Autoboxing : 기본타입 ~ 클래스 간의 자동 형변환
		int a = 100;		
		Integer val1 = a;		
		int b = val1;
		
		Double val2 = 3.14;
		double c = val2;
		
		//래퍼클래스의 특별한 기능들
		//문자열 => 기본형으로 변환
		
		int result1 = Integer.parseInt("10");
		double result2 = Double.parseDouble("3.14");
		long result3 = Long.parseLong("10");
		
		System.out.println(result1 + result2 + result3);
		
		
		System.out.println(Integer.compare(3, 5)); //앞에 값이 뒤값보다 작으면 음수
		System.out.println(Integer.compare(5, 3)); //앞에 값이 뒤값보다 크면 양수
		System.out.println(Integer.compare(3, 3)); //같으면 0
		
		
		
	}
}
