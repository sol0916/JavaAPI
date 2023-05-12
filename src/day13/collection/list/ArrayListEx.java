package day13.collection.list;

import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		
		/*
		 * ArrayList
		 * => 배열기반
		 * => 순서, 중복
		 */
		
		//ArrayList<String> list = new ArrayList;
		List<String> list = new ArrayList<>();
		
		list.add("홍길동");
		list.add("이순신");
		list.add("홍길자");
		list.add("신사임당");
		
		//
		System.out.println(list.toString());
		
		//길이 확인 size()
		System.out.println("리스트의 길이:"+list.size());
		
		//중간에 추가 add()
		list.add(0, "0번째 추가");
		System.out.println(list.toString());
		
		//값의 확인 get()
		String n = list.get(3);
		System.out.println(n);
		
		//값의 수정 set()
		list.set(4, "홍순자");
		System.out.println(list.toString());
		
		//값의 제거 remove()
		list.remove(0);
		list.remove("신사임당");
		System.out.println(list.toString());
		
		//contains()
		if(list.contains("홍길동")) {
			System.out.println("홍길동이 있음");
		}
		
		//빈 리스트의 확인 isEmpty()
		if(list.isEmpty()) {
			System.out.println("리스트가 비었음");
		} else {
			System.out.println("리스트가 비어있지 않음");
			
	    //전부 삭제 clear()
		list.clear();	
		System.out.println(list.toString());
		
		System.out.println("----------------------------");
		
		//제네릭<?> = 제네릭에 뭐든 다 들어갈 수 있음
		//제네릭<? extends String> = String과 String의 자식들
		//제네릭<? super String> = String타입이 될 수 있다면 전달가능
		
		List<String> list2 = Arrays.asList("a","b","c","d");
		System.out.println(list2.toString());
		
		//리스트를 병합
		list.addAll(list2);
		System.out.println(list.toString());	
			
		
	
		
		
		}

	}

}
