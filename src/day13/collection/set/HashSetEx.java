package day13.collection.set;

import java.util.*;

public class HashSetEx {

	public static void main(String[] args) {
		
		
		//HashSet<Integer> set = new HashSet<>();
		Set<String> set = new HashSet<>();
		
		//add()
		set.add("java");
		set.add("database");
		set.add("spring");
		set.add("jsp");
		set.add("python");
		set.add("java"); //중복 x
		
		//
		System.out.println(set.toString());
		
		//크기
		System.out.println("크기:"+set.size());
		
		//삭제 (값)
		set.remove("python");
		System.out.println(set.toString());
		
		//순회 => 내부적으로 반복자의 개념을 사용해서 회전
		for(String s : set) {
			System.out.println(s);
		}
		
		System.out.println("------------------------");
		
		//set => iterator 타입으로 변경
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) { //다음이 있다면 true
			System.out.println(iter.next());
		}
		
		

	}

}
