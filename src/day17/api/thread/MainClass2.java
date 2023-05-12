package day17.api.thread;

public class MainClass2 {

	public static void main(String[] args) {
		
		//쓰레드를 상속받은 클래스는 직접 사용
		ThreadTest02 thread = new ThreadTest02();
		thread.setName("Tread_B"); //쓰레드명
		thread.start();
		
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("메인쓰레드 종료");

	}

}
