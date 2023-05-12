package day13.collection.queue;

import java.util.*;

public class PriorityQueueEx {

	public static void main(String[] args) {
		
		
		Queue<Integer> que = new PriorityQueue();
		
		que.offer(4);
		que.offer(3);
		que.offer(1);
		que.offer(5);
		que.offer(6);
		
		System.out.println(que.toString());
		
		System.out.println(que.poll()); //1
		System.out.println(que.poll()); //3
		System.out.println(que.poll()); //4
		System.out.println(que.poll()); //5
		System.out.println(que.poll()); //6
		
		System.out.println(que.toString());
		
		System.out.println("----------------------------------");
		
		//User객체를 담을 수 있는 큐
		//큐가 순서를 확인할 때 compareTo 메서드를 확인합니다
		//compareTo에 정의된 순서에 의해서 우선순위를 정합니다
		//객체가 우선순위를 가지게 하려면
		//comparable 인터페이스를 상속받아서 compareTo 메서드를 오버라이딩해서 가지면 됩니다
	
		//우선순위 지정
		System.out.println("홍길동".compareTo("홍길자")); //홍길동이 사전적으로 앞에 위치 > 음수
		System.out.println("홍길자".compareTo("홍길동")); //홍길동이 사전적으로 뒤에 위치 > 양수
		
		Queue<User> queue = new PriorityQueue<>();
		
		queue.offer(new User("홍길동",10));
		queue.offer(new User("홍길자",20));
		queue.offer(new User("홍길순",30));
		queue.offer(new User("신사임당",40));

		System.out.println(queue.toString());
		
		System.out.println("가장 먼저 나온 객체의 이름:"+queue.poll());
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());

	}

}
