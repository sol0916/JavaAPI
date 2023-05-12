package day13.api.util.arrays;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		
		//생성 안됨 
		//Calendar cal = new Calendar();
		
		//static 메서드를 사용해서 객체를 반환하는 모형
		Calendar cal = Calendar.getInstance();
		
		System.out.println(Calendar.YEAR);
		System.out.println(Calendar.MONTH);
		System.out.println(Calendar.DATE);
		
		int year = cal.get(Calendar.YEAR);
		System.out.println(year); //년
		
		int month = cal.get(Calendar.MONTH);
		System.out.println(month+1); //월 (하나 적게 나옴)
		
		int day = cal.get(Calendar.DATE);
		System.out.println(day); //일
		
		int hour = cal.get(Calendar.HOUR); //시
		int min = cal.get(Calendar.MINUTE); //분
		int second = cal.get(Calendar.SECOND); //초
		System.out.println(hour+"시 "+min+"분 "+second+"초");
		

	}

}
