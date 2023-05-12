package day12.api.lang.sb;

public class StringBuilderEx {
	
	public static void main(String[] args) {
		
	
	//StringBuilder - 단일 쓰레드 환경에서 사용
	//StringBuffer - 멀티 쓰레드 환경에서 사용
	
	String str = new String("JaVa");
	StringBuilder sb = new StringBuilder("Java ");
	
	System.out.println(str+"program");
	System.out.println("sb.append(program");
	
	System.out.println(str);
	System.out.println(sb);
	
	
	//빌더의 메서드
	//append() - 문자열 끝에 추가
	sb.append("ming");
	System.out.println(sb);
	
	//insert() - 중간에 추가
	sb.insert(5, "Study");
	System.out.println(sb);
	
	//replace() - 문자열 변경
	sb.replace (5, 10, "book"); //(이상, 미만)
	System.out.println(sb);
	
	//delete() 삭제
	sb.delete(5, 10); //이상~미만
	System.out.println(sb);
	
	//reverse() - 거꾸로
	sb.reverse();
	System.out.println(sb);
	
    //toString() - 문자열로 형변환 (최종적으로 변경해줘야 함)
//    if("gnimmargorp ava".equals(sb)) { // 타입이 달라서 확인할 수가 없음 이에, toString를 사용
//       System.out.println("같음");
//    }else {
//       System.out.println("다름"); 
//    }
    
    String result = sb.toString();
    System.out.println(result);
	
	
	
	
	

}

}