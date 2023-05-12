package day15.api.io.readwrite;

import java.io.*;

public class WriterEx {

	public static void main(String[] args) {
		
		
		/*
		 * 문자를 써서 저장할 때는 2byte 기반 클래스 fa
		 * 
		 */
		
		
		String path = "C:\\Users\\user\\Desktop\\course\\Java\\file\\text.txt";
		
		try(Writer fw = new FileWriter(path);) {
			
			// \n 줄바꿈
			// \r 캐리지리턴(맨 앞으로 당기기)
			
			String str = "그만좀 자세요. \n그만 일어나.\n 집에가야지";
			fw.write(str);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
