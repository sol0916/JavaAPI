package day12.api.lang.system;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		//System 클래스는 전부 static 메서드로 선언되어있다
		//System.exit(시스템 종료{0}; = 시스템 종료)
	
		
		//1970년 1월 1일 ~ 현재까지 시간을 밀리초 반환
		//간단한 프로그램 시간체크
		long strat = System.currentTimeMillis();
		long sum = 0;
		for(int i=0; i<1000000; i++) {
			sum += i;
			System.out.println(i);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println((end-strat)*0.001);

	}
}

